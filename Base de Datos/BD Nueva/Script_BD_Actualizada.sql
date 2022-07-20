create database rentalMaquinaria;
use rentalMaquinaria;

create table departamento (
	id_departamento int (20) auto_increment primary key,
    nombre varchar(100)
);

create table municipio (
	id_municipio int auto_increment primary key,
    id_departamento int,
    nombre varchar(100),
    foreign key (id_departamento) references departamento(id_departamento)
);

create table duenio(
	id_duenio int auto_increment primary key,
    nombre varchar(50),
    apellido varchar(50),
    nombre_usuario varchar(60),
    telefono varchar(50),
    email varchar(50),
    clave varchar(50),
    verificacion bit(1) default 0
);

create table cliente(
	id_cliente int auto_increment primary key,
    nombre varchar(50),
    apellido varchar(50),
    nombre_usuario varchar(60),
    telefono varchar(50),
    email varchar(50),
    clave varchar(50),
    verificacion bit(1) default 0
);

create table tipo_maquina(
	id_tipo_maquina int primary key auto_increment,
    nombre_maquina varchar(50)
);

create table imagen (
	id_imagen int auto_increment primary key,
    enlace_imagen blob
);


create table maquina(
	id_maquina int auto_increment primary key,
    id_duenio int,
    id_tipo_maquina int,
    id_municipio int,
    nombre varchar (100),
    descripcion varchar (500),
    precio_por_dia decimal(12,2),
    precio_por_hora decimal(12,2),
    estado bit(1) default 1,
    foreign key (id_duenio) references duenio(id_duenio),
    foreign key (id_tipo_maquina) references tipo_maquina(id_tipo_maquina),
    foreign key (id_municipio) references municipio(id_municipio)
);

create table reserva(
	id_reserva int auto_increment primary key,
    id_cliente int,
    id_maquina int,
    fecha_inicio date, 
    fecha_final date,
    precio_reserva decimal(12,2), 
    foreign key (id_maquina) references maquina(id_maquina),
    foreign key (id_cliente) references cliente(id_cliente)
);


