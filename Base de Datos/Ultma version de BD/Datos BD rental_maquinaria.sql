INSERT INTO `departamento` ( `nombre`) VALUES
	('Atlantida'),('Choluteca'),('Colon'),('Comayagua'),('Copan'), ('Cortes'),('El Paraiso'),
    ('Francisco Morazan'), ('Gracias a Dios'), ('Intibuca'), ('Islas de la Bahia'), ('La Paz'),
    ('Lempira'), ('Ocotepeque'), ('Olancho'), ('Santa Barbara'), ('Valle'), ('Yoro');
    
select * from departamento;
    
INSERT INTO `municipio` (`id_departamento`,`nombre`) VALUES
(1, 'La ceiba'), (1, 'Tela'), (1, 'La masica'), (1, 'Arizona'), (1, 'Jutiapa'), (1, 'El porvenir'),(1, 'Esparta'),(1, 'San Francisco'),
(2, 'Choluteca'),(2, 'Marcovia'),(2, 'El triunfo'),(2, 'Namasigue'),(2, 'Concepcion de Maria'),(2, 'Pespire'),(2, 'El Corpus'),(2, 'Orocuina'),
(2, 'Santa Ana de yusguare'),(2, 'Apacilagua'),(2, 'San antonio de flores'),(2, 'Morolica'),(2, 'Duyure'),(2, 'San Isidro'),(2, 'San Jose'),
(2, 'San Marcos de Colon'),(3, 'Tocoa'),(3, 'Bonito Oriental'),(3, 'Trujillo'),(3, 'Iriona'),(3, 'Balfate'),(3, 'Limon'),(3, 'Saba'),(3, 'Santa fe'),
(3, 'Santa rosa de Aguan'),(3, 'Sonaguera'),(4, 'Comayagua'),(4, 'Siguatepeque'),(4, 'La libertad'),(4, 'Taulabe'),(4, 'Villa de san antonio'),(4, 'San Jeronimo'),
(4, 'Esquias'),(4, 'Ajuterique'),(4, 'Minas de oro'),(4, 'Ojos de agua'),(4, 'Las lajas'),(4, 'San Luis'),(4, 'El Rosario'),(4, 'Lamani'),(4, 'San Jose de Comayagua'),
(4, 'Lejamani'),(4, 'San Jose del potrero'),(4, 'La trinidad'),(4, 'San Sebastian'),(4, 'Meambar'),(4, 'Humuya'),(5, 'Veracruz'),(5, 'Santa rosa de copan'),(5, 'Copan Ruinas'),
(5, 'Nueva Arcadia'),(5, 'Florida'),(5, 'Santa Rita'),(5, 'El Paraiso'),(5, 'Cucuyagua'),(5, 'La union'),(5, 'Corquin'),(5, 'Cabañas'),(5, 'San antonio'),(5, 'La jigua'),
(5, 'San juan de opoa'),(5, 'San Nicolas'),(5, 'Trinidad de Copan'),(5, 'Concepcion'),(5, 'San Jose'),(5, 'San Pedro'),(5, 'Dolores'),(5, 'Dulce Nombre'),(5, 'San Agustin'),
(6, 'Choloma'),(6, 'Puerto Cortes'),(6, 'Villanueva'),(6, 'Santa Cruz de Yojoa'),(6, 'La lima'),(6, 'San Manuel'),(6, 'Omoa'),(6, 'San Antonio de Cortes'),(6, 'Potrerillos'),
(6, 'Pimienta'),(6, 'San Francisco de Yojoa'),(6, 'San Pedro Sula'),(7, 'Trojes'),(7, 'Danli'),(7, 'El Paraiso'),(7, 'Teupasenti'),(7, 'Moroceli'),(7, 'Yuscaran'),(7, 'Liure'),
(7, 'Soledad'),(7, 'Texguat'),(7, 'Alauca'),(7, 'Guinope'),(7, 'San Lucas'),(7, 'Oropoli'),(7, 'Moroceli'),(7, 'San antonio de flores'),(7, 'San matias'),(7, 'Vado ancho'),(7, 'Jacaleapa'),
(7, 'Proterillos'),(7, 'Yauyupe'),(8, 'Tegucigalpa'),(8, 'Talanga'),(8, 'Guaimaca'),(8, 'Cedros'),(8, 'Curaren'),(8, 'Sabanagrande'),(8, 'El Porvenir'),(8, 'Lepaterique'),(8, 'San antonio de oriente'),
(8, 'Orica'),(8, 'Valle de angeles'),(8, 'San Juan de Flores'),(8, 'Reitoca'),(8, 'Santa Ana'),(8, 'Ojojona'),(8, 'Villa de san francisco'),(8, 'San Ignacio'),(8, 'Marale'),(8, 'Santa Lucia'),(8, 'Vallecillo'),
(8, 'La venta'),(8, 'Maraita'),(8, 'Tatumbla'),(8, 'La libertad'),(8, 'Nueva Armenia'),(8, 'San Miguelito'),(8, 'San Buenaventura'),(8, 'Alubaren'),(9, 'Puerto Lempira'),(9, 'Ramon Villeda Morales'),(9, 'Ahuas'),
(9, 'Juan Francisco Bulnes'),(9, 'Wampusirpe'),(9, 'Brus laguna'),(10, 'Initbuca'),(10, 'Jesus de Otoro'),(10, 'Masaguara'),(10, 'Yamaranguila'),(10, 'Colomoncagua'),(10, 'Concepcion'),(10, 'San Juan'),(10, 'La Esperanza'),
(10, 'San francisco de opalaca'),(10, 'San marcos de la sierra'),(10, 'Camasca'),(10, 'Magdalena'),(10, 'San antonio'),(10, 'Santa Lucia'),(10, 'San Miguel guancapla'),(10, 'Dolores'),(10, 'San Isidro'),
(11, 'Roatan'),(11, 'Guanaja'),(11, 'Jose Santos Guardiola'),(11, 'Utila'),(12, 'Santiago de Puringla'),(12, 'La paz'),(12, 'Marcala'),(12, 'Guajiquiro'),(12, 'Santa Ana'),(12, 'Santa Maria'),(12, 'Opatoro'),
(12, 'San Jose'),(12, 'Santa Elena'),(12, 'Chinacla'),(12, 'Yarula'),(12, 'San Pedro de Tutule'),(12, 'Aguanqueterique'),(12, 'Cane'),(12, 'San Antonio del norte'),(12, 'Lauterique'),(12, 'Cabañas'),
(12, 'San Juan'),(12, 'Mercedes de Oriente'),(13, 'Gracias'),(13, 'La iguala'),(13, 'La Union'),(13, 'San Sebastian'),(13, 'San Manuel Colohete'),(13, 'Piraera'),(13, 'San Rafael'),(13, 'San Andres'),(13, 'Erandique'),
(13, 'Gualcince'),(13, 'San Francisco'),(13, 'Las flores'),(13, 'Guarita'),(13, 'Talgua'),(13, 'Cololaca'),(13, 'La virtud'),(13, 'Candelaria'),(13, 'Tomala'),(13, 'Santa Cruz'),(13, 'Belen'),(13, 'La campa'),
(13, 'San Marcos de Caiquin'),(13, 'Lepaera'),(13, 'Mapulaca'),(13, 'Valladolid'),(13, 'San Juan Guarita'),(13, 'Virginia'),(13, 'Tambla'),(14, 'Ocotepeque'),(14, 'San Marcos'),(14, 'Belen Gualcho'),(14, 'Sesenti'),
(14, 'La labor'),(14, 'San francisco del valle'),(14, 'Mercedes'),(14, 'Sinuapa'),(14, 'San Fernando'),(14, 'San Jorge'),(14, 'La encarnacion'),(14, 'Concepcion'),(14, 'Santa Fe'),(14, 'Lucerna'),(14, 'Fraternidad'),
(14, 'Dolore Merendon'),(15, 'Juticalpa'),(15, 'Catacamas'),(15, 'Dulce Nombre de culmi'),(15, 'Patuca'),(15, 'San Esteban'),(15, 'Gualaco'),(15, 'Campamento'),(15, 'San Francisco de la paz'),(15, 'Santa Maria del real'),
(15, 'Guata'),(15, 'Manto'),(15, 'Guayape'),(15, 'Yocon'),(15, 'Esquipulas del valle'),(15, 'Mangulile'),(15, 'San francisco de becerra'),(15, 'La union'),(15, 'Guarizama'),(15, 'Silca'),(15, 'Salama'),(15, 'Concordia'),
(15, 'El rosario'),(15, 'Jano'),(16, 'Quimistan'),(16, 'Santa Barbara'),(16, 'San Luis'),(16, 'Nueva Frontera'),(16, 'Las vegas'),(16, 'Azacualpa'),(16, 'San Jose de las colinas'),(16, 'Trinidad'),(16, 'Proteccion'),(16, 'Naranjito'),
(16, 'San Marcos'),(16, 'Atima'),(16, 'San Nicolas'),(16, 'Petoa'),(16, 'San Pedro Azacapa'),(16, 'Ilama'),(16, 'Arada'),(16, 'Nuevo celilac'),(16, 'El nispero'),(16, 'Macuelizo'),(16, 'San francisco de ojuera'),(16, 'Gualala'),
(16, 'Chinda'),(16, 'Ceguaca'),(16, 'Concepcion del sur'),(16, 'Santa rita'),(16, 'San vicente centenario'),(16, 'Concepcion del norte'),(17, 'Nacaome'),(17, 'San Lorenzo'),(17, 'Langue'),(17, 'Goascoran'),(17, 'Aramecina'),
(17, 'Amapala'),(17, 'San francisco de coray'),(17, 'Alianza'),(17, 'Caridad'),(18, 'El progreso'),(18, 'Olanchito'),(18, 'Yoro'),(18, 'Santa Rita'),(18, 'El Negrito'),(18, 'Morazan'),(18, 'Victoria'),(18, 'Sulaco'),(18, 'Yorito'),
(18, 'Jocon'),(18, 'Arenal');


