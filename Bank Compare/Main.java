principal=int(input())
time=int(input())

s1=0
s2=0

b1slabs=int(input())

for i in range(1,b1slabs+1):
    tim1,mnintr1=input().split()
    tim1=int(tim1)
    mnintr1=float(mnintr1)
    
    s1+=((principal*mnintr1)/(1-(1/(1+mnintr1)**(tim1*12))))
    
    
b2slabs=int(input())

for j in range(1,b2slabs+1):
    tim2,mnintr2=input().split()
    tim2=int(tim2)
    mnintr2=float(mnintr2)
    
    s2+=((principal*mnintr2)/(1-(1/(1+mnintr2)**(tim2*12))))
    
if s2<s1:
    print("Bank B")
else:
    print("Bank A")