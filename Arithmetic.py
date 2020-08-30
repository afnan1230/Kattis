number = input()
number = number[::-1]
base10=0
for i in range(len(number)):
    digit = int(number[i])
    base10 += digit*(8**i)
decToHex = {0:"0", 1:"1", 2:"2", 3:"3", 4:"4",5:"5",6:"6",7:"7",8:"8",9:"9",10:"A",11:"B",12:"C",13:"D",14:"E",15:"F"}
base16 = hex(base10)
base16 = base16.upper()
base16 = base16[2:]
print(base16)


