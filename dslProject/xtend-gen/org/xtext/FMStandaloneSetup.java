/**
 * generated by Xtext 2.12.0
 */
package org.xtext;

import org.xtext.FMStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FMStandaloneSetup extends FMStandaloneSetupGenerated {
  public static void doSetup() {
    new FMStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}