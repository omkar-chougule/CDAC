# -*- coding: utf-8 -*-
"""
Created on Fri Mar 27 11:41:50 2026

@author: PGCP-BDA
"""
import sys
import pymysql

def deletebyId():
    cur.execute("delete from  product where pid = %s",(pid,))
    conn.commit()
    return True
    

def display():
    cur.fetchall()
    
    
    
def addnewproduct():
    pid= int(input("enter pid"))
    pname = input("Enter pname")
    qty = int(input("ente qty"))
    price = float(input("Enter Price"))
    mfgdt=input("enter date (yyyy-mm-dd)")
    cur.execute("insert into product values(%s, %s, %s,%s,%s)", (pid, pname, qty, price, mfgdt))
    conn.commit()

def updateById(pid, qty, price):
    cur.execute("update product set qty = %s, price = %s where pid = %s",(qty,price,pid))
    conn.commit()
    return True

def displaybyid(pid):
    cur.execute("select * from product where pid=%s",(pid,))
    for row in cur.fetchall():
        print(f"Id : {row[0]} Name: {row[1]} Qty: {row[2]} price: {row[3]} mfgdt: {row[4]}")
    
try:
    conn= pymysql.connect(host='localhost', port=3306, user='root', passwd='root123', db='bda2026')
    if conn!= None:
        print("connection succes")
    else:
        print("connection failed!!")

except Exception as e:
    print(e)

try:
    cur = conn.cursor()
    choice = 0 
    while choice != 6:
        choice = int(input("""
                           1. add new product
                           2. delete product
                           3. modify product info
                           4. display all
                           5. display by id
                           6. exit
                           """
                           ))
        match choice:
            case 1:
                addnewproduct()
            case 2:
                pid = int(input("Entet pid"))
                status = deletebyId()
                if status:
                    print("delete Successfully")
                else:
                    print("not found")
                    
            case 3:
                pid= int(input("enter pid"))
                qty=int(input("Enter qty"))
                price = float(input("Enter price"))
                status =updateById(pid, qty, price)
                if status:
                    print("update successfully")
                else:
                    print("not found")
            case 4:
                display()
            case 5:
                pid = int(input("Entet pid"))
                status = displaybyid()
                if status:
                    print("successfully display")
                else:
                    print("not found")
            case 6:
                print("Than you for Visiting.....")
            case _:
                print("wrong choice")
                sys.exit(0)
    else:
        print("fail")
except Exception as e:
    print(e)
finally:
    if conn != None:
        cur.close()
        conn.close()
        
sum=10
print(sum+10)
print(sum)