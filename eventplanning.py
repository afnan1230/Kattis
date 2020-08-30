participants, budget, hotels, weeks = tuple([int(x) for x in input().split()])
available = []
for i in range(hotels):
    price = int(input())
    a = [participants*price for x in input().split() if int(x)>=participants]
    available.extend(a)
available.sort()
if(len(available)==0 or available[0]> budget):
    print("stay home")
else:
    print(available[0])