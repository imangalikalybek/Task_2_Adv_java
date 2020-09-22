package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "destruction_act")
public class Destruction_act {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String act_number;
    private String base;
    private long structural_subdivision_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
