/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import sam.xtext.mydsl.ui.internal.MydslActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("org.xtext.example.mydsl1.MyDsl");
	}

}
