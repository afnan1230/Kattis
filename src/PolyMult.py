def multiply(poly1, poly2):
    length = (len(poly1)-1)+(len(poly2)-1)+1
    product = [0]*length
    degree1,degree2 = (len(poly1)-1,len(poly2)-1)
    for i in range(degree1+1):
        for j in range(degree2+1):
            product[(degree1-i)+(degree2-j)]+= poly1[i]*poly2[j]
    st = ""
    for i in product[::-1]:
        st+= str(i) + " "
    st = st.strip()
    return st
# f = open("test.txt","r")
numCases = int(input())
for i in range(numCases):
    deg1 = int(input())
    pol1 = [int(x) for x in input().split()]
    deg2 = int(input())
    pol2 = [int(x) for x in input().split()]
    print(deg1+deg2)
    print(multiply(pol1,pol2))