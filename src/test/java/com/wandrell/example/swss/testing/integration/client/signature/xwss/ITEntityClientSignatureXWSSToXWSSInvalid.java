/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.wandrell.example.swss.testing.integration.client.signature.xwss;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.wandrell.example.swss.testing.util.config.ClientXWSSContextConfig;
import com.wandrell.example.swss.testing.util.config.WSPropertiesConfig;
import com.wandrell.example.swss.testing.util.test.client.AbstractITEntityClientInvalid;

/**
 * Implementation of {@code AbstractITEntityClientInvalid} for a password
 * protected web service using XWSS for both the client and the web service.
 *
 * @author Bernardo Martínez Garrido
 */
@ContextConfiguration(locations = { ClientXWSSContextConfig.SIGNATURE })
@TestPropertySource({ "classpath:context/keystore/keystore2.properties",
        WSPropertiesConfig.SIGNATURE_XWSS })
public final class ITEntityClientSignatureXWSSToXWSSInvalid extends
        AbstractITEntityClientInvalid {

    /**
     * Default constructor.
     */
    public ITEntityClientSignatureXWSSToXWSSInvalid() {
        super();
    }

}
