CREATE TABLE IF NOT EXISTS driver (
  id BIGINT NOT NULL,
  name VARCHAR(25) NOT NULL,
  last_name VARCHAR(25) NOT NULL,
  car_plate CHAR(7) NOT NULL,
  PRIMARY KEY (id)
);