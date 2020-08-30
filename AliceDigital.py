cases = int(input())
maxSum = 0
for i in range(cases):
    elements,m = tuple([int(x) for x in input().split()])
    maxSum=0
    data = [int(x) for x in input().split()]
    indices = [c for c,x in enumerate(data) if x == m]
    for j in indices:
        sub = [m]
        diff = 1
        while(j-diff>=0 and data[j-diff]> m):
            sub.append(data[j-diff])
            diff+=1
        diff=1
        while(j+diff<len(data) and data[j+diff]> m):
            sub.append(data[j+diff])
            diff+=1
        if(sum(sub)>= maxSum):
            maxSum = sum(sub)
    print(maxSum)

        
