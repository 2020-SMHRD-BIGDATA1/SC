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
values(	Members_Sequence.NEXTVAL,	'admin3',	'admin',	'관리자',	'남구 송하동',	'01011111110',	'9006162000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'saerom',	'saerom',	'하새롬',	'광산구 신가동',	'01082481710',	'9511072000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'raekang',	'raekang',	'오래강',	'북구 오치동',	'01039943119',	'9105141000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'yusang',	'yusang',	'이유상',	'서구 화정동',	'01054252642',	'9505101000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'dongkyu',	'dongkyu',	'이동규',	'남구 월산동',	'01096270116',	'9401161000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'haedo',	'haedo',	'황해도',	'북구 오치동',	'01096270117',	'9005121000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'dongwon',	'dongwon',	'김동원',	'북구 삼각동',	'01096270118',	'8906241000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'byungkwan',	'byungkwan',	'박병관',	'남구 효덕동',	'01096270119',	'8807012000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'hyunjin',	'hyunjin',	'김현진',	'동구 동명동',	'01096270120',	'8812081000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'unbi',	'unbi',	'김운비',	'동구 동명동',	'01096270121',	'7708152000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'myungjin',	'myungjin',	'임명진',	'광산구 신가동',	'01096270122',	'9405031000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'dongchan',	'dongchan',	'김동찬',	'서구 쌍촌동',	'01096270123',	'6908061000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'bora',	'bora',	'연보라',	'동구 동명동',	'01096270124',	'9609081000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'mihui',	'mihui',	'황미희',	'북구 매곡동',	'01096270125',	'8506192000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'juyeon',	'juyeon',	'하주연',	'서구 화정동',	'01096270126',	'9203151000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'innam',	'innam',	'최인남',	'광산구 신창동',	'01096270127',	'9903301000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'sujin',	'sujin',	'박수진',	'서구 화정동',	'01096270128',	'9704192000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'2sujin',	'2sujin',	'이수진',	'광산구 신창동',	'01096270129',	'9303031000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'jihoon',	'jihoon',	'신지훈',	'북구 오치동',	'01096270130',	'9106232000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'eunji',	'eunji',	'이은지',	'북구 운암동',	'01096270131',	'9410081000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'taeyoon',	'taeyoon',	'민태윤',	'동구 대인동',	'01096270132',	'8806152000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'2jihoon',	'2jihoon',	'이지훈',	'북구 오치동',	'01096270133',	'9309172000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'yohan',	'yohan',	'문요한',	'광산구 수완동',	'01096270134',	'9605181000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'hyunmyeong',	'hyunmyeong',	'박현명',	'광산구 우산동',	'01096270135',	'6804051000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'seungmo',	'seungmo',	'김승모',	'남구 봉선동',	'01096270136',	'8706262000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'gayoung',	'gayoung',	'김가영',	'동구 산수동',	'01096270137',	'9910052000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'changeon',	'changeon',	'박찬건',	'남구 진월동',	'01096270138',	'9003281000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'junsoo',	'junsoo',	'심준수',	'남구 진월동',	'01096270139',	'6707091000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'minseon',	'minseon',	'정민선',	'북구 매곡동',	'01096270140',	'9501051000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'hyesoo',	'hyesoo',	'정혜수',	'광산구 신가동',	'01096270141',	'9203301000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'myeongju',	'myeongju',	'김명주',	'북구 풍향동',	'01096270142',	'9307151000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'jaewon',	'jaewon',	'정재원',	'북구 각화동',	'01096270143',	'9608172000000')
insert into MEMBERS(MemberNum, MemberID, MemberPW, MemberName,  MemberAddr, MemberPhone, MemberCode)
values(	Members_Sequence.NEXTVAL,	'chanyoung',	'chanyoung',	'반찬영',	'남구 진월동',	'01096270144',	'9603172000000')
   
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
