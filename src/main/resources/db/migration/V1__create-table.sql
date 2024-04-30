create table rac_racao (
 rac_id bigint primary key auto_increment,
 rac_nome varchar(100) not null,
 rac_data_hora_ultima_compra datetime not null,
 rac_estoque float not null,
 rac_avaliacao int
);