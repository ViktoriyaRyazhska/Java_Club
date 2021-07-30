package com.team4.thebest.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
public class HibernateConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/travelagency"); //DB_CLOSE_DELAY=-1
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("");
//
//        return dataSource;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan(
//                "com.softserve.travelagency.model");
//        sessionFactory.setHibernateProperties(hibernateProperties());
//
//        return sessionFactory;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        HibernateTransactionManager transactionManager
//                = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(sessionFactory().getObject());
//        return transactionManager;
//    }
//
//
//    private Properties hibernateProperties() {
//        Properties hibernateProperties = new Properties();
//
//        hibernateProperties.setProperty(
//                "hibernate.hbm2ddl.auto", "update");
//        hibernateProperties.setProperty(
//                "hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        hibernateProperties.setProperty(
//                "hibernate.current_session_context_class", "thread");
//        hibernateProperties.setProperty("hibernate.show_sql", "true");
//        hibernateProperties.setProperty("hibernate.format_sql", "true");
//
//        return hibernateProperties;
//    }
}
