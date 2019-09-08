package com.marketlogicsoftware.cs.analysis;

import com.marketlogicsoftware.cs.analysis.models.submission.SurveySubmission;
import com.marketlogicsoftware.cs.analysis.models.submission.SurveySubmissionDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AnalysisRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<SurveySubmission> retrieve(String id) {
        return this
                .mongoTemplate
                .find(Query.query(Criteria.where("surveySubmission.surveyId").is(id)), SurveySubmissionDocument.class)
                .stream()
                .map(surveySubmissionDocument -> surveySubmissionDocument.getSurveySubmission())
                .collect(Collectors.toList());
    }

}
