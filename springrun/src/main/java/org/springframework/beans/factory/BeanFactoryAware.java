package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * 实现该接口，能感知所属BeanFactory
 * 给实现该接口的类设置BeanFactory
 * @author derekyi
 * @date 2020/12/1
 */
public interface BeanFactoryAware extends Aware {

	/**
	 * 给实现该类的注入bean工厂  在填充了属性之后会注入
	 * @param beanFactory
	 * @throws BeansException
	 */
	void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
