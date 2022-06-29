len,base = map(int,input().split())
arr = list(map(int,input().split()))

for i in range(len) :
    if arr[i] <base :
        #파이썬에서 print는 자동 줄바꿈인데 end= " "를 줌으로써 끝을 띄어쓰기로 바꿔준다
        print(arr[i], end = " ")