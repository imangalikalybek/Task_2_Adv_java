package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "catalog_case")
public class Catalog_case {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long case_id;
    private long catalog_id;
    private long company_unit_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
