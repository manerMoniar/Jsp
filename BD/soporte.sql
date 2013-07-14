/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : soporte

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-06-24 12:01:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `etiquetas`
-- ----------------------------
DROP TABLE IF EXISTS `etiquetas`;
CREATE TABLE `etiquetas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of etiquetas
-- ----------------------------

-- ----------------------------
-- Table structure for `puntuacion`
-- ----------------------------
DROP TABLE IF EXISTS `puntuacion`;
CREATE TABLE `puntuacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `puntos` float NOT NULL,
  `idUsuarioOrigen` int(11) NOT NULL,
  `idUsuarioDestino` int(11) NOT NULL,
  `comentario` varchar(140) CHARACTER SET latin1 DEFAULT NULL,
  `estatus` enum('') CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `puntuacion_ibfk_1` (`idUsuarioOrigen`),
  KEY `idUsuarioDestino` (`idUsuarioDestino`),
  CONSTRAINT `puntuacion_ibfk_2` FOREIGN KEY (`idUsuarioDestino`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `puntuacion_ibfk_1` FOREIGN KEY (`idUsuarioOrigen`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of puntuacion
-- ----------------------------

-- ----------------------------
-- Table structure for `usuarios`
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET latin1 NOT NULL,
  `usuario` varchar(255) CHARACTER SET latin1 NOT NULL,
  `contrasenia` varchar(32) CHARACTER SET latin1 NOT NULL,
  `latitud` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `longitud` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `direccion` text CHARACTER SET latin1,
  `telefono` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `email` varchar(255) CHARACTER SET latin1 NOT NULL,
  `activo` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuarios
-- ----------------------------

-- ----------------------------
-- Table structure for `usuariosetiquetas`
-- ----------------------------
DROP TABLE IF EXISTS `usuariosetiquetas`;
CREATE TABLE `usuariosetiquetas` (
  `idUsuario` int(11) NOT NULL,
  `idEtiqueta` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`,`idEtiqueta`),
  KEY `idEtiqueta` (`idEtiqueta`),
  CONSTRAINT `usuariosetiquetas_ibfk_2` FOREIGN KEY (`idEtiqueta`) REFERENCES `etiquetas` (`id`),
  CONSTRAINT `usuariosetiquetas_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuariosetiquetas
-- ----------------------------
