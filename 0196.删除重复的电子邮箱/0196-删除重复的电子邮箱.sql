# Write your MySQL query statement below
delete 
from Person
where Id not in 
(
    select *
    from
    (select min(Id) as Id
     from Person 
     group by Email
    ) as x
);