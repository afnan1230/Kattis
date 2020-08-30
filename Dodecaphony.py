notes = ["C","C#","D","D#","E","F","F#","G","G#","A","A#","B"]
def transposition(arr1,arr2, notes):
    first_distance = calculate_distance(arr1[0], arr2[0],notes)
    for i in range(len(arr1)):
        if(calculate_distance(arr1[i],arr2[i],notes)!= first_distance):
            return False
    return True
def retrograde(arr1,arr2,notes):
    return arr1[::-1] == arr2
def inversion(arr1,arr2,notes):
    inverse = [arr1[0]]
    added = ""
    for i in range(1,len(arr1)):
        distance = notes.index(arr1[i]) - notes.index(arr1[0])
        new_dis = distance * -1
        if(notes.index(arr1[0])+new_dis<0):
            added = notes[len(notes)+(notes.index(arr1[0])+new_dis)]
        elif(notes.index(arr1[0])+new_dis>=len(notes)):
            added = notes[(notes.index(arr1[0])+new_dis)-len(notes)]
        else:
            added = notes[notes.index(arr1[0])+new_dis]
        inverse.append(added)
    print(inverse)
    return inverse == arr2
def calculate_distance(s,d,notes):
    if(notes.index(d)-notes.index(s)>=0):
        return notes.index(d) - notes.index(s)
    else:
        dist = notes.index(d)-notes.index(s)
        return len(s) - notes.index(s) - notes.index(d)

n = int(input())
first = input().split()
second = input().split()
if(transposition(first,second,notes)):
    print("Transposition")
elif(retrograde(first,second,notes)):
    print("Retrograde")
elif(inversion(first,second,notes)):
    print("Inversion")
else:
    print("Nonsense")
