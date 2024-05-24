package com.busanit501.springex.sample.SampleTests;

import com.busanit501.springex.sample.SampleDAO;
import com.busanit501.springex.sample.SampleService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SampleService sampleService;


    @Qualifier("event")
    @Autowired
    private SampleDAO sampleDAO;

    public SampleTests() throws SQLException {
    }

    @Test
    public void testService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testDAO() {
        log.info(sampleDAO);
        Assertions.assertNotNull(sampleDAO);
    }

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);
        connection.close();
    }

}
