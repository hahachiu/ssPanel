/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : ss-panel

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2016-09-27 23:31:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `chargeorders`
-- ----------------------------
DROP TABLE IF EXISTS `chargeorders`;
CREATE TABLE `chargeorders` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `way` varchar(10) NOT NULL,
  `other` int(11) NOT NULL,
  `figure` float NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `chargeorders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chargeorders
-- ----------------------------
INSERT INTO `chargeorders` VALUES ('1', '2016-09-17', 'Alipay', '201602', '10', '2');
INSERT INTO `chargeorders` VALUES ('2', '2016-09-17', 'Alipay', '201601', '6', '2');

-- ----------------------------
-- Table structure for `logs`
-- ----------------------------
DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `title` varchar(20) NOT NULL,
  `content` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of logs
-- ----------------------------
INSERT INTO `logs` VALUES ('1', '2016-09-05', 'hello world', 'test');
INSERT INTO `logs` VALUES ('2', '2016-09-05', 'test', 'test');

-- ----------------------------
-- Table structure for `nodes`
-- ----------------------------
DROP TABLE IF EXISTS `nodes`;
CREATE TABLE `nodes` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `nodeName` varchar(20) NOT NULL,
  `state` varchar(10) NOT NULL,
  `address` varchar(20) NOT NULL,
  `encryption` varchar(20) NOT NULL,
  `ratio` float NOT NULL,
  `detail` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nodes
-- ----------------------------
INSERT INTO `nodes` VALUES ('1', '2016-09-05', 'japan1', 'ok', 'jp1.me.net', 'rc4-md5', '1', 'test');
INSERT INTO `nodes` VALUES ('2', '2016-09-05', 'japan2', 'ok', 'jp2.me.net', 'rc4-md5', '1', 'test');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `total_price` float DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for `order_item`
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `month` int(11) NOT NULL,
  `plan_id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `port` int(11) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `data_usage` int(11) DEFAULT NULL,
  `data_total` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `plan_id` (`plan_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `order_item_ibfk_1` FOREIGN KEY (`plan_id`) REFERENCES `plan` (`id`),
  CONSTRAINT `order_item_ibfk_3` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_item
-- ----------------------------

-- ----------------------------
-- Table structure for `plan`
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `name` varchar(10) NOT NULL,
  `dataMonth` varchar(10) NOT NULL,
  `price` float NOT NULL,
  `detail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plan
-- ----------------------------
INSERT INTO `plan` VALUES ('1', '2016-09-05', 'A', '15', '10', 'test');
INSERT INTO `plan` VALUES ('2', '2016-09-05', 'B', '30', '20', 'test');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `creation_date` date NOT NULL,
  `username` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(64) NOT NULL,
  `money` float DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2016-09-05', 'test', '123@163.com', 'test', '0');
INSERT INTO `user` VALUES ('2', '2016-09-05', '1', '111@163.com', '1', '0');
