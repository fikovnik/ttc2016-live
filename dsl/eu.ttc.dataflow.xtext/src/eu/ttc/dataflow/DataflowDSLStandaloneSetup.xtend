/*
 * generated by Xtext 2.9.2
 */
package eu.ttc.dataflow


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DataflowDSLStandaloneSetup extends DataflowDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new DataflowDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}