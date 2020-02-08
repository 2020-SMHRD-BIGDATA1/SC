create table MEMBERS (
MemberNum NUMBER unique not null,
MemberID VARCHAR2(20) ,
MemberPW VARCHAR2(20) not null,
MemberName VARCHAR2(20) not null,
MemberAddr VARCHAR2(100) not null ,
MemberPhone VARCHAR2(20) not null ,
MemberCode VARCHAR2(20) unique not null,
constraint MemberID_pk PRIMARY KEY(MemberID)
)


create sequence Members_Sequence
   start with 1
   increment by 1

insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'admin3',	'admin',	'������',	'���� ���ϵ�',	'01011111110',	'9006162000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'saerom',	'saerom',	'�ϻ���',	'���걸 �Ű���',	'01082481710',	'9511072000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'raekang',	'raekang',	'������',	'�ϱ� ��ġ��',	'01039943119',	'9105141000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'yusang',	'yusang',	'������',	'���� ȭ����',	'01054252642',	'9505101000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'dongkyu',	'dongkyu',	'�̵���',	'���� ���굿',	'01096270116',	'9401161000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'haedo',	'haedo',	'Ȳ�ص�',	'�ϱ� ��ġ��',	'01096270117',	'9005121000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'dongwon',	'dongwon',	'�赿��',	'�ϱ� �ﰢ��',	'01096270118',	'8906241000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'byungkwan',	'byungkwan',	'�ں���',	'���� ȿ����',	'01096270119',	'8807012000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'hyunjin',	'hyunjin',	'������',	'���� ����',	'01096270120',	'8812081000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'unbi',	'unbi',	'����',	'���� ����',	'01096270121',	'7708152000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'myungjin',	'myungjin',	'�Ӹ���',	'���걸 �Ű���',	'01096270122',	'9405031000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'dongchan',	'dongchan',	'�赿��',	'���� ���̵�',	'01096270123',	'6908061000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'bora',	'bora',	'������',	'���� ����',	'01096270124',	'9609081000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'mihui',	'mihui',	'Ȳ����',	'�ϱ� �Ű',	'01096270125',	'8506192000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'juyeon',	'juyeon',	'���ֿ�',	'���� ȭ����',	'01096270126',	'9203151000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'innam',	'innam',	'���γ�',	'���걸 ��â��',	'01096270127',	'9903301000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'sujin',	'sujin',	'�ڼ���',	'���� ȭ����',	'01096270128',	'9704192000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'2sujin',	'2sujin',	'�̼���',	'���걸 ��â��',	'01096270129',	'9303031000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'jihoon',	'jihoon',	'������',	'�ϱ� ��ġ��',	'01096270130',	'9106232000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'eunji',	'eunji',	'������',	'�ϱ� ��ϵ�',	'01096270131',	'9410081000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'taeyoon',	'taeyoon',	'������',	'���� ���ε�',	'01096270132',	'8806152000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'2jihoon',	'2jihoon',	'������',	'�ϱ� ��ġ��',	'01096270133',	'9309172000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'yohan',	'yohan',	'������',	'���걸 ���ϵ�',	'01096270134',	'9605181000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'hyunmyeong',	'hyunmyeong',	'������',	'���걸 ��굿',	'01096270135',	'6804051000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'seungmo',	'seungmo',	'��¸�',	'���� ������',	'01096270136',	'8706262000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'gayoung',	'gayoung',	'�谡��',	'���� �����',	'01096270137',	'9910052000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'changeon',	'changeon',	'������',	'���� ������',	'01096270138',	'9003281000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'junsoo',	'junsoo',	'���ؼ�',	'���� ������',	'01096270139',	'6707091000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'minseon',	'minseon',	'���μ�',	'�ϱ� �Ű',	'01096270140',	'9501051000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'hyesoo',	'hyesoo',	'������',	'���걸 �Ű���',	'01096270141',	'9203301000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'myeongju',	'myeongju',	'�����',	'�ϱ� ǳ�⵿',	'01096270142',	'9307151000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'jaewon',	'jaewon',	'�����',	'�ϱ� ��ȭ��',	'01096270143',	'9608172000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'chanyoung',	'chanyoung',	'������',	'���� ������',	'01096270144',	'9603172000000')
   
select * from members

drop table members
drop sequence Members_Sequence

create table BOARDS(
					boardNum number 			,
					boardTitle varchar2(50) 	not null,
					boardAddr varchar2(100) 	not null,
					boardContent varchar2(1000) not null,
					memberID varchar2(20) 		,
					boardDate date		default sysdate,
					constraint boardNum_pk PRIMARY KEY(boardNum),
              	 	constraint memberID_fk FOREIGN KEY(memberID)
               		references members(memberID)
					)
               		

create sequence BOARDS_Sequence
	start with 1
	increment by 1;
	



alter table boards
modify (boarddate date [default sysdate])

commit;
	
select * from BOARDS

drop table BOARDS
drop sequence BOARDS_Sequence

select * from BOARDS
