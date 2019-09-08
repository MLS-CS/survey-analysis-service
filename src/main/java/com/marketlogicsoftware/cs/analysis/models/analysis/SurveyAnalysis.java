package com.marketlogicsoftware.cs.analysis.models.analysis;

import java.util.Map;

public class SurveyAnalysis {
    private String surveyId;
    private Integer totalResponses;
    private Map<String, Map<String, Long>>  questionAnalysis;

    public SurveyAnalysis(String surveyId, Integer totalResponses, Map<String, Map<String, Long>> questionAnalysis) {
        this.surveyId = surveyId;
        this.totalResponses = totalResponses;
        this.questionAnalysis = questionAnalysis;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getTotalResponses() {
        return totalResponses;
    }

    public void setTotalResponses(Integer totalResponses) {
        this.totalResponses = totalResponses;
    }

    public Map<String, Map<String, Long>> getQuestionAnalysis() {
        return questionAnalysis;
    }

    public void setQuestionAnalysis(Map<String, Map<String, Long>> questionAnalysis) {
        this.questionAnalysis = questionAnalysis;
    }
}
