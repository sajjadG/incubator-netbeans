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
package org.netbeans.modules.xml.schema.model.impl;

import org.netbeans.modules.xml.schema.model.MinLength;
import org.netbeans.modules.xml.schema.model.SchemaComponent;
import org.netbeans.modules.xml.schema.model.visitor.SchemaVisitor;
import org.w3c.dom.Element;

/**
 * This implents interface represents the xs:minLength facet.
 * @author nn136682
 */
public class MinLengthImpl extends CommonLength implements MinLength {

    public MinLengthImpl(SchemaModelImpl model) {
        this(model, createNewComponent(SchemaElements.MIN_LENGTH, model));
    }
    
    /** Creates a new instance of MinLengthImpl */
    public MinLengthImpl(SchemaModelImpl model, Element e) {
        super(model, e);
    }

	/**
	 *
	 *
	 */
	public Class<? extends SchemaComponent> getComponentType() {
		return MinLength.class;
	}
    
    public String getComponentName() {
        return SchemaElements.MIN_LENGTH.getName();
    }
    
    public void accept(SchemaVisitor visitor) {
        visitor.visit(this);
    }
    
}
