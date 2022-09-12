from math import *

dimension = input("which dimension do you want coords for? (n(ether) or o(verworld)) ")

#Overworld to Nether
if dimension == "n":
    x = input("Overworld x: ")
    z = input("Overworld z: ")
    
    x2 = int(x)/8
    z2 = int(z)/8
    
    print("The coords to build the portal at in the nether are " + str(x2) + " : " + str(z2))

#Nether to Overworld
elif dimension == "o":
    x = input("Nether x: ")
    z = input("Nether z: ")
    
    x2 = int(x)*8
    z2 = int(z)*8
    
    print("The coords to build the portal at in the overworld are " + str(x2) + " : " + str(z2))
#if they're stupid
else:
    print("That's not an answer silly, try again")
