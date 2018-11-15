package me.khmelevskiy.task;

import java.util.Scanner;

public class PhoneBookApplication {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBookRecord ivanov = new PhoneBookRecord("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600");
        phoneBook.addRecord(ivanov);
        PhoneBookRecord petrov = new PhoneBookRecord("Петров П.П.", "+8 800 2000 700");
        phoneBook.addRecord(petrov);
        PhoneBookRecord sidorov = new PhoneBookRecord("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000");
        phoneBook.addRecord(sidorov);

        String name = readEnteredName();
        PhoneBookRecord record = phoneBook.getRecordByName(name);
        if (record != null) {
            showPhoneNumbers(record);
        } else {
            System.out.println("Not found");
        }
    }

    private static String readEnteredName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input last name and initials:");
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    private static void showPhoneNumbers(final PhoneBookRecord record) {
        int i = 1;
        for (String phoneNumber : record.getPhones()) {
            System.out.println(i++ + ". " + phoneNumber);
        }
    }
}
