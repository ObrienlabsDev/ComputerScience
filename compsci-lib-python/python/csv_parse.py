# CSV parser
# 20261001 Michael OBrien michael at obrienlabs.dev

from pathlib import Path
#import os.path
import csv

#path = Path("/Users/michaelobrien/wse_github/ObrienlabsDev/ComputerScience/compsci-lib-python/python/csv-data.csv")
path = Path(__file__).parent / "data.csv"

lines = path.read_text().splitlines()
reader = csv.reader(lines)
header_row = next(reader) # read only the 1st line
print(header_row)

