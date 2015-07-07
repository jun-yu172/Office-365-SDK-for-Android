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
 * The type Provisioning Error.
*/
public class ProvisioningError extends ODataBaseEntity {

    public ProvisioningError(){
        setODataType("#Microsoft.Graph.ProvisioningError");
    }

    private String errorDetail;

    /**
    * Gets the error Detail.
    *
    * @return the String
    */
    public String getErrorDetail() {
        return this.errorDetail; 
    }

    /**
    * Sets the error Detail.
    *
    * @param value the String
    */
    public void setErrorDetail(String value) { 
        this.errorDetail = value;
        valueChanged("errorDetail", value);

    }

    private Boolean resolved;

    /**
    * Gets the resolved.
    *
    * @return the Boolean
    */
    public Boolean getResolved() {
        return this.resolved; 
    }

    /**
    * Sets the resolved.
    *
    * @param value the Boolean
    */
    public void setResolved(Boolean value) { 
        this.resolved = value;
        valueChanged("resolved", value);

    }

    private String service;

    /**
    * Gets the service.
    *
    * @return the String
    */
    public String getService() {
        return this.service; 
    }

    /**
    * Sets the service.
    *
    * @param value the String
    */
    public void setService(String value) { 
        this.service = value;
        valueChanged("service", value);

    }

    private java.util.Calendar timestamp;

    /**
    * Gets the timestamp.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getTimestamp() {
        return this.timestamp; 
    }

    /**
    * Sets the timestamp.
    *
    * @param value the java.util.Calendar
    */
    public void setTimestamp(java.util.Calendar value) { 
        this.timestamp = value;
        valueChanged("timestamp", value);

    }
}
