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

package org.netbeans.modules.lexer.demo.handcoded.link;

import org.netbeans.api.lexer.Language;
import org.netbeans.spi.lexer.util.LexerTestDescription;

/**
 * Example of using the lexer framework.
 *
 * @author Miloslav Metelka
 * @version 1.00
 */

public class LinkTestDescription extends LexerTestDescription {

    public Language getLanguage() {
        return LinkLanguage.get();
    }

    public TestRound[] getTestRounds() {
        return new TestRound[] {
            new TestRound(10000, 0.6, 5, 0.4, 4),
            new TestRound(10000, 0.4, 1, 0.6, 3)
        };
    }
    
    public TestChar[] getTestChars() {
        return new TestChar[] {
            new TestChar('/', 0.5),
            new TestChar(':', 0.3),
            new TestChar('.', 0.1),
            new TestChar('#', 0.1),
            new TestChar(' ', 0.2),
            new TestChar('\n', 0.05)
        };
    }
    
    public TestString[] getTestStrings() {
        return new TestString[] {
            new TestString("http://", 0.05),
            new TestString("ftp://", 0.05),
            new TestString("ascheme://", 0.05),
            new TestString("://", 0.05)
        };
    }

    public TestCharInterval[] getTestCharIntervals() {
        return new TestCharInterval[] {
            new TestCharInterval('0', '9', 0.1),
            new TestCharInterval('a', 'z', 0.1)
        };
    }
    
    public int getDebugLevel() {
        return 0; // 3;
    }
    

}

