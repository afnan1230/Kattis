flip = [0,1,2,-1,-1,5,9,-1,8,6]
def flipped(num):
    x = ""
    n = int(num)
    while(n > 0):
        digit = n % 10
        if(flip[digit]==-1):
            return -1
        else:
            x+= str(digit)
            n = n//10
    return int(x)
line1 = input().split()
cards = int(line1[0])
wanted = int(line1[1])
line2 = [int(x) for x in input().split()]
yes = False
for i in range(len(line2)):
    val = line2[i]
    desired = wanted - line2[i]
    desired2 = wanted - flipped(line2[i])
    line2.remove(line2[i])
    if(desired in line2 or flipped(desired) in line2 or desired2 in line2 or flipped(desired2) in line2):
        print("YES")
        yes = True
        break
    line2.insert(i,val)
if(not yes):
    print("NO")

