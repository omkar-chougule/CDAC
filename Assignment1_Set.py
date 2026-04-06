

#Q1 Add a list of elements to a given set 

sampleSet = {"Yellow", "Orange", "Black"} 
list1 = ["Blue", "Green", "Red", "Yellow", "orange"]

sampleSet.update(list1)
print(sampleSet)

#Q2 display common elements from the given set 

set1 = {10, 20, 30, 40, 50} 
set2 = {30, 40, 50, 60, 70} 

set3 = set1.intersection(set2)
print(set3)

#Q3 Generate a new set with all items from both sets by removing numbers which are in both 
#sets. 

set1 = {10, 20, 30, 40, 50,25} 
set2 = {30, 40, 50, 60, 70,100} 
print(set1^set2)

#Q4 Perform following operations on both sets and find the output 
#Intersection, difference, union, difference, symmetric_difference, 
#symmetric_difference_update, difference_update 

set1 = {10, 20, 30, 40, 50} 
set2 = {30, 40, 50, 60, 70} 

print(set1.intersection(set2))  
print(set1.difference(set2))  
print(set2.difference(set1))  
print(set1.union(set2))  
print(set1.symmetric_difference(set2))  

set1_copy = set1.copy()
set1_copy.symmetric_difference_update(set2)
print(set1_copy)  

set1_copy = set1.copy()
set1_copy.difference_update(set2)
print(set1_copy)  

#Q5 Update set1 by adding items from set2, which are > avg of all values in set1 
set1 = {10, 20, 30, 40, 50} 
set2 = {30, 40, 50, 60, 70} 

sum = 0

for i in set1:
    sum += i 
    
avg = sum//len(set1)
print(avg)

for i in set2:
    if i > avg:
        set1.add(i)

print(set1)

# Q6 Program to accept multiple values from user, store in a set,
# and display only strings with length greater than n

# Accept values from user
values = input("Enter multiple values separated by spaces: ").split()
values_set = set(values)
n = int(input("Enter the minimum string length (n): "))

print(f"Strings with length greater than {n}:")
for val in values_set:
    if len(val) > n:
        print(val)