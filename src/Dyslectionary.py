# # import sys
# # def main():
# #     length = 0
# #     words = []
# #     for line in sys.stdin:
# #         if line == "\n":
# #             words = sorted(words)
# #             for x in words:
# #                 print(x[::-1].rjust(length," "))
# #             print()
# #             words = []
# #             length = 0
# #         else:
# #             word = str(line.strip())
# #             word = word[::-1]
# #             words.append(word)
# #             if(len(word) > length):
# #                 length = len(word)
# # main()
while True:
    try:
        s = input()
        words = []
        length = 0
        while(s != ""):
            words.append(s[::-1])
            if(len(s)>length):
                length = len(s)
            s = input()
        words = sorted(words)
        for x in words:
            print(x[::-1].rjust(length," "))
        print()
    except:
        break
# import sys

# def main():
# 	maxLen = 0
# 	itemList = [ [] for i in range(26)]

# 	for line in sys.stdin:
# 		if line == '\n':
# 			for i in range(26):
# 				itemList[i] = sorted(itemList[i])
# 				for x in itemList[i]:
# 					spaces = maxLen - len(x)
# 					print(' '* spaces + x[::-1])
# 			print()

# 			maxLen = 0
# 			itemList = [ [] for i in range(26)]
# 			continue
	
# 		else:
# 			item = str(line.strip())
# 			item = item[::-1]
# 			lastChar = item[0]
# 			itemList[ord(lastChar) - ord('a')].append(item)
# 			maxLen = len(item) if (len(item) > maxLen) else maxLen
	
# 	for i in range(26):
# 		itemList[i] = sorted(itemList[i])
# 		for x in itemList[i]:
# 			spaces = maxLen - len(x)
# 			print(' ' * spaces + x[::-1])

# main()
