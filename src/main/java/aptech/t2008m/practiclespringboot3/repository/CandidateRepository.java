package aptech.t2008m.practiclespringboot3.repository;

import aptech.t2008m.practiclespringboot3.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
