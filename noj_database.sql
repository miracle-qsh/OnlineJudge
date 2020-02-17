/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : noj_database

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2019-12-03 21:13:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contest
-- ----------------------------
DROP TABLE IF EXISTS `contest`;
CREATE TABLE `contest` (
  `con_id` int(11) NOT NULL AUTO_INCREMENT,
  `con_name` varchar(30) COLLATE utf8_bin NOT NULL,
  `con_starttime` datetime NOT NULL,
  `con_endtime` datetime NOT NULL,
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for con_pro_map
-- ----------------------------
DROP TABLE IF EXISTS `con_pro_map`;
CREATE TABLE `con_pro_map` (
  `map_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) NOT NULL,
  `con_id` int(11) NOT NULL,
  PRIMARY KEY (`map_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for problem
-- ----------------------------
DROP TABLE IF EXISTS `problem`;
CREATE TABLE `problem` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_title` varchar(255) CHARACTER SET utf8 NOT NULL,
  `pro_timelim` int(11) NOT NULL,
  `pro_memlim` int(11) NOT NULL,
  `pro_info` varchar(300) CHARACTER SET utf8 NOT NULL,
  `pro_input` varchar(300) CHARACTER SET utf8 NOT NULL,
  `pro_output` varchar(300) CHARACTER SET utf8 NOT NULL,
  `pro_sinput` varchar(300) CHARACTER SET utf8 NOT NULL,
  `pro_soutput` varchar(300) CHARACTER SET utf8 NOT NULL,
  `pro_hint` varchar(300) CHARACTER SET utf8 NOT NULL,
  `pro_authorid` int(11) NOT NULL,
  `pro_acnum` int(11) NOT NULL,
  `pro_totalnum` int(11) NOT NULL,
  `pro_data` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_username` varchar(15) NOT NULL,
  `stu_password` varchar(15) NOT NULL,
  `stu_name` varchar(15) NOT NULL,
  `stu_sloveed` int(11) NOT NULL,
  `stu_email` varchar(30) NOT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for submission
-- ----------------------------
DROP TABLE IF EXISTS `submission`;
CREATE TABLE `submission` (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `pro_id` int(11) NOT NULL,
  `result` varchar(255) CHARACTER SET utf8 NOT NULL,
  `sub_time` datetime NOT NULL,
  `time` int(11) NOT NULL,
  `mem` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_username` varchar(15) CHARACTER SET utf8 NOT NULL,
  `tea_password` varchar(15) CHARACTER SET utf8 NOT NULL,
  `tea_name` varchar(15) CHARACTER SET utf8 NOT NULL,
  `tea_email` varchar(15) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
