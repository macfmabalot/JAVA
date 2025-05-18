CREATE DATABASE  IF NOT EXISTS `db_Rhea` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_Rhea`;
-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: db_Rhea
-- ------------------------------------------------------
-- Server version	5.7.15

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
-- Table structure for table `tblInventory`
--

DROP TABLE IF EXISTS `tblInventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblInventory` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Code` varchar(45) DEFAULT NULL,
  `Item` varchar(45) NOT NULL,
  `Price` varchar(45) DEFAULT NULL,
  `UOM` varchar(45) NOT NULL,
  `Quantity` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblInventory`
--

LOCK TABLES `tblInventory` WRITE;
/*!40000 ALTER TABLE `tblInventory` DISABLE KEYS */;
INSERT INTO `tblInventory` VALUES (6,'inv-2025-04-0622:54:25.309','Ashley shine-Very light blonde gray','208','9/13','5'),(7,'inv-2025-04-0622:55:15.305','ashley shine-Honey tea','208','8/12','6'),(8,'inv-2025-04-0622:56:47.211','Ashley shine-Pink brown','208','8/67','7'),(9,'inv-2025-04-0622:57:58.051','Ashley shine-Dark brown','208','3/0','8'),(10,'inv-2025-04-0623:00:21.549','Ashley shine-Light golden brown ','208','5/3','9'),(11,'inv-2025-04-0623:01:57.279','Ashley shine-Light Blonde','208','8/0','10'),(12,'inv-2025-04-0623:14:03.167','iCure clarifying shampoo','1000','1000ml','10'),(13,'inv-2025-04-0623:20:30.540','iCure keracollagen Blowout','4200','1000ml','15'),(14,'inv-2025-04-0623:23:13.856','iCure keratin Blowout','3200','1000ml','15'),(15,'inv-2025-04-0623:24:54.400','iCure Black daily conditioner','215','300ml','15'),(16,'inv-2025-04-0623:27:25.597','iCure Argan Series Elixir HAir Mask','380','350ml','15'),(17,'inv-2025-04-0623:28:37.050','iCure Argan Series Elixir Curl Cream','450','300ml','15'),(18,'inv-2025-04-0623:30:07.509','Brazilian Hair Botox Sakura Essence','573','500ml','15'),(19,'inv-2025-04-0623:31:44.461','Keragloss Purifying Shampoo','800','1000ml','15'),(20,'inv-2025-04-0623:33:19.581','Keragloss Brazillian Blowout','1000','1gal','15'),(21,'inv-2025-04-0623:35:28.031','Nanokeratin System Reinvent Insulator','7000.95','550ml','15'),(22,'inv-2025-04-0623:37:12.431','Nanokeratin System Refine shampoo','5279.40','550ml','15'),(23,'inv-2025-04-0623:38:38.885','Nanokeratin System Revine Mask','6886.18','500ml','15'),(24,'inv-2025-04-0623:42:44.433','NanoKeratin System Replenish Shampoo','5279.40','550ml','15'),(25,'inv-2025-04-0623:44:33.873','Nanokeratin System Replenish Mask','6886.18','500ml','15'),(26,'inv-2025-04-0623:53:50.816','O.P.I Gel Nail Polish-Reoccurin\'Gleam','248','15ml','15'),(27,'inv-2025-04-0623:55:32.449','O.P.I Gel Nail Polish-Happy Play-ce','271','15ml','15'),(28,'inv-2025-04-0623:57:46.848','O.P,I Gel Polish-Suzi calls the Paparazzi','289','15ml','15'),(29,'inv-2025-04-0623:59:17.482','O.P.I Gel POlish- I\'m an Extra ','281','15ml','15'),(30,'inv-2025-04-0700:01:10.885','O.P.I Gel Polish-Pro Health Best Coat','271','15ml','15'),(31,'inv-2025-04-0700:03:27.726','O.P.I Gel POlish-Hands In the Clouds','249','15ml','15'),(32,'inv-2025-04-0700:04:47.570','O.P.I Gel Nail Polish-Air We Go','289','15ml','15'),(33,'inv-2025-04-0700:06:16.646','O.P.I Gel Nail Polish-Reality check Ya out','281','15ml','15'),(34,'inv-2025-04-0700:07:19.637','O.P.I Gel Polish-keep it Surreal','279','15ml','15'),(35,'inv-2025-04-0700:09:10.428','O.P.I Gel Nail Polish- grape Scape ','289','15ml','15'),(36,'inv-2025-04-0700:10:44.026','O.P.I Gel Nail Polish-silicon Valley Girl','249','15ml','15'),(37,'inv-2025-04-0700:12:50.840','O.P.I Gel Nail Polish-You Don\'t Know Jacqueas','281','15ml','15'),(38,'inv-2025-04-0700:15:06.457','O.P.I Gel Nail Polish-Mirror on the Awe ','281','15ml','15'),(39,'inv-2025-04-0700:16:17.894','O.P.I Gel Nail Polish-Strawberry Margarita','289','15ml','15'),(40,'inv-2025-04-0700:24:38.234','Cathy kathy Stainless Nail Nipper','177','1','15'),(41,'inv-2025-04-0700:25:49.544','Basicare foot Brush','160','1','5'),(42,'inv-2025-04-0700:27:52.795','Cathy kathy Cuticle Softener ','511','500ml','15'),(43,'inv-2025-04-0700:28:40.735','Suki Cling Wrap ','45','30m','15'),(44,'inv-2025-04-0700:29:34.082','Mellona Foot Mask ','190','500ml','15'),(45,'inv-2025-04-0700:31:51.449','sievaOrganic Foot Gel ','299','250ml','15'),(46,'inv-2025-04-0700:34:02.495','Mellina Foot Scrub Peppermint','299','1 gallon','15'),(47,'inv-2025-04-0700:35:43.603','O.P.I Manicure Pedicure Chamomile Mint Mask','391','7','15'),(48,'inv-2025-04-0700:42:43.964','Advanced Clinical Coconut Oil Mosturizing','590','16oz','15'),(49,'inv-2025-04-3017:07:33.169','deodorant','180','150','15');
/*!40000 ALTER TABLE `tblInventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblService`
--

DROP TABLE IF EXISTS `tblService`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblService` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Code` varchar(45) DEFAULT NULL,
  `Service` varchar(45) DEFAULT NULL,
  `Category` varchar(45) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblService`
