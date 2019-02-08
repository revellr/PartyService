package com.revellr.core.partyservice.config;

import com.revellr.core.partyservice.resource.HelloWorldResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    registerEndpoints();
  }

  private void registerEndpoints() {
    register(HelloWorldResource.class);
  }
}
