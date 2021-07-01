package org.springframework.beans;

/**
 * @author 阮威敏
 * @since 01.07.2021
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
