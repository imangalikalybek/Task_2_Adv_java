package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "case_index")
public class Case_index {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String case_index;
    private String title_ru;
    private String title_kx;
    private String title_en;
    private int storage_type;
    private int storage_year;
    private String note;
    private long company_unit_id;
    private long nomenclature_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
