str = "Life is too short, You need Python"

# •이 문자열 내의 글자를 모두 소문자로 변경합니다.
str = str.lower()
print(str)

# •이 문자열 내의 공백과 ,를 제거합니다.
str = str.replace(" ","")
print(str)
str = str.replace(",","")
print(str)

# •이 문자열을 list로 형변환한 후 lst 변수에 담아 봅니다.
lst = list(str)
print(lst,type(lst))

# •lst를 set로 형변환하여 chars 변수에 담아 봅시다.
chars = set(lst)
print(chars,type(chars))

# •chars를 다시 list로 형변환하여 lst에 담아 봅시다.
lst =  list(chars)
print(lst,type(lst))

# •lst를 알파벳 순으로 정렬하고, 길이를 출력해 봅시다.
lst = sorted(lst)
print(lst)
print(len(lst))
lengthlst = len(lst)

print("총 사용된 알파벳 글자의 수:", lengthlst,"개",sep="")


