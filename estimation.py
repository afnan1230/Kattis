import sys
import math
(r,m,c) = tuple(input().split())
while((r,m,c)!=("0","0","0")):
    trueArea = math.pi*(float(r)**2)
    ratio = int(c)/int(m)
    estimate = ((float(r)*2)**2)*ratio
    if(estimate == int(estimate)):
        estimate = int(estimate)
    print(trueArea,estimate)
    (r,m,c) = tuple(input().split())
     