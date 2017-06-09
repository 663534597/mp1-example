// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.example.io;

/**
 * Section for management of default dependency information for use in a group of POMs.
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all")
public class DependencyManagement implements java.io.Serializable, java.lang.Cloneable, com.example.io.InputLocationTracker {

	// --------------------------/
	// - Class/Member Variables -/
	// --------------------------/

	/**
	 * Field dependencies.
	 */
	private java.util.List<Dependency> dependencies;

	/**
	 * Field locations.
	 */
	private java.util.Map<Object, InputLocation> locations;

	// -----------/
	// - Methods -/
	// -----------/

	/**
	 * Method addDependency.
	 * @param dependency
	 */
	public void addDependency(Dependency dependency) {
		getDependencies().add(dependency);
	} // -- void addDependency( Dependency )

	/**
	 * Method clone.
	 * @return DependencyManagement
	 */
	public DependencyManagement clone() {
		try {
			DependencyManagement copy = (DependencyManagement) super.clone();

			if (this.dependencies != null) {
				copy.dependencies = new java.util.ArrayList<Dependency>();
				for (Dependency item : this.dependencies) {
					copy.dependencies.add(((Dependency) item).clone());
				}
			}

			if (copy.locations != null) {
				copy.locations = new java.util.LinkedHashMap(copy.locations);
			}

			return copy;
		} catch (java.lang.Exception ex) {
			throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException(getClass().getName() + " does not support clone()").initCause(ex);
		}
	} // -- DependencyManagement clone()

	/**
	 * Method getDependencies.
	 * @return List
	 */
	public java.util.List<Dependency> getDependencies() {
		if (this.dependencies == null) {
			this.dependencies = new java.util.ArrayList<Dependency>();
		}

		return this.dependencies;
	} // -- java.util.List<Dependency> getDependencies()

	/**
	 * @param key
	 * @return InputLocation
	 */
	public InputLocation getLocation(Object key) {
		return (locations != null) ? locations.get(key) : null;
	} // -- InputLocation getLocation( Object )

	/**
	 * Method removeDependency.
	 * @param dependency
	 */
	public void removeDependency(Dependency dependency) {
		getDependencies().remove(dependency);
	} // -- void removeDependency( Dependency )

	/**
	 * Set the dependencies specified here are not used until they are referenced in a POM within the group. This allows the specification of a "standard" version for a particular
	 * dependency.
	 * @param dependencies
	 */
	public void setDependencies(java.util.List<Dependency> dependencies) {
		this.dependencies = dependencies;
	} // -- void setDependencies( java.util.List )

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

}
