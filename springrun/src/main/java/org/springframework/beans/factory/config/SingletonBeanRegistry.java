package org.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author derekyi
 * @date 2020/11/22
 */
public interface SingletonBeanRegistry {

	/**
	 * 获取单例实例 跟getBean有区别的
	 * @param beanName
	 * @return
	 */
	Object getSingleton(String beanName);

	/**
	 * 放入一个单例
	 * @param beanName
	 * @param singletonObject
	 */
	void addSingleton(String beanName, Object singletonObject);
}
