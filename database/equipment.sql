/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 127.0.0.1:3306
 Source Schema         : equipment

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 30/07/2020 13:43:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for equ_data
-- ----------------------------
DROP TABLE IF EXISTS `equ_data`;
CREATE TABLE `equ_data` (
  `time` bigint(255) DEFAULT NULL COMMENT '系统时间',
  `rotate` double(255,0) DEFAULT NULL COMMENT '转速',
  `core_temper` double(255,0) DEFAULT NULL COMMENT '内温度',
  `exter_temper` double(255,0) DEFAULT NULL COMMENT '外温度',
  `equipment_id` varchar(32) DEFAULT NULL COMMENT '设备ID',
  `start_time` bigint(255) DEFAULT NULL COMMENT '开始时间',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equ_data
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for equipments
-- ----------------------------
DROP TABLE IF EXISTS `equipments`;
CREATE TABLE `equipments` (
  `equipment_id` varchar(32) NOT NULL,
  `class_id` varchar(32) NOT NULL,
  `time` bigint(255) NOT NULL,
  `number` varchar(10) NOT NULL,
  `class_number` varchar(10) NOT NULL,
  `school` varchar(50) NOT NULL,
  `state` int(1) DEFAULT '0',
  `student_id` varchar(32) DEFAULT NULL,
  `core_future` bigint(255) DEFAULT '0',
  `rotate_future` bigint(255) DEFAULT '0',
  `exter_future` bigint(255) DEFAULT '0',
  `isdel` int(1) NOT NULL DEFAULT '0',
  `start_time` bigint(255) DEFAULT NULL,
  `equ_state` int(1) DEFAULT '1',
  PRIMARY KEY (`equipment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipments
-- ----------------------------
BEGIN;
INSERT INTO `equipments` VALUES ('84c4902c53e34a128ea7c658e3db4b3c', 'ee9a5dd6c63641a9912a03efd3c12146', 1596086551991, '10010001', '1001', '吉林化工学院', 0, NULL, 0, 0, 0, 0, 0, 1);
INSERT INTO `equipments` VALUES ('df7a59bc8b224c1c8a41997c8fd87912', 'ee9a5dd6c63641a9912a03efd3c12146', 1596086558583, '10010002', '1001', '吉林化工学院', 0, NULL, 0, 0, 0, 0, 0, 1);
COMMIT;

-- ----------------------------
-- Table structure for laboratory
-- ----------------------------
DROP TABLE IF EXISTS `laboratory`;
CREATE TABLE `laboratory` (
  `class_id` varchar(32) NOT NULL COMMENT '课堂id//UUID',
  `class_number` varchar(50) NOT NULL COMMENT '520',
  `class_code` varchar(10) DEFAULT NULL COMMENT '602346',
  `teacher_id` varchar(32) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `state` int(1) DEFAULT '0' COMMENT '//课堂状态 0代表没上课1代表正在上课',
  `isdel` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of laboratory
-- ----------------------------
BEGIN;
INSERT INTO `laboratory` VALUES ('357477ddc0124854a7f861a6b308a941', '1002', NULL, '2240004d813d409c8794e5917b8c9b1d', '吉林化工学院', 0, 0);
INSERT INTO `laboratory` VALUES ('9d3489ebc4084f14aa492e5743d218a5', '1003', NULL, '2240004d813d409c8794e5917b8c9b1d', '吉林化工学院', 0, 0);
INSERT INTO `laboratory` VALUES ('ee9a5dd6c63641a9912a03efd3c12146', '1001', NULL, '2240004d813d409c8794e5917b8c9b1d', '吉林化工学院', 0, 0);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(11) NOT NULL,
  `password` varchar(20) NOT NULL,
  `power` int(1) NOT NULL DEFAULT '1',
  `school` varchar(255) DEFAULT NULL,
  `field1` varchar(255) DEFAULT NULL,
  `field2` varchar(255) DEFAULT NULL,
  `isdel` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('2240004d813d409c8794e5917b8c9b1d', '15104343060', '111111', 2, '吉林化工学院', '张老师', '1610507901', 0);
INSERT INTO `user` VALUES ('33389d8167104ee7804be96d825ac7dc', '15104343061', '111111', 2, '吉林化工学院', '李老师', '1610507265', 0);
INSERT INTO `user` VALUES ('4af745d88fbf4d9b8c94cc750d84e316', '15104343050', '983422', 1, '吉林化工学院', '张三', '1610507201', 0);
INSERT INTO `user` VALUES ('admin', '15100008888', '111111', 3, 'admin', 'admin', 'admin', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
