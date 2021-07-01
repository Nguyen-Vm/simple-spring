package org.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author 阮威敏
 * @since 01.07.2021
 */
public class UserDao {

    private static Map<String, String> hashMao = new HashMap<>();

    static {
        hashMao.put("GSZN11374", "25");
    }

    public String queryUserInfo(String userId) {
        return hashMao.get(userId);
    }
}
