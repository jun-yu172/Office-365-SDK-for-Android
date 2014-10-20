/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.listservices;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * The Class SPList.
 */
public class SPList extends OfficeEntity {

	/**
	 * List from json.
	 * 
	 * @param json
	 *            the json
	 * @return the list
	 */
	public static List<SPList> listFromJson(JsonObject json)  {
		return listFromJson(json, SPList.class);
	}

	/**
	 * Instantiates a new SP list.
	 * 
	 */
	public SPList() {
		super();
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public String getId() {
		return getData("Id").toString();
	}

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return getData("Title").toString();
	}

	/**
	 * Gets the list item entity type full name.
	 * 
	 * @return the list item entity type full name
	 */
	public String getListItemEntityTypeFullName() {
		return getData("ListItemEntityTypeFullName").toString();
	}
}
