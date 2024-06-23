CREATE USER 'jefe'@'localhost' IDENTIFIED BY 'sjdksahdkad';
GRANT ALL ON clientes_empresa.* TO 'jefe'@'localhost';

drop database clientes_empresa;
create database clientes_empresa;
use clientes_empresa;

CREATE TABLE Vino (
  id INT UNIQUE NOT NULL PRIMARY KEY auto_increment,
  nombre VARCHAR(80),
  tipo VARCHAR(80),
  aniada int,
  bodega VARCHAR(80)
  );

use clientes_empresa; 
select * from Vino;