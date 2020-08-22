#聚集函数只能用于select子句或者group by中的having子句中

#连接查询

#1.等值与非等值连接
#查询每个学生及其选修课程的情况
select s.sno,sc.cno,c.cname
from s,sc,c
where sc.sno = s.sno and c.cno = sc.cno;


#2.自身连接
#查询每个学生的间接选修课
select sc.sno as 学号,c1.cname as 直接选修课,c2.cname as 间接选修课
from sc,c c1,c c2
where sc.cno = c1.cno and c1.cpno = c2.cno;


#3.外连接  内连接
#查询所有学生选修课程的情况
select s.sname,sc.cno
from s
left outer join
sc on s.sno = sc.sno

# join 需要左表和右表都有数据才返回
# left join 左表有数据的全部返回 右表数据可以为空
# right join 右表有数据的全部返回 左表数据可以为空
# full join 左表和右表中有一个有数据就返回



#嵌套查询(子查询)

#1.  in
#查询和boluo不在同一个系的学生
select sno,sname
from s
where sdept not in(
    select sdept
    from s
    where sname = 'boluo'
);


#查询选修了课程名是"信息系统"的学生学号和姓名
select s.sno,s.sname
from s,sc
where sc.sno = s.sno and sc.cno in (
    select cno
    from c
    where c.cname = 'CS'
);


#查询曾与刘晨一同上课的学生学号和姓名
select s.sno,s.sname
from s,sc
where s.sno = sc.sno and sc.cno in (
    select cno
    from s,sc
    where s.sno = sc.sno and s.sno in (
        select sno
        from s
        where s.name = '刘晨'
    )
)


#带有比较运算符的子查询(=  >=  <=  <>或!=)

#查询与王敏同学在同一个系的所有学生信息
select sno,sname
from s
where sdept = (
    select sdept
    from s
    where sname = 'boluo'
)


#查询每个学生超过该课程最低分的课程号
select cno
from sc a
where grade > (
    select min(grade)
    from sc b
    where a.cno = b.cno
);


#查询每个学生超过他选修课程平均分的课程号
select cno
from sc a
where grade > (
    select avg(grade)
    from sc b
    where a.cno = b.cno
)


#带有 any或all 的子查询
#查询其他系中比计算机系某一学生年龄小的学生姓名 性别 年龄和所在系
select sname,ssex,sage,sdept
from s
where sdept != 'CS' and sage < any (
    select min(age)
    from s
    where sdept = 'CS'
)

#exists
#查询所有选修了1号课程的学生姓名
select sname
from s
where exists (
    select *
    from sc
    where sc.cno = 1 and s.sno = sc.sno
)

#查询与刘晨在同一个系学习的学生
select sno
from s s1
where exists (
    select *
    from s s2
    where s1.sdept = s2.sdept and s2.sname = 'boluo'
)


#集合查询
#查询计算机系的学生及年龄不大于19岁的学生详细信息
select *
from s
where sdept = 'CS'
union
select *
from s
where sage <= 19















