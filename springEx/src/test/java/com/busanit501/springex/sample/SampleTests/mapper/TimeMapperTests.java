package com.busanit501.springex.sample.SampleTests.mapper;

import com.busanit501.springex.mapper.TimeMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TimeMapperTests {
    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Test
    public void timeTest() {
        log.info("마이바티스 설정 확인 중, 매퍼 테스트:" + timeMapper.getTime());
    }

}
