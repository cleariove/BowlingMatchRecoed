/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : bowling

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 20/02/2020 21:45:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for inningrecord
-- ----------------------------
DROP TABLE IF EXISTS `inningrecord`;
CREATE TABLE `inningrecord`  (
  `event` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `teamNum` int(11) NULL DEFAULT NULL,
  `inning` int(11) NULL DEFAULT NULL,
  `firstScore1` int(11) NULL DEFAULT NULL,
  `secondScore1` int(11) NULL DEFAULT NULL,
  `scoreType1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore1` int(11) NULL DEFAULT NULL,
  `firstScore2` int(11) NULL DEFAULT NULL,
  `secondScore2` int(11) NULL DEFAULT NULL,
  `scoreType2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore2` int(11) NULL DEFAULT NULL,
  `firstScore3` int(11) NULL DEFAULT NULL,
  `secondScore3` int(11) NULL DEFAULT NULL,
  `scoreType3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore3` int(11) NULL DEFAULT NULL,
  `firstScore4` int(11) NULL DEFAULT NULL,
  `secondScore4` int(11) NULL DEFAULT NULL,
  `scoreType4` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore4` int(11) NULL DEFAULT NULL,
  `firstScore5` int(11) NULL DEFAULT NULL,
  `secondScore5` int(11) NULL DEFAULT NULL,
  `scoreType5` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore5` int(11) NULL DEFAULT NULL,
  `firstScore6` int(11) NULL DEFAULT NULL,
  `secondScore6` int(11) NULL DEFAULT NULL,
  `scoreType6` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore6` int(11) NULL DEFAULT NULL,
  `firstScore7` int(11) NULL DEFAULT NULL,
  `secondScore7` int(11) NULL DEFAULT NULL,
  `scoreType7` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore7` int(11) NULL DEFAULT NULL,
  `firstScore8` int(11) NULL DEFAULT NULL,
  `secondScore8` int(11) NULL DEFAULT NULL,
  `scoreType8` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore8` int(11) NULL DEFAULT NULL,
  `firstScore9` int(11) NULL DEFAULT NULL,
  `secondScore9` int(11) NULL DEFAULT NULL,
  `scoreType9` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore9` int(11) NULL DEFAULT NULL,
  `firstScore10` int(11) NULL DEFAULT NULL,
  `secondScore10` int(11) NULL DEFAULT NULL,
  `thirdScore` int(11) NULL DEFAULT NULL,
  `scoreType10` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personRoundScore10` int(11) NULL DEFAULT NULL,
  `personInningScore` int(11) NULL DEFAULT NULL,
  `teamInningScore` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for player
-- ----------------------------
DROP TABLE IF EXISTS `player`;
CREATE TABLE `player`  (
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `score` int(11) NULL DEFAULT NULL,
  `singleScore` int(11) NULL DEFAULT NULL,
  `doubleScore` int(11) NULL DEFAULT NULL,
  `tripleScore` int(11) NULL DEFAULT NULL,
  `pentaScore` int(11) NULL DEFAULT NULL,
  `classicScore` int(11) NULL DEFAULT NULL,
  `topFourScore` int(11) NULL DEFAULT NULL,
  `topThreeScore` int(11) NULL DEFAULT NULL,
  `finalScore` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
