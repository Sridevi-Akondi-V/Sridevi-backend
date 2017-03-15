-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mavericks_project
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_images`
--

DROP TABLE IF EXISTS `tb_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_images` (
  `Image_Type` varchar(255) NOT NULL,
  `ImagesUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Image_Type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_images`
--

LOCK TABLES `tb_images` WRITE;
/*!40000 ALTER TABLE `tb_images` DISABLE KEYS */;
INSERT INTO `tb_images` VALUES ('Admin Page','http://localhost:9000/images/79e9eda1-1898-409d-8d24-3c90f40a72ff'),('Background','http://localhost:9000/images/05199b56-4c50-4364-89b6-0f082b9851fd'),('Login','http://localhost:9000/images/286b4b0f-c497-4d5e-81fe-906ef239b5d1'),('Logo','http://localhost:9000/images/5498f7c0-ca2f-44b4-826c-0deb07521b20'),('Signup','http://localhost:9000/images/d16729b2-ddd2-4a53-a3dc-c00d4f61542'),('User','http://localhost:9000/images/7c3a12df-df09-4374-b8b0-8abcd1de4163');
/*!40000 ALTER TABLE `tb_images` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-16  3:42:11
