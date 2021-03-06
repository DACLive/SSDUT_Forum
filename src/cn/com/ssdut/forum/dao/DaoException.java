
package cn.com.ssdut.forum.dao;

import cn.com.ssdut.forum.exception.*;

/**
 * 数据库访问层异常
 * 
 */
public class DaoException extends BaseRuntimeException {

	private static final long serialVersionUID = -4366199523154339206L;

	/**
	 * 实例化一个数据库访问异常
	 * @param msg 异常消息
	 */
	public DaoException(String msg) {
		super(msg);
	}
	
	/**
	 * 实例化一个数据库访问异常
	 * @param cause 异常
	 */
	public DaoException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 实例化一个数据库访问异常
	 * @param msg 异常消息
	 * @param cause 异常
	 */
	public DaoException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
