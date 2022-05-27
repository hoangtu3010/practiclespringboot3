package aptech.t2008m.practiclespringboot3.controller;

import aptech.t2008m.practiclespringboot3.entity.Candidate;
import aptech.t2008m.practiclespringboot3.sevice.CandidateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/candidates")
public class CandidateController {
    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<Candidate>> findAll(){
        return ResponseEntity.ok(candidateService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    private ResponseEntity<Candidate> save(@RequestBody Candidate candidate){
        return ResponseEntity.status(HttpStatus.CREATED).body(candidateService.save(candidate));
    }
}
