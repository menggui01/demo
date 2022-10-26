package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class DemoApplicationTests {
private DataSource dataSource;
	@Test
	void contextLoads() {
	}
	@Test
	void getConnection() throws SQLException {
		dataSource.getConnection();
		DigestUtils.md5DigestAsHex();
	}

}
