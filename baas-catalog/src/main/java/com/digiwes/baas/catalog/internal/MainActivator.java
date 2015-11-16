package com.digiwes.baas.catalog.internal;

import com.digiwes.baas.catalog.resource.BookResource;
import com.digiwes.baas.catalog.resource.CatalogManagementResource;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by zhaoyp-pc on 2015/11/11.
 */
public class MainActivator implements BundleActivator {


    private static final URI BASE_URI = URI.create("http://192.168.133.101:9444/");
    HttpServer server = null;
    public void start(BundleContext context) throws Exception {
        try {
            ResourceConfig resourceConfig = new ResourceConfig();
            resourceConfig.register(CatalogManagementResource.class);
            //resourceConfig.packages(CatalogManagementResource.class.getPackage().getName());
            resourceConfig.register(DeclarativeLinkingFeature.class);
            server= GrizzlyHttpServerFactory .createHttpServer(BASE_URI,resourceConfig);

        } catch (Exception ex) {
            Logger.getLogger(MainActivator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stop(BundleContext context) throws Exception {
        if (null != server) {
            server.shutdownNow();
            server = null;
        }
    }
   public static void main(String args[]) throws Exception {
     	BundleActivator mainActivator = new MainActivator();
         mainActivator.start(null);
    	 System.in.read();
         mainActivator.stop(null);
    }
}
