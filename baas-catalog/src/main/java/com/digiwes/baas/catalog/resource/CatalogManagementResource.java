package com.digiwes.baas.catalog.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.digiwes.baas.catalog.model.Category;
import com.digiwes.baas.catalog.model.TimePeriod;

/**
 * Created by zhaoyp-pc on 2015/11/12.
 */
@Path("catalogManagement")
@Produces({ "application/json"})
@Consumes({ "application/json"})
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
    @GET
    @Path("/productOffering/{id}")
    public String retrieveProductOffering (@PathParam("id")String id){
        String json="{ \"id\": \"42\", \"href\": \"http://serverlocation:port/catalogManagement/productOffering/42\", \"version\": \"2.0\", \"lastUpdate\": \"2013-04-19T16:42:23-04:00\", \"name\": \"Virtual Storage Medium\", \"description\": \"Virtual Storage Medium\", \"isBundle\": \"true\", \"lifecycleStatus\": \"Active\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"2013-06-19T00:00:00-04:00\" }, \"category\": [ { \n" +
                "\"id\": \"12\", \n" +
                "\"href\": \"http://serverlocation:port/catalogManagement/category/12\", \"version\": \"2.0\", \"name\": \"Cloud offerings\" } ], \"channel\": [ { \n" +
                "\"id\": \"13\", \"href\": \"http://serverlocation:port/marketSales/channel/13\", \"name\": \"Online Channel\" } ], \"place\": [ { \n" +
                "\"id\": \"12\", \"href\": \"http://serverlocation:port/marketSales/place/12\", \"name\": \"France\" } ], \"bundledProductOffering\": [ { \n" +
                "\"id\": \"15\", \"href\": \"http://serverlocation:port/catalogManagement/productOffering/15\", \"lifecycleStatus\": \"Active\", \"name\": \"Offering 15\" }, { \n" +
                "\"id\": \"64\", \"href\": \"http://serverlocation:port/catalogManagement/productOffering/64\", \"lifecycleStatus\": \"Active\", \"name\": \"Offering 64\" } ], \"serviceLevelAgreement\": { \n" +
                "\"id\": \"28\", \n" +
                "\"href\": \"http://serverlocation:port/slaManagement/serviceLevelAgreement/28\", \"name\": \"Standard SLA\" }, \"productSpecification\": { \"id\": \"13\", \n" +
                "\"href\": \"http://serverlocation:port/catalogManagement/productSpecification/13\", \"version\": \"2.0\", \"name\": \"specification product 1\" }, \n" +
                "\"serviceCandidate\": { \"id\": \"13\", \"href\": \"http://serverlocation:port/catalogManagement/serviceCandidate/13\", \"version\": \"2.0\", \"name\": \"specification service 1\" },\n" +
                "\"resourceCandidate\": { \"id\": \"13\", \"href\": \"http://serverlocation:port/catalogManagement/resourceCandidate/13\", \"version\": \"2.0\", \"name\": \"specification resource 1\" }, \n" +
                "\"productOfferingTerm\": [ { \"name\": \"12 Month\", \"description\": \"12 month contract\", \"duration\": \"12\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"2013-06-19T00:00:00-04:00\" } } ], \"productOfferingPrice\": [ { \"name\": \"Monthly Price\", \"description\": \"monthlyprice\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"2013-06-19T00:00:00-04:00\" }, \"priceType\": \"recurring\", \"unitOfMeasure\": \"\", \"price\": { \"taxIncludedAmount\": \"12.00\", \"dutyFreeAmount\": \"10.00\", \"taxRate\": \"20.00\", \"currencyCode\": \"EUR\" }, \"recurringChargePeriod\": \"monthly\" }, { \"name\": \"Usage Price\", \"description\": \"usageprice\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"2013-06-19T00:00:00-04:00\" }, \"priceType\": \"usage\", \"unitOfMeasure\": \"second\", \"price\": { \"taxIncludedAmount\": \"12.00\", \"dutyFreeAmount\": \"10.00\", \"taxRate\": \"20.00\", \"currencyCode\": \"EUR\" }, \"recurringChargePeriod\": \"\" } ] }";
       return json;

    }
    @GET
    @Path("/productSpecification/{id}")
    public String retrieveProductSpecification(@PathParam("id")String id){
    	String json="{ \"id\": \"22\", \"href\": \"http://serverlocation:port/catalogManagement/productSpecification/22\", \"productNumber\": \"WS45-230-FC\", \"version\": \"2.0\", \"lastUpdate\": \"2013-04-19T16:42:23-04:00\", \"name\": \"iPhone 42\", \"description\": \"Siri works on this iPhone\", \"isBundle\": \"true\", \"brand\": \"Apple\", \"lifecycleStatus\": \"Active\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"2013-06-19T00:00:00-04:00\" }, \"relatedParty\": [ { \n" +
    	        "\"id\": \"1234\", \"role\": \"Owner\", \"href\": \"http ://serverLocation:port/partyManagement/partyRole/1234\" } ], \"attachment\": [ { \n" +
    	        "\"id\": \"22\", \"href\": \"http://serverlocation:port/documentManagement/attachment/22\", \"type\": \"Picture\", \"url\": \"http://xxxxx\" } ], \"bundledProductSpecification\": [ { \n" +
    	        "\"id\": \"15\", \"href\": \"http://serverlocation:port/catalogManagement/productSpecification/15\", \"lifecycleStatus\": \"Active\", \"name\": \"Product specification 15\" }, { \n" +
    	        "\"id\": \"64\", \"href\": \"http://serverlocation:port/catalogManagement/productSpecification/64\", \"lifecycleStatus\": \"Active\", \"name\": \"Product specification 64\" } ], \"productSpecificationRelationship\": [ { \"id\": \"23\", \n" +
    	        "\"href\": \"http://serverlocation:port/productCatalogManagement/productSpecification/23\", \n" +
    	        "\"type\": \"dependency\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"\" } } ], \"serviceSpecification\": [ { \n" +
    	        "\"id\": \"13\", \"href\": \"http://serverlocation:port/catalogManagement/serviceSpecification/13\", \"name\": \"specification 1\", \"version\": \"1.1\" } ], \"resourceSpecification\": [ { \n" +
    	        "\"id\": \"13\", \"href\": \"http://serverlocation:port/catalogManagement/resourceSpecification/13\", \"name\": \"specification 1\", \"version\": \"1.1\" } ], \"productSpecCharacteristic\": [ { \"name\": \"Screen Size\", \"description\": \"Screen size\", \"valueType\": \"number\", \"configurable\": \"false\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"\" }, \n" +
    	        "\"productSpecCharacteristicValue\": [ { \"valueType\": \"number\", \"default\": \"true\", \"value\": \"4.2\", \"unitOfMeasure\": \"inches\", \"valueFrom\": \"\", \"valueTo\": \"\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"\" } } ] }, { \n" +
    	        "\"name\": \"Colour\", \"description\": \"Colour\", \"valueType\": \"string\", \"configurable\": \"true\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"\" }, \"productSpecCharacteristicValue\": [ { \"valueType\": \"string\", \"default\": \"true\", \"value\": \"Black\", \"unitOfMeasure\": \"\", \"valueFrom\": \"\", \"valueTo\": \"\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"\" } }, { \"valueType\": \"string\", \"default\": \"false\", \"value\": \"White\", \"unitOfMeasure\": \"\", \"valueFrom\": \"\", \"valueTo\": \"\", \"validFor\": { \"startDateTime\": \"2013-04-19T16:42:23-04:00\", \"endDateTime\": \"\" } } ] } ] }";


    	return json;
    }
    
    @POST
    @Path("/{resource}/{id}/exportJob")
    public String exportJob(@PathParam("resource")String resource,@PathParam("id")String id){
    	String json="{ \"id\": \"54\", \n" +
    	        "\"href\": \"http:/api/catalogManagement/exportJob/54\", \n" +
    	        "\"status\": \"running\", \n" +
    	        "\"path\": \"catalogManagement/catalog/10\" , \n" +
    	        "\"content-type\": \"application/json\", \"errorLog\": \"\", \n" +
    	        "\"creationDate\" : \"2013-04-19T16:42:23-04:00\", \n" +
    	        "\"completionDate\" : \"\", \"url\": \"ftp://ftp.myCatalog.com/productCatalog/54\" \n" +
    	        "}";
    	return json;
    }
    @POST
    @Path("/{resource}/{id}/importJob")
    public String importJob(@PathParam("resource")String resource,@PathParam("id")String id,String url){
    	

    	String json="{ \"id\": \"554\", \n" +
        "\"href\": \"http:/api/catalogManagement/importJob/554\", \n" +
        "\"status\": \"running\", \n" +
        "\"path\": \"catalogManagement/catalog/10\" , \n" +
        "\"content-type\": \"application/json\", \"errorLog\": \"\", \n" +
        "\"creationDate\" : \"2013-04-19T16:42:23-04:00\", \n" +
        "\"completionDate\" : \"\", \"url\": \"ftp://ftp.myCatalog.com/productCatalog/partner54\" \n" +
        "}";
    	return json;
    }
    @POST
    @Path("/{resource}/{id}/hub")
    public String createHub(@QueryParam("eventType")String eventType ,@PathParam("resource")String resource,@PathParam("id")String id,String callback){
    	String json="{\"id\":\"42\",\"callback\":\"http://in.listener.com\",\"query\":null,\"evnetType\": \"CatalogChangeNotification\" }";
    	return json;
    }
    
    @DELETE
    @Path("/hub/{id}")
    public Response removeHub(@PathParam("id")String id){
    	return Response.noContent().build();
    }


    
}
