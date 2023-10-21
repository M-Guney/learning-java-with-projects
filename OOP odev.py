# 122 ders de kaldın

#?          0 ile 100  arasından 1000 random sayı oluşturmak
#?              çift ve tek sayıların ortalamasını bul

import random
from random import randint
# i = 0
# cift,tek= 0,0 

# while i < 1000:
#     i+= 1

#     temp_numb = random.randrange(0,100)
#     print(temp_numb)
#     if temp_numb % 2 == 0:
#         cift += temp_numb
#     if temp_numb % 2 != 0:
#         tek += temp_numb

# cift_ort= cift/i
# tek_ort= tek/i
# print(cift_ort)
# print(tek_ort)
######################################################MuhammedSüleymanGüney####################################3

#!  Hem lambda da hem de for lu bir şekilde yap
random_numbers = (random.randint(0, 100) for i in range(1000))
tek = (0)
cift = (0)

# f = lambda x : cift.append(x) if x % 2 == 0 else tek.append(x) and sum(cift) and sum(tek) while 0 for i in range(1000))
f = lambda x : sum(cift, x) if x % 2 == 0 else sum(tek, x)
# f(random_numbers)
# binsayi  = map(f, random_numbers)
# print(binsayi)
print("Ortalama tek :",tek/1000)
print("Ortalama cift :",cift/1000)




"""
# Kaynakça   

https://www.geeksforgeeks.org/how-to-use-if-else-elif-in-python-lambda-functions/
        result = lambda x : f"{x} is even" if x %2==0 else f"{x} is odd"

#!   map fonksiyonunu sor
#!                          temp_numb_to_lambda = map(f,99)

https://www.w3schools.com/python/ref_func_sum.asp
        x = sum(a, 7)

        
Chat GPT

Yes, you can use a list comprehension with a lambda function to achieve the same result in a single line. Here's how you can do it:

numbers = [1, 2, 3, 4, 5]
squared_numbers = [(lambda x: x ** 2)(num) for num in numbers]
print(squared_numbers)
















"""