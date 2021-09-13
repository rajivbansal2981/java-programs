package com.jmk.designpattern.factorymethod;

public class SourceFromDataBase implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("read from other database and ingest");
    }
}
