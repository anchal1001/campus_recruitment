package com.example.campus_recruitment.response;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {
    String message;
    Boolean status;

    Data data;

    public LoginResponse() {
    }



    public LoginResponse(String message, Boolean status,Data data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}


