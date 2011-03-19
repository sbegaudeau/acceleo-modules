package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.main.properties;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.acceleo.engine.service.AcceleoService;
import org.eclipse.acceleo.engine.service.properties.AbstractAcceleoPropertiesLoaderService;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class AcceleoPluginPropertiesLoaderService extends
		AbstractAcceleoPropertiesLoaderService {

	private Bundle scalaGeneratorBundle;
	
	public AcceleoPluginPropertiesLoaderService(AcceleoService acceleoService) {
		this.acceleoService = acceleoService;
	}

	@Override
	protected Properties alternatePropertiesLoading(String filepath) {
		Properties properties = new Properties();
		scalaGeneratorBundle = Platform.getBundle("com.github.sbegaudeau.acceleo.modules.psm.gen.scala");
		if (scalaGeneratorBundle != null) {
			URL res = scalaGeneratorBundle.getResource(filepath);
			if (res != null) {
				try {
					properties.load(res.openStream());
				} catch (IOException e1) {
					return null;
				}
			}
		}		
		return properties;
	}

}
