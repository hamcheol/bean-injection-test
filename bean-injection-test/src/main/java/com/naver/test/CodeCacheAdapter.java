package com.naver.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

public class CodeCacheAdapter extends AbstractCacheAdapter<CodeCache> implements ApplicationContextAware, InitializingBean {
	private ApplicationContext applicationContext;

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Bean(name = "codeCache")
	@Override
	public CodeCache createCacheImpl() throws Exception {
		return new CodeCache();
	}

}
