package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fond")
public class Fond {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fond_number;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
