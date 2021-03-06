/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.core.windows.nativeaccess;

import org.netbeans.junit.NbTestCase;

/**
 *
 * @author S. Aubrecht
 */
public class NoNativeAccessWindowSystemTest extends NbTestCase {
    
    public NoNativeAccessWindowSystemTest(String testName) {
        super(testName);
    }            

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testIsWindowAlphaSupported() {
        NoNativeAccessWindowSystem nws = new NoNativeAccessWindowSystem();
        assertFalse( "we don't support native access", nws.isWindowAlphaSupported() );
    }
}
