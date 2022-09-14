package biz.global77.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import biz.global77.model.Learner;

public interface LearnerRepo extends JpaRepository<Learner, Long> {

}
