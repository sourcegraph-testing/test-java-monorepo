package org.sourcegraph.client;

import org.sourcegraph.Record;
import org.sourcegraph.SourcegraphService;

public class Client {
    private final SourcegraphService service;

    public Client() {
        this.service = new SourcegraphService();
    }

    public boolean isAuthorized() {
        final Record record = service.getRecordById(1);
        return record.getName().equalsIgnoreCase("some name");
    }
}
