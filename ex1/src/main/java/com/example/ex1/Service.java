package com.example.ex1;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.auth.LoginConfig;

@ApplicationPath("/kau")
@LoginConfig(authMethod = "MP-JWT", realmName = "jwt-jaspi")
public class Service extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();

        resources.add(Conversor.class);

        return resources;
    }
}
