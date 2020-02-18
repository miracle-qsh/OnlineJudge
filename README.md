# OnlineJudge系统 1.0（SSM+Python）

* [简介](#1)
* [功能](#2)
* [原理](#3)
* [配置](#4)
* [使用](#5)
* [待办](#6)
* [声明](#7)

## <span id="1">简介</span>

​		本系统是旨在为 **ACM（ACM-ICPC 国际大学生程序设计竞赛）** 选手提供高质量、稳定练习平台的一款 **Java Web** 应用。本系统使用 **SSM框架（Spring + SpringMVC + Mybatis）** 完成前后端的交互，评测机部分为 **Python** 实现，运行环境为 **Windows** ，目前支持的编译语言为 **C++**。

## <span id="2">功能</span>

​		用户可以通过本系统浏览本系统的题库（编程题、算法题），查看相关题目描述，提交自己的代码，本系统会自动评测用户代码的正确性并反馈给用户。

​		管理员可以在本系统添加题目，创建比赛等。

## <span id="3">原理</span>

​		本系统评测机的实现原理为：用户通过前端页面发送自己的代码至后台（SSM），后台将用户代码保存至本地（.cpp），之后调用 cmd 命令启动评测程序（Python），评测程序会调用 cmd 命令（g++）编译用户的代码并生成可执行文件（.exe），之后执行可执行文件，获取用户程序的输出，运行时间及占用内存（pustil 模块），与标准答案进行比对，并将结果反馈给前端

## <span id="4">配置</span>

使用本系统前，请确保您的 **Windows** 系统已安装：

* Python 3.x
* JDK 1.8
* Tomcat 9
* Eclipse

### 导入数据库

将目录下 **noj_database.sql** 文件导入MySQL数据库

### 导入WebServer

打开 Eclipse，将 **WebServer** 文件夹导入

### 修改 JudgeServer 路径

找到 **com.newoj.controller** 包中 **JudgeController.java** 文件

修改 codeexe、run、exe、pathname 变量的路径为 **JudgerServer** 目录下相应文件 

### 部署至 Tomcat

完成后，将项目部署至 Tomcat 即可运行

## <span id="5">使用</span>

### 管理员权限

登录 admin 账号即可执行管理员权限，密码为 123456

#### 题目管理（增删改查）

![img](https://i.loli.net/2020/02/17/jyQGzDSX21UumPh.png)

#### 比赛管理（增删改查）

![img](https://i.loli.net/2020/02/17/5FxqTLGwU9RW6Sm.png)

### 用户权限

#### 查看题库

![img](https://i.loli.net/2020/02/17/fxjkCnH4oIeLuc9.png)

#### 参与比赛

![img](https://i.loli.net/2020/02/17/pQFEA5ic8Hnu7Ul.png)

#### 题目提交

![img](https://i.loli.net/2020/02/17/SX5PQW1LOMkzTxV.png)

![img](https://i.loli.net/2020/02/17/oxZjGXUFeERNAgy.png)

#### 排名系统

![img](https://i.loli.net/2020/02/17/E8TUH6YinmV2b3p.png)

## <span id="6">待办</span>

目前本系统（学校期末实训项目）还存在一些问题，有待完善：

- [ ] 评测程序的同步问题（生产者-消费者模式）
- [ ] 管理员创建比赛时添加题目上限问题（最多 8 个，可通过优化前端实现）
- [ ] 更多功能的加入（错题记录、比赛密码、用户密码找回与修改等）

## 声明

本系统系编者在校实训期间完成，欢迎大家 fork 交流学习，但请不要用于商业用途
