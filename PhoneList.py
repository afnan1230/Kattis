cases = int(input())

for i in range(cases):
    yes = True
    numbers = []
    numNumbers = int(input())
    for j in range(numNumbers):
        numbers.append(input())
    numbers.sort()
    for i in range(1,len(numbers)):
        if(numbers[i].startswith(numbers[i-1])):
            yes = False
            break
    if(yes):
        print("YES")
    else:
        print("NO")
