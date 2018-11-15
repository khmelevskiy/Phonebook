package me.khmelevskiy.task;

import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String,PhoneBookRecord> map = new HashMap<String, PhoneBookRecord>();

    public PhoneBook() {
    }

    public void addRecord(final PhoneBookRecord record) {
        this.map.put(record.getName(), record);
    }

    public PhoneBookRecord getRecordByName(final String name) {
        return this.map.get(name);
    }
}
