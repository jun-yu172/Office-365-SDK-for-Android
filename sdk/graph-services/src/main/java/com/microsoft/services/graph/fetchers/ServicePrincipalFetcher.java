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
 * The type  ServicePrincipal
 .
 */
public class ServicePrincipalFetcher extends OrcEntityFetcher<ServicePrincipal,ServicePrincipalOperations> 
                                     implements Readable<ServicePrincipal> {

     /**
     * Instantiates a new ServicePrincipalFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ServicePrincipalFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, ServicePrincipal.class, ServicePrincipalOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ServicePrincipalFetcher addParameter(String name, Object value) {
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
    public ServicePrincipalFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

             /**
     * Gets approleassignedto.
     *
     * @return the app role assigned to
     */
    public AppRoleAssignmentFetcher getAppRoleAssignedTo() {
        return new AppRoleAssignmentFetcher("appRoleAssignedTo", this);
    }

     /**
     * Gets app role assignments.
     *
     * @return the app role assignments
     */
    public OrcCollectionFetcher<AppRoleAssignment, AppRoleAssignmentFetcher, AppRoleAssignmentCollectionOperations> getAppRoleAssignments() {
        return new OrcCollectionFetcher<AppRoleAssignment, AppRoleAssignmentFetcher, AppRoleAssignmentCollectionOperations>("appRoleAssignments", this, AppRoleAssignment.class, AppRoleAssignmentCollectionOperations.class);
    }

    /**
     * Gets app role assignment.
     *
     * @return the app role assignment
     */
    public AppRoleAssignmentFetcher getAppRoleAssignment(String id){
         return new OrcCollectionFetcher<AppRoleAssignment, AppRoleAssignmentFetcher, AppRoleAssignmentCollectionOperations>("appRoleAssignments", this, AppRoleAssignment.class, AppRoleAssignmentCollectionOperations.class).getById(id);
    }

     /**
     * Gets oauth2permission grants.
     *
     * @return the oauth2permission grants
     */
    public OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations> getOauth2PermissionGrants() {
        return new OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations>("oauth2PermissionGrants", this, OAuth2PermissionGrant.class, OAuth2PermissionGrantCollectionOperations.class);
    }

    /**
     * Gets oauth2permission grant.
     *
     * @return the oauth2permission grant
     */
    public OAuth2PermissionGrantFetcher getOauth2PermissionGrant(String id){
         return new OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations>("oauth2PermissionGrants", this, OAuth2PermissionGrant.class, OAuth2PermissionGrantCollectionOperations.class).getById(id);
    }

     /**
     * Gets member of.
     *
     * @return the member of
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getMemberOf() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("memberOf", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets member of.
     *
     * @return the member of
     */
    public DirectoryObjectFetcher getMemberOf(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("memberOf", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }
     /**
     * Gets createdonbehalfof.
     *
     * @return the created on behalf of
     */
    public DirectoryObjectFetcher getCreatedOnBehalfOf() {
        return new DirectoryObjectFetcher("createdOnBehalfOf", this);
    }

     /**
     * Gets created objects.
     *
     * @return the created objects
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getCreatedObjects() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("createdObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets created object.
     *
     * @return the created object
     */
    public DirectoryObjectFetcher getCreatedObject(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("createdObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets owners.
     *
     * @return the owners
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getOwners() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("owners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public DirectoryObjectFetcher getOwner(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("owners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets owned objects.
     *
     * @return the owned objects
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getOwnedObjects() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("ownedObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets owned object.
     *
     * @return the owned object
     */
    public DirectoryObjectFetcher getOwnedObject(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("ownedObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

}
