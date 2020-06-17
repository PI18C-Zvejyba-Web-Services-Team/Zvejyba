-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: rybokas
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `administratorius`
--

DROP TABLE IF EXISTS `administratorius`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administratorius` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Naudotojas_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Administratorius_Naudotojas` (`Naudotojas_ID`),
  CONSTRAINT `Administratorius_Naudotojas` FOREIGN KEY (`Naudotojas_ID`) REFERENCES `naudotojas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administratorius`
--

LOCK TABLES `administratorius` WRITE;
/*!40000 ALTER TABLE `administratorius` DISABLE KEYS */;
INSERT INTO `administratorius` VALUES (1,1);
/*!40000 ALTER TABLE `administratorius` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adresas`
--

DROP TABLE IF EXISTS `adresas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adresas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Salis` varchar(120) NOT NULL,
  `Miestas` varchar(120) NOT NULL,
  `Gatve` varchar(120) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adresas`
--

LOCK TABLES `adresas` WRITE;
/*!40000 ALTER TABLE `adresas` DISABLE KEYS */;
INSERT INTO `adresas` VALUES (1,'Lithuania','Vilnius','J.Jasinskio 15'),(2,'Lithuania','Kaunas','K.Mindaugo 15'),(3,'Lithuania','Vilnius','Rokantiškės');
/*!40000 ALTER TABLE `adresas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `irankis`
--

DROP TABLE IF EXISTS `irankis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `irankis` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Pavadinimas` varchar(120) NOT NULL,
  `IrankisFirma_ID` int(11) NOT NULL,
  `IrankisTipas_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Įrankis_ĮrankisFirma` (`IrankisFirma_ID`),
  KEY `Įrankis_ĮrankisTipas` (`IrankisTipas_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `irankis`
--

LOCK TABLES `irankis` WRITE;
/*!40000 ALTER TABLE `irankis` DISABLE KEYS */;
INSERT INTO `irankis` VALUES (1,'Feederis',1,1),(2,'Deeper Max Pro',2,3),(3,'Shimano',1,1);
/*!40000 ALTER TABLE `irankis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `irankisfirma`
--

DROP TABLE IF EXISTS `irankisfirma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `irankisfirma` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Firma` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `irankisfirma`
--

LOCK TABLES `irankisfirma` WRITE;
/*!40000 ALTER TABLE `irankisfirma` DISABLE KEYS */;
INSERT INTO `irankisfirma` VALUES (1,'Shimano'),(2,'Deeper');
/*!40000 ALTER TABLE `irankisfirma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `irankistipas`
--

DROP TABLE IF EXISTS `irankistipas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `irankistipas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Tipas` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `irankistipas`
--

LOCK TABLES `irankistipas` WRITE;
/*!40000 ALTER TABLE `irankistipas` DISABLE KEYS */;
INSERT INTO `irankistipas` VALUES (1,'Kotas'),(2,'Ritė'),(3,'Echolotas'),(4,'Valas'),(5,'Šeryklos'),(6,'Kabliukai'),(7,'Svoriai');
/*!40000 ALTER TABLE `irankistipas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `masalas`
--

DROP TABLE IF EXISTS `masalas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `masalas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Masalas` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `masalas`
--

LOCK TABLES `masalas` WRITE;
/*!40000 ALTER TABLE `masalas` DISABLE KEYS */;
INSERT INTO `masalas` VALUES (1,'Žirnis'),(2,'Musės Lerva'),(3,'Sliekas'),(4,'Uodo truklio lerva'),(5,'Batonas'),(6,'Žiogas');
/*!40000 ALTER TABLE `masalas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naudotimasalai`
--

DROP TABLE IF EXISTS `naudotimasalai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naudotimasalai` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Masalas_ID` int(11) NOT NULL,
  `Zukle_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `NaudotiMasalai_Masalas` (`Masalas_ID`),
  KEY `NaudotiMasalai_Žūklė` (`Zukle_ID`),
  CONSTRAINT `NaudotiMasalai_Masalas` FOREIGN KEY (`Masalas_ID`) REFERENCES `masalas` (`ID`),
  CONSTRAINT `NaudotiMasalai_Žūklė` FOREIGN KEY (`Zukle_ID`) REFERENCES `zukle` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naudotimasalai`
--

LOCK TABLES `naudotimasalai` WRITE;
/*!40000 ALTER TABLE `naudotimasalai` DISABLE KEYS */;
/*!40000 ALTER TABLE `naudotimasalai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naudotipašarai`
--

DROP TABLE IF EXISTS `naudotipašarai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naudotipašarai` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Pasaras_ID` int(11) NOT NULL,
  `Zukle_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `NaudotiPašarai_Pašaras` (`Pasaras_ID`),
  KEY `NaudotiPašarai_Žūklė` (`Zukle_ID`),
  CONSTRAINT `NaudotiPašarai_Pašaras` FOREIGN KEY (`Pasaras_ID`) REFERENCES `pasaras` (`ID`),
  CONSTRAINT `NaudotiPašarai_Žūklė` FOREIGN KEY (`Zukle_ID`) REFERENCES `zukle` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naudotipašarai`
--

LOCK TABLES `naudotipašarai` WRITE;
/*!40000 ALTER TABLE `naudotipašarai` DISABLE KEYS */;
/*!40000 ALTER TABLE `naudotipašarai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naudotojas`
--

DROP TABLE IF EXISTS `naudotojas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naudotojas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Slapyvardis` varchar(150) NOT NULL,
  `Slaptazodis` varchar(1000) NOT NULL,
  `Vardas` varchar(150) NOT NULL,
  `Pavardė` varchar(150) NOT NULL,
  `El_Pastas` varchar(150) NOT NULL,
  `KontaktinisTelefonas` varchar(25) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naudotojas`
--

LOCK TABLES `naudotojas` WRITE;
/*!40000 ALTER TABLE `naudotojas` DISABLE KEYS */;
INSERT INTO `naudotojas` VALUES (1,'user','user','Admin','Admin','Admin@gmail.com','+37066666520'),(2,'Letv','user','Letvidas','Česaitis','Letvidas123@gmail.com','+37066666526'),(3,'DominiC','user','Dominic','Hoffmann','Hoffmann@gmail.com','+37066666510');
/*!40000 ALTER TABLE `naudotojas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naudotojasirankiai`
--

DROP TABLE IF EXISTS `naudotojasirankiai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naudotojasirankiai` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Kaina` int(11) NOT NULL,
  `Garantija` varchar(100) NOT NULL,
  `Irankis_ID` int(11) NOT NULL,
  `Naudotojas_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `NaudotojasĮrankiai_Naudotojas` (`Naudotojas_ID`),
  KEY `NaudotojasĮrankiai_Įrankis` (`Irankis_ID`),
  CONSTRAINT `NaudotojasĮrankiai_Naudotojas` FOREIGN KEY (`Naudotojas_ID`) REFERENCES `naudotojas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naudotojasirankiai`
--

LOCK TABLES `naudotojasirankiai` WRITE;
/*!40000 ALTER TABLE `naudotojasirankiai` DISABLE KEYS */;
INSERT INTO `naudotojasirankiai` VALUES (1,200,'2 metai',2,2),(2,200,'2metai',3,1);
/*!40000 ALTER TABLE `naudotojasirankiai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naudotojoadresas`
--

DROP TABLE IF EXISTS `naudotojoadresas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naudotojoadresas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Naudotojas_ID` int(11) NOT NULL,
  `Adresas_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `NaudotojoAdresas_Adresas` (`Adresas_ID`),
  KEY `NaudotojoAdresas_Naudotojas` (`Naudotojas_ID`),
  CONSTRAINT `NaudotojoAdresas_Adresas` FOREIGN KEY (`Adresas_ID`) REFERENCES `adresas` (`ID`),
  CONSTRAINT `NaudotojoAdresas_Naudotojas` FOREIGN KEY (`Naudotojas_ID`) REFERENCES `naudotojas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naudotojoadresas`
--

LOCK TABLES `naudotojoadresas` WRITE;
/*!40000 ALTER TABLE `naudotojoadresas` DISABLE KEYS */;
INSERT INTO `naudotojoadresas` VALUES (2,2,2),(3,3,3);
/*!40000 ALTER TABLE `naudotojoadresas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orosalygos`
--

DROP TABLE IF EXISTS `orosalygos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orosalygos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Apibudinimas` varchar(150) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orosalygos`
--

LOCK TABLES `orosalygos` WRITE;
/*!40000 ALTER TABLE `orosalygos` DISABLE KEYS */;
INSERT INTO `orosalygos` VALUES (1,'Saulėta'),(2,'Lietinga'),(3,'Debesuota'),(4,'Debesuota su pragidruliais'),(5,'Vejuota');
/*!40000 ALTER TABLE `orosalygos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagautazuvis`
--

DROP TABLE IF EXISTS `pagautazuvis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagautazuvis` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Zukle_ID` int(11) NOT NULL,
  `Zuvis_ID` int(11) NOT NULL,
  `Svoris` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `PagautaŽuvis_Žuvis` (`Zuvis_ID`),
  KEY `PagautaŽuvis_Žūklė` (`Zukle_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagautazuvis`
--

LOCK TABLES `pagautazuvis` WRITE;
/*!40000 ALTER TABLE `pagautazuvis` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagautazuvis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasaras`
--

DROP TABLE IF EXISTS `pasaras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pasaras` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Pavadinimas` varchar(100) NOT NULL,
  `Tipas` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasaras`
--

LOCK TABLES `pasaras` WRITE;
/*!40000 ALTER TABLE `pasaras` DISABLE KEYS */;
INSERT INTO `pasaras` VALUES (1,'Karosas','Karosinis'),(2,'Karpis','Karpinis'),(3,'Virtos Kruopos','Kruopos'),(4,'Lynas','Lynas'),(5,'Karosas/Karpis','Karpinis');
/*!40000 ALTER TABLE `pasaras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skelbimas`
--

DROP TABLE IF EXISTS `skelbimas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skelbimas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Naudotojas_ID` int(11) NOT NULL,
  `Aprašymas` varchar(255) NOT NULL,
  `Kaina` int(11) NOT NULL,
  `NaudotojasIrankiai_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Skelbimas_Naudotojas` (`Naudotojas_ID`),
  KEY `fk_Skelbimas_NaudotojasĮrankiai1_idx` (`NaudotojasIrankiai_ID`),
  CONSTRAINT `Skelbimas_Naudotojas` FOREIGN KEY (`Naudotojas_ID`) REFERENCES `naudotojas` (`ID`),
  CONSTRAINT `fk_Skelbimas_NaudotojasĮrankiai1` FOREIGN KEY (`NaudotojasIrankiai_ID`) REFERENCES `naudotojasirankiai` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skelbimas`
--

LOCK TABLES `skelbimas` WRITE;
/*!40000 ALTER TABLE `skelbimas` DISABLE KEYS */;
INSERT INTO `skelbimas` VALUES (1,1,'Parduodu',100,1),(2,1,'Parduodu',120,2);
/*!40000 ALTER TABLE `skelbimas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telkiniotipas`
--

DROP TABLE IF EXISTS `telkiniotipas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telkiniotipas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Tipas` varchar(150) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telkiniotipas`
--

LOCK TABLES `telkiniotipas` WRITE;
/*!40000 ALTER TABLE `telkiniotipas` DISABLE KEYS */;
INSERT INTO `telkiniotipas` VALUES (1,'Upė'),(2,'Ežeras'),(3,'Jūra'),(4,'Prūdas'),(5,'Upelis'),(6,'Baseinas'),(7,'Estuarija'),(8,'Fiardas'),(9,'Fiordas'),(10,'Griovys'),(11,'Įlanka'),(12,'Kanalas'),(13,'Kūdra'),(14,'Lagūna'),(15,'Marios'),(16,'Marša'),(17,'Pelkė'),(18,'Požeminis Vandens Telkinys'),(19,'Sąsiauris'),(20,'Šaltinis'),(21,'Šlapynė'),(22,'Užutekis'),(23,'Vadė'),(24,'Vandenynas'),(25,'Versmė');
/*!40000 ALTER TABLE `telkiniotipas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telkinys`
--

DROP TABLE IF EXISTS `telkinys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telkinys` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TelkinioTipas_ID` int(11) NOT NULL,
  `Adresas_ID` int(11) NOT NULL,
  `Pavadinimas` varchar(150) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Telkinys_Adresas` (`Adresas_ID`),
  KEY `Telkinys_TelkinioTipas` (`TelkinioTipas_ID`),
  CONSTRAINT `Telkinys_Adresas` FOREIGN KEY (`Adresas_ID`) REFERENCES `adresas` (`ID`),
  CONSTRAINT `Telkinys_TelkinioTipas` FOREIGN KEY (`TelkinioTipas_ID`) REFERENCES `telkiniotipas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telkinys`
--

LOCK TABLES `telkinys` WRITE;
/*!40000 ALTER TABLE `telkinys` DISABLE KEYS */;
INSERT INTO `telkinys` VALUES (1,1,1,'Neris'),(2,2,3,'Deltuvos Ežeras');
/*!40000 ALTER TABLE `telkinys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zukle`
--

DROP TABLE IF EXISTS `zukle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zukle` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Telkinys_ID` int(11) NOT NULL,
  `LaikasNuo` datetime NOT NULL,
  `LaikasIki` datetime NOT NULL,
  `OroSalygos_ID` int(11) NOT NULL,
  `Dregme` varchar(80) NOT NULL,
  `Temperatura` varchar(80) NOT NULL,
  `Slegis` varchar(80) NOT NULL,
  `Vejas` varchar(80) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Žūklė_OroSalygos` (`OroSalygos_ID`),
  KEY `Žūklė_Telkinys` (`Telkinys_ID`),
  CONSTRAINT `Žūklė_OroSalygos` FOREIGN KEY (`OroSalygos_ID`) REFERENCES `orosalygos` (`ID`),
  CONSTRAINT `Žūklė_Telkinys` FOREIGN KEY (`Telkinys_ID`) REFERENCES `telkinys` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zukle`
--

LOCK TABLES `zukle` WRITE;
/*!40000 ALTER TABLE `zukle` DISABLE KEYS */;
/*!40000 ALTER TABLE `zukle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zukleirankis`
--

DROP TABLE IF EXISTS `zukleirankis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zukleirankis` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Zukle_ID` int(11) NOT NULL,
  `NaudotojasIrankiai_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ŽūklėĮrankis_NaudotojasĮrankiai` (`NaudotojasIrankiai_ID`),
  KEY `ŽūklėĮrankis_Žūklė` (`Zukle_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zukleirankis`
--

LOCK TABLES `zukleirankis` WRITE;
/*!40000 ALTER TABLE `zukleirankis` DISABLE KEYS */;
/*!40000 ALTER TABLE `zukleirankis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuklesdalyviai`
--

DROP TABLE IF EXISTS `zuklesdalyviai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zuklesdalyviai` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Naudotojas_ID` int(11) NOT NULL,
  `Zukle_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ŽūklėsDalyviai_Naudotojas` (`Naudotojas_ID`),
  KEY `ŽūklėsDalyviai_Žūklė` (`Zukle_ID`),
  CONSTRAINT `ŽūklėsDalyviai_Naudotojas` FOREIGN KEY (`Naudotojas_ID`) REFERENCES `naudotojas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuklesdalyviai`
--

LOCK TABLES `zuklesdalyviai` WRITE;
/*!40000 ALTER TABLE `zuklesdalyviai` DISABLE KEYS */;
/*!40000 ALTER TABLE `zuklesdalyviai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuvis`
--

DROP TABLE IF EXISTS `zuvis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zuvis` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Pavadinimas` varchar(150) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuvis`
--

LOCK TABLES `zuvis` WRITE;
/*!40000 ALTER TABLE `zuvis` DISABLE KEYS */;
INSERT INTO `zuvis` VALUES (1,'Karosas'),(2,'Karpis'),(3,'Lynas'),(4,'Karšis'),(5,'Lydeka'),(6,'Šapalas'),(7,'Upėtakis'),(8,'Ešerys');
/*!40000 ALTER TABLE `zuvis` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-10 10:21:47
