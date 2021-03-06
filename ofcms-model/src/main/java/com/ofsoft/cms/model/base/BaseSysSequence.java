package com.ofsoft.cms.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysSequence<M extends BaseSysSequence<M>> extends Model<M> implements IBean {

	public M setName(String name) {
		set("name", name);
		return (M)this;
	}

	public String getName() {
		return getStr("name");
	}

	public M setStartValue(Integer startValue) {
		set("start_value", startValue);
		return (M)this;
	}

	public Integer getStartValue() {
		return getInt("start_value");
	}

	public M setMaxValue(Integer maxValue) {
		set("max_value", maxValue);
		return (M)this;
	}

	public Integer getMaxValue() {
		return getInt("max_value");
	}

	public M setCurrentValue(Integer currentValue) {
		set("current_value", currentValue);
		return (M)this;
	}

	public Integer getCurrentValue() {
		return getInt("current_value");
	}

	public M setIncrement(Integer increment) {
		set("increment", increment);
		return (M)this;
	}

	public Integer getIncrement() {
		return getInt("increment");
	}

}
