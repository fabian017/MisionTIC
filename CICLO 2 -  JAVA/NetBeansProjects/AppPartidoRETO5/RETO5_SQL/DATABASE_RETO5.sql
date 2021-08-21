-- MySQL Script generated by MySQL Workbench
-- Tue Aug 17 09:58:07 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Equipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Equipo` (
  `equipo_codigo` INT NOT NULL AUTO_INCREMENT,
  `equipo_nombre` VARCHAR(30) NOT NULL,
  `equipo_entrenador` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`equipo_codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Partido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Partido` (
  `partido_codigo` INT NOT NULL AUTO_INCREMENT,
  `partido_fecha` DATETIME NOT NULL,
  `equipo_local` VARCHAR(30) NOT NULL,
  `goles_equipo_local` INT NOT NULL,
  `equipo_visitante` VARCHAR(30) NOT NULL,
  `goles_equipo_visitante` INT NOT NULL,
  `Equipo_equipo_codigo` INT NOT NULL,
  PRIMARY KEY (`partido_codigo`, `Equipo_equipo_codigo`),
  INDEX `fk_Partido_Equipo_idx` (`Equipo_equipo_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_Partido_Equipo`
    FOREIGN KEY (`Equipo_equipo_codigo`)
    REFERENCES `mydb`.`Equipo` (`equipo_codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
