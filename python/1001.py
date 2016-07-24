a,b = raw_input().split( )
c = int(a)+int(b)
Mystr = str(int(c))
for i in range(len(Mystr) - 3, 0,-3):
    if(not (i==1 and c < 0)):
        Mystr = Mystr[:i] + "," + Mystr[i:]
print Mystr
