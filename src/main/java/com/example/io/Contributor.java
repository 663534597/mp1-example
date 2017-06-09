// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.example.io;

/**
 * Description of a person who has contributed to the project, but who does not have commit privileges. Usually, these contributions come in the form of patches submitted.
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all")
public class Contributor implements java.io.Serializable, java.lang.Cloneable, com.example.io.InputLocationTracker {

	// --------------------------/
	// - Class/Member Variables -/
	// --------------------------/

	/**
	 * The full name of the contributor.
	 */
	private String name;

	/**
	 * The email address of the contributor.
	 */
	private String email;

	/**
	 * The URL for the homepage of the contributor.
	 */
	private String url;

	/**
	 * The organization to which the contributor belongs.
	 */
	private String organization;

	/**
	 * The URL of the organization.
	 */
	private String organizationUrl;

	/**
	 * Field roles.
	 */
	private java.util.List<String> roles;

	/**
	 * The timezone the contributor is in. Typically, this is a number in the range <a href="http://en.wikipedia.org/wiki/UTC%E2%88%9212:00">-12</a> to
	 * <a href="http://en.wikipedia.org/wiki/UTC%2B14:00">+14</a> or a valid time zone id like "America/Montreal" (UTC-05:00) or "Europe/Paris" (UTC+01:00).
	 */
	private String timezone;

	/**
	 * Field properties.
	 */
	private java.util.Properties properties;

	/**
	 * Field locations.
	 */
	private java.util.Map<Object, InputLocation> locations;

	// -----------/
	// - Methods -/
	// -----------/

	/**
	 * Method addProperty.
	 * @param key
	 * @param value
	 */
	public void addProperty(String key, String value) {
		getProperties().put(key, value);
	} // -- void addProperty( String, String )

	/**
	 * Method addRole.
	 * @param string
	 */
	public void addRole(String string) {
		getRoles().add(string);
	} // -- void addRole( String )

	/**
	 * Method clone.
	 * @return Contributor
	 */
	public Contributor clone() {
		try {
			Contributor copy = (Contributor) super.clone();

			if (this.roles != null) {
				copy.roles = new java.util.ArrayList<String>();
				copy.roles.addAll(this.roles);
			}

			if (this.properties != null) {
				copy.properties = (java.util.Properties) this.properties.clone();
			}

			if (copy.locations != null) {
				copy.locations = new java.util.LinkedHashMap(copy.locations);
			}

			return copy;
		} catch (java.lang.Exception ex) {
			throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException(getClass().getName() + " does not support clone()").initCause(ex);
		}
	} // -- Contributor clone()

	/**
	 * Get the email address of the contributor.
	 * @return String
	 */
	public String getEmail() {
		return this.email;
	} // -- String getEmail()

	/**
	 * @param key
	 * @return InputLocation
	 */
	public InputLocation getLocation(Object key) {
		return (locations != null) ? locations.get(key) : null;
	} // -- InputLocation getLocation( Object )

	/**
	 * Get the full name of the contributor.
	 * @return String
	 */
	public String getName() {
		return this.name;
	} // -- String getName()

	/**
	 * Get the organization to which the contributor belongs.
	 * @return String
	 */
	public String getOrganization() {
		return this.organization;
	} // -- String getOrganization()

	/**
	 * Get the URL of the organization.
	 * @return String
	 */
	public String getOrganizationUrl() {
		return this.organizationUrl;
	} // -- String getOrganizationUrl()

	/**
	 * Method getProperties.
	 * @return Properties
	 */
	public java.util.Properties getProperties() {
		if (this.properties == null) {
			this.properties = new java.util.Properties();
		}

		return this.properties;
	} // -- java.util.Properties getProperties()

	/**
	 * Method getRoles.
	 * @return List
	 */
	public java.util.List<String> getRoles() {
		if (this.roles == null) {
			this.roles = new java.util.ArrayList<String>();
		}

		return this.roles;
	} // -- java.util.List<String> getRoles()

	/**
	 * Get the timezone the contributor is in. Typically, this is a number in the range <a href="http://en.wikipedia.org/wiki/UTC%E2%88%9212:00">-12</a> to
	 * <a href="http://en.wikipedia.org/wiki/UTC%2B14:00">+14</a> or a valid time zone id like "America/Montreal" (UTC-05:00) or "Europe/Paris" (UTC+01:00).
	 * @return String
	 */
	public String getTimezone() {
		return this.timezone;
	} // -- String getTimezone()

	/**
	 * Get the URL for the homepage of the contributor.
	 * @return String
	 */
	public String getUrl() {
		return this.url;
	} // -- String getUrl()

	/**
	 * Method removeRole.
	 * @param string
	 */
	public void removeRole(String string) {
		getRoles().remove(string);
	} // -- void removeRole( String )

	/**
	 * Set the email address of the contributor.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	} // -- void setEmail( String )

	/**
	 * @param key
	 * @param location
	 */
	public void setLocation(Object key, InputLocation location) {
		if (location != null) {
			if (this.locations == null) {
				this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
			}
			this.locations.put(key, location);
		}
	} // -- void setLocation( Object, InputLocation )

	/**
	 * Set the full name of the contributor.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	} // -- void setName( String )

	/**
	 * Set the organization to which the contributor belongs.
	 * @param organization
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	} // -- void setOrganization( String )

	/**
	 * Set the URL of the organization.
	 * @param organizationUrl
	 */
	public void setOrganizationUrl(String organizationUrl) {
		this.organizationUrl = organizationUrl;
	} // -- void setOrganizationUrl( String )

	/**
	 * Set properties about the contributor, such as an instant messenger handle.
	 * @param properties
	 */
	public void setProperties(java.util.Properties properties) {
		this.properties = properties;
	} // -- void setProperties( java.util.Properties )

	/**
	 * Set the roles the contributor plays in the project. Each role is described by a <code>role</code> element, the body of which is a role name. This can also be used to
	 * describe the contribution.
	 * @param roles
	 */
	public void setRoles(java.util.List<String> roles) {
		this.roles = roles;
	} // -- void setRoles( java.util.List )

	/**
	 * Set the timezone the contributor is in. Typically, this is a number in the range <a href="http://en.wikipedia.org/wiki/UTC%E2%88%9212:00">-12</a> to
	 * <a href="http://en.wikipedia.org/wiki/UTC%2B14:00">+14</a> or a valid time zone id like "America/Montreal" (UTC-05:00) or "Europe/Paris" (UTC+01:00).
	 * @param timezone
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	} // -- void setTimezone( String )

	/**
	 * Set the URL for the homepage of the contributor.
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	} // -- void setUrl( String )

}
