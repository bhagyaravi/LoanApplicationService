package com.example.loanapplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LoanApplicationServiceTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testProcessApplication() {
        LoanApplicationService service = new LoanApplicationService();
        String result = service.processApplication();
        assertThat(result).isEqualTo("Application processed");
    }
}