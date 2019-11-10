create table basket (
basketId int primary key not null auto_increment,
user_id int);

create table laptops (
laptop_Id int primary key not null auto_increment,
name varchar(255),
price double precision,
basket_id int) engine=InnoDB;

create table my_seq_role (next_val int ) engine=InnoDB;
insert into my_seq_role values ( 1 );

create table my_seq_user (next_val int) engine=InnoDB;
insert into my_seq_user values ( 1 );

create table roles (
role_id int not null,
name varchar(255), primary key (role_id)) engine=InnoDB;

create table users (
user_id int primary key not null,
active bit not null,
password varchar(255),
user_name varchar(255),
basket_id_fk int )engine=InnoDB;

create table users_roles (
user_id int not null,
role_id int not null, primary key (user_id, role_id)) engine=InnoDB;

alter table basket add constraint FK_basket_id foreign key (user_id) references users (user_id);
alter table laptops add constraint FK_laptop_id foreign key (basket_id) references basket (basketId);
alter table users add constraint FK_user_id foreign key (basket_id_fk) references basket (basketId);
alter table users_roles add constraint FK_user_id foreign key (role_id) references roles (role_id);
alter table users_roles add constraint FK_user_id foreign key (user_id) references users (user_id);
