package com.example.campus_recruitment.response;

public class Data {
    String username;
    int roleId;

    public Data() {
    }

    public Data(String username, int roleId) {
        this.username = username;
        this.roleId = roleId;
    }
//    public Data() {
//        this.username = username;
//        this.roleId = roleId;
//    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Data{" +
                "username='" + username + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
