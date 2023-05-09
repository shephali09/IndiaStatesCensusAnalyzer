package com.bridgelabz.indianstatescensussanalyzer;

public class CensusAnalyzerException extends Exception{




    enum ExceptionType {
        CENSUS_FILE_PROBLEM
    }

    ExceptionType type;

    public CensusAnalyzerException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CensusAnalyzerException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
