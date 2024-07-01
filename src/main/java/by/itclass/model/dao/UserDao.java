package by.itclass.model.dao;

import by.itclass.model.db.ConnectionManager;
import by.itclass.model.entities.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public static final String FIO_QUERY = "SELECT * FROM user WHERE fio LIKE ?";
    public static final String ID_QUERY = "SELECT * FROM user WHERE id >= ? AND id <= ?";

    public User findByFio(String fio) {
        try (var cn = ConnectionManager.getConnection();
            var ps = cn.prepareStatement(FIO_QUERY)) {
            ps.setString(1, fio);
            var rs = ps.executeQuery();
            if (rs.next()) {
                var id = rs.getInt("id");
                var email = rs.getString("email");
                return new User(id, fio, email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> findByIds(int fromId, int toId) {
        var users = new ArrayList<User>();
        try (var cn = ConnectionManager.getConnection();
            var ps = cn.prepareStatement(ID_QUERY)) {
            ps.setInt(1, fromId);
            ps.setInt(2, toId);
            var rs = ps.executeQuery();
            while (rs.next()) {
                var id = rs.getInt("id");
                var fio = rs.getString("fio");
                var email = rs.getString("email");
                users.add(new User(id, fio, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
