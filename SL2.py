# -*- coding: utf-8 -*-
"""
1. Write a menu driven program to practice String functions
Design following meu
a. display characters from even position
b. display characters from odd position
c. display length of a string
d. add a at the end of string length times
e. exit
"""
import sys
st=input("Enter String: ")

def disp_even(st):
    ans=st[0::2]
    print(f"Even charactered string will be {ans} ")
    return True

def disp_odd(st):
    ans=st[1::2]
    print(f"Even charactered string will be {ans} ")
    return True


while True:
    ch=int(input('''1. Display characters from even position
                 2. Display characters from odd position
                 3. Display length of a string
                 4. add a at the end of string length times
                 5. Exit
                 Enter your choice: '''))
    match ch:
        case 1:
            disp_even(st)
        case 2:
            disp_odd(st)
        case 3:
            if len(st):
                print(f"Length of string '{st}' is  ",len(st))
            else:
                print("String is empty!!")
        case 4:
            ans=st+'a'*len(st)
            print(f"Required string is {ans}")
        case 5:
            print("THANK YOU!!!")
            sys.exit(0)

'''
2. Write a program to accept a string from user.
Accept a second string from user to search and find all occurrences of in the given string.
'''

def count_occ(st,key):
    
    indices = []   # to store all positions

    for i in range(len(str) - len(key) + 1):
        if str[i:i+len(key)] == key:
            indices.append(i)

    count = len(indices)

    print("Occurrences of", key, "at indices:", indices)
    print("Count:", count)
    return True

string=input("Enter string: ")
key=input("Enter key to search: ")

count_occ(string, key)

'''
4. Create two lists to store cities and locations by accepting values from user.
Display 1st city and 1st location
then 2nd city and 2nd location ....... (zip function)
'''
cities = []
locations = []

n = int(input("How many entries do you want to add? "))

for i in range(n):
    city = input(f"Enter city {i+1}: ")
    location = input(f"Enter location {i+1}: ")
    cities.append(city)
    locations.append(location)

print("\nCity and Location pairs:")
for city, location in zip(cities, locations):
    print(city, "->", location)


'''
Q5. Create a list and exchange the values as index and index as values.
lst=[12, 1, 3, 7, 8, 5, 8]
0 1 2 3 4 5 6

Output should be as follows.
initial list
lst1=[-1 ,1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]
modified list
lst1=[-1 ,1, -1, 2, -1, 5, -1, 3, 6, -1, -1, -1, 0]
'''

length=int(input("how many elements you want !"))
lst=[]

for i in range(length):
    ch=int(input("enter the value"))
    lst.append(ch)

lst1= [-1] * (max(lst)+1)

for i,v in enumerate(lst):
    lst1[v]= i

print(lst1)

'''
Q6. Write a menu driven program to practice Set functions.
Write a program to accept names from users and store it in a set.
Display the following menu:
print("""1. delete element if exists otherwise
do not show any errr""")
print("2. add a elemet")
print("3. create one more set")
print("4. union of 2 sets")
print("4. intersection of 2 sets")
print("5. difference of 2 sets")
print("6. convert set into frozenset")
print("6. exit")
'''
set1 = set()

n = int(input("Enter number of names: "))
for i in range(n):
    name = input("Enter name: ")
    set1.add(name)

set2 = set()

while True:
    print("\n----- MENU -----")
    print("1. Delete element (no error if not exists)")
    print("2. Add element")
    print("3. Create another set")
    print("4. Union of 2 sets")
    print("5. Intersection of 2 sets")
    print("6. Difference of 2 sets")
    print("7. Convert set into frozenset")
    print("8. Exit")

    choice = input("Enter your choice: ")

    match choice:
        case '1':
            val = input("Enter element to delete: ")
            set1.discard(val)   
            print("Operation done! (No error if not found)")

        case '2':
            val = input("Enter element to add: ")
            set1.add(val)
            print("Element added!")

        case '3':
            set2 = set()
            n2 = int(input("Enter number of elements for second set: "))
            for i in range(n2):
                val = input("Enter value: ")
                set2.add(val)
            print("Second set created!")

        case '4':
            print("Union:", set1.union(set2))

        case '5':
            print("Intersection:", set1.intersection(set2))

        case '6':
            print("Difference (set1 - set2):", set1.difference(set2))

        case '7':
            fset = frozenset(set1)
            print("Frozen set:", fset)

        case '8':
            print("Exiting program...")
            break

        case _:
            print("Invalid choice!")
            
'''
Q7. Generate a list of lists (NOTE: List should get generated dynamically)
Accept a number from user and check last digit of the number.
If it is 1 then add it in the list at 1st position.
If 0 then it should get added at list in 0th position.
e.g list should look as follows
[[10],[51],[52]]
[[10,30,20,40],[11,31,41,31],[22,32,42]....]
if user enter 15 then the resultant list should be
[[10,30,20,40],[11,32,41,31],[22,32,42],[],[],[15]]
'''

n=int(input("enter the no of elements"))
lst=[[] for _ in range(10)]
for i in range(n):
    ch=int(input("enter the number"))
    ld=ch%10
    lst[ld].append(ch)
    
    
print(lst)

'''
Q8. Create a list to store strings in a list in following manner list
[dxz,axz,bat,rat,cat,pat,bbc,bbm,cbm,....] pat axz
All list with same character at second position should be consecutive.
If user adds sat, then the resultant list will be:
[bat,rat,cat,sat,bbc,bbm,cbm,....]

If user adds pick, then it should be added at
[bat,rat,cat,bbc,bbm,cbm,pick]
'''
def add_word(lst, word):
    if len(word) < 2:
        lst.append(word)
        return

    ch = word[1]
    pos = -1

    for i in range(len(lst)):
        if len(lst[i]) >= 2 and lst[i][1] == ch:
            pos = i

    if pos != -1:
        lst.insert(pos + 1, word)
    else:
        lst.append(word)


words = ["bat", "rat", "cat", "bbc", "bbm", "cbm"]

print("Original:", words)

add_word(words, "sat")
print("After adding sat:", words)

add_word(words, "pick")
print("After adding pick:", words)
    
