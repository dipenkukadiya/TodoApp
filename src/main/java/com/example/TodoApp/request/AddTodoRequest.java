package com.example.TodoApp.request;
import java.sql.Date;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AddTodoRequest {
        
    private String task_name;
    private String discription;
    private String status;
    // private Long assign_member_id;
    private Long created_user_id;
    // private String assigned_date;
    private String estimated_hours;
    // private String end_date;
    // private String start_date;
    @CreatedDate
    private Date created_date;
    @LastModifiedDate
    private Date updated_date;
    
    
}
