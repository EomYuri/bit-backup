# 함수 스코핑 룰
# Local 영역 : 함수, 메서드 등
# Enclosed 영역 : 함수를 둘러싼 함수, 클래스
# Global 영역 : 해당 모듈 자체
# Built-in 영역 : 내장영역
# LEGB룰
x = 1   # 글로벌 영역

def scope_func(a):
    return a+x  # a Local Scope x는 글로벌

print(scope_func(10))

def scope_func2(a):
    x = 2   # 로컬 영역에 심벌로 생성
    return a + x    # a, x 모두 로컬 영역

print(scope_func2(10))
print(x)

g = 1

def scope_func3(a):
    g = 3   # 로컬 영역
    return a + g

print(scope_func3(10))
print(g)

# 글로벌 영역의 심볼 테이블 확인
print(globals())
print(dir())

# Built-in 영역의 심볼 테이블 확인
print(dir("__builtins__"))





