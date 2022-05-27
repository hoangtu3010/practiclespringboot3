package aptech.t2008m.practiclespringboot3.sevice;

import aptech.t2008m.practiclespringboot3.entity.Candidate;
import aptech.t2008m.practiclespringboot3.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }
}