INSERT INTO `tipo_maquina` (`nombre_maquina`) VALUES
('Cargador de Ruedas'),('Camion Articulado'),('Excavadora'),('Minicargador'),('Minicargador de oruga'),
('Motonivaladora'),('Retroexcavadora'),('Tractor Topador');

SELECT * FROM tipo_maquina;

/*SCRIPTS*/
select count(*) from municipio;

select * from municipio;

select id_departamento, nombre, count(*) from municipio
group by nombre, id_departamento having count(*)>1; 

select id_municipio, id_departamento,  nombre from municipio group by nombre, id_departamento having count(*)>1; 

delete from  municipio where id_municipio = 36; 

SELECT * FROM tipo_maquina;

DROP TRIGGER IF EXISTS trigger_actualizarRol;
DROP TRIGGER IF EXISTS trigger_rol_usuario;
DROP TRIGGER IF EXISTS trigger_usuario_rol;

DELIMITER $$
	CREATE TRIGGER trigger_actualizarRol
	AFTER INSERT ON usuario
	FOR EACH ROW
	BEGIN
	DECLARE id_usuario INT;
	  IF 
		id_usuario=1
	  THEN 
		INSERT INTO rol(nombre) VALUES("ROLE_ADMIN"); 
	  ELSE 
		INSERT INTO rol(nombre) VALUES("ROLE_USER");
	  END IF;
DELIMITER ;

INSERT INTO tipo_maquina (nombre) VALUES(
'Cargador de Ruedas',
'Camion Articulado',
'Excavadora',
 'Minicargador',
'Minicargador de oruga',
'Motonivaladora',
'Retroexcavadora',
'Tractor Topador');

INSERT INTO usuario ( nombre,apellido,telefono,email,clave) 
VALUES ("Maria","Benavidez","934992", "mbv@gmail.com","231fma"),
	   ("Fernando","Antunez","992912", "fa@gmail.com","re21s"),
	   ("Julio","Jaramillo","935592", "jj@gmail.com","ops432");


INSERT INTO rol(nombre) VALUES("ROLE_ADMIN");
INSERT INTO rol(nombre) VALUES("ROLE_USR");

INSERT INTO usuario_roles(id_usuario, id_rol) VALUES(1,1), (2,2),(3,3);

INSERT INTO reserva (id_usuario, id_maquina, fecha_inicio, fecha_final, precio_reserva) VALUES
(2, 1, '2022-08-04', '2022-08-27', 18999.97);

SELECT * FROM reserva;