"""There's a baseball player who can score 3 or 5 or 10 points in a single move. Given a total score n, find and print all the distinct combinations to reach the given score, also print the total number of possible combinations.
For input: Create a method that will take "n" as parameter"""


from itertools import combinations_with_replacement
from functools import reduce
n = 13
#n is the submission
ls=[3,5,10]
#list of values

def goals(n,ls):
    lst=[]
    for i in range(1,n):
        ls1=list(combinations_with_replacement(ls,r=i))
        for j in ls1:
            if reduce(lambda x,y:x+y,j)==n:
                lst.append(j)
    return (lst)

def count1():
    x=goals(n,ls)
    return len(x)


print(count1()) #This will give the number of possible combinations
print(goals(n,ls)) #This will give the list of combinations
