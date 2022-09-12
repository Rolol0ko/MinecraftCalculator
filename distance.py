from math import *

x1 = int(input("x1:"))
y1 = int(input("y1:"))
z1 = int(input("z1:"))

x2 = int(input("x2:"))
y2 = int(input("y2:"))
z2 = int(input("z2:"))

def distance():
    return[sqrt(((x2-x1)**2)+((y2-y1)**2)+((z2-z1)**2))]

print(distance())