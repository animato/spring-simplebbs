DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `subject` varchar(255) NOT NULL,
  `contents` text NOT NULL,
  `author` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;