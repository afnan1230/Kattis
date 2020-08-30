n,k = tuple([int(x) for x  in input().split()])
preferences = []
ranking = []
available = []
teams = []
for i in range(n):
    line = input().split()
    num = int(line[0])
    preferences.append(line[1:])
    preferences[i] = preferences[i][::-1]
    teams.append([])
players = int(input())
for i in range(players):
    s = input()
    ranking.append(s)
    available.append(s)
available = available[::-1]
avail = set(available)
for i in range(k):
    for j in range(n):
        picked = False
        pick = ""
        while(not picked and len(preferences[j])>0):
            pick = preferences[j].pop()
            if(pick in avail):
                teams[j].append(pick)
                available.remove(pick)
                avail.remove(pick)
                picked = True
        if(not picked):
            pick = available.pop()
            teams[j].append(pick)
for i in teams:
    print(" ".join(i))
