# # Phonebook
## Task:

There is a program that stores the phone book in memory (full in the program code).
Phonebook for each name stores a list of numbers.
Input data:

> Иванов И.И. +8 800 2000 500 +8 800 200 600 

> Петров П.П. +8 800 2000 700

> Сидоров С.С. +8 800 2000 800 +8 800 2000 900 +8 800 2000 000

The full name is sent to the program, the program prints the phone numbers associated with that name.
If there is no phone, the program should display a message stating that there is no such full name in the database.

*Example:*
User enters:

    Иванов И.И.

The program gives:

    1. +8 800 2000 500
    2. +8 800 200 600

Required use to implement HashMap (to store the mapping name -> phones), ArrayList to store the list of phones
