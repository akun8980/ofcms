## OFCMS
#### 项目介绍
java 版CMS系统、基于java技术研发的内容管理系统、功能：栏目模板自定义、内容模型自定义、多个站点管理、在线模板页面编辑等功能、代码完全开源、MIT授权协议。
 
技术选型：jfinal mybatis mysql  freemarker  redis spring 等 layui zTree bootstrap 。

特点：支持多站点、可以根据需求添加手机站、pc站。

模板采用：freemarker  标签会在官网发布。

项目地址：https://gitee.com/oufu/ofcms   QQ 群: ①185948055 <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=9c5f0bdc44402195be254668a80a6c5eeebb06f0336e8c5be26878930b88c672"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="OFCMS技术交流" title="OFCMS技术交流"></a> 

#### 项目团队

firechou ([https://gitee.com/firechou](https://gitee.com/firechou))
 
王雪峰 ([https://gitee.com/wangxfsh](https://gitee.com/wangxfsh))

大寶   ([https://gitee.com/zhouzhangl](https://gitee.com/zhouzhangl))
 
姚杰  ([https://gitee.com/yaojiecd](https://gitee.com/yaojiecd))

abpai ([https://gitee.com/abpai](https://gitee.com/abpai))

#### 软件功能

1. 用户管理：
2. 菜单管理：
3. 角色管理：
4. 字典管理：
5. 机构管理：
6. 操作日志：
7. 连接池监视：
8. 定时任务：
9. 代码生成：
9. 通知管理：
9. 微信管理：
9. 模板管理：
9. 栏目管理：
9. 文章管理：

 

#### 使用说明

1. 配置文件 resource/conf/admin.properties
2. 微信配置文件 resource/conf/weixin.properties
3. shior 文件 resource/shior.ini
4. 缓存 resource/ehcache.xml
5. 后台账号 http://localhost:8080/ofcms-admin/admin admin 密码 123456
6. 目前功能未全部完成，后续进行版本升级补充。

###  项目依赖


- ofcms-core 核心
- ofcms-model  数据源
- ofcms-front  模板
- 管理台
- ofcms-admin  -> ofcms-core
- ofcms-admin  -> ofcms-model
- ofcms-admin  -> ofcms-front

###  部署说明

1. 建议采用 idea 工具开发
2. mysql 5.6+
3. jdk 1.8
4. tomcat 8


#### 前台展示：
![输入图片说明](https://images.gitee.com/uploads/images/2018/0715/184501_f670e294_634828.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2018/0715/184517_cb09dff3_634828.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2018/0715/184524_0b210b8f_634828.png "屏幕截图.png")

#### 后台展示：
![输入图片说明](https://images.gitee.com/uploads/images/2018/0715/184544_31b52ef7_634828.png "屏幕截图.png")

![输入图片说明](https://images.gitee.com/uploads/images/2018/0715/184549_502a3d43_634828.png "屏幕截图.png")

![输入图片说明](https://images.gitee.com/uploads/images/2018/0715/184626_9f85d46f_634828.png "屏幕截图.png")
#### 技术交流
官 网: [https://gitee.com/oufu](https://gitee.com/oufu)   QQ 群:  ①185948055 <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=9c5f0bdc44402195be254668a80a6c5eeebb06f0336e8c5be26878930b88c672"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="OFCMS技术交流" title="OFCMS技术交流"></a> 

博 客 [https://blog.csdn.net/oufua](https://blog.csdn.net/oufua)  

#### 相关文档
IDEA 部署手册：[ https://blog.csdn.net/oufua/article/details/81210008](https://blog.csdn.net/oufua/article/details/81210008)

项目发展离不开你的支持：

![捐赠](https://images.gitee.com/uploads/images/2018/0727/110232_49d5dc17_634828.png "项目成长离不开你的支持")