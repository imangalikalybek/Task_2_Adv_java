package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "file_routing")
public class File_routing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long file_id;
    private String table_name;
    private long table_id;
    private String type;
}
