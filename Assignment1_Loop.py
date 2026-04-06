# -*- coding: utf-8 -*-
"""
Created on Fri Mar 20 12:43:53 2026

@author: PGCP-BDA
"""

#Assignment

#Q1.Accept 10 integers from user and print their average value on the screen
sum=0
for i in range(1,11):
    n = int(input("Enter the value "))
    sum=sum+n

avg=sum/10
print(f"Average of 10 number is {avg}")


#Q2 Print the following patterns using loop :
    #a.
for i in range(5):
    print("*"*i)
    print()


    #b.
    
def display(n,count):
    cnt=count
    for i in range (1,n+1,2):
        print(" "*cnt,end="")
        print("*"*i)
        cnt-=1
    cnt=1
    for i in range (n-2,0,-2):
        print(" "*cnt,end="")
        print("*"*i)
        cnt+=1

n=int(input("enter number of rows: "))
spc=n//2


if n%2 == 0:
    print("Please enter odd number!!")
else:
    display(n,spc)


    #c
n=int(input("enter number of rows: "))
count=n//2
if n%2 == 0:
    print("Please enter odd number!!")
else:
    for i in range (1,n+1,2):
        print(" "*count,end="")
        print("*"*i)
        count-=1

    #d.
for i in range(1,7):
    for j in range(1,i):
        print(f"{j}", end = " ")
    print()


#Q3Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of
#given two numbers
n1=int(input("Enter the number1 "))
n2=int(input("Enter the number2 "))


num1=[]
for i in range(1,n1+1):
    if n1%i==0 and n2%i==0:
        num1.append(i)

HCF=num1[-1]
lcm=(n1*n2)/HCF
print(num1)
print(f"The Lcm and Hcf are {lcm} and {HCF}")


#Q4 Take integer inputs from user until he/she presses q ( Ask to press q to quit after every
#integer input ). Print average and product of all numbers.
import sys
add=0
product=1
count=0
while (True):
    ch=input('''enter your choice "y"-Input or "q"-To Exit: ''')
    match ch:
        case "y":        
            n=int(input("Enter the number"))
            add=add+n
            count=count+1
            product=product*n
        case "q":
            avg=add/count
            print(avg)
            sys.exit(0)
        case _:
            print("Invalid choice, please enter 'y' or 'q'.")
            
#5. Given a number count the total number of digits in a number and also find sum of digits of the number

num=int(input("enter a number: "))
sumd = 0
cnt = 0

while num > 0:
    digit = num % 10
    sumd = sumd+digit
    cnt = cnt+1 
    num = num//10

print(f"The sum of digit is {sumd} and count of digit is {cnt}")

#6. To display the cube of the number upto given an integer. If the given integer is 5, then
#display cube of 1 to 4
n = int(input("Enter the Number "))
for i in range(1,n):
    print(f"{i}--->{i**3}")


#7 Accept 20 numbers from user and display sum of only even numbers.
sump=0
for i in range(1, 21):
    n = int(input("Enter the number"))
    if n%2==0:
        sump = sump+n;
print(f"the sum of even number is {sump}")


#8 Ask user number of terms to be generated of a series.
#generate numbers for the following series and find its addition
#[9 + 99 + 999 + 9999+……..]
n = int(input("Enter the number"))


series_sum = 0
term = 9

print("Series:")
for i in range(n):
    print(term, end=" ")   
    series_sum += term     
    term = term * 10 + 9   

print("\nSum of series =", series_sum)

3**3

#9. Write a program in python to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....]. Go tothe edito
def factorial(n):
    if(n==0):
        return 1
    else:
        return n*factorial(n-1)
factorial(5)
value=int(input("Enter value to compute: "))
terms=int(input("Enter number of terms : "))
sum=0
for i in range (terms):
    sum=sum + (value**(i)/factorial(i))
print(sum)


#10. Write a program in python to find the sum of the series [ x - x^3 + x^5 + ......]. Go to the editor

value=int(input("Enter value to compute: "))
terms=int(input("Enter number of terms : "))
count=1
sum=0
for i in range (1,terms+1):
    if(i%2==1):
        sum = sum + (value**(count))
        print(value**(count))
    else:
        sum = sum - (value**(count))
        print(value**(count))
    count=count+2
print(f"Addition of terms is : {sum}")


