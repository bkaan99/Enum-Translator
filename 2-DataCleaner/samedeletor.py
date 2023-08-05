import pandas as pd
import os

APP_PATH = os.path.dirname(os.path.abspath(__file__))
# Excel dosyasını oku
df = pd.read_excel(os.path.join(APP_PATH, "Data", r"C:\Users\kaan.gurgen\Desktop\deletionexcel\deletor_final.xlsx"),engine='openpyxl')
# Eşleşen satırları tutmak için boş bir liste oluşturun
matched_rows = []

# "col2" ve "col3" sütunlarını tek tek kontrol edin
for i in range(len(df)):
    for j in range(i+1, len(df)):
        if df.loc[i, 'col2'] == df.loc[j, 'col3'] or df.loc[i, 'col2'] == df.loc[j, 'col3']:
            # Eşleşen satırları listeye ekleyin
            matched_rows.append(i)
            matched_rows.append(j)

# Eşleşen satırları içeren yeni bir veri çerçevesi oluşturun
duplicate_df = df.iloc[matched_rows]
print("\nAynı olanlar = ",duplicate_df.shape, "\n")

# Eşleşen satırları silin
df = df.drop(matched_rows)

print("\nAynıları silme işlemi sonrası = ",df.shape, "\n")
# Yeni dosyayı kaydedin
duplicate_df.to_excel('duplicates.xlsx', index=False)
df.to_excel('deleteddublicates.xlsx', index = False)