DROP TABLE IF EXISTS fond;
Create table fond (
                      id serial ,
                      fond_number varchar default 128,
                      created_timestamp bigint,
                      created_by bigint ,
                      updated_timestamp bigint ,
                      updated_by bigint ,
                      primary key (id)
);
alter table fond owner to postgres;

DROP TABLE IF EXISTS company;
Create table company (
                         id serial not null,
                         name_ru varchar default 128,
                         name_kz varchar default 128,
                         name_en varchar default 128,
                         bin varchar default 32,
                         parent_id bigint not null,
                         fond_id bigint not null,
                         created_timestamp bigint not null,
                         created_by bigint not null,
                         updated_timestamp bigint not null,
                         updated_by bigint not null,
                         primary key (id)
);
alter table company owner to postgres;

DROP TABLE IF EXISTS company_unit;
Create table company_unit (
                              id serial not null,
                              name_ru varchar default 128,
                              name_kz varchar default 128,
                              name_en varchar default 128,
                              parent_id bigint not null,
                              year int not null,
                              company_id int not null,
                              code_index varchar default 16,
                              created_timestamp bigint not null,
                              created_by bigint not null,
                              updated_timestamp bigint not null,
                              updated_by bigint not null,
                              primary key (id)
);
alter table company_unit owner to postgres;
DROP TABLE IF EXISTS users;
Create table users (
                       id  serial not null,
                       auth_id bigint not null,
                       name varchar default 128,
                       fullname varchar default 128,
                       surname varchar default 128,
                       secondname varchar default 128,
                       status varchar default 128,
                       company_unit_id bigint not null,
                       password varchar default 128,
                       last_login_timestamp bigint not null,
                       iin varchar default 32,
                       is_active boolean not null,
                       is_activeted boolean not null,
                       company_id int not null,
                       code_index varchar default 16,
                       created_timestamp bigint not null,
                       created_by bigint not null,
                       updated_timestamp bigint not null,
                       updated_by bigint not null,
                       primary key (id)
);
alter table users owner to postgres;

DROP TABLE IF EXISTS auth;
Create table auth (
                      id  serial not null,
                      username varchar default 255,
                      email varchar default 255,
                      password varchar default 128,
                      rope varchar default 255,
                      forgot_password_key varchar default 128,
                      forgot_password_key_timestamp bigint not null,
                      company_unit_id bigint not null,
                      primary key (id)
);
alter table auth owner to postgres;
DROP TABLE IF EXISTS record;
Create table record (
                        id  serial not null,
                        number varchar default 128,
                        type varchar default 128,
                        company_unit_id bigint not null,
                        created_timestamp bigint not null,
                        created_by bigint not null,
                        updated_timestamp bigint not null,
                        updated_by bigint not null,
                        primary key (id)
);
alter table record owner to postgres;

DROP TABLE IF EXISTS case_index;
Create table case_index (
                            id  serial not null,
                            case_index varchar default 128,
                            title_ru varchar default 128,
                            title_kx varchar default 128,
                            title_en varchar default 128,
                            storage_type int not null,
                            storage_year int not null,
                            note varchar default 128,
                            company_unit_id bigint not null,
                            nomenclature_id bigint not null,
                            created_timestamp bigint not null,
                            created_by bigint not null,
                            updated_timestamp bigint not null,
                            updated_by bigint not null,
                            primary key (id)
);
alter table case_index owner to postgres;

DROP TABLE IF EXISTS nomenclature;
Create table nomenclature (
                              id  serial not null,
                              nomenclature_number varchar default 128,
                              year int not null,
                              nomenclature_summary_id bigint not null,
                              company_unit_id bigint not null,
                              created_timestamp bigint not null,
                              created_by bigint not null,
                              updated_timestamp bigint not null,
                              updated_by bigint not null,
                              primary key (id)
);
alter table nomenclature owner to postgres;

DROP TABLE IF EXISTS case1;
Create table case1 (
                      id  serial not null,
                      case_number varchar default 128,
                      volume_number varchar default 128,
                      case_title_ru varchar default 128,
                      case_title_kz varchar default 128,
                      case_title_en varchar default 128,
                      start_date bigint not null,
                      end_date bigint not null,
                      page_number bigint not null,
                      signature_flag_eds boolean not null,
                      signature_eds text not null,
                      naf_sign_sending boolean not null,
                      deletion_sign boolean not null,
                      restricted_flag boolean not null,
                      hash varchar default 128,
                      version int not null,
                      id_versoin varchar default 128,
                      active_version_flag boolean not null,
                      note varchar default 255,
                      location_id bigint not null,
                      index_case_id bigint not null,
                      record_id bigint not null,
                      destruction_act_id bigint not null,
                      structural_unit_id bigint not null,
                      blockchain_address_case varchar default 128,
                      blockchain_date_added bigint not null,
                      created_timestamp bigint not null,
                      created_by bigint not null,
                      updated_timestamp bigint not null,
                      updated_by bigint not null,

                      primary key (id)
);
alter table case1 owner to postgres;

DROP TABLE IF EXISTS request;
Create table request (
                         id  serial not null,
                         request_user_id bigint not null,
                         response_user_id bigint not null,
                         case_id bigint not null,
                         case_index_id bigint not null,
                         created_type varchar default 64,
                         comment varchar default 255,
                         status varchar default 64,
                         timestamp bigint not null,
                         sharestamp bigint not null,
                         sharefinish bigint not null,
                         favorite boolean not null,
                         updated_timestamp bigint not null,
                         updated_by bigint not null,
                         declinenote varchar default 255,
                         company_unit_id bigint not null,
                         from_request_id bigint not null,
                         primary key (id)
);
alter table request owner to postgres;
DROP TABLE IF EXISTS share;
Create table share (
                       id  serial not null,
                       request_id bigint not null,
                       note varchar default 255,
                       sender_id bigint not null,
                       receiver_id bigint not null,
                       share_timestamp bigint not null,
                       primary key (id)
);
alter table share owner to postgres;


