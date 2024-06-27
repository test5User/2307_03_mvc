package by.itclass.model.services;

import by.itclass.model.db.DbInMemory;
import by.itclass.model.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class UserService {
    public List<User> getByCriteria(Map<String, String[]> params) {
        List<User> users = new ArrayList<>();
        var criteria = params.get("criteria")[0];
        switch (criteria) {
            case "fio" : {
                var fio = params.get("fio")[0];
                var user = DbInMemory.findByFio(fio);
                if (user != null) {
                    users.add(user);
                }
                break;
            }
            case "id" : {
                var fromId = Integer.parseInt(params.get("fromId")[0]);
                var toId = Integer.parseInt(params.get("toId")[0]);
                users = DbInMemory.findByIds(fromId, toId);
                break;
            }
            default: break;
        }
        return users;
    }
}
