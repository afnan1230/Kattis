class team():
    def __init__(self, team, favorite = False):
        self.penalties = 0
        self.team = team
        self.favorite = favorite
        self.completed = 0
    def __eq__(self, other):
        return self.team == other.team
    def __lt__(self, other):
        if(self.completed == other.completed):
            if(self.penalties == other.penalties):
                return self.favorite
            return self.penalties<other.penalties
        return self.completed > other.completed
    def __gt__(self, other):
        return other.__lt__(self)
    def __ne__(self, other):
        return not self.__eq__(other)
    def addCompleted(self):
        self.completed +=1
    def addPenalties(self,num):
        self.penalties += num
f = open("test.txt","r")
# line1 = f.readline().split()
line1 = input().split()
numTeams = int(line1[0])
numEvents = int(line1[1])
teams = []
for i in range(1,numTeams+1):
    if(i==1):
        teams.append(team(int(i),True))
    else:
        teams.append(team(int(i)))
for i in range(numEvents):
    line = input().split()
    # line = f.readline().split()
    ind = teams.index(team(int(line[0])))
    teams[ind].addCompleted()
    teams[ind].addPenalties(int(line[1]))
    teams.sort()
    print(teams.index(team(1))+1)
