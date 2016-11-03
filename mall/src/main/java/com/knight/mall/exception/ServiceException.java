package com.knight.mall.exception;

/**
 * service异常
 * @author Administrator
 *
 */
public class ServiceException extends Exception{
	
	
	private int code;
	
	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public ServiceException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}
