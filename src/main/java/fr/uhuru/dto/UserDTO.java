package fr.uhuru.dto;

public class UserDTO {

    private Integer userId;
    private String name;
    private String password;
    private String phone;
    private String email;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    } 

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO [userId = "+userId+", name = "+name+", password = "+password+", phone = "+phone+", email = "+email+ "]" ;
    }
     
}