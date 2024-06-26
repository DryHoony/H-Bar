-- < menu ���̺� Script >

create Table menu (
    name varchar(50) primary key,
    
    base1 varchar(50), -- ����(����)
    base2 varchar(50),
    juice1 varchar(50), -- �ֽ�(������)
    juice2 varchar(50),
    juice3 varchar(50),
    juice4 varchar(50),
    ingredients varchar(50),
    
--    capacity_base1 NUMBER, -- base1�� ���� �뷮
--    capacity_base2 NUMBER, -- base2�� ���� �뷮
--    capacity_juice1 NUMBER, -- juice1�� ���� �뷮
--    capacity_juice2 NUMBER, -- juice2�� ���� �뷮
--    capacity_juice3 NUMBER, -- juice3�� ���� �뷮
--    capacity_juice4 NUMBER -- juice4�� ���� �뷮
--    capacity_ingredients varchar(50), -- ingredients�� ���� �뷮
    
    method varchar2(10) check(method in ('Shaking', 'Stir', 'Build')),
    proof number(2), -- base ���̺��� ���� ����(proof) �� �޾ƿ� ����ϱ�
--    recipe varchar(100), -- ���� method�� ��� ǥ��, ������ ������ comments�� �Ҵ�
    comments varchar(100),
    
    CONSTRAINT fk_base1 FOREIGN KEY (base1) REFERENCES base(baseName),
    CONSTRAINT fk_base2 FOREIGN KEY (base2) REFERENCES base(baseName)
);

select * from menu;

drop table menu;


-----------------------------------------------------

-- < base ���̺� Script >

create table base (
    baseName varchar(50) primary key, -- ���� ��
    baseType varchar(50), -- ���� ���� : ��, ����ī, ����Ű, Ʈ���ü�, ������, ��ġƮ��, ��
    proof Number(2), -- ����
    comments varchar(50)
);

select * from base;

drop table base;



