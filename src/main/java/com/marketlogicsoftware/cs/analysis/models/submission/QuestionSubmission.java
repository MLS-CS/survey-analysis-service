package com.marketlogicsoftware.cs.analysis.models.submission;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class QuestionSubmission {
    private String questionId;
    private String answerId;

    public QuestionSubmission(){}

    public QuestionSubmission(@NotNull String questionId, String answerId) {
        this.questionId = questionId;
        this.answerId = answerId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }
}
