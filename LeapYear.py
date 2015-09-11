'''
Created on Sep 11, 2015

@author: Nurul
'''
def main():
    
    year= int(input("Type A Year: "))
    
    print("\n") #Prints on next line
    if (year % 4 == 0):
        print("LEAP YEAR")
    else:
        print("NOT A LEAP YEAR")
main()