# import numpy as np
def left(grid):
    for i in range(4):
        arr = [x for x in grid[i] if x!=0]
        for j in range(len(arr)-1):
            if(arr[j]== arr[j+1]):
                arr[j] = 2*arr[j]
                arr[j+1] = 0
        arr = [x for x in arr if x!=0]
        for k in range(4-len(arr)):
            arr.append(0)
        grid[i] = arr
def right(grid):
    for i in range(4):
        arr = [x for x in grid[i] if x!= 0]
        for j in range(len(arr)-1,0,-1):
            if(arr[j]== arr[j-1]):
                arr[j] = 2*arr[j]
                arr[j-1] = 0
        arr = [x for x in arr if x!=0]
        for k in range(4-len(arr)):
            arr.insert(k,0)
        grid[i] = arr
def down(grid):
    for i in range(4):
        arr = grid[:,i]
        arr = [x for x in arr if x!=0]
        for j in range(len(arr)-1,0,-1):
            if(arr[j]== arr[j-1]):
                arr[j] = 2*arr[j]
                arr[j-1] = 0
        arr = [x for x in arr if x!=0]
        for k in range(4-len(arr)):
            arr.insert(k,0)
        grid[:,i] = arr
def up(grid):
    for i in range(4):
        arr = grid[:,i]
        arr = [x for x in arr if x!=0]
        for j in range(len(arr)-1):
            if(arr[j]== arr[j+1]):
                arr[j] = 2*arr[j]
                arr[j+1] = 0
        arr = [x for x in arr if x!=0]
        for k in range(4-len(arr)):
            arr.append(0)
        grid[:,i] = arr
f = open("test.txt","r")
board = [[0,0,0,0],
         [0,0,0,0],
         [0,0,0,0],
         [0,0,0,0]]
# board = np.array(board)
for i in range(4):
    s = f.readline().split()
    for j in range(4):
        board[i][j] = int(s[j])
moves = {0: left, 1:up, 2: right, 3:down}
move = int(f.readline())
moves[move](board)
for i in range(4):
    print(str(board[i][0])+ " "+str(board[i][1])+ " "+str(board[i][2])+ " "+str(board[i][3]))
