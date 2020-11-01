import sys
he = {"0":0,"1":1,"2":2,"3":3,"4":4,"5":5,"6":6,"7":7,"8":8,"9":9,"A":10,"B":11,"C":12,"D":13,"E":14,"F":15}
for line in sys.stdin:
    s = str(line).upper()
    h = str(line)
    while("0X" in s):
        i = s.index("0X")
        p = h[i:i+2]
        count = 0
        index = i+2
        while(index<len(s) and s[index] in he and count< 8 ):
            p+= h[index]
            index+=1
        print(p+" "+ str(int(p,16)))
        s = s.replace(p.upper(),"",1)
        h = h.replace(p,"",1)