a = input().split()
b = input().split()

aMath = int(a[0])
aEng = int(a[1])
bMath = int(b[0])
bEng = int(b[1])

if aMath > bMath and aEng > bEng:
    print(1)
else :
    print(0)