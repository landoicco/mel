CREATE TABLE cats (
--      Primary key
      cat_id MEDIUMINT NOT NULL AUTO_INCREMENT,
      PRIMARY KEY (cat_id),
--      Specs
      gender VARCHAR(50),
      is_alive VARCHAR(50),
      can_beget VARCHAR(50),
      name VARCHAR(50),
      alias VARCHAR(50),
      color_pattern VARCHAR(50),
      colors VARCHAR(50),
      birth_date VARCHAR(50),
      joiner_since VARCHAR(50)
);
CREATE TABLE dogs (
--      Primary key
      dog_id MEDIUMINT NOT NULL AUTO_INCREMENT,
      PRIMARY KEY (dog_id),
--      Specs
      gender VARCHAR(50),
      is_alive VARCHAR(50),
      can_beget VARCHAR(50),
      name VARCHAR(50),
      alias VARCHAR(50),
      breed VARCHAR(50),
      colors VARCHAR(50),
      birth_date VARCHAR(50),
      joiner_since VARCHAR(50)
);
