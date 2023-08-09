# Variables
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

# Method 1
for a in range(1, len(numeros), 2):
    print(a)

# Method 2
for b in numeros:
    if b%2 !=0: print(b)