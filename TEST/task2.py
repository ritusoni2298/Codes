l = ["h", "f", "w",64, 25, 12, 22, 11, 1,2,44,3,122, 23, 34,"B", "D", "E", "C"]

def task2(l):
    dig=[]
    u=[]
    for i in l:
        if type(i) == int:
            dig.append(i)
        elif type(i) == str:
            u.append(i)

    for i in range(len(dig)):
        for j in range(i + 1, len(dig)):
            if dig[i] > dig[j]:
               dig[i], dig[j] = dig[j], dig[i]
               
    for pa in range(len(u)):
      for i in range(pa+1,len(u)):
        if u[pa] > u[i]:
          u[pa], u[i] = u[i], u[pa]
    return dig+u    

print(task2(l))
