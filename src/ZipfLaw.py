from collections import Counter
import string
while True:
    try:
        n = int(input())
        s = ""
        test = ""
        arr= []
        while(s != "EndOfText"):
            test+= s+ " "
            s = input()
        test = test.lower()
        table = str.maketrans(string.punctuation, ' '*len(string.punctuation))  # OR {key: None for key in string.punctuation}
        new_s = test.translate(table) 
        x = Counter(new_s.split())
        for i in x:
            if(x[i]==n):
                arr.append(i)
        if(len(arr) == 0):
            print("There is no such word.")
        else:
            arr.sort()
            for i in arr:
                print(i)
        print()
    except:
        break