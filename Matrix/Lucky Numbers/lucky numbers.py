class Solution:
    def luckyNumbers(self, matrix):
        v = []
        for i in range(len(matrix)):
            a = min(matrix[i])
            j = matrix[i].index(a)
            maxi = float('-inf')
            for k in range(len(matrix)):
                maxi = max(maxi, matrix[k][j])
            if maxi == a:
                v.append(a)
        return v
