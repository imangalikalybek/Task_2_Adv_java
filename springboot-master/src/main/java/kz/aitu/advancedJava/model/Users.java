package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long auth_id;
    private String name;
    private String fullname;
    private String surname;
    private String secondname;
    private String status;
    private long company_unit_id;
    private String password;
    private long last_login_timestamp;
    private String iin;
    private boolean is_active;
    private boolean is_activeted;
    private int company_id;
    private String code_index;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
