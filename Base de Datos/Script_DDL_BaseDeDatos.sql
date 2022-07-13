create database rentadora;
use rentadora;

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

create table estado_maquina (
	id_estado_maquina int auto_increment,
    estado varchar (20),
    primary key (id_estado_maquina)
);

create table tipo_maquina (
	id_tipo_maquina int auto_increment,
    nombre varchar (100),
    primary key (id_tipo_maquina)
);

create table carrito (
	id_carrito int auto_increment,
    fecha_solicitud date,
    total_a_pagar decimal(12,2),
    verificacion bit(1) default 0,
    primary key (id_carrito)
);

create table pago (
	id_pago int auto_increment,
    id_carrito int,
    imagen longblob,
    primary key (id_pago),
    foreign key (id_carrito) references carrito(id_carrito)
);

create table duenio(
	id_duenio int auto_increment primary key,
    nombre varchar(50),
    apellido varchar(50),
    nombre_usuario varchar(60),
    telefono varchar(50),
    email varchar(50),
    verificada bit(1) default 0
);

create table cliente(
	id_cliente int auto_increment primary key,
    nombre varchar(50),
    apellido varchar(50),
    nombre_usuario varchar(60),
    telefono varchar(50),
    email varchar(50),
    verificada bit(1) default 0
);

create table maquina (
	id_maquina int auto_increment,
    id_duenio int,
    id_tipo_maquina int,
    id_estado_maquina int,
    id_municipio int,
    nombre varchar (100),
    descripcion varchar (500),
    precio_por_dia decimal(12,2),
    imagen longblob,
    primary key (id_maquina),
    foreign key (id_duenio) references duenio(id_duenio),
    foreign key (id_tipo_maquina) references tipo_maquina(id_tipo_maquina),
    foreign key (id_estado_maquina) references estado_maquina(id_estado_maquina),
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

create table reservas_por_carrito (
	id_carrito int,
    id_reserva int,
    foreign key (id_carrito) references carrito(id_carrito),
    foreign key (id_reserva) references reserva(id_reserva)
); 

create table detalle_topador (
	id_detalle_topador int auto_increment primary key,
    id_maquina int,
    nombre varchar(100),
    potencia_neta_motor varchar(100),
    oruga_sobre_suelo varchar(100),
    peso_operativo varchar(100),
    rango_ancho_hoja varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_cargador(
	id_cargador int auto_increment primary key,
    id_maquina int,
    potencia_neta varchar(100),
    capacidad_cucharon varchar(100),
    peso_operativo varchar(100),
    fuerza_inicial varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_articulado(
	id_articulado int auto_increment primary key,
    id_maquina int,
    carga_nominal varchar(100),
    capacidad_colmado varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_excavadora(
	id_excavadora int auto_increment primary key,
	id_maquina int,
    potencia_motor varchar(100),
    peso_operativo varchar(100),
    profundidad_excavacion varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_minicargadores(
	id_excavadora int auto_increment primary key,
    id_maquina int,
    potencia_neta varchar(100),
    capacidad_nominal varchar(100),
    peso_operativo varchar(100),
	potencia_bruta varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_orugas(
	id_oruga int auto_increment primary key,
    id_maquina int,
    potencia_neta varchar(100),
    capacidad_nominal varchar(100),
    peso_operativo varchar(100),
	potencia_bruta varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_motoniveladora(
	id_motoniveladora int auto_increment primary key,
    id_maquina int,
    potencia_neta varchar(100),
    motor_neto_max varchar(100),
	fuerza_arrastre varchar(100),
	aumento_neto varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);

create table detalle_retroexcavadora(
	id_motoniveladora int auto_increment primary key,
    id_maquina int,
    potencia_neta varchar(100),
    potencia_max varchar(100),
	fuerza_excavacion varchar(100),
	capacidad_elevacion varchar(100),
    foreign key (id_maquina) references maquina(id_maquina)
);










