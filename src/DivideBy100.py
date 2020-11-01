N = input()
M = str(input())
output = ""
power = len(M)
length = len(N)

s = length - power
leadingZeroes = 0
if(s<0):
    leadingZeroes = s*-1
if(leadingZeroes ==0):
    output = N[0:s+1]+ "."+N[s+1:]
else:
    output = "0." +"0"*(leadingZeroes-1) + N
if(output[-1] == "."):
    output = output[0:len(output)-1]
index = output.index(".")
t = set(output[index+1:])
if(len(t) == 1 and t.pop() == "0"):
    print(output[0:index])
elif(float(output)>=1):
    print(output.strip("0"))
else:
    print(output.rstrip("0"))