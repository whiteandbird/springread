package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;

/**
 * InstantiationAwareBeanpostProcessor是个特殊的postProcessor  大部分的执行时机是在填充属性之后  而这个却在bean实例化前后
 * 在BeanPostProcessor基础上增加了俩个接口 实现了在实例化前后进行操作的功能
 * @author derekyi
 * @date 2020/12/6
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

	/**
	 * 在bean实例化之前执行 实例化之前而不是初始化之前
	 *
	 * @param beanClass
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

	/**
	 * bean实例化之后，设置属性之前执行
	 *
	 * @param bean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException;

	/**
	 * bean实例化之后，设置属性之前执行
	 *
	 * @param pvs
	 * @param bean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName)
			throws BeansException;

	/**
	 * 提前暴露bean
	 *
	 * @param bean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	default Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
