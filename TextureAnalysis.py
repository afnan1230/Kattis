import sys
number = 1
for line in sys.stdin:
    test = line
    space = 0
    currentSpace = 0
    time = 1
    even = True
    first = True
    if(line == "END\n"):
        break
    for x,i in enumerate(test):
        if(i=="*" and x == 0):
            first = False
        elif(i == "."):
            currentSpace+=1
        elif(i=="*" and time == 1):
            space = currentSpace
            currentSpace = 0
            time+=1
        elif(i=="*" and time != 1):
            if(currentSpace != space):
                even = False
                break
            currentSpace = 0
    if(even):
        print(str(number)+" EVEN")
    else:
        print(str(number)+" NOT EVEN")
    number+=1