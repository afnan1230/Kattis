n,p,m = tuple([int(x) for x in input().split()])
# f = open("test.txt","r")
# n,p,m = tuple([int(x) for x in f.readline().split()])
participants = {}
winners = []
for i in range(n):
    participants[input()] = 0
    # participants[f.readline().strip("\n")]=0
for i in range(m):
    person,point = tuple([x for x in input().split()])
    # person,point = tuple([x for x in f.readline().split()])
    participants[person]+= int(point)
    if(participants[person]>= p and person not in winners):
        winners.append(person)
if(len(winners)!=0):
    for i in winners:
        print(i+" wins!")
else:
    print("No winner!")
