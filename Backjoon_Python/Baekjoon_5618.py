#from math import gcd,sqrt

# n = int(input())
# list = list(map(int,input().split()))
# list2 = []

# if n==2 :
#     max = gcd(list[0],list[1])
# else:
#     max = gcd(list[0],list[1],list[2])

# for i in range(1,max+1) :
#     if max%i ==0 :
#         list2.append(i)
# list2.sort()
# for i in range(len(list2)) :
#      print(list2[i])
################################################################
# for i in range(1,min(list)+1) :
#     for j in range(len(list)) :
#         if list[j]%i !=0 :
#             break
#         if j == len(list)-1 :
#             list2.append(i)
# list2.sort()
# for i in range(len(list2)) :
#     print(list2[i])
################################################################
from math import gcd, sqrt
n = int(input())
lst = []

if n == 2:
    a, b = map(int, input().split())
    gcd_ = gcd(a, b)


if n == 3:
    a, b, c = map(int, input().split())
    gcd_ = gcd(gcd(a, b), c)

for i in range(1, int(sqrt(gcd_)) + 1):
    if gcd_ % i == 0:
        lst.append(i)
        if i**2 != gcd_:
            lst.append(gcd_ // i)

lst.sort()

for num in lst:
    print(num)