package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notification")
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String object_type;
    private long object_id;
    private long company_unit_id;
    private long user_id;
    private long created_timestamp;
    private long viewed_timestamp;
    private long is_viewed;
    private String title;
    private String text;
    private long company_id;
}
