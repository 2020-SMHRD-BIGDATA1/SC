create table MEMBERS (
MemberNum NUMBER unique not null,
MemberName VARCHAR2(20) not null,
MemberID VARCHAR2(20) primary key,
MemberPW VARCHAR2(20) not null,
MemberAddr VARCHAR2(100) not null ,
MemberPhone VARCHAR2(20)not null ,
MemberCode VARCHAR2(20) unique not null
)


create sequence Members_Sequence
   start with 1
   increment by 1

   
select * from members

drop table members