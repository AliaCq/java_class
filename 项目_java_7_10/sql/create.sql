CREATE DATABASE IF NOT EXISTS `java_7_10_project` CHARACTER utf8mb4;
USE `java_7_10_project`;

CREATE TABLE IF NOT EXISTS `album` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `brief` varchar(45) NOT NULL,
  `cover` varchar(200) NOT NULL,
  `header` varchar(200) NOT NULL,
  `count` int(11) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`aid`)
);

CREATE TABLE IF NOT EXISTS `story` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `aid` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `count` int(11) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `audio` longblob NOT NULL,
  PRIMARY KEY (`sid`)
);

CREATE TABLE IF NOT EXISTS `user`(
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `nickname` varchar(45) NOT NULL,
  `password` varchar(128) NOT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uid_UNIQUE` (`uid`),
  UNIQUE KEY `username_UNIQUE` (`username`)
);
