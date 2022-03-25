package org.springframework.beans.factory.config;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.StringValueResolver;

/**
 * 可配置的bean工厂  给bean工厂加配置  供applyBeanPostProcessorsBeforeInitialization 这种执行
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

	/**
	 * 加入后置器

	 * @param beanPostProcessor
	 */
	void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

	/**
	 * 销毁单例bean
	 */
	void destroySingletons();

	/**
	 * 增加一个string value解析
	 * @param valueResolver
	 */
	void addEmbeddedValueResolver(StringValueResolver valueResolver);

	/**
	 * 字符解析
	 * @param value
	 * @return
	 */
	String resolveEmbeddedValue(String value);

	/**
	 * 设置类型转换器
	 * @param conversionService
	 */
	void setConversionService(ConversionService conversionService);

	ConversionService getConversionService();

}
