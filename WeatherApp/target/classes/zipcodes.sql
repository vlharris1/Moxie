DROP TABLE IF EXISTS ZIPCODE;
  
CREATE TABLE ZIPCODE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  zips VARCHAR(250) NOT NULL,
);

INSERT INTO ZIPCODE (zips) VALUES
('23666'),
('23605');