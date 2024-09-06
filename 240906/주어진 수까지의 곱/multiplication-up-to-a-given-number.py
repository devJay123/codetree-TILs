ab = input().split()
a = int(ab[0])
b = int(ab[1])

prod = 1
for i in range(a, b+1):
    prod *= i

print(prod)