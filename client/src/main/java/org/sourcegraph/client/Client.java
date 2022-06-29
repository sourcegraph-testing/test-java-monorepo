package org.sourcegraph.client;

import org.sourcegraph.Record;
import org.sourcegraph.SourcegraphLookup;

public class Client {
    private final SourcegraphLookup service;

    public Client() {
        this.service = new SourcegraphLookup();
    }

    public boolean isAuthorized() {
        final Record record = service.getRecordById(1);
        return record.getName().equalsIgnoreCase("some name");
    }
}
