#Author: Bilge Kaan Gürgen

import os
import pandas as pd

# işlem yapılacak klasörü belirle
input_folder = r'C:\Users\kaan.gurgen\Desktop\enumex\xxxxxxxx' 

# kaydedilecek klasörü belirle
output_folder = r'C:\Users\kaan.gurgen\Desktop\enumex\last_out'

# tüm txt dosyalarını listele
txt_files = [f for f in os.listdir(input_folder) if f.endswith('.txt')] 

# DataFrame oluştur ve her txt dosyasını oku, DataFrame'e ekle
df = pd.DataFrame(columns=['dosya_adi', 'col1_duzeltildi', 'col2', 'ilk_sayi_satir_index'])
for txt_file in txt_files:
    # dosya adı ve yolu
    file_name = os.path.splitext(txt_file)[0]  # uzantısız dosya adı
    file_path = os.path.join(input_folder, txt_file)

    
    # dosyayı oku ve DataFrame'e dönüştür
    with open(file_path, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    temp_df = pd.DataFrame({'col1': [line.strip() for line in lines]})
    temp_df['col2'] = temp_df['col1'].str.extract(r'"(.*?)"', expand=True)

    # yeni sütunlar ekle
    temp_df['dosya_adi'] = os.path.join(r'D:\Fonethbys\hbys-project\hbys\hbys-common\src\main\java\tr\com\fonet\hbys\common\skrsenums', os.path.splitext(txt_file)[0])
    temp_df['ilk_sayi_satir_index'] = temp_df['col1'].str.extract(r'^(\d+)', expand=True)
    temp_df['col1_duzeltildi'] = temp_df['col1'].str[2:].str.lstrip()  # ilk iki basamağı çıkar ve başındaki boşlukları kaldır

    # DataFrame'e ekle
    df = pd.concat([df, temp_df], ignore_index=True)

# dosya adından ".txt" uzantısını çıkar
df['dosya_adi'] = df['dosya_adi'].str.replace('.txt', '')

# sütunları yeniden düzenle
df = df[['dosya_adi', 'col1_duzeltildi', 'col2', 'ilk_sayi_satir_index']]

# dosyayı kaydet
output_path = os.path.join(output_folder, 'output.xlsx')
df.to_excel(output_path, index=False)
