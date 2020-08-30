R,C = tuple([int(x) for x in input().split()])
grid = []
for i in range(R):
    grid.append(list(input()))
# for i in range(R-2,-1,-1):
#     for j in range(C):
#         if(grid[i][j] == "a"):
#             row = i
#             while(row<R-1 and grid[row+1][j]=="."):
#                 grid[row+1][j] = "a"
#                 grid[row][j] = "."
#                 row+=1

# for i in range(R):
#     print("".join(grid[i]))
for c in range(C):
    spots = 0
    for r in range(R-1,-1,-1):
        if(grid[r][c] == "."):
            spots +=1
        elif(grid[r][c] == "#"):
            spots = 0
        elif(grid[r][c] == "a" and spots >0):
            grid[r][c] = "."
            grid[r+spots][c] = "a"
for i in range(R):
    print("".join(grid[i]))