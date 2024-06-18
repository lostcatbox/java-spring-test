package com.example.javacodetest.transactional.service;

import com.example.javacodetest.transactional.exception.CustomException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(value = false)
public class ExampleServiceTest {
    @Autowired
    private ExampleService exampleService;

    @Test
    void 예외발생시_롤백하지않는_옵션_활성화(){
        Assertions.assertThrows(CustomException.class,()->exampleService.noRollbackForTransactionMethod());
    }
    @Test
    void 예외발생시_롤백_옵션_활성화(){
        Assertions.assertThrows(CustomException.class,()->exampleService.rollbackForTransactionMethod());
    }
}
