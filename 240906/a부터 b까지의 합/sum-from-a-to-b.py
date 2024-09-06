ab = input().split()

a = int(ab[0])
b = int(ab[1])

sum = 0
for i in range(a, b+1):
    sum += i

print(sum)