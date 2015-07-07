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
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Resource Access.
*/
public class ResourceAccess extends ODataBaseEntity {

    public ResourceAccess(){
        setODataType("#Microsoft.Graph.ResourceAccess");
    }

    private java.util.UUID id;

    /**
    * Gets the id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the java.util.UUID
    */
    public void setId(java.util.UUID value) { 
        this.id = value;
        valueChanged("id", value);

    }

    private String type;

    /**
    * Gets the type.
    *
    * @return the String
    */
    public String getType() {
        return this.type; 
    }

    /**
    * Sets the type.
    *
    * @param value the String
    */
    public void setType(String value) { 
        this.type = value;
        valueChanged("type", value);

    }
}
