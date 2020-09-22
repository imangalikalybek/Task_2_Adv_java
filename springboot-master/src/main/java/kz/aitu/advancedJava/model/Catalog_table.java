package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "catolog_table")
public class Catalog_table {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_ru;
    private String name_kz;
    private String name_en;
    private long parent_id;
    private long company_unit_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
