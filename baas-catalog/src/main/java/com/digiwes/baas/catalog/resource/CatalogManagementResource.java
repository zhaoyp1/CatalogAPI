package com.digiwes.baas.catalog.resource;

import com.digiwes.baas.catalog.model.Category;
import com.digiwes.baas.catalog.model.TimePeriod;
import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

/**
 * Created by zhaoyp-pc on 2015/11/12.
 */
@Path("catalogManagement")
@Produces({ "application/json"})
public class CatalogManagementResource {
    @GET
    @Path("/category/{id}")
    public Category retrieveCategory(@PathParam("id")String id){
        TimePeriod validFor =new TimePeriod("2015-10-19T16:42:23.0Z", "2015-12-19T16:42:23.0Z");
        Category category =new Category();
        category.setId(id);
        category.setIsRoot("true");
        category.setParentid("0");
        category.setName("Cloud Services");
        category.setLastUpdate("2013-10-20T16:42:23-04:00");
        category.setVersion("2.0.0");
        category.setLifecycleStatus("Active");
        category.setValidFor(validFor);
        category.setDescription("A category to hold all available cloud service offers");
        return category;
    }
}
