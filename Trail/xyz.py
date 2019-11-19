st="aaabbbdhsbvabbbbdddccc"
dict1={}

for i in st:
    if i not in dict1:
        dict1[i]=1 
    else: 
        dict1[i]+=1
count=3
dict2={}
for i,k in sorted(dict1.items(),reverse=True, key = lambda x: (x[1],x[0])):
    # keys=list(dict2.keys())
    # kys=list(dict2.values())
    # if k in dict2.values():
    #     if ord(keys[kys.index(k)])==ord(i):
    #         dict2.insert(dict2.index('b')+1,k)
    # else:    
    # dict2[i]=k
    print(i,k)
    count-=1
    if count==0:
        break

print(dict2)
# for i,k in dict2.items():
    
