package com.busanit501.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@RequiredArgsConstructor
@Service
public class SampleService {

    // 생성자를 활용한 주입방식
     @Autowired
     @Qualifier("event")
     private SampleDAO sampleDAO;

    // 주입받는데 final 설정하는 방식
    // @RequiredArgsConstructor, 세트로 같이 설정해야함
    // 디버깅 용의
//    private final SampleDAO sampleDAO;
}
