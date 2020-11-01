import math
f = open("test.txt")
n = int(f.read())
print(math.ceil(math.log(n,2))+1)
