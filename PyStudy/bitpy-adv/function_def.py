# 함수의 정의
def dummy():    # 구현부가 없을때
    pass

def none(): # return만 하면 None이 반환
    return


def times(a, b):
    return a*b


dummy()
print(none())
print(times(10, 20))

# 함수 자체도 객체
fun = times # 심볼로 할당
print(type(fun))    # 타입도 확인 가능
print(callable(fun))    # 호출 가능 객체인지 확인

if callable(fun): print(fun(10, 20))

# 함수의 return
def bigger(a, b):
    if a > b:
        return a
    else:
        return b

print(bigger(10, 20))

# 여러 값의 반환 -> Tuple로 처리
def swap(a, b):
    return b, a

result = swap(10, 20)
print(result, type(result))
print(result[0], result[1])

res_a, res_b = swap(10, 20) # 리턴값의 언패킹
print(res_a, res_b)

