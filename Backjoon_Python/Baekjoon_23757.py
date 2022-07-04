import heapq,sys

input = sys.stdin.readline

N, M = map(int,input().split())

giftArr = list(map(int,input().split()))
wishArr = list(map(int,input().split()))

heap = []

for i in range(N) :
    heapq.heappush(heap,-giftArr[i])

for i in range(M) :
    wishCount = wishArr[i]

    maxCount = -heapq.heappop(heap)

    if wishCount > maxCount :
        print(0)
        exit(0)

    if wishCount == maxCount :
        continue
    
    remain = maxCount - wishCount
    heapq.heappush(heap, -remain)

print(1)
    

