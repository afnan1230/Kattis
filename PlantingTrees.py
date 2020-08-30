trees = int(input())
days = [int(x) for x in input().split()]
days.sort()
days = days[::-1]
day = 1
maxDays = 0
for i in days:
    sprout = day + i
    if(sprout>maxDays):
        maxDays = sprout
    day+=1
print(maxDays+1)