a,b = tuple([int(x) for x in input().split()])
m,sigma = tuple([int(x) for x in input().split()])
x=0
y=0
if(a>b):
    x = m-1 
    y = 1
    while(x>0):
        if(2*x+y>=sigma):
            print(a*x+b*y)
            break
        else:
            x-=1
            y+=1
else:
    y = m-1
    x = 1
    while(y>0):
        if(2*x+y>=sigma):
            print(a*x+b*y)
            break
        else:
            x+=1
            y-=1
