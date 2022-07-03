while(1):
    len = list(map(int,input().split()))
    if len[0]==0 and len[1] ==0 and len[2]==0 :
        break
    else :
        len.sort()
        if len[0]*len[0]+len[1]*len[1] == len[2]*len[2] :
            print("right")
        else :
            print("wrong")