DROP TABLE IF EXISTS status_request_history;
Create table status_request_history (
                                        id  serial not null,
                                        request_id bigint not null,
                                        status varchar default 64,
                                        created_timestamp bigint not null,
                                        created_by bigint not null,
                                        updated_timestamp bigint not null,
                                        updated_by bigint not null,
                                        primary key (id)
);
alter table status_request_history owner to postgres;
DROP TABLE IF EXISTS destruction_act;
Create table destruction_act (
                                 id  serial not null,
                                 act_number varchar default 128,
                                 base varchar default 256,
                                 structural_subdivision_id bigint not null,
                                 created_timestamp bigint not null,
                                 created_by bigint not null,
                                 updated_timestamp bigint not null,
                                 updated_by bigint not null,
                                 primary key (id)
);
alter table destruction_act owner to postgres;

DROP TABLE IF EXISTS nomenclature_summary;
Create table nomenclature_summary (
                                      id  serial not null,
                                      number varchar default 128,
                                      year int not null,
                                      company_unit_id bigint not null,
                                      created_timestamp bigint not null,
                                      created_by bigint not null,
                                      updated_timestamp bigint not null,
                                      updated_by bigint not null,
                                      primary key (id)
);
alter table nomenclature_summary owner to postgres;
DROP TABLE IF EXISTS catalog_case;
Create table catalog_case (
                              id  serial not null,
                              case_id bigint not null,
                              catalog_id bigint not null,
                              company_unit_id bigint not null,
                              created_timestamp bigint not null,
                              created_by bigint not null,
                              updated_timestamp bigint not null,
                              updated_by bigint not null,
                              primary key (id)
);
alter table catalog_case owner to postgres;

DROP TABLE IF EXISTS search_key_routing;
Create table search_key_routing (
                                    id  serial not null,
                                    search_key_id bigint not null,
                                    table_name varchar default 128,
                                    table_id bigint not null ,
                                    type varchar default 128,
                                    primary key (id)
);
alter table search_key_routing owner to postgres;

DROP TABLE IF EXISTS searchkey;
Create table searchkey (
                           id  serial not null,
                           name varchar default 128,
                           company_unit_id bigint not null,
                           created_timestamp bigint not null,
                           created_by bigint not null,
                           updated_timestamp bigint not null,
                           updated_by bigint not null,
                           primary key (id)
);
alter table searchkey owner to postgres;
DROP TABLE IF EXISTS file;
Create table file (
                      id  serial not null,
                      name varchar default 128,
                      type varchar default 128,
                      size bigint not null,
                      page_count int not null,
                      hash varchar default 128,
                      is_deleted boolean not null,
                      file_binary_id bigint not null,
                      created_timestamp bigint not null,
                      created_by bigint not null,
                      updated_timestamp bigint not null,
                      updated_by bigint not null,
                      primary key (id)
);
alter table file owner to postgres;

DROP TABLE IF EXISTS tepfiles;
Create table tepfiles (
                          id  serial not null,
                          file_binary text not null,
                          file_binary_byte bytea,
                          primary key (id)
);
alter table tepfiles owner to postgres;
DROP TABLE IF EXISTS file_routing;
Create table file_routing (
                              id serial not null,
                              file_id bigint not null,
                              table_name varchar default 128,
                              table_id bigint not null,
                              type varchar default 128,
                              primary key (id)
);
alter table file_routing owner to postgres;

DROP TABLE IF EXISTS location;
Create table location (
                          id serial not null,
                          row varchar default 64,
                          line varchar default 64,
                          location_column varchar default 64,
                          box varchar default 64,
                          company_unit_id bigint not null,
                          created_timestamp bigint not null,
                          created_by bigint not null,
                          updated_timestamp bigint not null,
                          updated_by bigint not null,
                          primary key (id)
);
alter table location owner to postgres;
DROP TABLE IF EXISTS notification;
Create table notification (
                              id serial not null,
                              object_type varchar default 128,
                              object_id bigint not null,
                              company_unit_id bigint not null,
                              user_id bigint not null,
                              created_timestamp bigint not null,
                              viewed_timestamp bigint not null,
                              is_viewed bigint not null,
                              title varchar default 255,
                              text varchar default 255,
                              company_id bigint not null,
                              primary key (id)
);
alter table notification owner to postgres;

DROP TABLE IF EXISTS catolog_table;
Create table catolog_table (
                               id serial not null,
                               name_ru varchar default 128,
                               name_kz varchar default 128,
                               name_en varchar default 128,
                               parent_id bigint not null,
                               company_unit_id bigint not null,
                               created_timestamp bigint not null,
                               created_by bigint not null,
                               updated_timestamp bigint not null,
                               updated_by bigint not null,
                               primary key (id)
);
alter table catolog_table owner to postgres;

DROP TABLE IF EXISTS activate_journal;
Create table activate_journal (
                                  id serial not null,
                                  event_type varchar default 128,
                                  object_type varchar default 255,
                                  object_id bigint not null,
                                  created_timestamp bigint not null,
                                  created_by bigint not null,
                                  message_level varchar default 128,
                                  message varchar default 255,
                                  primary key (id)
);
alter table activate_journal owner to postgres;