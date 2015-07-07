/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  OAuth2PermissionGrant
 .
 */
public class OAuth2PermissionGrantFetcher extends OrcEntityFetcher<OAuth2PermissionGrant,OAuth2PermissionGrantOperations> 
                                     implements Readable<OAuth2PermissionGrant> {

     /**
     * Instantiates a new OAuth2PermissionGrantFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public OAuth2PermissionGrantFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, OAuth2PermissionGrant.class, OAuth2PermissionGrantOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public OAuth2PermissionGrantFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public OAuth2PermissionGrantFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
}
