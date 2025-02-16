X = int(input())
N = int(input())

total_sum = 0
for i in range(N):
    a, b = map(int, input().split())
    total_sum += a * b
    
if total_sum == X:
    print('Yes')
else:
    print('No')