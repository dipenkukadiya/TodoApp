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
@Getter
@Setter
public class AddUserRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updatedDate;
    
    
    
}
