A = int(input())
B = int(input())
C = int(input())
num = str(A*B*C)
list = [0 for i in range(10)]
for i in range(0,len(str(num))) : 
    list[int(num[i])] += 1

for i in range(10) :
    print(list[i])
