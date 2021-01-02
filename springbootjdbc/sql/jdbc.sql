CREATE SCHEMA `jdbc` DEFAULT CHARACTER SET utf8mb4 ;
CREATE TABLE `jdbc`.`book` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `author` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
INSERT INTO `jdbc`.`book` (`id`, `name`, `author`) VALUES ('1', '三国演义', '罗贯中');
INSERT INTO `jdbc`.`book` (`id`, `name`, `author`) VALUES ('2', '水浒传', '施耐庵');

ALTER TABLE `jdbc`.`book`
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);
;
