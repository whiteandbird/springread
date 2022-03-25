package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

/**
 * 有注入能力的bean工厂  ，丰富bean工厂的能力 能在bean前后做一些事情
 * @author derekyi
 * @date 2020/11/28
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

	/**
	 * 执行BeanPostProcessors的postProcessBeforeInitialization方法
	 *
	 * @param existingBean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)
			throws BeansException;

	/**
	 * 执行BeanPostProcessors的postProcessAfterInitialization方法
	 *
	 * @param existingBean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName)
			throws BeansException;
}
