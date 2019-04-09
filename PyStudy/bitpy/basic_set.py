evens = {0, 2, 4, 6, 8} # 10 미만 짝수의 집합
odds = {1, 3, 5, 7, 9}  # 10 미만 홀수의 집합
numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}    # 10 미만 양수 정수
mthree = {0, 3, 6, 9}   # 10 미만 3의 배수의 집합

def define_set():
    """
    셋 정의 연습
    """

    empty = set()   # 빈 셋
    print(empty, type(empty))

    # 길이 구할 수 있음
    print(numbers, "length:", len(numbers))
    # 포함 여부 확인할 수 있음
    print(2 in numbers, 2 in evens, 2 in odds)

    # 다른 순차형 자료형으로부터 셋을 만들기
    s = "Python Programming"
    chars = set(s.replace(" ","").upper())
    print(chars, type(chars))
    print(s, "has", len(chars), "characters")

    # 활용 : 리스트에서 중복 제거
    lst = "Python Programming Java Programming Web Programming".split()
    print("SOURCE:", lst)
    s = set(lst)
    print("SET:", s)
    lst = list(s)
    print("중복제거 리스트:", lst)
    print(list(set(lst)))

def set_methods():
    """
    셋 다루기
    """

    # 요소의 추가
    numbers.add(10)
    print(numbers)
    print("짝수집합:", evens)
    evens.add(4)    # 중복 입력은 허용되지 않음
    print("홀수집합:", odds)

    # 요소의 삭제
    evens.add(3)
    print("짝수 집합:", evens)
    evens.discard(3)
    print("짝수 집합:", evens)
    evens.discard(3)    # 없는 객체 삭제시 무시
    if 3 in evens: evens.remove(3)  # 없는 객체 삭제시 오류
    numbers.update({10, 11, 12})
    print(numbers)

def set_oper():
    """
    집합 연산
    """
    print("numbers:", numbers)
    print("짝수 집합:", evens)
    print("홀수 집합:", odds)
    print("3의 배수 집합:", mthree)

    # 합집합   : union, /
    print(evens.union(odds) == numbers)
    print(evens | odds == numbers)

    # 모집합과 부분집합임을 확인
    print(numbers.issuperset(evens), numbers.issuperset(odds))
    print(evens.issubset(numbers), odds.issubset(numbers))

    # 교집합 : intersection, &
    print(evens.intersection(mthree))
    print(mthree.intersection(odds))
    print(mthree & odds)

    # 차집합 : difference, -
    print(numbers.difference(odds) == evens)
    print(numbers - odds == evens)



# define_set()
# set_methods()
set_oper()