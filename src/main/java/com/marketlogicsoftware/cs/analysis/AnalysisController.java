package com.marketlogicsoftware.cs.analysis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("survey/analysis")
public class AnalysisController {
    @Autowired
    private AnalysisService analysisService;

    @GetMapping("/{id}")
    public ResponseEntity<?> retriveSurveyAnalysis(@PathVariable("id") String id) {
        return ResponseEntity.ok(analysisService.retrieveSurveyAnalysis(id));
    }

}
