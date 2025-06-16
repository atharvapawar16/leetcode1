# Write your MySQL query statement below
select machine_id , round(avg(a2-a1),3) as processing_time from(

    select machine_id ,process_id ,
    max(case When activity_type = "start" then timestamp End) as a1,
    max(case When activity_type = "end" then timestamp End) as a2 
    from activity group by machine_id , process_id 
) as processing_time group by machine_id ;