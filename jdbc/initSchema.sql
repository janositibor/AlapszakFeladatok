CREATE SCHEMA IF NOT EXISTS suli
DEFAULT CHARACTER SET utf8
COLLATE utf8_hungarian_ci;
CREATE USER suliRoot@localhost IDENTIFIED BY 'suliPass';
GRANT ALL ON suli.* TO suliRoot@localhost;
USE suli;
