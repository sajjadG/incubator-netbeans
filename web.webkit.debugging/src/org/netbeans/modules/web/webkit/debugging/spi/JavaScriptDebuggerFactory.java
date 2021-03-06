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
package org.netbeans.modules.web.webkit.debugging.spi;

import org.netbeans.api.debugger.Session;
import org.netbeans.modules.web.webkit.debugging.api.WebKitDebugging;
import org.openide.util.Lookup;

/**
 * Factory for creating NetBeans UI for WebKit javascript debugging.
 */
public interface JavaScriptDebuggerFactory {
    
    /**
     * Create and start new JavaScript debugging session using given WebKit
     * Debugging protocol.
     * @param projectContext lookup which may contain Project instance if
     *   JavaScript Debugger session is started in the context of a project
     */
    Session createDebuggingSession(WebKitDebugging webkit, Lookup projectContext);

    /**
     * Stop session previously started by this factory.
     * @param session 
     */
    void stopDebuggingSession(Session session);
    
}
