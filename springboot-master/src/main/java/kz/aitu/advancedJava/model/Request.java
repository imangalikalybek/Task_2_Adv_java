package kz.aitu.advancedJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "request")
public class Request {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long request_user_id;
    private long response_user_id;
    private long case_id;
    private long case_index_id;
    private String created_type;
    private String comment;
    private String status;
    private long timestamp;
    private long sharestamp;
    private long sharefinish;
    private boolean favorite;
    private long updated_timestamp;
    private long updated_by;
    private String declinenote;
    private long company_unit_id;
    private long from_request_id;
}
