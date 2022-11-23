class Solution(object):
    def spiralOrder(self, matrix):
        
        n = len(matrix)
        m = len(matrix[0])
        
        def go_outside(x, y):
            if x < 0 or x >= n or y < 0 or y >= m:
                return True
            return False
        
        visited = [[False] * m for _ in range(n)]
        
        end = 1
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        
        x = 0
        y = 0
        
        ans = [matrix[0][0]]
        visited[0][0] = True
        
        idx = 0
        while (True):
            if (end == n*m):
                break
            
            dx = directions[idx%4][0]
            dy = directions[idx%4][1]
            
            if (go_outside(x+dx, y+dy)):
                idx += 1
                continue
            if (visited[x+dx][y+dy]):
                idx += 1
                continue
            x = x + dx
            y = y + dy
            ans.append(matrix[x][y])
            visited[x][y] = True
            end += 1
            
        return ans
            

        