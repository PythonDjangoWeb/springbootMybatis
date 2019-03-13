/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : maven

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-03-13 16:40:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administer
-- ----------------------------
DROP TABLE IF EXISTS `administer`;
CREATE TABLE `administer` (
  `id` int(11) NOT NULL,
  `administer` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administer
-- ----------------------------
INSERT INTO `administer` VALUES ('1', '3', '3');
INSERT INTO `administer` VALUES ('2', '3', '3');

-- ----------------------------
-- Table structure for color
-- ----------------------------
DROP TABLE IF EXISTS `color`;
CREATE TABLE `color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `x` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=809 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of color
-- ----------------------------
INSERT INTO `color` VALUES ('786', '1', '7');
INSERT INTO `color` VALUES ('787', '2', '7');
INSERT INTO `color` VALUES ('788', '3', '7');
INSERT INTO `color` VALUES ('789', '4', '7');
INSERT INTO `color` VALUES ('790', '5', '7');
INSERT INTO `color` VALUES ('791', '6', '7');
INSERT INTO `color` VALUES ('792', '7', '7');
INSERT INTO `color` VALUES ('793', '8', '7');
INSERT INTO `color` VALUES ('794', '12', '7');
INSERT INTO `color` VALUES ('795', '13', '7');
INSERT INTO `color` VALUES ('796', '3', '5');
INSERT INTO `color` VALUES ('797', '4', '5');
INSERT INTO `color` VALUES ('798', '5', '5');
INSERT INTO `color` VALUES ('799', '7', '5');
INSERT INTO `color` VALUES ('800', '8', '5');
INSERT INTO `color` VALUES ('801', '9', '5');
INSERT INTO `color` VALUES ('802', '10', '5');
INSERT INTO `color` VALUES ('803', '11', '5');
INSERT INTO `color` VALUES ('804', '12', '5');
INSERT INTO `color` VALUES ('805', '13', '5');
INSERT INTO `color` VALUES ('806', '14', '5');
INSERT INTO `color` VALUES ('807', '15', '5');
INSERT INTO `color` VALUES ('808', '16', '5');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL,
  `goodName_s` varchar(255) DEFAULT NULL,
  `goodColor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '2', '3');
INSERT INTO `goods` VALUES ('2', '3', '4');

