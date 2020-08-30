n = int(input())
energy = []
gold = []
for i in range(n):
    line = input().split()
    if(line[0]=="add"):
        energy.append(int(line[1]))
        gold.append(int(line[2]))
    else:
        ene = 0
        j = int(line[1])
        h = j
        while(j>0 and h>0):
            indices = [i for i, x in enumerate(energy) if x == j]
            if(len(indices)>0):
                if(len(indices)==1):
                    ene+= gold[indices[0]]
                    h-=energy[indices[0]]
                    energy.remove(energy[indices[0]])
                    gold.remove(gold[indices[0]])
                    j = h
                else:
                    m = max([gold[x] for x in indices])
                    ene+=m
                    h-= energy[gold.index(m)]
                    energy.remove(gold.index(m))
                    gold.remove(m)
                    j = h
            else:
                j-=1
            
        print(ene)

