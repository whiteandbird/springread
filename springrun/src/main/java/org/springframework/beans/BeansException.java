package org.springframework.beans;

/**
 * @author derekyi 异常类
 * @date 2020/11/22
 */
public class BeansException extends RuntimeException {

	public BeansException(String msg) {
		super(msg);
	}

	public BeansException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
