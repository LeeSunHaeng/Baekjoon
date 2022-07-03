N = int(input())
if N%10 != 0 :
    print(-1)
else :
    print(N//300, end=" ")
    N %= 300
    print(N//60, end=" ")
    N %= 60
    print(N//10, end=" ")