package by.itclass.model.db;

import by.itclass.model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class DbInMemory {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Vasia Pupkin", "vasia@gmail.com"));
        users.add(new User(2, "Ivan Ivanov", "ivan@yandex.ru"));
        users.add(new User(3, "Petr Petrov", "petr@mail.ru"));
    }

    public static boolean isContainByFio(String fio) {
        return users.stream()
                .anyMatch(it -> it.getFio().equalsIgnoreCase(fio));
    }

    public static User findByFio(String fio) {
        return users.stream()
                .filter(it -> it.getFio().equalsIgnoreCase(fio))
                .findFirst()
                .orElse(null);
    }

    public static List<User> findByIds(int fromId, int toId) {
        return users.stream()
                .filter(it -> it.getId() >= fromId && it.getId() <= toId)
                .toList();
    }
}
