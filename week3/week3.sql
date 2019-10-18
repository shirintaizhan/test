-- Select All
select * from city;

-- Select By ID
select * from city where id = 1661;

-- Japanese Cities' Attributes
select * from city where countrycode = 'JPN';

-- Japanese Cities' Names
select name from city where countrycode = 'JPN';

-- Weather Observation Station 1
select city, state from station;

-- Weather Observation Station 3
select distinct city from station where (id % 2) = 0; 



-- Weather Observation Station 5
select city, char_length(city) from station where char_length(city) = (select min(char_length(city)) from station) order by city limit 1;

select city, char_length(city) from station where char_length(city) = (select max(char_length(city)) from station) order by city limit 1;

-- Weather Observation Station 7
select distinct city from station where city like '%a'
or city like '%e'
or city like '%i'
or city like '%o'
or city like '%u';

-- Higher Than 75 Marks
select name from students where marks > 75 order by right(name, 3), id asc;

-- Employee Names
select name from employee order by name asc;