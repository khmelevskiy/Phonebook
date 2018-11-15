package me.khmelevskiy.task;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookRecord {
    private final String name;
    private final ArrayList<String> phones = new ArrayList<String>();

    public PhoneBookRecord(final String name, final String... phones) {
        this.name = name;
        this.phones.addAll(Arrays.asList(phones));
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getPhones() {
        return this.phones;
    }
}
