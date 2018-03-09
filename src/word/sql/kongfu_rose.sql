/*
 Navicat Premium Data Transfer

 Source Server         : person
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : sxgs

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 09/25/2017 11:13:56 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `kongfu_rose`
-- ----------------------------
DROP TABLE IF EXISTS `kongfu_rose`;
CREATE TABLE `kongfu_rose` (
  `id` int(10) NOT NULL,
  `roseCode` varchar(100) NOT NULL,
  `roseName` varchar(200) NOT NULL,
  `userCode` varchar(100) NOT NULL,
  `userName` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
