/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : ruoyi

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 15/09/2023 18:28:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for biz_germplasm
-- ----------------------------
DROP TABLE IF EXISTS `biz_germplasm`;
CREATE TABLE `biz_germplasm` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(20) NOT NULL DEFAULT '' COMMENT '编号',
  `specific_name` varchar(20) NOT NULL DEFAULT '' COMMENT '种名',
  `latin_name` varchar(50) NOT NULL DEFAULT '' COMMENT '种拉丁名',
  `coordinate` varchar(50) NOT NULL DEFAULT '' COMMENT '坐标 经纬度',
  `longitude` varchar(20) NOT NULL DEFAULT '' COMMENT '经度',
  `latitude` varchar(20) NOT NULL DEFAULT '' COMMENT '纬度',
  `elevation` smallint unsigned NOT NULL DEFAULT '0' COMMENT '海拔(单位：米)',
  `life_form` varchar(20) NOT NULL DEFAULT '' COMMENT '生活型',
  `medicinal_name` varchar(20) NOT NULL DEFAULT '' COMMENT '药材名',
  `collection_address` varchar(100) NOT NULL DEFAULT '' COMMENT '采集地址',
  `collection_time` datetime NOT NULL COMMENT '采集时间',
  `characteristics` varchar(100) NOT NULL DEFAULT '' COMMENT '种质特征',
  `preservation_location` varchar(20) NOT NULL DEFAULT '' COMMENT '种质保存位置',
  `plant_photograph` varchar(1000) NOT NULL DEFAULT '' COMMENT '种质资源植物照片',
  `voucher_specimen` varchar(1000) NOT NULL DEFAULT '' COMMENT '凭证标本',
  `remark` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',
  `creator` int unsigned NOT NULL DEFAULT '0' COMMENT '创建人',
  `modifier` int unsigned NOT NULL DEFAULT '0' COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `del_flag` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='种质资源表';


-- ----------------------------
-- Records of sys_menu
-- ----------------------------
BEGIN;
INSERT INTO `sys_menu` VALUES (2000, '种质资源保护圃', 0, 0, '#', 'menuItem', 'M', '0', '1', NULL, 'fa fa-tree', 'admin', '2023-09-14 12:38:13', '', NULL, '');
INSERT INTO `sys_menu` VALUES (2001, '种质资源', 2000, 1, '/biz/germplasm', 'menuItem', 'C', '0', '1', 'biz:germplasm:view', '#', 'admin', '2023-09-14 12:38:53', 'admin', '2023-09-14 12:49:25', '');
INSERT INTO `sys_menu` VALUES (2002, '列表查询', 2001, 1, '#', 'menuItem', 'F', '0', '1', 'biz:germplasm:list', '#', 'admin', '2023-09-14 12:41:33', 'admin', '2023-09-14 12:49:36', '');
INSERT INTO `sys_menu` VALUES (2003, '种质新增', 2001, 2, '#', 'menuItem', 'F', '0', '1', 'biz:germplasm:add', '#', 'admin', '2023-09-14 12:42:43', 'admin', '2023-09-14 12:49:59', '');
INSERT INTO `sys_menu` VALUES (2004, '种质修改', 2001, 3, '#', 'menuItem', 'F', '0', '1', 'biz:germplasm:edit', '#', 'admin', '2023-09-14 12:43:58', 'admin', '2023-09-14 12:49:46', '');
INSERT INTO `sys_menu` VALUES (2005, '种质删除', 2001, 4, '#', 'menuItem', 'F', '0', '1', 'biz:germplasm:remove', '#', 'admin', '2023-09-14 12:44:20', 'admin', '2023-09-14 12:50:10', '');
INSERT INTO `sys_menu` VALUES (2006, '种质导出', 2001, 5, '#', 'menuItem', 'F', '0', '1', 'biz:germplasm:export', '#', 'admin', '2023-09-14 12:45:23', 'admin', '2023-09-14 12:50:19', '');
COMMIT;
