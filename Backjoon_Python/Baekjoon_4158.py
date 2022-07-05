import sys
input = sys.stdin.readline



s = set()

while (True) :

    N,M = map(int,input().split())
    if N == M == 0:
        break

    for i in range(N) :
        cd = int(input())
        s.add(cd)

    answer = 0
    for _ in range(M) :
        cd = int(input())
        if cd in s :
            answer += 1


print(answer)