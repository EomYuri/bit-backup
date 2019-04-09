-- 사용자 테이블 : USERS
CREATE TABLE users(
    no number primary key,
    name varchar2(20) NOT NULL,
    password varchar2(20) NOT NULL,
    email varchar2(128) NOT NULL UNIQUE,
    gender char(1) check(gender IN ('M', 'F')),
    created_at date DEFAULT sysdate);
    
-- 사용자 테이블 시퀀스 : seq_users_pk
CREATE SEQUENCE seq_users_pk
    START WITH 1
    INCREMENT BY 1;
    
-- sample user
INSERT INTO users(no, name, password, email, gender)
VALUES(seq_users_pk.nextval, '관리자', '1234', 'admin@example.com', 'M');

COMMIT;
    
    
    
select * from users;

delete from users where no=22;

commit;

