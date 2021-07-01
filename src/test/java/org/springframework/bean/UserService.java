package org.springframework.bean;

/**
 * @author 阮威敏
 * <p>
 * 实践是校验真理的唯一标准
 */
public class UserService {

    private String name;

    private Integer age;

    private String no;

    private UserDao userDao;

    public UserService(String name) {
        this.name = name;
    }

    public String queryUserInfo() {
        return userDao.queryUserInfo(no);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
