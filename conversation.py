from collections import Counter
M = int(input())
people = {}
for i in range(M):
    line = input().split()
    if(line[0] not in people):
        people[line[0]] = line[1:]
    else:
        people[line[0]].extend(line[1:])

sets = []
for i in people:
    sets.append(set(people[i]))
words = set.intersection(*sets)
if(len(words)==0):
    print("ALL CLEAR")
else:
    s = ""
    for i in people:
        s += " ".join(people[i])
        s+=" "
    x = Counter(s.split(" "))

    order = []
    d = {}
    for i in words:
        d[x[i]] = i
        order.append(x[i])
    order.sort()
    order = order[::-1]

    for i in order:
        print(d[i])
