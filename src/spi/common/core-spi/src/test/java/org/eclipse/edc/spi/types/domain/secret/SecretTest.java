/*
 *  Copyright (c) 2024 Amadeus
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Amadeus - Initial API and Implementation
 *
 */

package org.eclipse.edc.spi.types.domain.secret;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;

class SecretTest {
    
    @Test
    void verifyExceptionWhenValueMissing() {
        assertThatNullPointerException().isThrownBy(() -> Secret.Builder.newInstance().id("abcd123").build())
                .withMessage("'value' is missing");
    }
}