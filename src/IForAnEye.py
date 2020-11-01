swaps = {'at': '@',
           'and': '&',
           'one': '1',
           'won': '1',
           'to': '2',
           'too': '2',
           'two': '2',
           'for': '4',
           'four': '4',
           'bea': 'b',
           'be': 'b',
           'bee': 'b',
           'sea': 'c',
           'see': 'c',
           'eye': 'i',
           'oh': 'o',
           'owe': 'o',
           'are': 'r',
           'you': 'u',
           'why': 'y'}
n = int(input())
for i in range(n):
    line = input()
    index = 0
    length = len(line)
    out = []
    while index < length:
        possibilities = []
        for word in swaps:
            current = len(word)
            if(line[index:index+current].lower() == word):
                possibilities.append(word)
        if(possibilities):
            possibilities.sort()
            replacement = possibilities[-1]
            if(line[index].isupper()):
                out.append(swaps[replacement].capitalize())
            else:
                out.append(swaps[replacement])
            index += len(replacement)
        else:
            out.append(line[index])
            index+=1
    print("".join(out))