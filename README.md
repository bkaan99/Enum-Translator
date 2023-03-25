
  

# Enum Lang Converter
Author: Bilge Kaan GÜRGEN

  

Enum Dosyalarında ki Türkçe ifadelerin İngilizce çeviri sonrası tekrar bozulmadan implement etmek için yapılmış Python Script Çalışması

  
  

# Files

  
**Adımlar** 

 1. Java dosyalarını **1-Grabber** Klasöründeki `Enum_grab_export_txt.py` ile Enumlar ve satır indekslerini .txt uzantılı olarak çıktı alıyoruz. Daha sonra .txt uzantısından .xlsx uzantısına `txt_to_excel_pandas.py` ile dönüştürüyoruz.
 2. Elde edilen excel çıktılarında boş ve değişim yapılmayacak olan satırları **2-Data Cleaner** klasöründeki `deletor.py` ile temizliyoruz.
 3. Implement klasöründeki `final.py` ile Temizlenmiş excel çıktımızda içerisinde çeviri yapılmış verilerin 4.kolondan 2.kolon içerisinde "" arasında ki değerle değiştiriyoruz.
 4. `Pusher.py` ile son haldeki excel dosyamızı ilgili java dosyasında ilgili satıra yapıştırıyoruz. 



  

## 1-Grabber

```

  

├───ENUM KLASÖRLERİ

  

│ ├───enums_core\..

  

│ ├───enums_hbys..

  

│ ├───enums_lis....

  

│ ├───enums_ris...

  

│ └───enums_skrsenums....

  

│ Enum_grab_export_txt.py

  

│ Enum_skrs_grab_export_txt.py

  

│ txt_to_excel_pandas.py

  

```

  

  

Enum klasörü içerisinde ki HBYS 'koduna ait java uzantılı dosyaları buraya kopyalandı. Daha sonra **`Enum_grab_export_txt.py`** isimli python kodunu çalıştırarak Enumların bulunduğu kısımlar ve satır indexleri kesilerek her java dosyası için .txt uzantılı dosyalar olarak kaydedilir.

Bazı enumlar DbEnum ve Skrs Enum isimli kod bloğu içerisindedir. DbEnum için `Enum_grab_export_txt.py` , Skrs Enum için `Enum_skrs_grab_export_txt.py`dosyasını çalıştırınız.

  

.txt uzantılı dosyaların da Excel formatına dönüştürmek için `txt_to_excel_pandas.py` dosyasını kullanabilirsiniz.

Not: Klasör içerisinde Enum Klasörlerinde örnek olarak birer adet .java dosyası bulunmaktadır.

  

Excel içerisinde:

  

- 1.sütun Dosya Path'lerini

- 2.sütun Enumun kendisi

- 3.sütun Enum içerisinde çevirisi yapılmak istenen ("") arasında kalan türkçe kelimelerin ayrıştırılmış hali.

- 4.sütun Kod içerisinde Enum'un Bulunduğu satırın indeksi

  

Dosyalar excel formatında ilgili kişilere verilmeye uygun hale gelmiştir.

  
  

  

## 2-Data Cleaner

  

```

2-DataCleaner

└───deletor_final.py

└───Enum_Core DONE.xlsx

└───samedeletor.py

```
Excel formatında ki çıktılar çeviriler yapıldıktan sonra içerisinde çevirisi yapılmayan ve boş olan verilerin temizlenmesi için yapılmış python scriptleri bulunmaktadır. 

Bu aşama sonrasına dosyamız Çevirilerin 4. Kolondan 2. kolona uygulanma aşamasına hazırdır.
  

  

## 3- Implement


Bu aşamada `Final.py` ile çevirisi yapılan Excel Dosyalarında ki İngilizce kelimeler 4.Kolonda bulunmaktadır. 2.kolondaki enumların içerisindeki " " arasında kalan ifade ile değiştirilme aşamasını burada yapmaktayız. 

Dosya içerisindeki sonu replaced.xlsx olan excel dosyasında yapılan işlemin sonucu görebiliriz.



## 4- Pusher

  

  
Son aşama olarak burada Implement aşamasından elde edilen excel dosyasındaki verileri HBYS klasöründeki .java uzantılı dosyalara uygulama aşaşamasıdır.

 
  

  

