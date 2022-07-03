from itertools import combinations


N,M = map(int,input().split())
list = combinations(list(map(int,input().split())),3)
max =0
for i in list :
    if sum(i) <= M and sum(i) > max :
        max = sum(i)
print(max)
        
