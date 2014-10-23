/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.outlookservices.*;

/**
 * The type AttachmentCollectionOperations
 */
public class AttachmentCollectionOperations extends ODataOperations {

    /**
     * Instantiates a new AttachmentCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public AttachmentCollectionOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the file attachment collection operations
     */
	public AttachmentCollectionOperations addParameter(String name, Object value) {
		addCustomParameter(name, value);
		return this;
	}
}