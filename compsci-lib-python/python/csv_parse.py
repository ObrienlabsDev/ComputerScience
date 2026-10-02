# CSV parser
# 20261001 Michael OBrien michael at obrienlabs.dev

from pathlib import Path
#import os.path
import csv

path = Path("/Users/.../dumps2025/20251207_biometric_gps_record_16236018_rows.csv")
#path = Path(__file__).parent / "data.csv"


lines = path.read_text().splitlines()
reader = csv.reader(lines)
# read only the 1st line
header_row = next(reader) 
print(header_row)
# ['IDENT_ID', 'ACCELX', 'ACCELY', 'ACCELZ', 'ACCURACY', 'ALTITUDE', 'bearing', 'geohash', 'GRAVX', 'GRAVY', 'GRAVZ', 'GYROX', 'GYROY', 'GYROZ', 'HEART1', 'HEART2', 'HRDEV1', 'HRDEV2', 'humidity', 'LATITUDE', 'light', 'LINACCX', 'LINACCY', 'LINACCZ', 'LONGITUDE', 'PRES', 'provider', 'PROX', 'RECV_SEQ', 'ROTVECX', 'ROTVECY', 'ROTVECZ', 'SEND_SEQ', 'speed', 'temp', 'teslaX', 'teslaY', 'teslaZ', 'tsStart', 'tsStop', 'userId', 'version']


# read all lines
count = 0
count_k = 0
for row in reader:
  #print(row)
  count += 1
  count_k += 1
  if count_k == 1023:
    print(f"{count} {row[7]},{row[19]},{row[24]}")
    count_k = 0

print(count)

