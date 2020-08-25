/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : fund

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 25/08/2020 19:45:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fund_info
-- ----------------------------
DROP TABLE IF EXISTS `fund_info`;
CREATE TABLE `fund_info`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代码',
  `unit_net` decimal(10, 4) NULL DEFAULT NULL COMMENT '单位净值',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fund_info
-- ----------------------------
INSERT INTO `fund_info` VALUES (1, '银华内需精选混合（LOF）', '161810', 3.6560, '2020-08-22 11:04:22', '2020-08-22 11:04:24');

-- ----------------------------
-- Table structure for fund_up_down_record
-- ----------------------------
DROP TABLE IF EXISTS `fund_up_down_record`;
CREATE TABLE `fund_up_down_record`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `fund_id` int(0) NULL DEFAULT NULL COMMENT '基金id',
  `up_down` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涨跌',
  `point` decimal(10, 2) NULL DEFAULT NULL COMMENT '点数',
  `profit` decimal(10, 2) NULL DEFAULT NULL COMMENT '盈亏',
  `date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '时间',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fund_up_down_record
-- ----------------------------

-- ----------------------------
-- Table structure for user_fund
-- ----------------------------
DROP TABLE IF EXISTS `user_fund`;
CREATE TABLE `user_fund`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(0) NULL DEFAULT NULL COMMENT '用户id',
  `fund_id` int(0) NULL DEFAULT NULL COMMENT '基金id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_fund
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
