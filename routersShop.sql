-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema routers
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema routers
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `routers` DEFAULT CHARACTER SET utf8mb3 ;
USE `routers` ;

-- -----------------------------------------------------
-- Table `routers`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `routers`.`customer` (
  `customerID` INT NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR(30) NOT NULL,
  `name` VARCHAR(15) NOT NULL,
  `patronymic` VARCHAR(30) NOT NULL,
  `phoneNumber` VARCHAR(10) NOT NULL,
  `deliveryAdress` VARCHAR(100) NOT NULL,
  `email` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`customerID`),
  UNIQUE INDEX `phoneNumber` (`phoneNumber` ASC) ,
  UNIQUE INDEX `email` (`email` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `routers`.`typeofrouter`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `routers`.`typeofrouter` (
  `typeOfRouterID` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`typeOfRouterID`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `routers`.`router`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `routers`.`router` (
  `RouterID` INT NOT NULL AUTO_INCREMENT,
  `maxSpeed` INT NOT NULL,
  `wifiFrequency` DOUBLE NOT NULL,
  `numberOfAntennas` INT NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `weight` INT NOT NULL,
  `power` INT NOT NULL,
  `protection` ENUM('WEP', 'WPA', 'WPA2', 'WPA3') NOT NULL,
  `brand` VARCHAR(45) NOT NULL,
  `price` DOUBLE NOT NULL,
  `typeOfRouterID` INT NULL DEFAULT NULL,
  PRIMARY KEY (`RouterID`),
  INDEX `fk_typeOfRouterID` (`typeOfRouterID` ASC) ,
  CONSTRAINT `fk_typeOfRouterID`
    FOREIGN KEY (`typeOfRouterID`)
    REFERENCES `routers`.`typeofrouter` (`typeOfRouterID`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `routers`.`buy`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `routers`.`buy` (
  `buyID` INT NOT NULL AUTO_INCREMENT,
  `dateOfBuy` DATE NOT NULL,
  `customerID` INT NOT NULL,
  `fullPrice` INT NOT NULL,
  `currency` VARCHAR(10) NOT NULL,
  `RouterID` INT NOT NULL,
  PRIMARY KEY (`buyID`),
  INDEX `customerID` (`customerID` ASC) ,
  INDEX `RouterID` (`RouterID` ASC) ,
  CONSTRAINT `buy_ibfk_1`
    FOREIGN KEY (`customerID`)
    REFERENCES `routers`.`customer` (`customerID`),
  CONSTRAINT `buy_ibfk_2`
    FOREIGN KEY (`RouterID`)
    REFERENCES `routers`.`router` (`RouterID`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
