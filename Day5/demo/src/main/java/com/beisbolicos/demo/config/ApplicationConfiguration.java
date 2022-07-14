package com.beisbolicos.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories
@ComponentScan("com.beisbolicos.*")
public class ApplicationConfiguration extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private String port;

    @Value("${spring.data.mongodb.database}")
    private String database;


    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(host + ":" + port); // Error
        // trying to connect to **localhost:27017** it should be of form 
        // **mongodb://localhost:27017/yourDB**

    }

    @Override
    protected String getDatabaseName() {
        return database;
    }
}
