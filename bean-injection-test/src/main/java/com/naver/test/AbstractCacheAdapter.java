package com.naver.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public abstract class AbstractCacheAdapter<T> implements BeanFactoryPostProcessor, Ordered {
	public abstract T createCacheImpl() throws Exception;
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getOrder() {
		return 100;
	}
}
