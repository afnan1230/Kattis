books = int(input())
prices = []
for i in range(books):
    prices.append(int(input()))
prices.sort()
prices = prices[::-1]
numGone = books//3
gone = []
for i in range(1,numGone+1):
    gone.append(prices[3*i-1])
print(sum(prices) - sum(gone))