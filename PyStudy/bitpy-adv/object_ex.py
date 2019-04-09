# 객체 관련 예제들

# 글로벌 변수 선언
global_a  = 1
global_b = "Python"

# 사용자 정의 함수
def func():
    local_a = 2
    local_b = "local"
    print(locals()) # 로컬 심볼 테이블의 확인

# 사용자 클래스
class MyClass:
    c_a = 3
    c_b = "class"

def symbol_table():
    """
    심볼 테이블을 확인
    """
    # 글로벌 심볼 테이블 확인
    print(globals())
    print(type(globals()))

    print(globals().get("global_a"), globals().get("global_b"))

    func()

    # 내부에 __dict__을 확인하면 내부 심볼 테이블을 확인
    # 사용자 정의 함수 내부의 심볼 테이블 확인
    print(func.__dict__)
    func.custom = "custom"
    print(func.__dict__)
    # 동작 스크립트는 런타임에 속성, 메서드 등이 추가될 수 있다.


def ref_count():
    """
    파이썬의 객체 레퍼런스 카운트를 확인
    """
    x = object()
    print(x, type(x))
    import sys  # 시스템 모듈 로딩

    print(sys.getrefcount(x))
    y = x   # x의 주소(ID) 값이 y에 할당
    print(sys.getrefcount(x))

    del x
    print(sys.getrefcount(y))

    # 레퍼런스 카운트가 0이면 가비지 컬렉터가 객체를 지움

def object_id():
    """
    객체 ID에 대한 이해
    """
    i1 = 10
    i2 = int(10)
    print("int:",hex(id(i1)),hex(id(i2)))

    s1 = "Python"
    s2 = str("Python")
    print("str:",hex(id(s1)),hex(id(s2)))

    lst1 = [1, 2, 3]
    lst2 = [1, 2, 3]
    print("mutable:", hex(id(lst1)), hex(id(lst2)))

    print("i1 == i2 ?", i1 == i2)   # == 값의 비교 (동등성)
    print("i1 is i2 ?", i1 is i2)   # is ID 비교 (동일성)

    print("lst1 == lst2 ?", lst1 == lst2)
    print("lst1 is lst2 ?", lst1 is lst2)


def object_copy():
    """
    객체의 복사
    """
    # 단순 레퍼런스 복사
    a = 1
    b = a

    a = [1, 2, 3]
    b = [4, 5, 6]
    c = [a, b, 100]
    print(c)
    d = c
    print(d)
    c[2] = 200
    print("c:", c)
    print("d:", d)

    import copy
    d = copy.copy(c)
    print("c:", c)
    print("d:", d)
    print(c is d)

    c[2] = 300
    print("c:", c)
    print("d:", d)

    print(id(c[0])) == id(d[0])   # 이 둘은 같은 객체
    c[0][1] = 10
    print("c:", c)
    print("d:", d)

    # 깊은 복사 : deepcopy
    d = copy.deepcopy(c)
    print("c:", c)
    print("d:", d)
    print(id(c[0])) == id(d[0])

    c[0][1] = 20    # 영향을 미치지 않는다
    print("c:", c)
    print("d:", d)









# symbol_table()
# ref_count()
# object_id()
object_copy()