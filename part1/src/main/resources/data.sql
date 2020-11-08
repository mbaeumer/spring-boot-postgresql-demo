DROP TABLE IF EXISTS contact;

CREATE TABLE contact (
  id INT AUTO_INCREMENT PRIMARY KEY,
  firstname VARCHAR(64),
  lastname VARCHAR(64),
  phonenumber VARCHAR(64),
  email VARCHAR(64)
);

INSERT INTO contact(id, firstName, lastName, phoneNumber, email) VALUES(1, 'Martin', 'Bäumer', '13546778', 'mb@mb.se');