package io.kuberocketci.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

/**
 * Integration tests for DemoApplication.
 * Uses JUnit 5 (Jupiter) as per Spring Boot 3.x standards.
 */
@SpringBootTest
@TestPropertySource(properties = {
    "spring.main.web-application-type=none",
    "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration"
})
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // This test verifies that the Spring application context loads successfully
    }

    @Test
    void main_shouldStartApplicationWithoutErrors() {
        // Test the main method directly to achieve full coverage
        // Using empty args array as would be done in production
        String[] args = {};
        DemoApplication.main(args);
        // If main method completes without exception, test passes
    }
}
