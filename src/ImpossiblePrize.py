items, maxPrice = tuple([int(x) for x in input().split()])
items = [int(x) for x in input().split()]
items.sort()
count = 0
for i in range(len(items)-1):
    if(items[i]+items[i+1]> maxPrice):
        count = i+1
        break
    count = i+2
if(len(items)==1):
    print(1)
else:
    print(count)