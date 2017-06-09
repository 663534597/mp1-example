// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.example.io;

/**
 * Describes a build extension to utilise.
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all")
public class Extension implements java.io.Serializable, java.lang.Cloneable, com.example.io.InputLocationTracker {

	// --------------------------/
	// - Class/Member Variables -/
	// --------------------------/

	/**
	 * The group ID of the extension's artifact.
	 */
	private String groupId;

	/**
	 * The artifact ID of the extension.
	 */
	private String artifactId;

	/**
	 * The version of the extension.
	 */
	private String version;

	/**
	 * Field locations.
	 */
	private java.util.Map<Object, InputLocation> locations;

	// -----------/
	// - Methods -/
	// -----------/

	/**
	 * Method clone.
	 * @return Extension
	 */
	public Extension clone() {
		try {
			Extension copy = (Extension) super.clone();

			if (copy.locations != null) {
				copy.locations = new java.util.LinkedHashMap(copy.locations);
			}

			return copy;
		} catch (java.lang.Exception ex) {
			throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException(getClass().getName() + " does not support clone()").initCause(ex);
		}
	} // -- Extension clone()

	/**
	 * Get the artifact ID of the extension.
	 * @return String
	 */
	public String getArtifactId() {
		return this.artifactId;
	} // -- String getArtifactId()

	/**
	 * Get the group ID of the extension's artifact.
	 * @return String
	 */
	public String getGroupId() {
		return this.groupId;
	} // -- String getGroupId()

	/**
	 * @param key
	 * @return InputLocation
	 */
	public InputLocation getLocation(Object key) {
		return (locations != null) ? locations.get(key) : null;
	} // -- InputLocation getLocation( Object )

	/**
	 * Get the version of the extension.
	 * @return String
	 */
	public String getVersion() {
		return this.version;
	} // -- String getVersion()

	/**
	 * Set the artifact ID of the extension.
	 * @param artifactId
	 */
	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	} // -- void setArtifactId( String )

	/**
	 * Set the group ID of the extension's artifact.
	 * @param groupId
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	} // -- void setGroupId( String )

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
	 * Set the version of the extension.
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	} // -- void setVersion( String )

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Extension)) {
			return false;
		}

		Extension e = (Extension) o;

		if (!equal(e.getArtifactId(), getArtifactId())) {
			return false;
		} else if (!equal(e.getGroupId(), getGroupId())) {
			return false;
		} else if (!equal(e.getVersion(), getVersion())) {
			return false;
		}
		return true;
	}

	private static <T> boolean equal(T obj1, T obj2) {
		return (obj1 != null) ? obj1.equals(obj2) : obj2 == null;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getArtifactId() != null ? getArtifactId().hashCode() : 0);
		result = 37 * result + (getGroupId() != null ? getGroupId().hashCode() : 0);
		result = 37 * result + (getVersion() != null ? getVersion().hashCode() : 0);
		return result;
	}

}
