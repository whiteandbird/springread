package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * 读取bean定义信息即BeanDefinition的接口
 *
 * @author derekyi
 * @date 2020/11/26
 */
public interface BeanDefinitionReader {

	/**
	 * 获取beanDefinition注册机
	 * @return
	 */
	BeanDefinitionRegistry getRegistry();

	/**
	 * 获取类加载器
	 * @return
	 */
	ResourceLoader getResourceLoader();

	/**
	 * 加载bean定义信息
	 * @param resource
	 * @throws BeansException
	 */
	void loadBeanDefinitions(Resource resource) throws BeansException;

	void loadBeanDefinitions(String location) throws BeansException;

	void loadBeanDefinitions(String[] locations) throws BeansException;
}
