from itertools import combinations
from math import lcm


input = list(map(int,input().split()))

list = combinations(input,3)
list2 = []

for i in list :
    list2.append(lcm(i[0],i[1],i[2]))

list2.sort()
print(list2[0])