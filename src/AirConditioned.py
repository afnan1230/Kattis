# minions = int(input())
# rooms = []
# index = -1
# fit = False
# for i in range(minions):
#     inter = [int(x) for x in input().split()]
#     if(len(rooms)==0):
#         rooms.append(set(range(inter[0],inter[1]+1)))
#         index+=1
#     else:
#         tolerable = set(range(inter[0],inter[1]+1))
#         for j in range(len(rooms)):
#             fit = False
#             intersect = set.intersection(tolerable,rooms[j])
#             if(len(intersect)!=0):
#                 rooms[j] = intersect
#                 fit = True
#                 break
#         if(not fit):
#             rooms.append(tolerable)
# print(len(rooms))
class Minion:
    def __init__(self, lower, upper):
        self.lower = lower
        self.upper = upper
    def __lt__(self, other):
        return self.upper<other.upper
    def __gt__(self,other):
        return other.__lt__(self)
    def __eq__(self,other):
        return self.lower == other.lower and self.upper == other.upper
minionsnum = int(input())
minions = []
rooms = 1
thresh = 0
for i in range(minionsnum):
    inter = [int(x) for x in input().split()]
    minions.append(Minion(inter[0],inter[1]))
minions.sort()
thresh = minions[0].upper
for minion in minions:
    if(minion.lower>thresh):
        rooms+=1
        thresh = minion.upper
print(rooms)
    