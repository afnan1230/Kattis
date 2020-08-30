class Primes:
    def __init__(self, length):
        self.l = [True for i in range(length+1)]
        self.l[0] = False
        self.l[1] = False
    def isPrime( self,x):
        return self.l[x]
    def isComposite(self,x):
        return (not isPrime(x))
    def computePrimes(self):
        for i in range(2,len(self.l)):
            if(self.l[i]):
                for j in range(i+i,len(self.l),i):
                    self.l[j] = False
n, q = tuple([int(x) for x in input().split()])
s = Primes(n)
s.computePrimes()
print(sum(s.l))
for i in range(q):
    l = int(input())
    if(s.isPrime(l)):
        print(1)
    else:
        print(0)
            
