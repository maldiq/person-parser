-- Adminer 5.4.1 MariaDB 11.4.8-MariaDB-log dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `person_data`;
CREATE TABLE `person_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `age` varchar(3) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

INSERT INTO `person_data` (`id`, `name`, `age`, `city`) VALUES
(1,	'CUTMINI28THN                  ',	'   ',	'ACEH                '),
(2,	'CUTMINI28                     ',	'   ',	'ACEH                '),
(3,	'CUTMINI28THN                  ',	'   ',	'ACEH                '),
(4,	'CUTMINI28THN                  ',	'   ',	'ACEH                '),
(5,	'CUTMINI28THN                  ',	'   ',	'ACEH                '),
(6,	'CUTMINI28                     ',	'   ',	'ACEH                '),
(7,	'CUTMINI28                     ',	'   ',	'ACEH                '),
(8,	'CUT MINI                      ',	' 28',	'ACEH                '),
(9,	'CUT MINI                      ',	' 28',	'ACEH                '),
(10,	'CUT MINI                      ',	' 28',	'ACEH                ');

-- 2026-01-22 14:57:44 UTC
