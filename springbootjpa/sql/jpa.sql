CREATE SCHEMA `mybatis` ;
CREATE TABLE `mybatis`.`t_user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
INSERT INTO `mybatis`.`t_user` (`id`, `name`, `password`) VALUES ('1', 'guoyuhang', 'guoyuhang');
INSERT INTO `mybatis`.`t_user` (`id`, `name`, `password`) VALUES ('2', 'guodd', 'guodd');
