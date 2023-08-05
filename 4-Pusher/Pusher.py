import openpyxl
import os

# Excel dosyasını yükle
wb = openpyxl.load_workbook(r'enum_core\Enum_Core DONE_replaced-Copy.xlsx') 
sheet = wb.active # Aktif sayfayı seç. (Excel dosyasındaki ilk sayfa) 

# Excel dosyasındaki her satır için döngü
for row in sheet.iter_rows(min_row=2, values_only=True): 
    java_file_path = row[0]  # 1. kolondaki Java dosyasının yolu
    row_num = row[4]  # 5. kolondaki satır indexi
    java_line_num = int(row_num) - 1  # Java dosyasındaki satır numarası

    # Java dosyasını yükle ve belirli satırı güncelle
    with open(java_file_path, 'r', errors="ignore") as f: 
        lines = f.readlines() # Java dosyasındaki tüm satırları oku

    java_line = lines[java_line_num].strip()  # Java dosyasındaki satırı oku ve sağdaki boşlukları sil

    # 2. kolondaki veriyi al ve Java satırında ilgili yere yapıştır ve yapıştırılan
    java_line_parts = row[1]
    new_java_line = ''.join('\t'+java_line_parts + '\n')

    # Java dosyasındaki satırı güncelle
    lines[java_line_num] = new_java_line

    # Java dosyasını güncelle
    with open(java_file_path, 'w') as f:
        f.writelines(lines)
