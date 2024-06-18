package com.example.javacodetest.transactional.repo;

import com.example.javacodetest.transactional.domain.entity.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<ExampleEntity,Integer> {
}
