-- Active: 1705379493857@@aws-0-us-west-1.pooler.supabase.com@6543@postgres@public
select id_libro, titulo, fecha_publicacion, isbn, numero_ejemplares, foto, estado_libro from libros;
select * from autores;
select * from libros_autores;
select * from roles;
select * from usuarios;

INSERT INTO libros (estado_libro, fecha_publicacion, numero_ejemplares, isbn, titulo, foto) VALUES 
	(true, '4/19/1905' , 707, '952557303-6', 'Cyborg'                                                                  , 'Sapien.txt'           ),
	(true, '2/15/1986' , 135, '103874274-9', 'Dave Attell: Captain Miserable'                                          , 'OrciMauris.xls'       ),
	(true, '6/14/2013' , 10 , '509799529-5', 'Your Life in 65 (Tu vida en 65)'                                         , 'NamDui.png'           ),
	(true, '4/30/1970' , 628, '216160443-0', 'Emma'                                                                    , 'InterdumVenenatis.ppt'),
	(true, '1/12/1980' , 826, '852247639-X', 'What Have I Done to Deserve This? (¿Qué he hecho yo para merecer esto!!)', 'AtDiamNam. mpeg'      ),
	(true, '7/2/2011'  , 624, '842217628-9', 'Meat the Truth'                                                          , 'In.ppt'               ),
	(true, '3/26/2010' , 106, '181608382-8', 'Flicker (Flimmer)'                                                       , 'Nisi.avi'             ),
	(true, '6/24/1917' , 350, '660377765-7', 'Forgetting Sarah Marshall'                                               , 'TellusInSagittis.mp3' ),
	(true, '11/24/2016', 610, '052394962-6', 'Dressed to Kill'                                                         , 'Congue.tiff'          ),
	(true, '7/26/2022' , 496, '455491341-4', 'Remember the Daze (Beautiful Ordinary, The)'                             , 'NisiAtNibh.tiff'      );

INSERT INTO autores (estado_autor, fecha_nacimiento, apellido_autor, nacionalidad, nombre_autor) VALUES 
	(true, '1/6/2000'  , 'Redgrave' , 'Argentina'            , 'Holden'    ),
	(true, '10/27/2006', 'Newlan'   , 'France'               , 'Leeanne'   ),
	(true, '11/24/1936', 'Olifaunt' , 'China'                , 'Liane'     ),
	(true, '6/10/1961' , 'Chick'    , 'China'                , 'Erl'       ),
	(true, '10/16/1955', 'Cornuau'  , 'Palestinian Territory', 'Aldon'     ),
	(true, '4/11/1960' , 'Kubek'    , 'New Zealand'          , 'Josie'     ),
	(true, '6/28/1994' , 'Cocklie'  , 'Netherlands'          , 'Aubrette'  ),
	(true, '3/7/1948'  , 'Poundford', 'China'                , 'Purcell'   ),
	(true, '10/10/1910', 'Dureden'  , 'Colombia'             , 'Bonnibelle'),
	(true, '8/20/1980' , 'Charrette', 'Portugal'             , 'Chloette'  );

INSERT INTO libros_autores (autores_id_autor, libros_id_libro) VALUES 
	(9, 1),
	(8, 2),
	(7, 3),
	(6, 4),
	(5, 5),
	(4, 6),
	(3, 7),
	(2, 8),
	(1, 9),
	(2, 1);

INSERT INTO roles (rol) VALUES 
	('Bibliotecario'),
	('Lector');

