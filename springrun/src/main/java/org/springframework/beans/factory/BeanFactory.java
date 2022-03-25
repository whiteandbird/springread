package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * bean容器
 * bean容器两大功能 ：
 * ！！1：获取bean
 * ！！2：判断bean是否存在于容器中
 * @author derekyi
 * @date 2020/11/22
 */
public interface BeanFactory {

	/**
	 * 获取bean
	 *
	 * @param name
	 * @return
	 * @throws BeansException bean不存在时
	 */
	Object getBean(String name) throws BeansException;

	/**
	 * 根据名称和类型查找bean
	 *
	 * @param name
	 * @param requiredType
	 * @param <T>
	 * @return
	 * @throws BeansException
	 */
	<T> T getBean(String name, Class<T> requiredType) throws BeansException;

	<T> T getBean(Class<T> requiredType) throws BeansException;

	boolean containsBean(String name);
}
