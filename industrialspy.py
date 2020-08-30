import math
from itertools import permutations
def isPrime(num):
    x = int(num)
    
    limit = x**0.5
    if(x == 0):
        return False
    elif(x == 1):
        return False
    elif(x == 2):
        return True
    for i in range(2,int(limit)+1):
        if(x%i==0):
            return False
    return True
cases = int(input())
primes = 0
for i in range(cases):
    case = input()
    numbers = []
    for k in range(1,len(case)+1):
        a = permutations(case,k)
        numbers.extend([int("".join(j)) for j in a])
    for x in set(numbers):
        if(isPrime(x)):
            primes+=1
    print(primes)
    primes = 0
    