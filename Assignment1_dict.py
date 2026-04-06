# -*- coding: utf-8 -*-
"""
Created on Sat Mar 21 18:10:43 2026

@author: PGCP-BDA
"""

#Q1 the two lists convert it into the dictionary 
# Correct way
keys = ["name", "age", "city"]
values = ["Alice", "25", "Pune"]


my_dict={k:v for k,v in zip(keys,values)}
print(my_dict)


myd=dict(zip(keys,values))
print(myd)
#Q2 Merge following two Python dictionaries into one
dict1 = {'Ten': 10, 'Twenty': 20, 'Thirty': 30} 
dict2 = {'Thirty': 30, 'Fourty': 40, 'Fifty': 50}
dict3 = {**dict1, **dict2}  
print(dict3) 

#Q3 Display the value of key history from the following dictionary 
#the value of key ‘history’ from the below dict 

sampleDict = {  
"class":{  
      "student":{  
         "name":"Mike", 
         "marks":{  
            "physics":70, 
            "history":80 
         } 
      } 
   } 
}

print(sampleDict["class"]["student"]["marks"]["history"])

#Q4 Delete set of keys from a dictionary

sampleDict = { 
  "name": "Kelly", 
  "age":25, 
  "salary": 8000, 
  "city": "New york" 
   
} 

keysToRemove = ["name", "salary"]

for key in keysToRemove:
    sampleDict.pop(key, None)

print(sampleDict)

#Q5 display all the keys with value 200 from the following dictionary. 
sampleDict = {'a': 100, 'b': 200, 'c': 300,'d':200} 
# for i in sampleDict:
#     if sampleDict.values() == 200:
#         print(sampleDict.keys())
        
a=sampleDict.values(200)
b=sampleDict.key(a)
print(b)

