lst = [1, 3.14, 'python', 7, 89.1, 3]

lst_cleaned=[]

def is_num(x):
    if (isinstance(x, (int, float))):
        lst_cleaned.append(x)

for i in range(0,len(lst)):
    is_num(lst[i])

print("lst_cleaned : " ,lst_cleaned)