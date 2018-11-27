package org.apache.camel.component.corda;

import net.corda.core.flows.FlowLogic;

public class CamelFlow extends FlowLogic<String> {
    private String in;

    public CamelFlow(String in) {
        this.in = in;
    }

    @Override
    public String call() {
        return in + " world!";
    }
}
