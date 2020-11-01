line = [int(x) for x in input().split()]
number = line[0]
numbers = line[1:]
lists = [numbers]
currList = numbers
while(len(currList)==0 or currList.count(currList[0])!= len(currList)):
    temp = []
    for i in range(len(currList)-1):
        temp.append(currList[i+1]-currList[i])
    lists.append(temp)
    currList = temp
printed = str(len(lists)-1)
length = len(lists)-1
for j in range(length):
   current = lists[length-j-1]
   valueDifference = lists[length-j][-1]
   current.append(current[-1]+valueDifference)
printed += " " + str(lists[0][-1])
print(printed)

