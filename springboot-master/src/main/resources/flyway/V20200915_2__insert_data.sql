INSERT INTO fond (fond_number,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
('+77775556644',1,1,2,3),
('+77775556644',2,1,2,3),
('+77775556644',3,1,2,3);

INSERT INTO company (name_ru,name_kz,name_en,bin,parent_id,fond_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
('бим','бим',',bim','abc',1,2,3,4,5,6),
('бим','бим',',bim','abc',1,2,3,4,5,6),
('бим','бим',',bim','abc',1,2,3,4,5,6);

INSERT INTO company_unit (name_ru,name_kz,name_en,parent_id,year,company_id,code_index,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
('бим','бим',',bim',1,2,3,'123',4,5,6,7),
('бим','бим',',bim',1,2,3,'123',4,5,6,7),
('бим','бим',',bim',1,2,3,'123',4,5,6,7);
INSERT INTO users (auth_id,name,fullname,surname,secondname,status,company_unit_id,password,last_login_timestamp,iin,is_active,is_activeted,company_id,code_index,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
(1,'bim1','bim2','bim3','bim4','bim5',2,'bim6',3,'bim7',true,true,4,'bim8',5,6,7,8),
(1,'bim1','bim2','bim3','bim4','bim5',2,'bim6',3,'bim7',true,true,4,'bim8',5,6,7,8),
(1,'bim1','bim2','bim3','bim4','bim5',2,'bim6',3,'bim7',true,true,4,'bim8',5,6,7,8);

INSERT INTO auth (username,email,password,rope,forgot_password_key,forgot_password_key_timestamp,company_unit_id)
VALUES
('bim1','bim2','bim3','bim4','bim5',1,2),
('bim1','bim2','bim3','bim4','bim5',1,2),
('bim1','bim2','bim3','bim4','bim5',1,2);

INSERT INTO record (number,type,company_unit_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
('bim1','bim2',1,2,3,4,5),
('bim1','bim2',1,2,3,4,5),
('bim1','bim2',1,2,3,4,5);
INSERT INTO case_index (case_index,title_ru,title_kx,title_en,storage_type,storage_year,note,company_unit_id,nomenclature_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
('bim1','бим','бим',',bim',1,2,'bim2',3,4,5,6,7,8),
('bim1','бим','бим',',bim',1,2,'bim2',3,4,5,6,7,8),
('bim1','бим','бим',',bim',1,2,'bim2',3,4,5,6,7,8);

INSERT INTO nomenclature (nomenclature_number,year,nomenclature_summary_id,company_unit_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
('bim1',1,2,3,4,5,6,7),
('bim1',1,2,3,4,5,6,7),
('bim1',1,2,3,4,5,6,7);

INSERT INTO case1( case_number, volume_number, case_title_ru, case_title_kz, case_title_en, start_date, end_date, page_number, signature_flag_eds, signature_eds, naf_sign_sending, deletion_sign, restricted_flag, hash, version, id_versoin, active_version_flag, note, location_id, index_case_id, record_id, destruction_act_id, structural_unit_id, blockchain_address_case, blockchain_date_added, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES
('bim1','bim2','бим','бим',',bim',1,2,3,true,'bim3',true,true,true,'bim4',4,'bim5',true,'bim6',5,6,7,8,9,'bim7',10,12,13,14,15),
('bim1','bim2','бим','бим',',bim',1,2,3,true,'bim3',true,true,true,'bim4',4,'bim5',true,'bim6',5,6,7,8,9,'bim7',10,12,13,14,15),
('bim1','bim2','бим','бим',',bim',1,2,3,true,'bim3',true,true,true,'bim4',4,'bim5',true,'bim6',5,6,7,8,9,'bim7',10,12,13,14,15);
INSERT INTO request( request_user_id, response_user_id, case_id, case_index_id, created_type, comment, status, timestamp, sharestamp, sharefinish, favorite, updated_timestamp, updated_by, declinenote, company_unit_id, from_request_id)
VALUES
(1,2,3,4,'bim1','bim2','bim3',5,6,7,true,8,9,'bim4',10,11),
(1,2,3,4,'bim1','bim2','bim3',5,6,7,true,8,9,'bim4',10,11),
(1,2,3,4,'bim1','bim2','bim3',5,6,7,true,8,9,'bim4',10,11);

INSERT INTO share (request_id,note,sender_id,receiver_id,share_timestamp)
VALUES
(1,'bim1',2,3,4),
(1,'bim1',2,3,4),
(1,'bim1',2,3,4);



INSERT INTO status_request_history( request_id, status, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES (1,'status1',1,1,1,1),
       (2,'status2',2,2,2,2),
       (3,'status3',3,3,3,3);
INSERT INTO destruction_act(act_number,base,structural_subdivision_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES ('act1','base1',1,1,1,1,1),
       ('act2','base2',2,2,2,2,2),
       ('act3','base3',3,3,3,3,3);

INSERT INTO nomenclature_summary(number,year,company_unit_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES  ('NUM1',1,1,1,1,1,1),
        ('NUM2',2,2,2,2,2,2),
        ('NUM1',3,3,3,3,3,3);

INSERT INTO catalog_case(case_id, catalog_id, company_unit_id, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES (1,1,1,1,1,1,1),
       (2,2,2,2,2,2,2),
       (3,3,3,3,3,3,3);

INSERT INTO search_key_routing(search_key_id, table_name, table_id, type)
VALUES (1,'name1',1,'type1'),
       (2,'name2',2,'type2'),
       (3,'name3',3,'type3');

INSERT INTO searchkey( name, company_unit_id, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES ('name1',1,1,1,1,1),
       ('name2',2,2,2,2,2),
       ('name3',3,3,3,3,3);
INSERT INTO file(name, type, size, page_count, hash, is_deleted, file_binary_id, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES ('name1','type1',1,1,'hash1',true,3,1,1,1,1),
       ('name2','type2',2,2,'hash2',false,2,2,2,2,2),
       ('name3','type3',3,3,'hash1',true,3,3,3,3,3);
INSERT INTO tepfiles(file_binary, file_binary_byte)
VALUES ('as1','ds'),
       ('as2','ds'),
       ('as3','sd');
INSERT INTO file_routing( file_id, table_name, table_id, type)
VALUES (1,'nameT1',1,'type1'),
       (2,'nameT2',2,'type2'),
       (3,'nameT3',3,'type3');
INSERT INTO location( row, line, location_column, box, company_unit_id, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES ('row1','line1','loc1','box1',1,1,1,1,1),
       ('row2','line2','loc2','box2',2,2,2,2,2),
       ('row3','line3','loc3','box3',3,3,3,3,3);
INSERT INTO notification(object_type, object_id, company_unit_id, user_id, created_timestamp, viewed_timestamp, is_viewed, title, text, company_id)
VALUES ('OB1',1,1,1,1,1,1,'TITLE1','TEXT1',1),
       ('OB2',2,2,2,2,2,2,'TITLE2','TEXT2',2),
       ('OB3',3,3,3,3,3,3,'TITLE3','TEXT3',3);
INSERT INTO catolog_table(name_ru, name_kz, name_en, parent_id, company_unit_id, created_timestamp, created_by, updated_timestamp, updated_by)
VALUES ('nameru1','namekz1','nameez1',1,1,1,1,1,1),
       ('nameru2','namekz2','nameez2',2,2,2,2,2,2),
       ('nameru3','namekz3','nameez3',3,3,3,3,3,3);
INSERT INTO activate_journal( event_type, object_type, object_id, created_timestamp, created_by, message_level, message)
VALUES ('event1','ob1',1,1,1,'messlevel1','mess1'),
       ('event2','ob2',2,2,2,'messlevel2','mess2'),
       ('event3','ob3',3,3,3,'messlevel3','mess3');