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
        
    private String taskname;
    private String discription;
    private String status;
    // private Long assign_member_id;
    private Long createdUserId;
    // private String assigned_date;
    private String estimatedHours;
    // private String end_date;
    // private String start_date;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updatedDate;
    
    
}
