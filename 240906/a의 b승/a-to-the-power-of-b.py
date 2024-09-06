ab = input().split()

a = int(ab[0])
b = int(ab[1])

prod = 1

for _ in range(b):
    prod *= a

print(prod)