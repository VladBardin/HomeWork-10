package Task2;

import java.io.Serializable;


public class User implements Serializable {

    private String name;
    private Integer age;

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

    public Integer getUserAge() {
        System.out.println(age);
        return age;
    }

    public void setUserAge(Integer userAge) {
        this.age = userAge;
    }
}
