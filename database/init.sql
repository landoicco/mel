CREATE TABLE cats (
      id_cat MEDIUMINT NOT NULL AUTO_INCREMENT,
      name VARCHAR(50),
      alias VARCHAR(50),
      gender VARCHAR(50),
      birthDate VARCHAR(50),
      joinerSince VARCHAR(50),
      color VARCHAR(50),
      isSterilized VARCHAR(50),
      alive VARCHAR(50),
      PRIMARY KEY (id_cat)
);
CREATE TABLE dogs (
      id_dog MEDIUMINT NOT NULL AUTO_INCREMENT,
      name VARCHAR(50),
      alias VARCHAR(50),
      gender VARCHAR(50),
      birthDate VARCHAR(50),
      joinerSince VARCHAR(50),
      color VARCHAR(50),
      isSterilized VARCHAR(50),
      alive VARCHAR(50),
      breed VARCHAR(50),
      PRIMARY KEY (id_dog)
);
