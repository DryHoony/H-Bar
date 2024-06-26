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
    
--    capacity_base1 NUMBER, -- base1에 대한 용량
--    capacity_base2 NUMBER, -- base2에 대한 용량
--    capacity_juice1 NUMBER, -- juice1에 대한 용량
--    capacity_juice2 NUMBER, -- juice2에 대한 용량
--    capacity_juice3 NUMBER, -- juice3에 대한 용량
--    capacity_juice4 NUMBER -- juice4에 대한 용량
--    capacity_ingredients varchar(50), -- ingredients에 대한 용량
    
    method varchar2(10) check(method in ('Shaking', 'Stir', 'Build')),
    proof number(2), -- base 테이블로 부터 도수(proof) 를 받아와 계산하기
--    recipe varchar(100), -- 재료와 method로 모두 표현, 부족한 내용은 comments에 할당
    comments varchar(100),
    
    CONSTRAINT fk_base1 FOREIGN KEY (base1) REFERENCES base(baseName),
    CONSTRAINT fk_base2 FOREIGN KEY (base2) REFERENCES base(baseName)
);

select * from menu;

drop table menu;


-----------------------------------------------------

-- < base 테이블 Script >

create table base (
    baseName varchar(50) primary key, -- 기주 명
    baseType varchar(50), -- 기주 종류 : 진, 보드카, 위스키, 트리플섹, 말리부, 피치트리, 럼
    proof Number(2), -- 도수
    comments varchar(50)
);

select * from base;

drop table base;




