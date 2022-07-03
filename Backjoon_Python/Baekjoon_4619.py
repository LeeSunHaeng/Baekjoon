import math

while(1):
    a,b = map(int,input().split())
    if a==0 and b== 0 :
        break
    for i in range(1,a+1) :
        if pow(i,b) > a :
           if abs(a-pow(i,b)) > abs(a-pow(i-1,b)) :
                print(i-1)
                break
           else :
                print(i)
                break
        elif pow(i,b) == a :
                print(i)
                break
        else :
            pass
                
           