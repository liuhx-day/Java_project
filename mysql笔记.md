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
alter table 表名 add constraint 外键名 foreign key 外键字段名 reference 主表名(主表主键名)
#先从当前表把你要作为外键的字段建好，再去引用
```

插入：
```mysql
insert
replace
```

## 20210112

删除：
```mysql
truncate 无条件删记录
delete 会存log中
注意区分 auto_inc
```
课堂作业1 9:00
```mysql
#用户信息表中的注册时间默认为系统当前时间
alter table users modify uCreatetime datetime default now() comment '注册时间';
#用户信息表中的账号当前状态默认值为1
alter table users add status int default 1 not null comment '账号当前状态';
#为用户信息表中 uName字段添加唯一值约束。
alter table users modify uName varchar(30) unique comment '姓名';
#向用户信息中添加priId字段。
alter table users add priId int not null comment '权限Id';
#将刚刚添加的字段作为外键。
alter table users add constraint
    fk_users_privilege
    foreign key(priId)
        references privilege(pId)
        on delete cascade on update cascade;
#向权限表录入数据。
insert into privilege(pId, pName) values
                              (1,'管理员'),
                              (2,'会员');
#修改表&字段的编码。
alter table privilege character set gb2312;
alter table privilege modify pName varchar(10) character set gb2312;
#向用户信息表录入数据。
insert into users(uname, upwd, priid)values
                              ('o3o','pwd',1),
                              ('oxo','pwd',2);
#更新用户信息表中uID为1用户的密码。
update users set uPwd='***' where uID=1;
#删除用户信息表中uName为oxo的用户信息。
delete from users where uName='oxo';
#开启级联后 无论主表的外键字段是否可为空，删除外键表中的数据的同时都会会删除主表相关数据。
#所以级联要慎重！
delete from privilege where pId=2;
select * from users;
#mysql 密码密文显示
update users set uPwd=password('1123456') where uID=1;
#修改密码字段，密文不够存
alter table users modify uPwd varchar(255) comment '密码';
```
正则：

连接：
```mysql
#右外连接
select pName as 权限
from users right outer join privilege p
    on p.pId = users.priId
group by p.pId;
#左外连接
select *
from users left outer join privilege p
    on p.pId = users.priId
order by uID desc ;
#全连接
select *
from users s right join privilege p on p.pId = s.priId
union
select *
from users s left join privilege p2 on p2.pId = s.priId;
```
## 20210113
索引
```mysql
# 创建全文索引
create fulltext index IX_fullXOrd on orderdetail(dEvalution);
# 显示索引
show create table goodstype
```
<font color='red'>唯一约束和唯一索引的区别：  
唯一约束是在表的结构上，唯一约束是在表的查询优化上。
创建唯一约束自动创建唯一索引，删除唯一约束时同时删除同时创建的索引。  
唯一约束可以被引用为外键。约束不行。
</font>

视图
```mysql
# 创建视图
create view 视图名
as
select statement
[with [cascaded | local]check option];
# 查询视图
select * from 视图名;
```

## 2020114 
课堂练习
```mysql
# 1.查询与用户“常昊萍”在同一城市的用户uName,uSex,uPhone和购物车中的gdName及scNum
select uName,uSex,uPhone,gdName,scNum 
from users left join shoppingcars as s
    on users.uID=s.uID
where uCity in (select uCity from users where uName='常昊萍');

# 2.在GoodType表中，为tName列创建名为IX_tName的普通索引
create index IX_tName on GoodType(tName);

# 3.在orderdetail表的dEvaluation列上创建IX_fullIXOrd的全文索引
create fulltext index IX_fullIXOrd on orderdetail(dEvaluation);
```

问题：  
1. 在mysql中，索引类型有哪些？  
普通索引  
   唯一索引  
   主键索引  
   组合索引  
   全文索引  
   空间索引
   
2. 索引建立的原则？  
3. 使用命令创建索引有几种方法？  
4. 使用命令如何修改索引？  

视图
```mysql
# 1.创建view_users的视图，用来描述会员的基本信息，包括会员的姓名、密码、性别、出生日期和电话号码。
create view view_users
as
select uName as 姓名,uPwd as 密码,uSex as 性别,uBirthdate as 出生日期,uPhone as 电话号码
from users
with check option; # 用于检查select statement 中的一些限制
# 默认 cascaded 检查所有视图
# local 只检查要更新的视图本身 
# 限制举例
create view v_limit
as
    select * from users where uName like 'M%'
with check option ;
# 此时执行更新语句向users表中更新姓名不以m开头就会报错。
# 2.使用视图
select * from view_users;
# 3.查看视图
describe 视图名;
show create view 视图名;
show table status like 视图名;
# 4.修改视图
create or replace view 视图名;
alter view 视图名;
# 5.删除视图
drop view if exists 视图名 [restrict | cascaded]
if exists 表示判断视图是否存在
restrict 表示不能级联删除
cascaded 表示级联删除
# 6.更新视图
update 视图名
set statement
# 7.通过更新视图向表内插入数据
insert 视图名
values()
```