# 내포(comprehension)의 이해
def list_comprehension():
    """
    리스트 내포
    syntax: [표현식 for 항목 in 시퀀스객체]
    """
    source = list(range(0,11))
    print(source)

    result = []
    for num in source:
        value = num * num
        result.append(value)

    print("result:", result)

    result = [num * num for num in source]
    print("list comp:", result)

    strings = "a as bat car dove python".split()
    print(strings)

    # 문자열 중에서 길이가 3이하인 항목만 새 리스트로
    result = [s for s in strings if len(s) <= 3]
    print("len <= 3 string:", result)

    # 1~100 숫자 중에서 짝수 리스트 만들기
    evens = [n for n in range(1, 101) if n % 2 == 0]
    print("짝수:", evens)

def set_comprehension():
    """
    syntax : {표현식 for 항목 in 시퀀스 객체}
    """
    strings = "a as bat car dove python".split()
    # 길이가 3 이하인 객체를 셋으로 만들어 봅시다.
    print(strings)

    result = {s for s in strings if len(s) <= 3}
    print(result)

def dict_comprehension():
    strings = "a as bat car dove python".split()
    # 키 -> 문자열, 값 -> 문자열의 길이
    dic = {s: len(s) for s in strings}
    





# list_comprehension()
set_comprehension()