package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "company_unit")
public class Company_unit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_ru;
    private String name_kz;
    private String name_en;
    private long parent_id;
    private int year;
    private int company_id;
    private String code_index;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
