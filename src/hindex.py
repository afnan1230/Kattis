# # n = int(input())
# # papers = []
# # h = 0
# # for i in range(n):
# #     papers.append(int(input()))
# # papers = sorted(papers)
# # while (len(papers) >0 and papers[-1]>h):
# #     papers.pop()
# #     h+=1
# # print(h)
# n = int(input())
# papers = []
# h = 0
# for i in range(n):
#     papers.append(int(input()))
# papers = sorted(papers)
# length = len(papers)
# while(h<len(papers)):
#     if(papers[length-1-h]>h):
#         h+=1
#     else:
#         break
# print(h)
while True:
    try:
        a, sign, b = input().split()
        s = 0
        if(sign == "+"):
            s = int(a) + int(b)
        elif(sign == "^"):
            s = int(a) ** int(b)
        else:
            s = int(a)*int(b)
        d4 = str(s)[-4:]
        print(int(d4))
    except:
        break