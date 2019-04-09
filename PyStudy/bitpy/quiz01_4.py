lst_date = ['2018.01.02', '2018.01.03', '2018.01.04', '2018.01.05']

lst_dow = ["화", "수", "목", "금"]
lst_price = [2479.65, 2486.35, 2466.46, 2497.52]

kospi_price = dict()

kospi_price = dict(zip(lst_dow,lst_price))
print(kospi_price)

kospi_price = dict(zip(lst_date, kospi_price))
print(kospi_price)