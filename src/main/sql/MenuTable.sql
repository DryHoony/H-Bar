-- < menu 테이블 Script >

create Table menu (
    name varchar(50) primary key,
    
    base1 varchar(50), -- 기주(알콜)
    base2 varchar(50),
    juice1 varchar(50), -- 주스(논알콜)
    juice2 varchar(50),
    juice3 varchar(50),
    juice4 varchar(50),
    ingredients varchar(50),
    
    capacity_base1 NUMBER, -- base1에 대한 용량
    capacity_base2 NUMBER, -- base2에 대한 용량
    capacity_juice1 NUMBER, -- juice1에 대한 용량
    capacity_juice2 NUMBER, -- juice2에 대한 용량
    capacity_juice3 NUMBER, -- juice3에 대한 용량
    capacity_juice4 NUMBER, -- juice4에 대한 용량
    capacity_ingredients varchar(50), -- ingredients에 대한 용량
    
    method varchar2(10) check(method in ('Shaking', 'Stir', 'Build')),
    proof number(2), -- base 테이블로 부터 도수(proof) 를 받아와 계산하기
--    recipe varchar(100), -- 재료와 method로 모두 표현, 부족한 내용은 comments에 할당
    comments varchar(100),
    
    CONSTRAINT fk_base1 FOREIGN KEY (base1) REFERENCES base(baseType),
    CONSTRAINT fk_base2 FOREIGN KEY (base2) REFERENCES base(baseType)
);

select * from menu;

drop table menu;

-- 예시 데이터 (진토닉)
Insert into menu(
name, 
base1, capacity_base1, 
juice1, capacity_juice1,
juice2, capacity_juice2,
method)
VALUES(
'진토닉',
'Gin', 45, -- Ref 확인
'Tonic Warter', 135,
'Lemon', 15,
'Build'
);

Insert into menu(
    name,
    base1, capacity_base1,
    base2, capacity_base2,
    juice1, capacity_juice1,
    juice2, capacity_juice2,
    juice3, capacity_juice3,
    juice4, capacity_juice4,
    ingredients, capacity_ingredients,
    method,
    proof,
    comments)
Values(
    '도화',
    '피치트리', 30,
    '트리플섹', 15,
    '레몬' , 15,
    '라임', 15,
    '사과주스', 30,
    '사이다', 100,
    '그레나딘', '1tsp',
    'Shaking',
    6,
    '사이다 외 재료를 Shaking 후 사이다를 Fill up'
);
    
;

select name, proof 
from menu;

select * from menu;

delete from menu;


-----------------------------------------------------

-- < base 테이블 Script >

create table base (
    baseName varchar(50) primary key, -- 기주 명
    baseType varchar(50) UNIQUE, -- 기주 종류 : 진, 보드카, 위스키, 트리플섹, 말리부, 피치트리, 럼
    proof Number(2), -- 도수
    comments varchar(50)
);

select * from base;

drop table base;

delete from base;

INSERT Into base (basename, baseType, proof)
VALUES('Bombay Sapphire', 'Gin', 47);

Insert into base
values('피치트리', '피치트리', 20, null);

Insert into base
values('트리플섹', '트리플섹', 40, null);




