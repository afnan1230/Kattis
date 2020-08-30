num1 = ""
num2 = ""
num1,num2 = tuple(input().split())
while(not(num1 == "0" and num2 == "0")):
    num1 = num1[::-1]
    num2 = num2[::-1]
    m = min(len(num1),len(num2))
    last = 0
    count = 0
    for i in range(m):
        if(int(num1[i])+ int(num2[i])+last >=10):
            count+=1
        if(int(num1[i])+ int(num2[i])+last >=10):
            last = 1
        else:
            last = 0
    if(min(len(num1),len(num2)) !=max(len(num1),len(num2))):
        if(len(num1) == max(len(num1),len(num2))):
            for i in range(min(len(num1),len(num2)),len(num1)):
                if(int(num1[i])+last>=10):
                    count+=1
                if(int(num1[i])+last >= 10):
                    last = 1
                else:
                    last = 0
        else:
            for i in range(min(len(num1),len(num2)),len(num2)):
                if(int(num2[i])+last>=10):
                    count+=1
                if(int(num2[i])+last >= 10):
                    last = 1
                else:
                    last = 0
    if(count == 0):
        print("No carry operation.")
    elif(count == 1):
        print("1 carry operation.")
    else:
        print(str(count)+ " carry operations.")
    num1,num2 = tuple(input().split())