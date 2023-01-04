# Write your MySQL query statement below
select Email from(
    select Email, count(Email) as counts
    from Person
    group by Email
) as Person2
where counts > 1;