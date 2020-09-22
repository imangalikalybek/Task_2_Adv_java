package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "status_request_history")
public class Status_request_history {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long request_id;
    private String status;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
