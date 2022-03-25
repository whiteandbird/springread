package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

import java.util.Objects;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、bean属性、bean的scope等，此处简化只包含class类型和bean属性
 *
 * @author derekyi
 * @date 2020/11/22
 */
public class BeanDefinition {

	public static String SCOPE_SINGLETON = "singleton";

	public static String SCOPE_PROTOTYPE = "prototype";

	/**
	 * bean的类
	 */
	private Class beanClass;

	/**
	 * bean 的一系列属性
	 */
	private PropertyValues propertyValues;

	/**
	 * bean的初始化方法
	 */
	private String initMethodName;

	/**
	 * bean消亡时调用的方法
	 */
	private String destroyMethodName;

	/**
	 * bean默认为单例
	 */
	private String scope = SCOPE_SINGLETON;

	private boolean singleton = true;

	private boolean prototype = false;

	public BeanDefinition(Class beanClass) {
		this(beanClass, null);
	}

	public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
		this.beanClass = beanClass;
		this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
	}

	public void setScope(String scope) {
		this.scope = scope;
		this.singleton = SCOPE_SINGLETON.equals(scope);
		this.prototype = SCOPE_PROTOTYPE.equals(scope);
	}

	public boolean isSingleton() {
		return this.singleton;
	}

	public boolean isPrototype() {
		return this.prototype;
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}

	public String getInitMethodName() {
		return initMethodName;
	}

	public void setInitMethodName(String initMethodName) {
		this.initMethodName = initMethodName;
	}

	public String getDestroyMethodName() {
		return destroyMethodName;
	}

	public void setDestroyMethodName(String destroyMethodName) {
		this.destroyMethodName = destroyMethodName;
	}

	/**
	 * 重写equals
	 * @param o
	 * @return
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BeanDefinition that = (BeanDefinition) o;
		return beanClass.equals(that.beanClass);
	}

	@Override
	public int hashCode() {
		return Objects.hash(beanClass);
	}
}
