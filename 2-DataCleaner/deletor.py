# @author:Bilge Kaan Gürgen 
# @date: 2023-02-23
# @description: NaN değerleri olan kolonlardaki satırları siler

import pandas as pd
import os

APP_PATH = os.path.dirname(os.path.abspath(__file__))

# Excel dosyasını oku
df = pd.read_excel(os.path.join(APP_PATH, "Data", r"C:\Users\kaan.gurgen\Desktop\deletionexcel\Enum_Core DONE.xlsx"),
     engine='openpyxl',)

print("\n DF ilk okumasına ait boyutu = ",df.shape, "\n")

shape1 = df.shape

# col2 ve col3 sütünlarında iki kolonda da boş olan satırları sil
df = df.dropna(subset=['col2', 'col3'], how='all')
df = df.dropna(subset=['col3'])

shape2 = df.shape

#silinen satırları bul
silinen_satir_sayisi = shape1[0] - shape2[0]
print("Silinen satır sayısı = ",silinen_satir_sayisi)

print("\nDF silme işleminden sonra boyutu = ",df.shape, "\n")



df.to_excel('deletor_final.xlsx', index = False) 