-- ----------------------------
-- Table structure for olddata
-- ----------------------------
DROP TABLE IF EXISTS `olddata`;
CREATE TABLE `olddata` (
  `id` int(11) NOT NULL,
  `usernum` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `surface` float(255,0) DEFAULT NULL,
  `square` float(255,0) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `isOne` varchar(255) DEFAULT NULL,
  `Ordinance` varchar(255) DEFAULT NULL,
  `sign` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of olddata
-- ----------------------------
INSERT INTO `olddata` VALUES ('1', '12011400700208080', '金龙', '二区56号', '13821751489', '123456792', '312', '449.424', '否', '6', null, null);
INSERT INTO `olddata` VALUES ('2', '12011400700206825', '候福琴', '二区55号', '13920703166', '307101040640', '485', '697.824', '是', null, null, null);
INSERT INTO `olddata` VALUES ('3', '12011400700206758', '王凤林', '二区30号', '13752313914', '307101007872', '639', '919.584', '是', null, null, null);
INSERT INTO `olddata` VALUES ('4', '12011400700223275', '陈胜利', '二区64号', '15122808392', '307090227200', '1', '0.72', '是', null, null, null);
INSERT INTO `olddata` VALUES ('5', '12011400700206762', '王振明', '二区59号', '13821418298', '307101007872', '1101', '1584.72', '是', null, null, null);
INSERT INTO `olddata` VALUES ('6', '12011400700207799', '金连河', '二区56号', '13821751489', '987654336', '607', '874.08', '是', null, null, null);
INSERT INTO `olddata` VALUES ('7', '12011400700207543', '王永江', '一区76号', '13702125562', '307101007872', '443', '638.496', '是', null, null, null);
INSERT INTO `olddata` VALUES ('8', '12011400700212039', '冯国建', '二区80号', '13820145230', '307090259968', '2', '2.304', '是', null, null, null);
INSERT INTO `olddata` VALUES ('9', '12011400700209091', '王俊起', '四区90号', '13132196884', '307090259968', '0', '0.0', '是', null, null, null);
INSERT INTO `olddata` VALUES ('10', '12011400700223293', '王德凯', '二区53号', '13022267780', '307090227200', '0', '0.0', '是', null, null, null);
INSERT INTO `olddata` VALUES ('11', '12011400700223190', '冯国江', '四区95号', '13302173096', '307090227200', '2136', '2592.0', '是', null, null, null);
INSERT INTO `olddata` VALUES ('12', '12011400700223154', '王善武', '二区2号', '13022224603', '307090227200', '1318', '1897.92', '是', null, null, null);
INSERT INTO `olddata` VALUES ('13', '12011400700220944', '邢克忠', '三区32号', '1.3752382031E10', '307090227200', '1212', '1745.28', '否', null, null, null);
INSERT INTO `olddata` VALUES ('14', '12011400700220905', '王洪浩', '一区22号', '13920626086', '307090227200', '0', '0.0', '否', null, null, '无设备');
INSERT INTO `olddata` VALUES ('15', '12011400700220407', '李洪涛', '一区10号', '13820841167', '307090227200', '0', '0.0', '否', '4', null, null);
INSERT INTO `olddata` VALUES ('16', '12011400700220328', '张广忠', '一区6号', '29482577', '307090227200', '55', '79.2', '是', null, null, null);
INSERT INTO `olddata` VALUES ('17', '12011400700220329', '张广忠', '一区6号', '29482577', '307090227200', '55', '79.2', '否', null, null, null);

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '菜单标题',
  `url` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '1：一级菜单\r\n2：二级菜单',
  `pub_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='管理菜单';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='管理权限';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='权限&菜单（中间表）';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `principal` varchar(255) DEFAULT NULL,
  `credential` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL COMMENT '0：正常\r\n1：冻结',
  `create_time` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员';

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) DEFAULT NULL,
  `userName_s` varchar(255) DEFAULT NULL,
  `userpassword_s` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2', '3');
INSERT INTO `user` VALUES ('2', '3', '3');

-- ----------------------------
-- Table structure for user_t
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES ('2', 'asd', '阿斯顿', '11');
INSERT INTO `user_t` VALUES ('3', 'asd', '啊撒啊啊', '12');
INSERT INTO `user_t` VALUES ('4', 'asd', '123', '12');
INSERT INTO `user_t` VALUES ('5', 'asd', '123', '12');
INSERT INTO `user_t` VALUES ('6', 'asd', '阿斯顿', '11');
INSERT INTO `user_t` VALUES ('7', 'asd', '啊撒啊啊', '12');
INSERT INTO `user_t` VALUES ('8', 'asd', '123', '12');
INSERT INTO `user_t` VALUES ('9', 'asd', '123', '12');
INSERT INTO `user_t` VALUES ('10', 'asd', '阿斯顿', '11');
INSERT INTO `user_t` VALUES ('11', 'asd', '啊撒啊啊', '12');
INSERT INTO `user_t` VALUES ('12', 'asd', '123', '12');
INSERT INTO `user_t` VALUES ('13', 'asd', '123', '12');
INSERT INTO `user_t` VALUES ('14', '请问', '请问', '13');
INSERT INTO `user_t` VALUES ('15', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('16', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('17', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('18', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('19', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('20', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('21', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('22', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('23', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('24', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('25', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('26', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('27', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('28', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('29', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('30', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('31', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('32', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('33', 'wangjh', '123654', '12');
INSERT INTO `user_t` VALUES ('34', 'wangjh', '123654', '12');
