# -*- coding: utf-8 -*-
"""
Created on Sat Mar 28 08:46:31 2026

@author: PGCP-BDA
"""

import requests
from bs4 import BeautifulSoup
import re

url= 'https://en.wikipedia.org/wiki/Academy_Award_for_Best_Picture'
headers = {
    "User-Agent":"StudentBot/1.0 (your_email@example.com)"
    }

response = requests.get(url,headers=headers)
#print(response.text)

html_soup = BeautifulSoup(response.text,'html.parser')
type(html_soup)
#print(html_soup)

award_list = html_soup.find_all("tr", {"style":'background:#FAEB86'})
print(len(award_list))

first_award=award_list[0]

tdlist=first_award.find_all('td')
print(len(tdlist))
print(tdlist[0].text)
print(tdlist[1].text)

names=[]
studios=[]
for award in award_list:
    tdlist=award.find_all('td');
    names.append(tdlist[0].text)
    studios.append(tdlist[1].text)

import pandas as pd
awards ={"names":names,"studios":studios}
df=pd.DataFrame(awards)
print(df.shape)