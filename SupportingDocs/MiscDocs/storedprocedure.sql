DELIMITER $$

DROP PROCEDURE IF EXISTS `workspace`.`myfirstsp`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `myfirstsp`(IN job varchar(100))
BEGIN
select * from emp where job = job;
    END$$

DELIMITER ;