-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: qlkltndb
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `danhgia`
--

DROP TABLE IF EXISTS `danhgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhgia` (
  `id` int NOT NULL,
  `score` decimal(3,1) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `sinvien_id` int DEFAULT NULL,
  `khoaluan_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_danhgia_khoaluan1_idx` (`khoaluan_id`),
  KEY `fk_danhgia_sinvien1_idx` (`sinvien_id`),
  CONSTRAINT `fk_danhgia_khoaluan1` FOREIGN KEY (`khoaluan_id`) REFERENCES `khoaluan` (`id`),
  CONSTRAINT `fk_danhgia_sinvien1` FOREIGN KEY (`sinvien_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhgia`
--

LOCK TABLES `danhgia` WRITE;
/*!40000 ALTER TABLE `danhgia` DISABLE KEYS */;
/*!40000 ALTER TABLE `danhgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoidong`
--

DROP TABLE IF EXISTS `hoidong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoidong` (
  `id` int NOT NULL,
  `active` tinyint DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoidong`
--

LOCK TABLES `hoidong` WRITE;
/*!40000 ALTER TABLE `hoidong` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoidong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoaluan`
--

DROP TABLE IF EXISTS `khoaluan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khoaluan` (
  `id` int NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `total_score` int DEFAULT NULL,
  `hoidong_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_khoaluan_hoidong_idx` (`hoidong_id`),
  CONSTRAINT `fk_khoaluan_hoidong` FOREIGN KEY (`hoidong_id`) REFERENCES `hoidong` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoaluan`
--

LOCK TABLES `khoaluan` WRITE;
/*!40000 ALTER TABLE `khoaluan` DISABLE KEYS */;
INSERT INTO `khoaluan` VALUES (1,'QL Thư viện','2022-10-08 00:00:00',8,NULL),(2,'QL Khach sạn','2022-03-29 00:00:00',9,NULL),(3,'QL Nhà hàng','2022-02-02 00:00:00',7,NULL),(4,'QL Căn hộ','2022-10-10 00:00:00',6,NULL),(5,'QL Bến xe','2022-11-11 00:00:00',10,NULL);
/*!40000 ALTER TABLE `khoaluan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tieuchi`
--

DROP TABLE IF EXISTS `tieuchi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tieuchi` (
  `id` int NOT NULL,
  `score` decimal(3,1) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `khoaluan_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tieuchi_khoaluan1_idx` (`khoaluan_id`),
  CONSTRAINT `fk_tieuchi_khoaluan1` FOREIGN KEY (`khoaluan_id`) REFERENCES `khoaluan` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieuchi`
--

LOCK TABLES `tieuchi` WRITE;
/*!40000 ALTER TABLE `tieuchi` DISABLE KEYS */;
/*!40000 ALTER TABLE `tieuchi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `khoaluan_id` int DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `user_role` varchar(45) DEFAULT NULL,
  `hoidong_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sinhvien_khoaluan1_idx` (`khoaluan_id`),
  KEY `fk_user_hoidong1_idx` (`hoidong_id`),
  CONSTRAINT `fk_sinhvien_khoaluan1` FOREIGN KEY (`khoaluan_id`) REFERENCES `khoaluan` (`id`),
  CONSTRAINT `fk_user_hoidong1` FOREIGN KEY (`hoidong_id`) REFERENCES `hoidong` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,'trung','tunnguyenn1159@gmail.com','$2a$10$bMkXROS/Jtmta9Avl12nXuAmLQSb/u5DwkxcTh29vGdfLMtNwAQ0q',NULL,'trung1159','ROLE_ADMIN',NULL),(3,'Trung','trung0909957826@gmail.com','$2a$10$o/WzfCf3.uwygf9L0r9fTeE2F3VZuGvXQ1O.pJIA67jidqXAwho5G',NULL,'trung2903','ROLE_USER',NULL),(5,'Trung','ttrungnguyenn2903@gmail.com','$2a$10$CR6KSIXF9uuuDz3zW48Oo.iRaw7ySHuD7jKpv3JXa4xBeY.TY8zl2',NULL,'trung007','ROLE_USER',NULL),(6,'Trung','trung0909957826@gmail.com','$2a$10$7hr9HKSxOcH.Et8p2OCJpOYUJT71gVQpNDs8C9Uf3T9uQcREdudiK',NULL,'trung333','ROLE_USER',NULL),(7,'Trung','trung0909957826@gmail.com','$2a$10$4fYmeRethUa78jGuNYW2G.z96xB5Kr5Kix0/ruozDDMA5VZt/Lmtu',NULL,'trung111','ROLE_USER',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-10 10:28:58