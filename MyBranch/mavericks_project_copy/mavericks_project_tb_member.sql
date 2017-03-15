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
-- Table structure for table `tb_member`
--

DROP TABLE IF EXISTS `tb_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_member` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Role` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Auth_Token` varchar(255) DEFAULT NULL,
  `Expiration_Time` datetime DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `User_Address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_member`
--

LOCK TABLES `tb_member` WRITE;
/*!40000 ALTER TABLE `tb_member` DISABLE KEYS */;
INSERT INTO `tb_member` VALUES (10,NULL,'123',0,'abc','77c719f7-c021-42f1-91d6-3c1ac862af0f','2017-03-04 22:01:48',NULL,NULL),(17,NULL,'456',0,'def','754cd2a4-c26f-45a1-be14-917322e32b92','2017-03-04 22:05:38',NULL,NULL),(22,NULL,'826bbc5d0522f5f20a1da4b60fa8c871',1,'ghi',NULL,NULL,NULL,NULL),(23,NULL,'$MD5vb$60b3a778684619f24791$c45c723f0b307c556d4756e70f4db320',1,'456',NULL,NULL,NULL,NULL),(24,NULL,'a1004fadda7f86cfcc4fbd40ecc1f3c4a59e960b365b9afb282d',1,'apple123',NULL,NULL,NULL,NULL),(25,NULL,'212f13944859affc4f86957129b91c9f185dc525c666740947dd',1,'a123',NULL,NULL,NULL,NULL),(26,NULL,'cb25cfc1d48b471af78bb2145cd8fc36c92eb52ea9f433ad945b',0,'ab123','0dce09bd-b828-47b2-8698-a9e3daa15293','2017-03-06 21:07:16',NULL,NULL),(27,NULL,'ab',0,'ab','52745fef-a6a6-4514-90c9-aa462cbdd922','2017-03-06 20:16:22',NULL,NULL),(30,NULL,'f1e91cdadaf52dac9f569d7d398e9d711f30392fe0b2aa4c76f0',0,'a',NULL,NULL,NULL,NULL),(31,NULL,'a0bab6182669fa9a8135a01bbe76f12fbe6eb4f027ea42b5fdc8',0,'sweety',NULL,NULL,NULL,NULL),(32,NULL,'0b0535ae8e37defad978067f0640971085763f40a0e6c339549c',0,'sw1',NULL,NULL,NULL,NULL),(34,NULL,'7839edd4aa5f7a8d6a40447e67aa6eb480b85c45476f7c39c926',0,'lemon123',NULL,NULL,NULL,NULL),(38,NULL,'abcd',0,'lemon12345678910111',NULL,NULL,NULL,NULL),(39,NULL,'ad0e1740de536276e6bf0f4f6d5e94d73324090c7c46c90f2ab2',0,'banana','',NULL,NULL,NULL),(40,NULL,'1c387cf40b9a0ac9891495c9c795b7a642f47766d526b08a1afbb2c409fe79b58b8cfdcee38856ee22d9',0,'orange','8023da14-d865-4ae8-bbdb-d8ea528f431b','2017-03-07 17:41:54',NULL,NULL),(41,NULL,'fc3de094c5113d527907573081297cc5cd6e3b123ef6c772980c8db11707cb47655dc5bd674e1fdc3b68',0,'sridevi','f02be892-6b48-4670-a1e5-bbd5eedc715a','2017-03-12 04:51:40',NULL,NULL),(42,NULL,'3f518be37661c36edf6cd64830cb50977330b03055c1c7e79d93ec2c708ff826be2252ecb42f54878eea',1,'manisha','4980bef9-a163-4eb7-801f-aa532f6cffc5','2017-03-15 19:25:50','1994-03-15',NULL),(43,NULL,NULL,1,'shruthi','e0deac22-cda0-41d5-ace8-51a6cbdf88fc','2017-03-09 16:32:24','1995-02-15',NULL);
/*!40000 ALTER TABLE `tb_member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-15 16:23:23
