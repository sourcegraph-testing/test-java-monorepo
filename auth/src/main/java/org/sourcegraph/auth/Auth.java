package org.sourcegraph.auth;

import org.sourcegraph.Record;
import org.sourcegraph.SourcegraphLookup;

public class Auth {
    private final SourcegraphLookup service;

    public Auth() {
        this.service = new SourcegraphLookup();
    }

    public boolean isAuthorized() {
        final Record record = service.getRecordById(1);
        return record.getName().equalsIgnoreCase("some name");
    }
}
