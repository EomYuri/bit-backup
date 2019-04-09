def handling_exception():
    lst = []

    try:
        lst[3] = 0
        4/0
    except IndexError as e:
        print("인덱스 오류입니다.")
    except ZeroDivisionError as e:
        print("0으로 나눌 수 없습니다.")
    except  Exception as e:
        print(e, type(e))
        print("오류 발생")
    else:   # try 블록에 오류가 없을 경우 1회 실행
        print("오류 없이 정상 수행되었습니다.")
    finally:    # 오류 유무 상관 없이 마지막에 1회 실행
        print("End of try")


def raise_exception():
    # 일부러 익셉션을 발생
    def beware_dog(animal):
        if animal == "dog": # 익셉션을 외부 발생
            raise RuntimeError("강아지는 출입을 제한합니다.")
        else:
            print("어서오세요")

    try:
        beware_dog("cat")
        beware_dog("cow")
        beware_dog("dog")
    except RuntimeError as e:
        print(e, type(e))


# handling_exception()
raise_exception()