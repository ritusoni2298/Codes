def task3(st):
    ls=list("aeiouAEIOU")
    s=""
    for i in st:
        if i in ls:
            s+='X'
        else:
            s+=i
    return s

print(task3('consultadd'))
