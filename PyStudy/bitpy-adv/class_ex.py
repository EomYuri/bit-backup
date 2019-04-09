# 클래스 만들기
class MyString(str):    # str을 상속 받은 새 클래스
    pass

if __name__ == "__main__":
    # 인스턴스의 생성
    o = MyString()
    print(o, type(o))

    # 기반 클래스 확인
    print(MyString.__bases__)   # 기반 클래스를 튜플로 반환

    # MyString은 str로부터 상속받았으니 str이 가진 대부분의 기능은 그대로 쓸 수 있음
    ms = MyString("Python")
    print(ms.upper())


class Point:
    instance_count = 0  # 클래스영역의 클래스 멤버

    # 생성자
    def __init__(self, x=0, y=0):
        self.x, self.y = x, y
        Point.instance_count += 1

    # 소멸자
    def __del__(self):
        Point.instance_count -= 1

    # 문자열 출력 재정의
    def __str__(self):  # return 출력 포맷
        return "Point x={0}, y={1}".format(self.x, self.y)

    # 객체 생성 코드 문자열 출력
    def __repr__(self):
        return "Point ({0}, {1})".format(self.x, self.y)

    # 연산자 재정의 : +
    def __add__(self, other):
        if isinstance(other, Point):
            self.x += other.x
            self.y += other.y
        elif isinstance(other, int):
            self.x += other
            self.y += other
        return self

    # 역이항 연산자 재정의 : +
    def __radd__(self, other):
        if isinstance(other, int):
            self.x += other
            self.y += other
        return self

    # GETTERS & SETTERS
    def set_x(self, x):
        self.x = x

    def set_y(self, y):
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y


def bound_instance_method():
    p = Point() # Point 인스턴스 생성
    p.set_x(10)
    p.set_y(10)

    print(p.get_x(), p.get_y(), sep=",")
    print(p.get_x, p.get_y)


def unbound_instance_method():
    p = Point()
    Point.set_x(p, 10)
    Point.set_y(p, 10)

    print(Point.get_x(p), Point.get_y(p), sep=",")
    print(Point.get_x, Point.get_y)


def test_contructor():
    p1 = Point()    # 기본값을 사용
    print(Point.instance_count)
    p2 = Point(10, 20)  # x = 10, y = 10
    print(Point.instance_count)

    print(p1, p2)

def test_to_string():
    p = Point(10, 20)
    p2 = Point(30, 40)

    print(p)
    print(p2)

def test_repr():
    p= Point(10, 20)
    print("__str__:", str(p))
    print("__repr__:", repr(p))

    p2 = eval(repr(p))
    print("eval:", p2)

def test_operator():
    p = Point(10, 20)
    print(p)
    print(" + int:", p + 10)
    print(" + Point:", p + Point(5,10))

    print(10 + p)


if __name__ == "__main__":
    # bound_instance_method()
    # unbound_instance_method()
    # test_contructor()
    # test_to_string()
    # test_repr()
    test_operator()