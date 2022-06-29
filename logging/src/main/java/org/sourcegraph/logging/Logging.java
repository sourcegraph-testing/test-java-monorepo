package org.sourcegraph.logging;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Logging {
    public void log(final String message) {
        System.out.println(message);
    }
}
