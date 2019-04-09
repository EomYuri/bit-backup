score1 = input("과목1 몇 점?")
score2 = input("과목2 몇 점?")

score1 = int(score1)
score2 = int(score2)
average = int (score1+score2)/2
message = ""

if score1>=50 & score2>=50 and average >= 60:
    message = "합격"
# elif average >= 60:
#     message = "합격"
else:
    message = "불합격"

print("과목1 점수:", score1, "과목2 점수:", score2, message)
