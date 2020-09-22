package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "search_key_routing")
public class Search_key_routing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long search_key_id;
    private String table_name;
    private long table_id;
    private String type;
}
