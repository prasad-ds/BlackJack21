CREATE TABLE `game` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status` ENUM('WON', 'LOST') NULL,
  `user_id` INT NOT NULL,
  `bet_amount` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `user_id`
  FOREIGN KEY (user_id)
  REFERENCES `blackjackdev`.`users` (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
