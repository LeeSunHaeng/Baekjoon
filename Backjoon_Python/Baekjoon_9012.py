from threading import stack_size


N = int(input())
for i in range(N):
    temp = input()
    stack = []
    for j in range(len(temp)) :
        if j == 0 and temp[j] == ")" :
            print("NO")
            break

        if temp[j] == "(" :
            stack.append("(")
        else :
            if stack:
                    stack.pop()
            else :
                print("NO")
                break
        if j == len(str(temp))-1 :

            if len(stack) == 0 :
                print("YES")
            else:
                print("NO")
   
            