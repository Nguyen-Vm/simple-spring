package org.springframework.bean;

/**
 * @author 阮威敏
 * <p>
 * 实践是校验真理的唯一标准
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息 " + name);
    }
}
