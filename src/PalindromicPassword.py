n = int(input())
for i in range(n):
    number = input()
    palindromes = []
    if(number == number[::-1]):
        palindromes.append(int(number))
    diff = 0
    while(len(palindromes)<1):
        s = str(eval(number+"+1+"+str(diff)))
        d = str(eval(number+"-1-"+str(diff)))
        if(s == s[::-1] and len(s) == 6):
            palindromes.append(int(s))
        if(d == d[::-1] and len(d) == 6):
            palindromes.append(int(d))
        diff+=1
    if(len(palindromes) == 1):
        print(palindromes[0])
    else:
        print(min(palindromes))