package org.sourcegraph.serviceregistry;

public class ServiceRegistry {
    public Service lookup(final String id) {
        return new Service(id, "Some-Service");
    }
}
