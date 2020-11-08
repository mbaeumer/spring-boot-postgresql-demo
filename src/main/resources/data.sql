DROP TABLE IF EXISTS contacts;

CREATE TABLE contacts (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  FIRSTNAME VARCHAR(64),
  LASTNAME VARCHAR(64),
  PHONENUMBER VARCHAR(64),
  EMAIL VARCHAR(64)
);

INSERT INTO contacts(id, firstname, lastname, phonenumber, email) VALUES(1, 'Martin', 'Bäumer', '13546778', 'mb@mb.se');