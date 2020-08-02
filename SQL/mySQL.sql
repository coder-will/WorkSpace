#常见的一些数据库操作
UPDATE USER SET PASSWORD=PASSWORD('1234567') WHERE USER='root'  #修改密码
FLUSH PRIVILEGES;  #刷新数据库
SHOW DATABASES; #显示所有数据库
USE ssm; #打开某个数据库
SHOW TABLES; #显示数据库中的所有表
DESCRIBE USER; #显示USER表中的列的信息
CREATE DATABASE student; #创建一个student数据库

#创建1个school数据库，创建一个学生表，学号int，密码varchar(20)，出生日期(datatime),家庭住址，email
CREATE DATABASE school;
USE school;
CREATE TABLE IF NOT EXISTS student{
	id INT AUTO_INCREMENT NOT NULL,
	PASSWORD VARCHAR(20) ,
	birth DATE,
	address VARCHAR(100) DEFAULT NULL,
	email VARCHAR(50),
	PRIMARY KEY(id)
}ENGINE=INNODB DEFAULT CHARSET=utf-8;
