package com.daniel.abstractconceptquiz;

import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {
    public static final Pattern PATTERN = Pattern.compile("^[0-9]*$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String clean(String input) {
        return input;
    }

}


