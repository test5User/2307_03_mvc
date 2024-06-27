package by.itclass.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class User {
    private int id;
    private String fio;
    private String email;
}
