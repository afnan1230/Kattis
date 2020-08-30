people = int(input())
nights = int(input())
songs = []
song = -1
for i in range(nights):
    line = [int(x) for x in input().split()]
    line.remove(line[0])
    if(1 in line):
        song+=1
        songs.append(set(line))
        songs[song].remove(1)
    else:
       for i in range(len(songs)):
        songs[i].update(line)
end = list(set.intersection(*songs))
end.sort()
print(1)
for i in end:
    print(i)

