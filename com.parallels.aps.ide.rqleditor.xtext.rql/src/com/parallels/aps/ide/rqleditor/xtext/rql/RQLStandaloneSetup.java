/*
* generated by Xtext
*/
package com.parallels.aps.ide.rqleditor.xtext.rql;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RQLStandaloneSetup extends RQLStandaloneSetupGenerated{

	public static void doSetup() {
		new RQLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

