case = int(input())



for i in range(case) :
    N,M = map(int,input().split())
    count =0
    for j in range(N,M+1):
        for k in str(j) :
            if k == "0" :
                count+=1
    print(count)
