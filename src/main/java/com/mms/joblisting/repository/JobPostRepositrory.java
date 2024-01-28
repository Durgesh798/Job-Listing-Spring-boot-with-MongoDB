package com.mms.joblisting.repository;

import com.mms.joblisting.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepositrory extends MongoRepository<JobPost,String> {
}
