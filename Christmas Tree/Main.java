def top(n):
    for i in range(1,n+2):
        print(" "*(n+1-i),end="")
        for j in range(1,2*i):
            print("*",end="")
        print()
def top2(n):
    for i in range(2,n+1):
        print(" "*(n+1-i),end="")
        for j in range(1,2*i):
            print("*",end="")
        print()
def rem(n):
    n1=n-2
    while n1>=2:
        for i in range(2,n1+2):
            print(" "*(n+1-i),end="")
            for j in range(1,2*i):
                print("*",end="")
            print()
        n1=n1-1
    print(" "*(n-1),"*")
    print(" "*(n-1),"*")

n=int(input())

if n<2:
    print("You cannot generate christmas tree")
elif n>20:
    print("Tree is no more")
elif n==2:
    for i in range(1,n+2):
        print(" "*(n+1-i),end="")
        for j in range(1,2*i):
            print("*",end="")
        print()
    print(" "*(n-1),"*")
    print(" "*(n-1),"*")
else:
    top(n)
    top2(n)
    rem(n)