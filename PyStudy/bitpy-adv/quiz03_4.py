s = """We encourage everyone to contribute to Python. 
If you still have questions after reviewing the material
in this guide, then the Python Mentors 
group is available to help guide new contributors through the process."""

s=s.upper()
s=s.replace(",","")
s=s.replace(".","")
s=s.replace("\n","")

print(s)

s = s.split(" ")
wordDic={}
for i in s:
    wordCount = s.count(i);
    wordDic[i] = wordCount

    for cnts in wordDic:
        print(cnts, wordDic[cnts])