import sys
for line in sys.stdin:
    number = int(line)
    remainder = 1%number
    digits = 1
    while remainder:
        remainder = (10*d+1)%number
        digits+=1
    print(digits)
    