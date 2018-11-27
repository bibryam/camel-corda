package org.apache.camel.component.corda;

import net.corda.core.serialization.SerializationWhitelist;
import org.jetbrains.annotations.NotNull;
import sun.security.rsa.RSAPublicKeyImpl;
import sun.security.util.BitArray;
import sun.security.util.ObjectIdentifier;
import sun.security.x509.AlgorithmId;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class IntegrationWhiteList implements SerializationWhitelist {

    @NotNull
    @Override
    public List<Class<?>> getWhitelist() {
        List list = new ArrayList();
        list.add(RSAPublicKeyImpl.class);
        list.add(AlgorithmId.class);
        list.add(ObjectIdentifier.class);
        list.add(BitArray.class);
        list.add(BigInteger.class);
        return list;
    }
}
