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

 Date: 09/25/2017 11:13:29 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `kongfu_user`
-- ----------------------------
DROP TABLE IF EXISTS `kongfu_user`;
CREATE TABLE `kongfu_user` (
  `id` int(10) COLLATE utf8_unicode_ci NOT NULL AUTO_INCREMENT,
  `userCode` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `userName` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `userNick` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `job` int(11) NOT NULL,
  `userPower` int(10) NOT NULL COMMENT '用户权限（0,最高管理员；1管理员；2,普通管理员，3会员）',
  `phone` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号',
  `qq` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sex` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `old` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
-- ----------------------------
--  Records of `kongfu_user`
-- ----------------------------
BEGIN;
INSERT INTO `kongfu_user` VALUES
('1', 'wu00000001', '王军伟', '紫罗圣手', '000000','0','0', '10101010100', '1111111', '0', '39'),
('2', 'shang000000006', '何进', '尚*', '000000','1','1',  '12345678901', '1111111', '0', '25'),
('3', 'shang000000007', '那云开', '尚朝','000000', '1', '1', '18701658769', '2790522457', '0', '24');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
