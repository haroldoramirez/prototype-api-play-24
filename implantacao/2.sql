# --- Sample dataset

# --- !Ups

insert into usuario (nome, email, senha, verificado, papel)
values ('Administrador', 'haroldoramirez@gmail.com', '209799FD3D4F728D1078852DF74F193239BF95CE' , TRUE, 'ADMIN');
insert into token_da_api (usuario_id, codigo, expicacao) values (1, 'D8E13FBA2F0F379C5A42C03026F4C9A8F5BCF346', '2019-11-22 14:42:23.383');

insert into usuario (nome, email, senha, verificado, papel)
values ('Api', 'haroldodev@gmail.com', '209799FD3D4F728D1078852DF74F193239BF95CE' , TRUE, 'ADMIN');
insert into token_da_api (usuario_id, codigo, expicacao) values (1, 'D8E13FBA2F0F379C5A42C03026F4C9A8F5BCF346', '2019-11-22 14:42:23.383');

insert into produto(titulo, codigo, tipo, descricao, preco)
values ('Produto 1', '555', 'Tipo 1', 'descricao 1', 1.10);
insert into produto(titulo, codigo, tipo, descricao, preco)
values ('Produto 2', '1333', 'Tipo 1', 'descricao 1', 10.10);
insert into produto(titulo, codigo, tipo, descricao, preco)
values ('Produto 13', '222', 'Tipo 1', 'descricao 1', 15.10);
insert into produto(titulo, codigo, tipo, descricao, preco)
values ('Produto 14', '111', 'Tipo 2', 'descricao 2', 25.10);