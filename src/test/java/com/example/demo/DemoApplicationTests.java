package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoApplicationTests {

    @Test
    void contextLoads() {
        String greeting = "Hello, World!";
        assertThat(greeting).isEqualTo("Hello, World!");
    }
}
