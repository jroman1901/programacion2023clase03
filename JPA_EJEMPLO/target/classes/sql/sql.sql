/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  apioriente
 * Created: 16-feb-2023
 */

create table empleados(
   id bigint unsigned auto_increment primary key,
   nombre varchar(100),
   direccion varchar(100),
   telefono varchar(100),
   salario double(18,2),
   estado int
);