INSERT INTO usuarios (estado_usuario, rol_id_rol, contrasena, telefono, apellido, nombre, email) VALUES 
	(false, 2, 'bA3_j<{}'    , '291-431-1298', 'Alekhov' , 'Debora'  , 'dalekhov0@japanpost.jp'),
	(true , 2, 'tG5"qxy67'   , '720-401-6957', 'Rodger'  , 'Oralle'  , 'orodger1@utexas.edu'   ),
	(false, 2, 'vK0>948|Xa'  , '915-497-6967', 'Ouslem'  , 'Elenore' , 'eouslem2@symantec.com' ),
	(true , 1, 'tU0=~JAA6'   , '701-692-6456', 'Staunton', 'Rhoda'   , 'rstaunton3@mapy.cz'    ),
	(true , 2, 'rK9%%~u+AJo+', '699-876-5065', 'Rosander', 'Salomo'  , 'srosander4@tripod.com' ),
	(false, 1, 'nW2/W*1G7'   , '187-315-9226', 'Croall'  , 'Milli'   , 'mcroall5@spiegel.de'   ),
	(false, 2, 'nE5~4F{l>C?' , '285-719-3188', 'Wolfit'   , 'Tedda'   , 'twolfit6@pinterest.com' ),
	(false, 2, 'dC6!3V&\LH)F', '592-283-0311', 'Minocchi', 'Tammie'  , 'tminocchi7@comsenz.com'),
	(true , 1, 'tS5&8+E"u<=%', '434-402-8203', 'McGinn'  , 'Kasper'  , 'kmcginn8@multiply.com' ),
	(true , 2, 'iI8)tlA.d'   , '619-682-6624', 'Stowte'  , 'Lowrance', 'lstowte9@woothemes.com');

INSERT INTO prestamos (fecha_devolucion, fecha_prestamo, libros_id_libro, usuarios_id_usuario) VALUES 
	('2024-08-01', '2024-07-18', 1 , 2 ),
	('2024-08-05', '2024-07-22', 3 , 4 ),
	('2024-08-08', '2024-07-28', 5 , 1 ),
	('2024-08-12', '2024-07-30', 7 , 3 ),
	('2024-08-15', '2024-08-02', 9 , 5 ),
	('2024-08-17', '2024-08-04', 2 , 6 ),
	('2024-08-20', '2024-08-06', 4 , 8 ),
	('2024-08-22', '2024-08-10', 6 , 9 ),
	('2024-08-25', '2024-08-12', 8 , 7 ),
	('2024-08-27', '2024-08-14', 10, 10);


SELECT libros.titulo, autores.nombre_autor, autores.apellido_autor
	FROM
		libros
		JOIN libros_autores ON libros.id_libro = libros_autores.libros_id_libro
		JOIN autores ON autores.id_autor = libros_autores.autores_id_autor
	LIMIT 5;

SELECT libros.titulo, autores.nacionalidad
	FROM
		libros
		JOIN libros_autores ON libros.id_libro = libros_autores.libros_id_libro
		JOIN autores ON autores.id_autor = libros_autores.autores_id_autor
	LIMIT 5;

SELECT usuarios.nombre, usuarios.apellido, roles.rol
	FROM usuarios
		JOIN roles ON usuarios.rol_id_rol = roles.id_rol
	LIMIT 5;

SELECT libros.titulo, libros.estado_libro, COUNT(prestamos.id_prestamo) AS prestamos_activos
	FROM libros
		LEFT JOIN prestamos ON libros.id_libro = prestamos.libros_id_libro
		AND prestamos.fecha_devolucion IS NULL
	GROUP BY
		libros.id_libro
	LIMIT 5;

SELECT
	CONCAT(
		usuarios.nombre,
		' ',
		usuarios.apellido
	) AS nombre_completo,
	libros.titulo AS Libro,
	prestamos.fecha_prestamo As "Fecha de préstamo",
	prestamos.fecha_devolucion AS "Fecha de devolución",
	CASE
		WHEN prestamos.fecha_devolucion < CURRENT_DATE THEN CONCAT(
			'Expiró hace ',
			(CURRENT_DATE - prestamos.fecha_devolucion)::INT,
			' días'
		)
		WHEN prestamos.fecha_devolucion = CURRENT_DATE THEN 'Expira hoy'
		ELSE CONCAT(
			'Faltan ',
			(prestamos.fecha_devolucion - CURRENT_DATE)::INT,
			' días'
		)
	END AS estado_prestamo
	FROM
		prestamos
		JOIN usuarios ON prestamos.usuarios_id_usuario = usuarios.id_usuario
		JOIN libros ON prestamos.libros_id_libro = libros.id_libro
	WHERE
		prestamos.fecha_devolucion IS NOT NULL
	LIMIT 5;