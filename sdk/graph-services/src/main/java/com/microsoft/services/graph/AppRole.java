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
 * The type App Role.
*/
public class AppRole extends ODataBaseEntity {

    public AppRole(){
        setODataType("#Microsoft.Graph.AppRole");
    }

    private java.util.List<String> allowedMemberTypes;

    /**
    * Gets the allowed Member Types.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getAllowedMemberTypes() {
        return this.allowedMemberTypes; 
    }

    /**
    * Sets the allowed Member Types.
    *
    * @param value the java.util.List<String>
    */
    public void setAllowedMemberTypes(java.util.List<String> value) { 
        this.allowedMemberTypes = value;
        valueChanged("allowedMemberTypes", value);

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

    private Boolean isEnabled;

    /**
    * Gets the is Enabled.
    *
    * @return the Boolean
    */
    public Boolean getIsEnabled() {
        return this.isEnabled; 
    }

    /**
    * Sets the is Enabled.
    *
    * @param value the Boolean
    */
    public void setIsEnabled(Boolean value) { 
        this.isEnabled = value;
        valueChanged("isEnabled", value);

    }

    private String value;

    /**
    * Gets the value.
    *
    * @return the String
    */
    public String getValue() {
        return this.value; 
    }

    /**
    * Sets the value.
    *
    * @param value the String
    */
    public void setValue(String value) { 
        this.value = value;
        valueChanged("value", value);

    }
}