--

LOCK TABLES `tblService` WRITE;
/*!40000 ALTER TABLE `tblService` DISABLE KEYS */;
INSERT INTO `tblService` VALUES (17,'ser-2025-04-0514:53:21.457','Foot Reflex','Other',150),(18,'ser-2025-04-0514:54:39.986','Hair Rebonding','Hair Service',1500),(19,'ser-2025-04-0514:55:11.305','Matrix Rebond','Hair Service',2000),(20,'ser-2025-04-0514:56:00.817','Traditional Perm','Perming Service',1200),(21,'ser-2025-04-0715:59:12.885','Nanoactive Treatment','Hair Service',2500),(22,'ser-2025-04-0715:59:33.196','Hair Botox','Hair Service',2000),(23,'ser-2025-04-0716:00:12.194','Organic Hair Color - Short','Hair Color',700),(24,'ser-2025-04-0716:00:28.188','Organic Hair Color - Medium','Hair Color',1000),(25,'ser-2025-04-0716:00:49.324','Organic Hair Color - Long','Hair Color',1500),(26,'ser-2025-04-0716:01:44.747','Creative Hairstylist','Hair Styling & Make Up',120),(27,'ser-2025-04-0716:02:13.549','Shampoo & Blowdry Hair iron','Hair Styling & Make Up',300),(28,'ser-2025-04-0716:02:50.639','Back Massage','Other',200),(29,'ser-2025-04-0716:03:07.098','Hand Reflex','Other',200),(30,'ser-2025-04-0716:03:44.608','Gel Polish','Other',300);
/*!40000 ALTER TABLE `tblService` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblUser`
--

DROP TABLE IF EXISTS `tblUser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblUser` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `createdby` varchar(45) DEFAULT NULL,
  `createddate` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblUser`
--

LOCK TABLES `tblUser` WRITE;
/*!40000 ALTER TABLE `tblUser` DISABLE KEYS */;
INSERT INTO `tblUser` VALUES (1,'admin','admin','admin','2025-04-03 18:09:45');
/*!40000 ALTER TABLE `tblUser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vinventory_lowstock`
--

DROP TABLE IF EXISTS `vinventory_lowstock`;
/*!50001 DROP VIEW IF EXISTS `vinventory_lowstock`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vinventory_lowstock` AS SELECT 
 1 AS `ID`,
 1 AS `Code`,
 1 AS `Item`,
 1 AS `Price`,
 1 AS `UOM`,
 1 AS `Quantity`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vinventory_lowstock`
--

/*!50001 DROP VIEW IF EXISTS `vinventory_lowstock`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vinventory_lowstock` AS select `tblinventory`.`ID` AS `ID`,`tblinventory`.`Code` AS `Code`,`tblinventory`.`Item` AS `Item`,`tblinventory`.`Price` AS `Price`,`tblinventory`.`UOM` AS `UOM`,`tblinventory`.`Quantity` AS `Quantity` from `tblinventory` where (`tblinventory`.`Quantity` <= 10) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-06 17:07:53
