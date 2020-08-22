#查询所有的课程的名称以及对应的任课老师姓名
select course.cname,teacher.name
from course
inner join teacher
on teacher,id = course.tid;


#查询平均成绩大于80分的同学的姓名和平均成绩
select student.name t1.ag
from student
inner join (select score.sid,avg(score.num) as ag
                from score
                group by score.sid
                having avg(score.num) > 80
)as t1 on student.sid = t1.sid;

1.同学姓名sname   平均成绩-不存在的表
所以要用学生表和平均成绩表做一个内连接查询
左  学生姓名student   右  平均成绩t1


#查询没有报李平老师课的学生姓名
select sname
from student
where sid not in (
    select sid
    from score
    where course_id in (
        select distinct cid
        from teacher
        inner join course
        on teacher.tid = course.tid and teacher.tname = 'liping'
    )
)


#查询没有同时选修物理课程和体育课程的学生姓名
select sname
from student
where sid in (
    select sid
    from (
        (select *
        from score
        inner join course
        on score.cid = course.cid
        where course.name = 'wuli' or course.name = 'tiyu') as t1
    )
    group by sid
    having count(sid) = 1
);


#查询挂科超过两门(包括两门)的学生姓名和班级
select t2.caption,t2.sname
from ( (select *
    from class
    inner join
    student on student.sid = class.sid ) as t2 )
where sname in (
    select sname
    from student
    where sid in (
        select sid
        from score
        where num < 60
        group by sid
        having count(sid) >= 2
    )
)























