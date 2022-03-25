package org.springframework.beans;

/**
 * bean属性信息
 *
 * @author derekyi
 * @date 2020/11/23
 */
public class PropertyValue {

	/**
	 * 属性的名字
	 */
	private final String name;

	/**
	 * 属性的值
	 */
	private final Object value;

	public PropertyValue(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}
}
