package org.springframework.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;

/**
 * 实现该接口，能感知所属ApplicationContext
 *
 * @author derekyi
 * @date 2020/12/1
 */
public interface ApplicationContextAware extends Aware {

	/**
	 * 注入context类型的
	 * @param applicationContext
	 * @throws BeansException
	 */
	void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
