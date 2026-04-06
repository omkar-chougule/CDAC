# -*- coding: utf-8 -*-
"""
Created on Sat Mar 21 14:30:00 2026

@author: PGCP-BDA
"""

#Q1 Reverse a given list in Python 
alist = [100,200,300,400,500]

print(alist[::-1]) 

#Q2.Concatenate two lists index-wise 
list1 = ["M", "na", "i", "Raj"] 
list2 = ["y", "me", "s", "esh"] 

list3 = []
for x in zip(list1,list2):
    list3.append(x[0] + x[1])

print(list3)

#Q3  Given a Python list of numbers. Turn every item of a list into its square 

aList = [1, 2, 3, 4, 5, 6, 7] 

lst = list(map(lambda x:x**2, aList))
print(lst)

#Q4 Concatenate two lists in the following order 

list1 = ["Hello ", "Welcome "] 
list2 = ["Students", "Sir"] 

list3 = [x1+y1 for x1 in list1 for y1 in list2 ]
print(list3)

#Q5  Given a two Python list. Iterate both lists simultaneously such that list1 should display item 
#in original order and list2 in reverse order

list1 = [10, 20, 30, 40] 
list2 = [100, 200, 300, 400] 

list2.sort(reverse = True)
list3 = []
for x,y in zip(list1, list2):
    print(x,y)


#Q6 Remove empty strings from the list of strings 
list1 = ["Ashish", "", "Atharva", "Amit", "", "Revati"] 

while "" in list1:
    list1.remove('')

print(list1)

#Q7 Add item 7000 after 6000 in the following Python List 

list1 = [10, 20, [300, 400, [5000, 6000], 500], 30, 40] 
list1[2][2].insert(2, 7000)

print(list1)

#Q8 Given a nested list extend it by adding the sub list ["h", "i", "j"] in such a way that it will look like the following list
list1 = ["a", "b", ["c", ["d", "e", ["f", "g"], "k"], "l"], "m", "n"] 
list2= ["h", "i", "j"] 

list1[2][1][2].extend(list2)
print(list1)

#Q9  Given a Python list, find value 20 in the list, and if it is present, replace it with 200. Only 
#update the first occurrence of a value 
list1 = [5, 10, 15, 20, 25, 50, 20] 
idx = list1.index(20)

list1[idx] = 200
print(list1)


#Q10  Given a Python list, remove all occurrence of 20 from the list 
list1 = [5, 20, 15, 20, 25, 50, 20] 

while 20 in list1:
    list1.remove(20)
    
print(list1)


