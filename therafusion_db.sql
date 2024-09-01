
                                                          SQL CODE






CREATE DATABASE thera_db; 
 use thera_db;
  create table user(
id int auto_increment,
name varchar(250),
username varchar(100),
role varchar(70),
center_id int,
password varchar(50),
primary key (id),
UNIQUE (username),
FOREIGN KEY (center_id) REFERENCES therapy_center(id)
);

create table therapy_center(
id int auto_increment,
centre_name varchar(250),
phone_num varchar (30),
add_l1 varchar(250),
add_l2 varchar (250),
city varchar (100),
state varchar (100),
pincode varchar (10),
price int,
session_type varchar(250),
rating decimal(4,2) NOT NULL,
primary key (id),
UNIQUE(centre_name, session_type)
);


create table therapist (
id int auto_increment,
therapist_name varchar(100),
patient_name varchar (100),
therapy_plan varchar (1000),
goals varchar (1000),
progress_report varchar(1000),
adding_sessions varchar (100),
session_type varchar (100),
supervisor_feedback varchar (1000),
primary key (id),
UNIQUE (therapist_name , patient_name),
FOREIGN KEY (therapist_name) REFERENCES user(username),
FOREIGN KEY (patient_name) REFERENCES user(username)
);

create table supervisor(
id int auto_increment,
supervisor_name varchar (100),
therapist_name varchar(100),
give_review varchar (1000),
is_plan_accepted varchar(1),
patient_name varchar(100),
primary key (id),
FOREIGN KEY (patient_name) REFERENCES user(username),
FOREIGN KEY (therapist_name) REFERENCES user(username),
FOREIGN KEY (supervisor_name) REFERENCES user(username),
unique (patient_name,therapist_name,supervisor_name)
);
