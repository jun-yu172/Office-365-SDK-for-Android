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



/**
 * The type Directory Role Template.
*/
public class DirectoryRoleTemplate extends DirectoryObject {

    public DirectoryRoleTemplate(){
        setODataType("#Microsoft.Graph.DirectoryRoleTemplate");
    }
            
    private String description;
     
    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getDescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setDescription(String value) { 
        this.description = value; 
        valueChanged("description", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
}

