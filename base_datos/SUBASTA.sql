-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-12-2018 a las 14:25:09
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;



CREATE TABLE IF NOT EXISTS `cliente` (
  `ci_cli` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `nombre_us` varchar(30) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `pais` varchar(50) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `contra` varchar(100) NOT NULL,
  `tipo_usuario` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `productos` (
  
  `codigo_p` varchar(50) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `dim` varchar(15) NOT NULL,
  `men_ram` varchar(15) NOT NULL,
  `almace` varchar(15) NOT NULL,
  `cam_from` varchar(15) NOT NULL,
  `cam_pos` varchar(15) NOT NULL,
  `bateria` varchar(15) NOT NULL,
  `color` varchar(15) NOT NULL,
  `un_disp` int(11) DEFAULT '0',
  `precio` decimal(10,2) NOT NULL,
  `imagen` varchar(100) DEFAULT NULL,
  `Estado_P` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `cliente`
 ADD PRIMARY KEY (`ci_cli`);

ALTER TABLE `pedido`
 ADD PRIMARY KEY (`Codigo_V`), ADD KEY `FK_ci_cli` (`ci_cli`), ADD KEY `FK_codigo_p` (`codigo_p`);
ALTER TABLE `productos`
 ADD PRIMARY KEY (`codigo_p`);
