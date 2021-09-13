package com.jmk.designpattern.factorymethod;

public class SourceDataFromFile implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("reads from file and ingests data");
    }
}
