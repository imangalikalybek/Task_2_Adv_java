package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "share")
public class Share {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long request_id;
    private String note;
    private long sender_id;
    private long receiver_id;
    private long share_timestamp;
}
