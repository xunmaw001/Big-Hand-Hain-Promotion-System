-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm5b2ht
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm5b2ht/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm5b2ht/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm5b2ht/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusshezuoxinxi`
--

DROP TABLE IF EXISTS `discusshezuoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusshezuoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611890946755 DEFAULT CHARSET=utf8 COMMENT='合作信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusshezuoxinxi`
--

LOCK TABLES `discusshezuoxinxi` WRITE;
/*!40000 ALTER TABLE `discusshezuoxinxi` DISABLE KEYS */;
INSERT INTO `discusshezuoxinxi` VALUES (141,'2021-01-29 03:15:03',1,1,'评论内容1','回复内容1'),(142,'2021-01-29 03:15:03',2,2,'评论内容2','回复内容2'),(143,'2021-01-29 03:15:03',3,3,'评论内容3','回复内容3'),(144,'2021-01-29 03:15:03',4,4,'评论内容4','回复内容4'),(145,'2021-01-29 03:15:03',5,5,'评论内容5','回复内容5'),(146,'2021-01-29 03:15:03',6,6,'评论内容6','回复内容6'),(1611890946754,'2021-01-29 03:29:06',101,1611890826141,'非常不错的合作伙伴，值得信任','感谢信任，希望下次可以继续合作');
/*!40000 ALTER TABLE `discusshezuoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611891041887 DEFAULT CHARSET=utf8 COMMENT='聊天论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (112,'2021-01-29 03:15:03','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(113,'2021-01-29 03:15:03','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(114,'2021-01-29 03:15:03','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(115,'2021-01-29 03:15:03','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(116,'2021-01-29 03:15:03','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1611890975875,'2021-01-29 03:29:34','11111','<p>请输入内容这里可以发布一些信息，用于之间可以进行交流</p>',0,1611890826141,'1','开放'),(1611890982403,'2021-01-29 03:29:42',NULL,'2222',1611890975875,1611890826141,'1',NULL),(1611891041886,'2021-01-29 03:30:41',NULL,'22222',1611890975875,11,'001',NULL);
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hezuoxinxi`
--

DROP TABLE IF EXISTS `hezuoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hezuoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `hezuogongsi` varchar(200) DEFAULT NULL COMMENT '合作公司',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `hezuojieguo` varchar(200) DEFAULT NULL COMMENT '合作结果',
  `gongsiziyuan` varchar(200) DEFAULT NULL COMMENT '公司资源',
  `hezuojianshu` longtext COMMENT '合作简述',
  `hezuoriqi` date DEFAULT NULL COMMENT '合作日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='合作信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hezuoxinxi`
--

LOCK TABLES `hezuoxinxi` WRITE;
/*!40000 ALTER TABLE `hezuoxinxi` DISABLE KEYS */;
INSERT INTO `hezuoxinxi` VALUES (101,'2021-01-29 03:15:03','与XX公司合作信息','http://localhost:8080/ssm5b2ht/upload/hezuoxinxi_tupian1.jpg','XX公司','020-89819991','773890001@qq.com','圆满完成','http://localhost:8080/ssm5b2ht/upload/1611890725678.doc','<p>合作简述1可以提供资料下载，这里可以写一些合作的项目等等</p>','2021-01-06'),(102,'2021-01-29 03:15:03','名称2','http://localhost:8080/ssm5b2ht/upload/hezuoxinxi_tupian2.jpg','合作公司2','020-89819992','773890002@qq.com','合作结果2','','合作简述2','2021-01-29'),(103,'2021-01-29 03:15:03','名称3','http://localhost:8080/ssm5b2ht/upload/hezuoxinxi_tupian3.jpg','合作公司3','020-89819993','773890003@qq.com','合作结果3','','合作简述3','2021-01-29'),(104,'2021-01-29 03:15:03','名称4','http://localhost:8080/ssm5b2ht/upload/hezuoxinxi_tupian4.jpg','合作公司4','020-89819994','773890004@qq.com','合作结果4','','合作简述4','2021-01-29'),(105,'2021-01-29 03:15:03','名称5','http://localhost:8080/ssm5b2ht/upload/hezuoxinxi_tupian5.jpg','合作公司5','020-89819995','773890005@qq.com','合作结果5','','合作简述5','2021-01-29'),(106,'2021-01-29 03:15:03','名称6','http://localhost:8080/ssm5b2ht/upload/hezuoxinxi_tupian6.jpg','合作公司6','020-89819996','773890006@qq.com','合作结果6','','合作简述6','2021-01-29');
/*!40000 ALTER TABLE `hezuoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611891010758 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (131,'2021-01-29 03:15:03',1,'用户名1','留言内容1','回复内容1'),(132,'2021-01-29 03:15:03',2,'用户名2','留言内容2','回复内容2'),(133,'2021-01-29 03:15:03',3,'用户名3','留言内容3','回复内容3'),(134,'2021-01-29 03:15:03',4,'用户名4','留言内容4','回复内容4'),(135,'2021-01-29 03:15:03',5,'用户名5','留言内容5','回复内容5'),(136,'2021-01-29 03:15:03',6,'用户名6','留言内容6','回复内容6'),(1611891010757,'2021-01-29 03:30:10',1611890826141,'1','有什么问题或者意见也可以在这里给管理员留言反馈，管理员看到后也可以进行回复','好的');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (121,'2021-01-29 03:15:03','公告信息','简介111111','http://localhost:8080/ssm5b2ht/upload/news_picture1.jpg','<p>内容1这里可以发布一些公告信息，或者帮助信息，有什么不懂的就可以发布在这里给用户查看</p>'),(122,'2021-01-29 03:15:03','标题2','简介2','http://localhost:8080/ssm5b2ht/upload/news_picture2.jpg','内容2'),(123,'2021-01-29 03:15:03','标题3','简介3','http://localhost:8080/ssm5b2ht/upload/news_picture3.jpg','内容3'),(124,'2021-01-29 03:15:03','标题4','简介4','http://localhost:8080/ssm5b2ht/upload/news_picture4.jpg','内容4'),(125,'2021-01-29 03:15:03','标题5','简介5','http://localhost:8080/ssm5b2ht/upload/news_picture5.jpg','内容5'),(126,'2021-01-29 03:15:03','标题6','简介6','http://localhost:8080/ssm5b2ht/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiyewenhua`
--

DROP TABLE IF EXISTS `qiyewenhua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiyewenhua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gongsimingcheng` varchar(200) NOT NULL COMMENT '公司名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shipinjianjie` varchar(200) DEFAULT NULL COMMENT '视频简介',
  `qiyewenhua` longtext COMMENT '企业文化',
  `fazhanlishi` longtext COMMENT '发展历史',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `xiangxidizhi` varchar(200) DEFAULT NULL COMMENT '详细地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='企业文化';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiyewenhua`
--

LOCK TABLES `qiyewenhua` WRITE;
/*!40000 ALTER TABLE `qiyewenhua` DISABLE KEYS */;
INSERT INTO `qiyewenhua` VALUES (21,'2021-01-29 03:15:03','公司名称1','http://localhost:8080/ssm5b2ht/upload/qiyewenhua_tupian1.jpg','','企业文化1','发展历史1','020-89819991','773890001@qq.com','详细地址1'),(22,'2021-01-29 03:15:03','苹果有限公司','http://localhost:8080/ssm5b2ht/upload/qiyewenhua_tupian2.jpg','http://localhost:8080/ssm5b2ht/upload/1611890433165.mp4','做一个现金的公司','<p><img src=\"http://localhost:8080/ssm5b2ht/upload/1611890498976.jpg\"></p><p><br></p><p><br></p><p>发展历史211111这里可以发布一些公司的发展过程或者历史可以图片加文字进行描述，这里的内容都是用预测的，可以自行添加删除的</p>','020-89819992','773890002@qq.com','海南省'),(23,'2021-01-29 03:15:03','公司名称3','http://localhost:8080/ssm5b2ht/upload/qiyewenhua_tupian3.jpg','','企业文化3','发展历史3','020-89819993','773890003@qq.com','详细地址3'),(24,'2021-01-29 03:15:03','公司名称4','http://localhost:8080/ssm5b2ht/upload/qiyewenhua_tupian4.jpg','','企业文化4','发展历史4','020-89819994','773890004@qq.com','详细地址4'),(25,'2021-01-29 03:15:03','公司名称5','http://localhost:8080/ssm5b2ht/upload/qiyewenhua_tupian5.jpg','','企业文化5','发展历史5','020-89819995','773890005@qq.com','详细地址5'),(26,'2021-01-29 03:15:03','公司名称6','http://localhost:8080/ssm5b2ht/upload/qiyewenhua_tupian6.jpg','','企业文化6','发展历史6','020-89819996','773890006@qq.com','详细地址6');
/*!40000 ALTER TABLE `qiyewenhua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiyezhixing`
--

DROP TABLE IF EXISTS `qiyezhixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiyezhixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `gongzuoshiji` longtext COMMENT '工作事迹',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='企业之星';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiyezhixing`
--

LOCK TABLES `qiyezhixing` WRITE;
/*!40000 ALTER TABLE `qiyezhixing` DISABLE KEYS */;
INSERT INTO `qiyezhixing` VALUES (31,'2021-01-29 03:15:03','1月份企业之星','http://localhost:8080/ssm5b2ht/upload/qiyezhixing_touxiang1.jpg','王飞','男','企业主管','<p>工作事迹11111完成了什么什么事迹</p>','2021-01-12'),(32,'2021-01-29 03:15:03','名称2','http://localhost:8080/ssm5b2ht/upload/qiyezhixing_touxiang2.jpg','姓名2','男','职位2','工作事迹2','2021-01-29'),(33,'2021-01-29 03:15:03','名称3','http://localhost:8080/ssm5b2ht/upload/qiyezhixing_touxiang3.jpg','姓名3','男','职位3','工作事迹3','2021-01-29'),(34,'2021-01-29 03:15:03','名称4','http://localhost:8080/ssm5b2ht/upload/qiyezhixing_touxiang4.jpg','姓名4','男','职位4','工作事迹4','2021-01-29'),(35,'2021-01-29 03:15:03','名称5','http://localhost:8080/ssm5b2ht/upload/qiyezhixing_touxiang5.jpg','姓名5','男','职位5','工作事迹5','2021-01-29'),(36,'2021-01-29 03:15:03','名称6','http://localhost:8080/ssm5b2ht/upload/qiyezhixing_touxiang6.jpg','姓名6','男','职位6','工作事迹6','2021-01-29');
/*!40000 ALTER TABLE `qiyezhixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','n2my9v09k7nh9oijzgo0sd7ia5r8twbl','2021-01-29 03:17:26','2021-01-29 04:31:27'),(2,11,'001','yonghu','用户','hk3y14m1xelqkhgoitstog4o42sbo6ab','2021-01-29 03:17:35','2021-01-29 04:30:34'),(3,1611890826141,'1','yonghu','用户','9zrz4vc1fga3eqt214iaiy5jghrvthbw','2021-01-29 03:27:10','2021-01-29 04:33:16');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushuguihai`
--

DROP TABLE IF EXISTS `tushuguihai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushuguihai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tushuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '图书馆名称',
  `tushubianhao` varchar(200) DEFAULT NULL COMMENT '图书编号',
  `tushumingcheng` varchar(200) DEFAULT NULL COMMENT '图书名称',
  `tushuleixing` varchar(200) DEFAULT NULL COMMENT '图书类型',
  `shuliang` varchar(200) NOT NULL COMMENT '数量',
  `guihairiqi` date DEFAULT NULL COMMENT '归还日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611891072168 DEFAULT CHARSET=utf8 COMMENT='图书归还';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushuguihai`
--

LOCK TABLES `tushuguihai` WRITE;
/*!40000 ALTER TABLE `tushuguihai` DISABLE KEYS */;
INSERT INTO `tushuguihai` VALUES (81,'2021-01-29 03:15:03','图书馆名称1','图书编号1','图书名称1','图书类型1','数量1','2021-01-29','用户名1','姓名1'),(82,'2021-01-29 03:15:03','图书馆名称2','图书编号2','图书名称2','图书类型2','数量2','2021-01-29','用户名2','姓名2'),(83,'2021-01-29 03:15:03','图书馆名称3','图书编号3','图书名称3','图书类型3','数量3','2021-01-29','用户名3','姓名3'),(84,'2021-01-29 03:15:03','图书馆名称4','图书编号4','图书名称4','图书类型4','数量4','2021-01-29','用户名4','姓名4'),(85,'2021-01-29 03:15:03','图书馆名称5','图书编号5','图书名称5','图书类型5','数量5','2021-01-29','用户名5','姓名5'),(86,'2021-01-29 03:15:03','图书馆名称6','图书编号6','图书名称6','图书类型6','数量6','2021-01-29','用户名6','姓名6'),(1611891072167,'2021-01-29 03:31:11','XX图书馆','10001','杜月星全传','传记','5','2021-01-27','1','李铭');
/*!40000 ALTER TABLE `tushuguihai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushujieyue`
--

DROP TABLE IF EXISTS `tushujieyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushujieyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tushuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '图书馆名称',
  `tushubianhao` varchar(200) DEFAULT NULL COMMENT '图书编号',
  `tushumingcheng` varchar(200) DEFAULT NULL COMMENT '图书名称',
  `tushuleixing` varchar(200) DEFAULT NULL COMMENT '图书类型',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `jieyueriqi` date DEFAULT NULL COMMENT '借阅日期',
  `guihairiqi` date DEFAULT NULL COMMENT '归还日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611890917002 DEFAULT CHARSET=utf8 COMMENT='图书借阅';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushujieyue`
--

LOCK TABLES `tushujieyue` WRITE;
/*!40000 ALTER TABLE `tushujieyue` DISABLE KEYS */;
INSERT INTO `tushujieyue` VALUES (71,'2021-01-29 03:15:03','图书馆名称1','图书编号1','图书名称1','图书类型1',1,'2021-01-29','2021-01-29','用户名1','姓名1'),(72,'2021-01-29 03:15:03','图书馆名称2','图书编号2','图书名称2','图书类型2',2,'2021-01-29','2021-01-29','用户名2','姓名2'),(73,'2021-01-29 03:15:03','图书馆名称3','图书编号3','图书名称3','图书类型3',3,'2021-01-29','2021-01-29','用户名3','姓名3'),(74,'2021-01-29 03:15:03','图书馆名称4','图书编号4','图书名称4','图书类型4',4,'2021-01-29','2021-01-29','用户名4','姓名4'),(75,'2021-01-29 03:15:03','图书馆名称5','图书编号5','图书名称5','图书类型5',5,'2021-01-29','2021-01-29','用户名5','姓名5'),(76,'2021-01-29 03:15:03','图书馆名称6','图书编号6','图书名称6','图书类型6',6,'2021-01-29','2021-01-29','用户名6','姓名6'),(1611890917001,'2021-01-29 03:28:36','XX图书馆','10001','杜月星全传','传记',5,'2021-01-05','2021-01-27','1','李铭');
/*!40000 ALTER TABLE `tushujieyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushuxinxi`
--

DROP TABLE IF EXISTS `tushuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tushuguanmingcheng` varchar(200) NOT NULL COMMENT '图书馆名称',
  `tushubianhao` varchar(200) NOT NULL COMMENT '图书编号',
  `tushumingcheng` varchar(200) NOT NULL COMMENT '图书名称',
  `tushuleixing` varchar(200) NOT NULL COMMENT '图书类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `tushujianjie` longtext COMMENT '图书简介',
  `shangjiariqi` date DEFAULT NULL COMMENT '上架日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='图书信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushuxinxi`
--

LOCK TABLES `tushuxinxi` WRITE;
/*!40000 ALTER TABLE `tushuxinxi` DISABLE KEYS */;
INSERT INTO `tushuxinxi` VALUES (61,'2021-01-29 03:15:03','XX图书馆','10001','杜月星全传','传记','http://localhost:8080/ssm5b2ht/upload/tushuxinxi_tupian1.jpg',95,'图书简介111111','2021-01-20'),(62,'2021-01-29 03:15:03','图书馆名称2','图书编号2','图书名称2','图书类型2','http://localhost:8080/ssm5b2ht/upload/tushuxinxi_tupian2.jpg',2,'图书简介2','2021-01-29'),(63,'2021-01-29 03:15:03','图书馆名称3','图书编号3','图书名称3','图书类型3','http://localhost:8080/ssm5b2ht/upload/tushuxinxi_tupian3.jpg',3,'图书简介3','2021-01-29'),(64,'2021-01-29 03:15:03','图书馆名称4','图书编号4','图书名称4','图书类型4','http://localhost:8080/ssm5b2ht/upload/tushuxinxi_tupian4.jpg',4,'图书简介4','2021-01-29'),(65,'2021-01-29 03:15:03','图书馆名称5','图书编号5','图书名称5','图书类型5','http://localhost:8080/ssm5b2ht/upload/tushuxinxi_tupian5.jpg',5,'图书简介5','2021-01-29'),(66,'2021-01-29 03:15:03','图书馆名称6','图书编号6','图书名称6','图书类型6','http://localhost:8080/ssm5b2ht/upload/tushuxinxi_tupian6.jpg',6,'图书简介6','2021-01-29');
/*!40000 ALTER TABLE `tushuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-01-29 03:15:03');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuexiziliao`
--

DROP TABLE IF EXISTS `xuexiziliao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuexiziliao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `xuexiziliao` varchar(200) DEFAULT NULL COMMENT '学习资料',
  `xuexishipin` varchar(200) DEFAULT NULL COMMENT '学习视频',
  `neirongjianjie` longtext COMMENT '内容简介',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='学习资料';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuexiziliao`
--

LOCK TABLES `xuexiziliao` WRITE;
/*!40000 ALTER TABLE `xuexiziliao` DISABLE KEYS */;
INSERT INTO `xuexiziliao` VALUES (91,'2021-01-29 03:15:03','XX学习资料','http://localhost:8080/ssm5b2ht/upload/xuexiziliao_tupian1.jpg','http://localhost:8080/ssm5b2ht/upload/1611890667829.doc','http://localhost:8080/ssm5b2ht/upload/1611890686154.mp4','内容简介1111111','2020-12-31'),(92,'2021-01-29 03:15:03','名称2','http://localhost:8080/ssm5b2ht/upload/xuexiziliao_tupian2.jpg','','','内容简介2','2021-01-29'),(93,'2021-01-29 03:15:03','名称3','http://localhost:8080/ssm5b2ht/upload/xuexiziliao_tupian3.jpg','','','内容简介3','2021-01-29'),(94,'2021-01-29 03:15:03','名称4','http://localhost:8080/ssm5b2ht/upload/xuexiziliao_tupian4.jpg','','','内容简介4','2021-01-29'),(95,'2021-01-29 03:15:03','名称5','http://localhost:8080/ssm5b2ht/upload/xuexiziliao_tupian5.jpg','','','内容简介5','2021-01-29'),(96,'2021-01-29 03:15:03','名称6','http://localhost:8080/ssm5b2ht/upload/xuexiziliao_tupian6.jpg','','','内容简介6','2021-01-29');
/*!40000 ALTER TABLE `xuexiziliao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yingpinxinxi`
--

DROP TABLE IF EXISTS `yingpinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yingpinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `zhaopingangwei` varchar(200) DEFAULT NULL COMMENT '招聘岗位',
  `gongzi` varchar(200) DEFAULT NULL COMMENT '工资',
  `yingpinliyou` varchar(200) NOT NULL COMMENT '应聘理由',
  `jianlitoudi` varchar(200) NOT NULL COMMENT '简历投递',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611890903688 DEFAULT CHARSET=utf8 COMMENT='应聘信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yingpinxinxi`
--

LOCK TABLES `yingpinxinxi` WRITE;
/*!40000 ALTER TABLE `yingpinxinxi` DISABLE KEYS */;
INSERT INTO `yingpinxinxi` VALUES (51,'2021-01-29 03:15:03','名称1','招聘岗位1','工资1','应聘理由1','','2021-01-29','用户名1','姓名1','手机1','是',''),(52,'2021-01-29 03:15:03','名称2','招聘岗位2','工资2','应聘理由2','','2021-01-29','用户名2','姓名2','手机2','是',''),(53,'2021-01-29 03:15:03','名称3','招聘岗位3','工资3','应聘理由3','','2021-01-29','用户名3','姓名3','手机3','是',''),(54,'2021-01-29 03:15:03','名称4','招聘岗位4','工资4','应聘理由4','','2021-01-29','用户名4','姓名4','手机4','是',''),(55,'2021-01-29 03:15:03','名称5','招聘岗位5','工资5','应聘理由5','','2021-01-29','用户名5','姓名5','手机5','是',''),(56,'2021-01-29 03:15:03','名称6','招聘岗位6','工资6','应聘理由6','','2021-01-29','用户名6','姓名6','手机6','是',''),(1611890903687,'2021-01-29 03:28:23','图书馆人员招聘','前台添加员','3500','喜欢这个工作，简历以文件的形式上传','http://localhost:8080/ssm5b2ht/upload/1611890890968.doc','2021-01-07','1','李铭','15214121411','是','明天来面试');
/*!40000 ALTER TABLE `yingpinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1611890826142 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-01-29 03:15:03','001','001','姓名1','男','http://localhost:8080/ssm5b2ht/upload/yonghu_touxiang1.jpg','440300199101010001','13823888881'),(12,'2021-01-29 03:15:03','用户2','123456','姓名2','男','http://localhost:8080/ssm5b2ht/upload/yonghu_touxiang2.jpg','440300199202020002','13823888882'),(13,'2021-01-29 03:15:03','用户3','123456','姓名3','男','http://localhost:8080/ssm5b2ht/upload/yonghu_touxiang3.jpg','440300199303030003','13823888883'),(14,'2021-01-29 03:15:03','用户4','123456','姓名4','男','http://localhost:8080/ssm5b2ht/upload/yonghu_touxiang4.jpg','440300199404040004','13823888884'),(15,'2021-01-29 03:15:03','用户5','123456','姓名5','男','http://localhost:8080/ssm5b2ht/upload/yonghu_touxiang5.jpg','440300199505050005','13823888885'),(16,'2021-01-29 03:15:03','用户6','123456','姓名6','男','http://localhost:8080/ssm5b2ht/upload/yonghu_touxiang6.jpg','440300199606060006','13823888886'),(1611890826141,'2021-01-29 03:27:06','1','1','李铭','男','http://localhost:8080/ssm5b2ht/upload/1611890842738.png','441214121144121412','15214121411');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhaopinxinxi`
--

DROP TABLE IF EXISTS `zhaopinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhaopinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `zhaopingangwei` varchar(200) NOT NULL COMMENT '招聘岗位',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhaopinrenshu` varchar(200) DEFAULT NULL COMMENT '招聘人数',
  `gongzi` varchar(200) DEFAULT NULL COMMENT '工资',
  `zhaopinyaoqiu` longtext COMMENT '招聘要求',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='招聘信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhaopinxinxi`
--

LOCK TABLES `zhaopinxinxi` WRITE;
/*!40000 ALTER TABLE `zhaopinxinxi` DISABLE KEYS */;
INSERT INTO `zhaopinxinxi` VALUES (41,'2021-01-29 03:15:03','图书馆人员招聘','前台添加员','http://localhost:8080/ssm5b2ht/upload/zhaopinxinxi_tupian1.jpg','20','3500','招聘要求1需要什么什么养的','2021-01-12 12:15:03'),(42,'2021-01-29 03:15:03','名称2','招聘岗位2','http://localhost:8080/ssm5b2ht/upload/zhaopinxinxi_tupian2.jpg','招聘人数2','工资2','招聘要求2','2021-01-29 11:15:03'),(43,'2021-01-29 03:15:03','名称3','招聘岗位3','http://localhost:8080/ssm5b2ht/upload/zhaopinxinxi_tupian3.jpg','招聘人数3','工资3','招聘要求3','2021-01-29 11:15:03'),(44,'2021-01-29 03:15:03','名称4','招聘岗位4','http://localhost:8080/ssm5b2ht/upload/zhaopinxinxi_tupian4.jpg','招聘人数4','工资4','招聘要求4','2021-01-29 11:15:03'),(45,'2021-01-29 03:15:03','名称5','招聘岗位5','http://localhost:8080/ssm5b2ht/upload/zhaopinxinxi_tupian5.jpg','招聘人数5','工资5','招聘要求5','2021-01-29 11:15:03'),(46,'2021-01-29 03:15:03','名称6','招聘岗位6','http://localhost:8080/ssm5b2ht/upload/zhaopinxinxi_tupian6.jpg','招聘人数6','工资6','招聘要求6','2021-01-29 11:15:03');
/*!40000 ALTER TABLE `zhaopinxinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-30 10:29:32
