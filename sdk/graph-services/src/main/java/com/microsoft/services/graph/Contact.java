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
 * The type Contact.
*/
public class Contact extends DirectoryObject {

    public Contact(){
        setODataType("#Microsoft.Graph.Contact");
    }
            
    private String city;
     
    /**
    * Gets the city.
    *
    * @return the String
    */
    public String getCity() {
        return this.city; 
    }

    /**
    * Sets the city.
    *
    * @param value the String
    */
    public void setCity(String value) { 
        this.city = value; 
        valueChanged("city", value);

    }
            
    private String country;
     
    /**
    * Gets the country.
    *
    * @return the String
    */
    public String getCountry() {
        return this.country; 
    }

    /**
    * Sets the country.
    *
    * @param value the String
    */
    public void setCountry(String value) { 
        this.country = value; 
        valueChanged("country", value);

    }
            
    private String department;
     
    /**
    * Gets the department.
    *
    * @return the String
    */
    public String getDepartment() {
        return this.department; 
    }

    /**
    * Sets the department.
    *
    * @param value the String
    */
    public void setDepartment(String value) { 
        this.department = value; 
        valueChanged("department", value);

    }
            
    private Boolean dirSyncEnabled;
     
    /**
    * Gets the dir Sync Enabled.
    *
    * @return the Boolean
    */
    public Boolean getDirSyncEnabled() {
        return this.dirSyncEnabled; 
    }

