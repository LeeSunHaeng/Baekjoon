A,B = map(str,input().split())
C = ""
D = ""
for i in range(2,-1,-1) :
    C += A[i]
    D += B[i]

if int(C) >int(D) :
    print(C)
else :
    print(D)
