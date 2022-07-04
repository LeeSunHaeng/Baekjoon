import sys
input = sys.stdin.readline

N,M = map(int,input().split)

s = set()

while (True) :
    for i in range(N) :
        cd = int(input())
        s.add(cd)

    answer = 0
    for _ in range(M) :
        cd = int(input())
        if cd in s :
            answer += 1

    print(answer)