SpringBoot and JDBC with Maven,
mysql, jdk 15
===============================
Setup Database
create database myjlcdb;
use myjlcdb;
create table mycustomers(
cid int primary key,
cname char(10),
email char(10),
phone long,
city char(10)
);


Ref:
https://medium.com/codeshake/spring-boot-auto-configuration-mystery-revealed-d734516dddfb

