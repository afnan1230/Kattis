N = int(input())
h = set()
stri = ""
for i in range(int(N**0.5)):
    if(N%(i+1) == 0):
        h.add(i)
        h.add((N/(i+1))-1)
for i in h:
    stri += str(int(i))+" "
    
stri = stri.strip(" ")
print(stri)