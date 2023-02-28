# Author : Bilge Kaan Gürgen

# Bu script ile enum dosyalarınızı txt dosyasına çevirebilirsiniz.

import os

baslangic = "DbEnum {" 
bitis = "private final"
dosya_yolu = r"C:\Users\kaan.gurgen\Desktop\enumex\ENUM KLASÖRLERİ\enum_lis" 
cikti_klasoru = os.path.join(os.path.expanduser("~"), "Desktop", "Java_enum_2_txt") 

if not os.path.exists(cikti_klasoru): # klasör yoksa oluştur
    os.mkdir(cikti_klasoru)      

for dosya_adi in os.listdir(dosya_yolu): # klasördeki dosyaları dolaş
    if dosya_adi.endswith(".java"): # java dosyaları için işlem yap
        dosya_yolu_adi = os.path.join(dosya_yolu, dosya_adi) # dosya yolunu oluştur. 
        with open(dosya_yolu_adi, "r", encoding="utf-8") as dosya: # dosyayı oku. 
            icerik = dosya.readlines() # dosyayı satır satır oku.
        for i in range(len(icerik)): # dosyayı satır satır dolaş
            if baslangic in icerik[i]: # başlangıç satırını bul
                start_index = i + 1 # başlangıç satırının bir sonraki satırı
            if bitis in icerik[i]: # bitiş satırını bul
                end_index = i - 1 # bitiş satırının bir önceki satırı
                while icerik[end_index].startswith("//") or not icerik[end_index].strip(): # bitiş satırının bir önceki satırı yorum satırı veya boş satır ise bir önceki satırı bulana kadar dön
                    end_index -= 1 # bir önceki satırı bulana kadar dön
                break # bitiş satırını bulduğunda döngüden çık
        with open(os.path.join(cikti_klasoru, f"{dosya_adi}.txt"), "w", encoding="utf-8") as dosya: # dosyayı yazma modunda aç
            for i in range(start_index, end_index + 1): # başlangıç satırından bitiş satırına kadar dolaş
                if icerik[i].strip(): # satır boş değilse
                    dosya.write(f"    {i+1}\t{icerik[i]}") # satırın index numarasını yazdır

