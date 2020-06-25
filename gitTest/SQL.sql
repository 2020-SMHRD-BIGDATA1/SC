create table MEMBERS (
MemberNum NUMBER unique not null,
MemberID VARCHAR2(20) ,
MemberPW VARCHAR2(20) not null,
MemberName VARCHAR2(20) not null,
MemberAddr VARCHAR2(100) not null ,
MemberPhone VARCHAR2(20) not null ,
MemberCode VARCHAR2(20) unique not null,
constraint MemberID_pk PRIMARY KEY(Member_ID)
)


create sequence Members_Sequence
   start with 1
   increment by 1

   
select * from members

drop table members

create table BOARDS(
					boardNum number 			,
					boardTitle varchar2(50) 	not null,
					boardAddr varchar2(100) 	not null,
					boardContent varchar2(1000) not null,
					memberID varchar2(20) 		,
					boardDate date 				default SYSDATE,
					constraint boardNum_pk PRIMARY KEY(boardNum),
              	 	constraint memberID_fk FOREIGN KEY(memberID)
               		references members(memberID),
               		constraint memberID_uk UNIQUE(memberID)
				   );
create sequence BOARDS_Sequence
	start with 1
	increment by 1;
	
insert into BOARDS(boardNum, boardTitle, boardContent, boardAddr)
	values (BOARDS_Sequence.NEXTVAL, '力格3', '郴侩3', '林家4')
commit;
	
select * from BOARDS

drop table BOARDS
drop sequence BOARDS_Sequence

select * from BOARDS
