word = input()
count = 0
if word == " " :
    print(0)
else :
    for i in range(len(str(word))):
        if i != 0 and i !=len(str(word))-1 :
            if word[i] == " " :
                count += 1
    print(count+1)
