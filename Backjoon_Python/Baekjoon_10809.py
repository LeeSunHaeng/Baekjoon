word = input()
list = [-1 for i in range(26)]

for i in range(len(str(word))) :
    if list[ord(word[i])-97] != -1 :
        continue
    else :
        list[ord(word[i])-97] = i

for i in range(len(list)) :
    print(list[i],end = " ")