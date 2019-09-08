package com.marketlogicsoftware.cs.analysis;

import com.marketlogicsoftware.cs.analysis.models.analysis.SurveyAnalysis;
import com.marketlogicsoftware.cs.analysis.models.submission.QuestionSubmission;
import com.marketlogicsoftware.cs.analysis.models.submission.SurveySubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnalysisService {

    @Autowired
    private AnalysisRepository analysisRepository;

    public SurveyAnalysis retrieveSurveyAnalysis(String id) {
        List<SurveySubmission> surveySubmissions = analysisRepository.retrieve(id);

        Map<String, Map<String, Long>> questionAnalysis = surveySubmissions.stream()
                                                          .flatMap(surveySubmission -> surveySubmission.getQuestionSubmissions().stream())
                                                          .collect(Collectors.toList())
                                                          .stream()
                                                          .collect(Collectors.groupingBy(
                                                                  QuestionSubmission::getQuestionId
                                                                  , Collectors.groupingBy(
                                                                          QuestionSubmission::getAnswerId
                                                                          , Collectors.counting())));


        return new SurveyAnalysis(id, surveySubmissions.size(), questionAnalysis);
    }

}
