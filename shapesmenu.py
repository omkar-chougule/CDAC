# -*- coding: utf-8 -*-
"""
Created on Mon Mar 23 13:51:56 2026

@author: PGCP-BDA
"""
from shapes import *

shape_lst=[]
choice=0

def addnewshape(ch):
    id=int(input("Enter id:"))
    color=input("enter color")
    
    if ch==1:
        s1=int(input("enter s1"))
        s2=int(input("enter s2"))
        b=int(input("enter base"))
        h=int(input("enter height"))
        sh1=Triangle(id,color,s1,s2,b,h)
    elif ch==2:
        r=int(input("enter radius: "))
        sh1=Circle(id,color,r)
    return True

def displayall(lst=shape_lst):
    for shape in shape_lst:
        print(shape)
        
def searchbyid(sid):
    for pos,shape in enumerate(shape_lst):
        if shape.get_shapeid()==sid:
            return pos,shape
        else:
            return -1,None

def getarea(sid):
    pos,s=searchbyid(sid)
    if pos!=-1:
        return s.calculateArea()
    else:
        return -1

def getperimeter(sid):
    pos,s=searchbyid(sid)
    if pos!=-1:
        return s.calculatePerimeter(sid)
    else:
        return -1

while choice!=7:
    choice=int(input('''
                     1.add sahpe
                     2.display all
                     3.display by id
                     4.area
                     5.perimeter
                     6. change radius
                     7.count shapes
                     8=exit
                     enter yourchoice:
                     '''))
    match choice:
        case 1:
            ch=int(input("1.triangle 2.circle"))
            status=addnewshape(ch)
            if status:
                print("print added sucessfully")
            else:
                print("shape not added")
                
        case 2:
            displayall()
        case 3:
            sid=int(input("enter sid: "))
            pos,s=searchbyid(sid)
            if pos !=-1:
                print("shape found")
            else:
                print(f"shape found at position {pos+1}")
        case 4:
            sid=int(input("enter shapeid to calcute area"))
            area=getarea(sid)
            if area!=-1:
                print(f"area {area}")
            else:
                print("not found")
        case 5:
            sid=int(input("enter shapeid to calcute perimeter"))
            perimeter=getperimeter(sid)
            if area!=-1:
                print(f"area {perimeter}")
            else:
                print("not found")
        case 6:
            pass
        case 7:
            pass
        case 8:
            pass
        case others:
            print("invalid input")
        