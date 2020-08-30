x = int(input())
for i in range(x):
    number = [int(x) if x!="" else 0 for x in input().split(",")]
    number = number[::-1]
    num = 0
    for j in range(len(number)):
        num+= number[j]*(60**j)
    print(num)