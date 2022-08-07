CREATE DATABASE IF NOT EXISTS rental_Maquinaria;
USE rental_Maquinaria;

CREATE TABLE departamento (
	id_departamento INT (20) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE table municipio (
	id_municipio INT AUTO_INCREMENT PRIMARY KEY,
    id_departamento INT,
    nombre varchar(100),
    FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento)
);

CREATE TABLE token(
	id_token INT AUTO_INCREMENT PRIMARY KEY,
    verificado BOOLEAN DEFAULT 0,
    token VARCHAR (25),
    fecha DATETIME,
    fecha_tm TIMESTAMP,
    id_usuario INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE rol(
	id_rol INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20)
);

CREATE TABLE usuario(
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    telefono VARCHAR(50),
    email VARCHAR(50),
    clave VARCHAR(50),
    verificacion BIT(1) DEFAULT 0
);

/*ALTER TABLE usuario ADD COLUMN id_token int, add constraint fk_id_token foreign key(id_token)REFERENCES token(id_token);
*/
CREATE TABLE usuario_roles(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_rol INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol)
    );
    
CREATE TABLE imagen (
	id_imagen INT AUTO_INCREMENT PRIMARY KEY,
    enlace_imagen BLOB
);

CREATE TABLE tipo_maquina(
	id_tipo_maquina INT AUTO_INCREMENT PRIMARY KEY ,
    nombre_maquina VARCHAR(50)
);

CREATE TABLE maquina(
	id_maquina INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
    descripcion VARCHAR(500),
    precio_dia FLOAT(12,2),
    precio_hora FLOAT(12,2),
    id_usuario INT,
    id_tipo_maquina INT,
    id_municipio INT,
    id_imagen INT,
    estado BIT(1) DEFAULT 1,
    FOREIGN KEY (id_imagen) REFERENCES imagen(id_imagen),
    FOREIGN KEY(id_tipo_maquina) REFERENCES tipo_maquina(id_tipo_maquina),
    FOREIGN KEY(id_municipio) REFERENCES municipio(id_municipio),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE reserva(
	id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_maquina INT,
    fecha_inicio DATE, 
    fecha_final DATE,
    precio_reserva FLOAT(12,2), 
    FOREIGN KEY(id_maquina) REFERENCES maquina(id_maquina),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);







/*<------------------------------------QUERYS DE ERRORES----------------------------------------*IGNORARLAS*>

INSERT INTO maquina 
(nombre, descripcion, precio_dia, precio_hora,id_usuario,id_tipo_maquina,id_municipio) VALUES 
("XL JohnDeere", "Excavadora grande, todo terreno y fuerte", 1000, 20, 2, 3, 3);
SELECT * FROM maquina;

SELECT * FROM rol;
ALTER PARA ERRORES <--->
SELECT * FROM usuario;
ALTER TABLE usuario DROP CONSTRAINT fk_id_token;
ALTER TABLE usuario DROP COLUMN id_token;
ALTER TABLE maquina drop column precio_por_dia;
ALTER TABLE maquina drop column precio_por_hora;
ALTER TABLE reserva drop column precio_reserva;
ALTER TABLE token ADD COLUMN id_usuario int, add constraint fk_id_usuario foreign key(id_usuario)REFERENCES usuario(id_usuario);


ALTER TABLE maquina ADD precio_dia FLOAT(12,2);
ALTER TABLE maquina ADD precio_hora FLOAT(12,2);
ALTER TABLE reserva ADD precio_reserva FLOAT(12,2);

DROP DATABASE rental_maquinaria;
DROP TABLE rol;
DROP table usuario_roles;
*/