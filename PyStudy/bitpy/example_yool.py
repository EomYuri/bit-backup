a = ['apple', 'banana', 10, 20]
a[2] = a[2] + 90 # mutable 자료형 -> 항목 변경 가능
print(a)
# 슬라이스를 이용한 치환의 예
a = [1, 12, 123, 1234]
a[0:2] = [10, 20]
print(a)
a[0:2] = [10]
print(a)
a[1:2] = [20]
print(a)
a[2:3] = [30]
print(a)