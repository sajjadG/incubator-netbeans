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
package org.netbeans.lib.lexer.inc;

import javax.swing.text.Document;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.junit.NbTestCase;
import org.netbeans.lib.lexer.test.LexerTestUtilities;
import org.netbeans.lib.lexer.test.ModificationTextDocument;
import org.netbeans.lib.lexer.lang.TestJavadocTokenId;
import org.netbeans.lib.lexer.lang.TestTokenId;

/**
 *
 * @author Jan Lahoda
 */
public class SnapshotTokenListTest extends NbTestCase {
    
    public SnapshotTokenListTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    public void testInputAttributes() throws Exception {
        Document d = new ModificationTextDocument();
        
        d.putProperty(Language.class,TestTokenId.language());
        
        d.insertString(0, "ident ident /** @see X */", null);
        
//        TokenHierarchy<?> h = TokenHierarchy.get(d).createSnapshot();
//        TokenSequence<?> ts = h.tokenSequence();
//        
//        LexerTestUtilities.assertNextTokenEquals(ts,TestTokenId.IDENTIFIER, "ident");
//        assertEquals(0, ts.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(ts,TestTokenId.WHITESPACE, " ");
//        assertEquals(5, ts.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(ts,TestTokenId.IDENTIFIER, "ident");
//        assertEquals(6, ts.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(ts,TestTokenId.WHITESPACE, " ");
//        assertEquals(11, ts.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(ts,TestTokenId.JAVADOC_COMMENT, "/** @see X */");
//        assertEquals(12, ts.offset());
//        
//        TokenSequence<?> inner = ts.embedded();
//        
//        assertNotNull(inner);
//        
//        LexerTestUtilities.assertNextTokenEquals(inner,TestJavadocTokenId.OTHER_TEXT, " ");
//        assertEquals(15, inner.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(inner,TestJavadocTokenId.TAG, "@see");
//        assertEquals(16, inner.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(inner,TestJavadocTokenId.OTHER_TEXT, " ");
//        assertEquals(20, inner.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(inner,TestJavadocTokenId.IDENT, "X");
//        assertEquals(21, inner.offset());
//        
//        LexerTestUtilities.assertNextTokenEquals(inner,TestJavadocTokenId.OTHER_TEXT, " ");
//        assertEquals(22, inner.offset());
    }
}
