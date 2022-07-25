package com.beisbolicos.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = { "com.beisbolicos.demo.**.**" })
@ComponentScan(value = "com.beisbolicos.demo.**.**")
@EntityScan(basePackages = { "com.beisbolicos.demo.**.**" })
public class ApplicationConfiguration extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private String port;

    @Value("${spring.data.mongodb.database}")
    private String database;


    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(host + ":" + port+"/" + database); 
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }
}
