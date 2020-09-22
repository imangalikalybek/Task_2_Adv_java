package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tepfiles")
public class Tepfiles {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String file_binary;
    private String file_binary_byte;
}
