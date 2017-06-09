// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.example.io;

/**
 * Describes the prerequisites a project can have.
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all")
public class Prerequisites implements java.io.Serializable, java.lang.Cloneable, com.example.io.InputLocationTracker {

	// --------------------------/
	// - Class/Member Variables -/
	// --------------------------/

	/**
	 * For a plugin project (packaging is <code>maven-plugin</code>), the minimum version of Maven required to use the resulting plugin.<br>
	 * In Maven 2, this was also specifying the minimum version of Maven required to build a project, but this usage is <b>deprecated</b> in Maven 3 and not checked any more: use
	 * the <a href="https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html">Maven Enforcer Plugin's <code>requireMavenVersion</code> rule</a> instead.
	 */
	private String maven = "2.0";

	/**
	 * Field locations.
	 */
	private java.util.Map<Object, InputLocation> locations;

	// -----------/
	// - Methods -/
	// -----------/

	/**
	 * Method clone.
	 * @return Prerequisites
	 */
	public Prerequisites clone() {
		try {
			Prerequisites copy = (Prerequisites) super.clone();

			if (copy.locations != null) {
				copy.locations = new java.util.LinkedHashMap(copy.locations);
			}

			return copy;
		} catch (java.lang.Exception ex) {
			throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException(getClass().getName() + " does not support clone()").initCause(ex);
		}
	} // -- Prerequisites clone()

	/**
	 * @param key
	 * @return InputLocation
	 */
	public InputLocation getLocation(Object key) {
		return (locations != null) ? locations.get(key) : null;
	} // -- InputLocation getLocation( Object )

	/**
	 * Get for a plugin project (packaging is <code>maven-plugin</code>), the minimum version of Maven required to use the resulting plugin.<br>
	 * In Maven 2, this was also specifying the minimum version of Maven required to build a project, but this usage is <b>deprecated</b> in Maven 3 and not checked any more: use
	 * the <a href="https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html">Maven Enforcer Plugin's <code>requireMavenVersion</code> rule</a> instead.
	 * @return String
	 */
	public String getMaven() {
		return this.maven;
	} // -- String getMaven()

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
	 * Set for a plugin project (packaging is <code>maven-plugin</code>), the minimum version of Maven required to use the resulting plugin.<br>
	 * In Maven 2, this was also specifying the minimum version of Maven required to build a project, but this usage is <b>deprecated</b> in Maven 3 and not checked any more: use
	 * the <a href="https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html">Maven Enforcer Plugin's <code>requireMavenVersion</code> rule</a> instead.
	 * @param maven
	 */
	public void setMaven(String maven) {
		this.maven = maven;
	} // -- void setMaven( String )

}
