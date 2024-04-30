create table rac_racao (
 rac_id bigint primary key auto_increment,
 rac_nome varchar(100) not null,
 rac_data_hora_ultima_compra datetime not null,
 rac_estoque float not null,
 rac_avaliacao int
);

insert into rac_racao (rac_nome, rac_data_hora_ultima_compra, rac_estoque, rac_avaliacao)
values ('Purina', '2024-03-15 23:59:59', 10.5, 7),
('Pedigree', current_timestamp(), 3, null);