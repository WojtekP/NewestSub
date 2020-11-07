package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage {

    @Override
    public BigDecimal getSandBeandsQuantity() {
        BigDecimal sandQuantity = new BigDecimal("98765432101234567890");
        return sandQuantity;
    }
}