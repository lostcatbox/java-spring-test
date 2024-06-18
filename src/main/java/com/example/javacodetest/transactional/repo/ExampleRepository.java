package com.example.javacodetest.transactional.repo;

import com.example.javacodetest.transactional.domain.entity.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepository implements JpaRepository<ExampleEntity,Integer> {
}