    /**
    * Sets the dir Sync Enabled.
    *
    * @param value the Boolean
    */
    public void setDirSyncEnabled(Boolean value) { 
        this.dirSyncEnabled = value; 
        valueChanged("dirSyncEnabled", value);

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
            
    private String facsimileTelephoneNumber;
     
    /**
    * Gets the facsimile Telephone Number.
    *
    * @return the String
    */
    public String getFacsimileTelephoneNumber() {
        return this.facsimileTelephoneNumber; 
    }

    /**
    * Sets the facsimile Telephone Number.
    *
    * @param value the String
    */
    public void setFacsimileTelephoneNumber(String value) { 
        this.facsimileTelephoneNumber = value; 
        valueChanged("facsimileTelephoneNumber", value);

    }
            
    private String givenName;
     
    /**
    * Gets the given Name.
    *
    * @return the String
    */
    public String getGivenName() {
        return this.givenName; 
    }

    /**
    * Sets the given Name.
    *
    * @param value the String
    */
    public void setGivenName(String value) { 
        this.givenName = value; 
        valueChanged("givenName", value);

    }
            
    private String jobTitle;
     
    /**
    * Gets the job Title.
    *
    * @return the String
    */
    public String getJobTitle() {
        return this.jobTitle; 
    }

    /**
    * Sets the job Title.
    *
    * @param value the String
    */
    public void setJobTitle(String value) { 
        this.jobTitle = value; 
        valueChanged("jobTitle", value);

    }
            
    private java.util.Calendar lastDirSyncTime;
     
    /**
    * Gets the last Dir Sync Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastDirSyncTime() {
        return this.lastDirSyncTime; 
    }

    /**
    * Sets the last Dir Sync Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastDirSyncTime(java.util.Calendar value) { 
        this.lastDirSyncTime = value; 
        valueChanged("lastDirSyncTime", value);

    }
            
    private String mail;
     
    /**
    * Gets the mail.
    *
    * @return the String
    */
    public String getMail() {
        return this.mail; 
    }

    /**
    * Sets the mail.
    *
    * @param value the String
    */
    public void setMail(String value) { 
        this.mail = value; 
        valueChanged("mail", value);

    }
            
    private String mailNickname;
     
    /**
    * Gets the mail Nickname.
    *
    * @return the String
    */
    public String getMailNickname() {
        return this.mailNickname; 
    }

    /**
    * Sets the mail Nickname.
    *
    * @param value the String
    */
    public void setMailNickname(String value) { 
        this.mailNickname = value; 
        valueChanged("mailNickname", value);

    }
            
    private String mobile;
     
    /**
    * Gets the mobile.
    *
    * @return the String
    */
    public String getMobile() {
        return this.mobile; 
    }

    /**
    * Sets the mobile.
    *
    * @param value the String
    */
    public void setMobile(String value) { 
        this.mobile = value; 
        valueChanged("mobile", value);

    }
            
    private String physicalDeliveryOfficeName;
     
    /**
    * Gets the physical Delivery Office Name.
    *
    * @return the String
    */
    public String getPhysicalDeliveryOfficeName() {
        return this.physicalDeliveryOfficeName; 
    }

    /**
    * Sets the physical Delivery Office Name.
    *
    * @param value the String
    */
    public void setPhysicalDeliveryOfficeName(String value) { 
        this.physicalDeliveryOfficeName = value; 
        valueChanged("physicalDeliveryOfficeName", value);

    }
            
    private String postalCode;
     
    /**
    * Gets the postal Code.
    *
    * @return the String
    */
    public String getPostalCode() {
        return this.postalCode; 
    }

    /**
    * Sets the postal Code.
    *
    * @param value the String
    */
    public void setPostalCode(String value) { 
        this.postalCode = value; 
        valueChanged("postalCode", value);

    }
    
        
    private java.util.List<ProvisioningError> provisioningErrors = null;
    
    
     
    /**
    * Gets the provisioning Errors.
    *
    * @return the java.util.List<ProvisioningError>
    */
    public java.util.List<ProvisioningError> getProvisioningErrors() {
        return this.provisioningErrors; 
    }

    /**
    * Sets the provisioning Errors.
    *
    * @param value the java.util.List<ProvisioningError>
    */
    public void setProvisioningErrors(java.util.List<ProvisioningError> value) { 
        this.provisioningErrors = value; 
        valueChanged("provisioningErrors", value);

    }
    
        
    private java.util.List<String> proxyAddresses = null;
    
    
     
    /**
    * Gets the proxy Addresses.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getProxyAddresses() {
        return this.proxyAddresses; 
    }

    /**
    * Sets the proxy Addresses.
    *
    * @param value the java.util.List<String>
    */
    public void setProxyAddresses(java.util.List<String> value) { 
        this.proxyAddresses = value; 
        valueChanged("proxyAddresses", value);

    }
            
    private String sipProxyAddress;
     
    /**
    * Gets the sip Proxy Address.
    *
    * @return the String
    */
    public String getSipProxyAddress() {
        return this.sipProxyAddress; 
    }

    /**
    * Sets the sip Proxy Address.
    *
    * @param value the String
    */
    public void setSipProxyAddress(String value) { 
        this.sipProxyAddress = value; 
        valueChanged("sipProxyAddress", value);

    }
            
    private String state;
     
    /**
    * Gets the state.
    *
    * @return the String
    */
    public String getState() {
        return this.state; 
    }

    /**
    * Sets the state.
    *
    * @param value the String
    */
    public void setState(String value) { 
        this.state = value; 
        valueChanged("state", value);

    }
            
    private String streetAddress;
     
    /**
    * Gets the street Address.
    *
    * @return the String
    */
    public String getStreetAddress() {
        return this.streetAddress; 
    }

    /**
    * Sets the street Address.
    *
    * @param value the String
    */
    public void setStreetAddress(String value) { 
        this.streetAddress = value; 
        valueChanged("streetAddress", value);

    }
            
    private String surname;
     
    /**
    * Gets the surname.
    *
    * @return the String
    */
    public String getSurname() {
        return this.surname; 
    }

    /**
    * Sets the surname.
    *
    * @param value the String
    */
    public void setSurname(String value) { 
        this.surname = value; 
        valueChanged("surname", value);

    }
            
    private String telephoneNumber;
     
    /**
    * Gets the telephone Number.
    *
    * @return the String
    */
    public String getTelephoneNumber() {
        return this.telephoneNumber; 
    }

    /**
    * Sets the telephone Number.
    *
    * @param value the String
    */
    public void setTelephoneNumber(String value) { 
        this.telephoneNumber = value; 
        valueChanged("telephoneNumber", value);

    }
            
    private byte[] thumbnailPhoto;
     
    /**
    * Gets the thumbnail Photo.
    *
    * @return the byte[]
    */
    public byte[] getThumbnailPhoto() {
        return this.thumbnailPhoto; 
    }

    /**
    * Sets the thumbnail Photo.
    *
    * @param value the byte[]
    */
    public void setThumbnailPhoto(byte[] value) { 
        this.thumbnailPhoto = value; 
        valueChanged("thumbnailPhoto", value);

    }
            
    private DirectoryObject manager;
     
    /**
    * Gets the manager.
    *
    * @return the DirectoryObject
    */
    public DirectoryObject getManager() {
        return this.manager; 
    }

    /**
    * Sets the manager.
    *
    * @param value the DirectoryObject
    */
    public void setManager(DirectoryObject value) { 
        this.manager = value; 
        valueChanged("manager", value);

    }
    
        
    private java.util.List<DirectoryObject> directReports = null;
    
    
     
    /**
    * Gets the direct Reports.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getDirectReports() {
        return this.directReports; 
    }

    /**
    * Sets the direct Reports.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setDirectReports(java.util.List<DirectoryObject> value) { 
        this.directReports = value; 
        valueChanged("directReports", value);

    }
    
        
    private java.util.List<DirectoryObject> memberOf = null;
    
    
     
    /**
    * Gets the member Of.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf; 
    }

    /**
    * Sets the member Of.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setMemberOf(java.util.List<DirectoryObject> value) { 
        this.memberOf = value; 
        valueChanged("memberOf", value);

    }
}

