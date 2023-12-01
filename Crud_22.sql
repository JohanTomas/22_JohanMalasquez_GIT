CREATE DATABASE S17;
USE S17;

CREATE TABLE persona (
 id INT AUTO_INCREMENT PRIMARY KEY,
 dni VARCHAR(8),
 nombres VARCHAR(50),
 edad INT,
 direccion VARCHAR(50),
 telefono INT
);

-- INSERTAR DATOS
INSERT INTO persona (dni, nombres, edad, direccion, telefono)
VALUES
	('75366255', 'johan', '18', 'asn jose', '903060835'),
	('10547584', 'juan', '20', 'cañete', '945879204');

-- LISTAR DATOS
SELECT * FROM persona;

-- MODIFICAR
UPDATE persona SET nombres = 'levano' WHERE id = 1;

-- ELIMINAR
DELETE FROM persona WHERE id = 2;
