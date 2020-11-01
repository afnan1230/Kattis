from collections import Counter
def one(arr):
    x = set(arr)
    for i in x:
        diff = 7777 - i
        if(diff in arr and diff != i):
            return "Yes"
    return "No"
def two(arr):
    if(len(set(arr)) == len(arr)):
        print("Unique")
    else:
        print("Contains duplicate")
def three(arr):
    length = len(arr)/2
    x = Counter(arr)
    for i in x:
        if(x[i]>length):
            return i
    return -1
def four(arr):
    arr.sort()
    if(len(arr)%2==1):
        middle = len(arr)//2
        print(arr[middle])
    else:
        middle = len(arr)//2
        print(str(arr[middle-1])+" "+ str(arr[middle]))
def five(arr):
    li = []
    for i in arr:
        if (i>=100 and i<=999):
            li.append(i)
    li.sort()
    return li

N,t = tuple([int(x) for x in input().split()])
A = [int(x) for x in input().split()]
if(t == 1):
    print(one(A))
elif(t == 2):
    two(A)
elif(t == 3):
    print(three(A))
elif(t == 4):
    four(A)
else:
    x = five(A)
    for i in x:
        print(str(i), end = " ")

