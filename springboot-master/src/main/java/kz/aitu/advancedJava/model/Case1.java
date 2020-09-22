package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "case1")
public class Case1 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String case_number;
    private String volume_number;
    private String case_title_ru;
    private String case_title_kz;
    private String case_title_en;
    private long start_date;
    private long end_date;
    private long page_number;
    private boolean signature_flag_eds;
    private String signature_eds;
    private boolean naf_sign_sending;
    private boolean deletion_sign;
    private boolean restricted_flag;
    private String hash;
    private long version;
    private String id_versoin;
    private boolean active_version_flag;
    private String note;
    private long location_id;
    private long index_case_id;
    private long record_id;
    private long destruction_act_id;
    private long structural_unit_id;
    private String blockchain_address_case;
    private long blockchain_date_added;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;

}
