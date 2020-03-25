--
-- @lc app=leetcode.cn id=620 lang=mysql
--
-- [620] 有趣的电影
--

-- @lc code=start
# Write your MySQL query statement below
select id, movie, description, rating from cinema where description != 'boring' and id%2=1 order by rating DESC;
-- @lc code=end

