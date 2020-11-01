import sys

def kmp_table(w):
    cnd = 0
    t = [-1]
    for pos in range(1, len(w)):
        if w[pos] == w[cnd]:
            t.append(t[cnd])
            cnd += 1
        else:
            t.append(cnd)
            cnd = t[cnd]
            while cnd >= 0 and w[pos] != w[cnd]:
                cnd = t[cnd]
            cnd += 1
    t.append(cnd)
    return t
string = input()
print(kmp_table(string))