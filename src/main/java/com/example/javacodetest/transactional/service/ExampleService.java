package com.example.javacodetest.transactional.service;

import com.example.javacodetest.transactional.domain.entity.ExampleEntity;
import com.example.javacodetest.transactional.exception.CustomException;
import com.example.javacodetest.transactional.repo.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    // 트랜잭션이 없으면 새로운 트랜잭션을 시작하고, 있으면 참여
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredTransactionMethod() {
        // 비즈니스 로직
        exampleRepository.save(new ExampleEntity("data1"));
    }

    // 항상 새로운 트랜잭션을 시작
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewTransactionMethod() {
        // 비즈니스 로직
        exampleRepository.save(new ExampleEntity("data2"));
    }

    // 중첩된 트랜잭션을 시작
    @Transactional(propagation = Propagation.NESTED)
    public void nestedTransactionMethod() {
        // 비즈니스 로직
        exampleRepository.save(new ExampleEntity("data3"));
    }

    // 읽기 전용 트랜잭션
    @Transactional(readOnly = true)
    public ExampleEntity readOnlyTransactionMethod(Integer id) {
        // 비즈니스 로직
        return exampleRepository.findById(id).orElse(null);
    }

    // 트랜잭션 타임아웃 설정 (5초)
    @Transactional(timeout = 5)
    public void timeoutTransactionMethod() {
        // 비즈니스 로직
        exampleRepository.save(new ExampleEntity("data4"));
    }

    // 특정 예외 발생 시 롤백
    @Transactional(rollbackFor = CustomException.class)
    public void rollbackForTransactionMethod() throws CustomException {
        // 비즈니스 로직
        exampleRepository.save(new ExampleEntity("data5"));
        throw new CustomException("Rollback this transaction");
    }

    // 특정 예외 발생 시 롤백하지 않음
    @Transactional(noRollbackFor = CustomException.class)
    public void noRollbackForTransactionMethod() throws CustomException {
        // 비즈니스 로직
        exampleRepository.save(new ExampleEntity("data6"));
        throw new CustomException("Don't rollback this transaction");
    }
}
