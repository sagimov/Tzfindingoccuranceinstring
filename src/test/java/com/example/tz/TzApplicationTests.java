package com.example.tz;

import com.example.tz.service.SolutionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TzApplicationTests {
    @Autowired
    SolutionService solutionService;
    @Test
    void contextLoads() {
        System.out.println( solutionService.solve("aaa123adbvvdbaabcccc"));
    }

}
