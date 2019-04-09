# 튜플 예제
def define_tuple():
    """
    튜플 정의 예제
    """

    tp = tuple()    # 공튜플
    print(tp, type(tp))

    tp = () # 공튜플
    tp = (1,)   # 항목이 하나일 경우는 반드시 콤마
    tp = (1, 2, 3)
    print(tp, type(tp))

    # 다른 시퀀스 자료형으로 튜플 만들기
    tp = tuple({1, 3, 5, 7})
    print(tp, type(tp))

def tuple_oper():
    """
    튜플의 연산
    """
    tp = (1, 2, 3, 4, 5)
    # 길이와 포함 여부를 확인 가능
    print(tp, "length:", len(tp))
    print("3 in tp?", 3 in tp)

    # 인덱스를 이용한 접근 가능
    print(tp[0], tp[1], tp[2])  # 정방향 인덱스
    print(tp[-3], tp[-2], tp[-1])

    # tp[3] = 5     # 변경 불가 자료형이어서 -> Error
    # 슬라이싱
    slice = tp[1:3]
    print(slice)

    # 연결 +, 반복 *
    print(tp + (6, 7, 8))   # 연결
    print(tp * 3)   # 반복

def tuple_assignment():
    """
    튜플을 이용한 좌우변 여러 변수의 설정
    """
    x, y, z = 10, 20, 30

    # 값 바꾸기
    x, y = 10, 20
    print(x, y)
    x, y = y, x
    print(x, y)

def tuple_methods():
    """
    튜플의 메서드
    """
    tp = (20, 30, 10, 20, 30)
    print(tp.index(20))
    print(tp.index(20, 1))

    print(tp.count(30))

def packing_unpacking():
    """
    튜플 패킹 언패킹
    """
    # packing, unpacking은 튜플만 가능
    tp = (10 ,20, 30, "Python")
    print(tp, type(tp))
    tp = 10, 20, 30, "Python"   # 자동 패킹
    print(tp, type(tp))

    # 기본 언패킹
    a, b, c, d = tp
    print(a, b, c, d)

    # a, b, c = tp   # 변수의 수가 부족 -> Error
    # a, b, c, d, e = tp   # 변수의 수가 많음 -> Error

    # 확장 언패킹
    a, *b = tp
    print(a, b)
    *a, b = tp  # 뒤쪽에서 한 개 언패킹
    print(a, b)
    a, *b, c = tp   # 앞에서 한개, 뒤에서 한개 언패킹
    print(a, b, c)







# dfine_tuple()
# tuple_oper()
# tuple_assignment()
# tuple_methods()
packing_unpacking()