package com.jmk.designpattern.factorymethod;

public class CloudDataStoreFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("CLOUD: read from api and ingest");
    }
}
