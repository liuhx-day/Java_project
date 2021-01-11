## 20200111
mysql安装目录：
1. bin文件夹：放置可执行文件。
2. data文件夹：存放日志及db.
3. include文件夹：存放头文件,mysql.h
4. lib文件夹：存放数据文件。
5. share文件夹：存放字符集。
6. my.ini 配置文件。

范式：
1. 第一范式：无重复列，每个属性不可再分。
2. 第二范式：1NF+非主属性部分完全依赖于主关键字。
3. 第三范式：2NF+每个非主属性都不传递依赖于主属性。  
4. BCNF  
完全依赖 A+B服务于C  
注意级联问题！

mysql数据库的组成：  
扩展名.frm  
存储引擎MyISAM .myd .myi    
InnoDB .ibd 日志  ib_logfile

CRUD语法：  
```mysql
#表重命名(两种方法):
rename table 旧表名 to 新表名;
alter table 旧表名 rename to 新表名;
#修改表字段的数据类型:  
alter table 表名 modify 字段名 新数据类型;
#修改字段名:  
alter table 表名 change 旧字段名 新字段名 新数据类型;
#修改字段的排序:把字段1 置于 字段2后
alter table 表名 modify 字段名1 数据类型 after 字段名2;
#将字段置于首位
alter table 表名 modify 字段名 数据类型 first;
#新增字段
alter table 表名 add 字段名 数据类型;
#删除字段
alter table 表名 drop 字段名;
#修改表的存储引擎
alter table 表名 engine = 新存储引擎名字;
#复制表
create table 新表 select语句 from origin表;
create table 新表 select语句 like origin表;
#复制表 同时新增字段
create table user
(
    uStatus tinyint default 1 comment '账号当前状态'
) comment '用户信息表-复制' select * from users[origin表];
#只复制表结构
create table 新表 select语句 from origin表 where=false;
#部分字段复制(带数据)
create table 新表 as(select语句，只要部分字段);
```

主键：
```mysql
#复合主键 要写在最后，括号内
primary key(主键1,主键2)
```

约束：
```mysql
default 默认值约束 
unique 唯一值约束
not null 非空约束
constraint 外键名 foreign key 外键字段名 reference 主表名(主表主键名)
#先从当前表把你要作为外键的字段建好，再去引用
```

插入：
```mysql
insert
replace
```