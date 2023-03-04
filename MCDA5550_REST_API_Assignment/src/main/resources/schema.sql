CREATE TABLE hotel (
  hotel_id INTEGER PRIMARY KEY,
  hotel_name VARCHAR(255) NOT NULL,
  address VARCHAR(255) NOT NULL,
  phone_no VARCHAR(20) NOT NULL,
  no_of_room INT NOT NULL
);


CREATE SEQUENCE Hotel_SEQ_ID START WITH (select max(hotel_id) + 1 from hotel);