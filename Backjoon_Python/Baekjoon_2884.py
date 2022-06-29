H,m = map(int,input().split())
if m>=45 :
    print(H,m-45)
else:
    if H==0 :
        print(23,m+15)
    else :
        print(H-1,m+15)