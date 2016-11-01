CREATE TABLE `regulamento` (
  `id_regulamento` bigint(20) NOT NULL AUTO_INCREMENT,
  `apelido` varchar(255) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  PRIMARY KEY (`id_regulamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
