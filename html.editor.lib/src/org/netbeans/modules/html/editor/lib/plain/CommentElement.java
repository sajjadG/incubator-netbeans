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
package org.netbeans.modules.html.editor.lib.plain;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.html.editor.lib.api.ProblemDescription;
import org.netbeans.modules.html.editor.lib.api.elements.Element;
import org.netbeans.modules.html.editor.lib.api.elements.ElementType;
import org.netbeans.modules.html.editor.lib.api.elements.Node;

/**
 *
 * @author marekfukala
 */
public class CommentElement implements Element {

    private CharSequence source;
    private int offset;
    private int length;
    
    public CommentElement(CharSequence doc, int offset, int length) {
        this.source = doc;
        this.offset = offset;
        this.length = length;
    }
    
    @Override
    public int from() {
        return offset;
    }

    @Override
    public int to() {
        return offset + length;
    }
    @Override
    public CharSequence image() {
        return source.subSequence(from(), to());
    }

    @Override
    public CharSequence id() {
        return type().name();
    }

    @Override
    public Collection<ProblemDescription> problems() {
        return Collections.emptyList();
    }

    @Override
    public Node parent() {
        return null;
    }

    @Override
    public ElementType type() {
        return ElementType.COMMENT;
    }
    
}
