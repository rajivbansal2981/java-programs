package com.jmk.designpattern.factorymethod;

public class SourceDataFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("read from API and ingest");
    }
}
