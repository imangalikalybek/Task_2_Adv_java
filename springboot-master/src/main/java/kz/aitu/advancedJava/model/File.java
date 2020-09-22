package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "file")
public class File {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private long size;
    private int page_count;
    private String hash;
    private boolean is_deleted;
    private long file_binary_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
