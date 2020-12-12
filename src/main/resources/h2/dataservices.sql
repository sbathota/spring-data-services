 
CREATE TABLE customer (
  customer_id INT AUTO_INCREMENT  PRIMARY KEY,
  customer_name VARCHAR(250) NOT NULL
);


INSERT INTO customer (customer_name) VALUES
  ('Sudheer'),
  ('Surendra'),
  ('Venkat');

create table customer_address(
address_id INT AUTO_INCREMENT  PRIMARY KEY,
address varchar(250) NOT NULL,
customer_id int,
 foreign key (customer_id) references customer(customer_id)
 );
 
 INSERT INTO customer_address (address, customer_id) VALUES
  ('Shrewsbury,MA',1),
  ('WestBorough,MA',2),
  ('Detroit,MI',3);
 

create table customer_email(
emaild_id INT AUTO_INCREMENT  PRIMARY KEY,
email varchar(250) NOT NULL,
customer_id int,
 foreign key (customer_id) references customer(customer_id)
 );
 
 INSERT INTO customer_email (email, customer_id) VALUES
  ('abc@gmail.com',1),
  ('abc1@gmail.com',2),
  ('xyz@gmail.com',3);


