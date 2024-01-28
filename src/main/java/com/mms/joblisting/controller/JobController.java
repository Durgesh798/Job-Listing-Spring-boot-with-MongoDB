package com.mms.joblisting.controller;

import com.mms.joblisting.model.JobPost;
import com.mms.joblisting.repository.JobPostRepositrory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobPostRepositrory repo;

    @GetMapping("/jobs")
    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    @PostMapping("/")
    public JobPost addJob(@RequestBody JobPost jobPost){
        return  repo.save(jobPost);

    }
}
