package com.digiwes.baas.catalog.resource;

/**
 * Created by zhaoyp-pc on 2015/11/25.
 */



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/carbonContext")
@Produces({"application/xml", "application/json"})
public class CarbonContextResource {
   /* //public CarbonContext.getThreadLocalCarbonContext();
    public Logger logger = Logger.getLogger(CarbonContextResource.class);
    @GET
    @Path("/users")
    public String getUser(){
       *//* CarbonContext carbonContext = CarbonContext.getThreadLocalCarbonContext();
        String username = carbonContext.getUsername();*//*
        CacheManager cacheManager = Caching.getCacheManagerFactory().getCacheManager("test");
        Cache<String,String> cache = cacheManager.getCache("USERINFO");
        cache.put("username", "zhaoyp");
        cache.put("password", "12345");
        //cache.get("username");
        logger.info("put cache ");
        return "SUCCESS";
    }
    @GET
    @Path("/tenant")
    public String getTenantInfo(){
        *//*CarbonContext carbonContext = CarbonContext.getThreadLocalCarbonContext();
        int tenantId = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
        //int tenantId = carbonContext.getTenantId();
        String tenantDomain = carbonContext.getTenantDomain();
        logger.info("TenantInfo:{tenantId:"+tenantId+",tenantName:"+tenantDomain+"}");
        return "TenantInfo:{tenantId:"+tenantId+",tenantName:"+tenantDomain+"}";*//*
    	 Cache<String,String>  cache =
    			 Caching.getCacheManagerFactory().getCacheManager("TEST").getCache("USERINFO");
    	 String name=cache.get("username");
    	 String password=cache.get("password");
    	 return "cacheInfo:{'username':"+name+",'password':"+password+"}";
    	 
    }
    @GET
    @Path("/registry")
    public String getRegistryInfo(){
        String tenantDomain = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantDomain();
        int tenantId = PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
         

        return "SUCCESS";
    }
*/

}
