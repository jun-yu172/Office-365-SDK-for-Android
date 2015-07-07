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
package com.microsoft.services.outlook;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Entity.
*/
public class Entity extends ODataBaseEntity {

    public Entity(){
        setODataType("#Microsoft.OutlookServices.Entity");
    }
            
    private String Id;
     
    /**
    * Gets the Id.
    *
    * @return the String
    */
    public String getId() {
        return this.Id; 
    }

    /**
    * Sets the Id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.Id = value; 
        valueChanged("Id", value);

    }
}

