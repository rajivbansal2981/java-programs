package com.jmk.designpattern.factorymethod;

public class FactoryMethodPatternClientMain {
    public static void main(String[] args) {
        IngestionService ingestionService = new OnPremiseStoreService();
        IngestToDatabase ingestToDatabase = ingestionService.getInstanceOfSource("FILE");
        ingestToDatabase.ingestData();
       
        ingestionService = new CloudStoreService();
        IngestToDatabase cloudIngestionService = ingestionService.getInstanceOfSource("API");
        cloudIngestionService.ingestData();
    }
}
