package com.example.jdbctest;

import com.example.jdbctest.bean.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@SpringBootApplication
public class JdbctestApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final Logger logger = LoggerFactory.getLogger(JdbctestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JdbctestApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		logger.info("creating table");
		jdbcTemplate.execute("drop table if exists test_db.customers");
		jdbcTemplate.execute("create table customers (" +
				"id bigint auto_increment," +
				"first_name VARCHAR (255)," +
				"last_name VARCHAR (255)," +
				"CONSTRAINT pk_customers PRIMARY KEY (id))");
		logger.info("insert into data");
		List<Object[]> splitUpName = Arrays.asList("Zhang San", "Li Si", "Wang Wu").stream()
				.map(name->name.split(" "))
				.collect(Collectors.toList());
		jdbcTemplate.batchUpdate("insert into customers (first_name, last_name) VALUES (?, ?)", splitUpName);
		logger.info("query data where first_name =Zhang");
		jdbcTemplate.query("select id , first_name , last_name " +
				"from customers " +
				"where first_name=?", new Object[]{"Zhang"},
				(rs, rowNum)->new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name")))
				.forEach(customer -> logger.info(customer.toString()));
	}


}
