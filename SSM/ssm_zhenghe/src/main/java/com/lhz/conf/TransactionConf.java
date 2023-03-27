package com.lhz.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class TransactionConf {
    @Autowired
    DruidDataSource druidDataSource;
    @Bean
    public DataSourceTransactionManager getDatasoure(){

        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();

        dataSourceTransactionManager.setDataSource(druidDataSource);
        return dataSourceTransactionManager;


    }
}
