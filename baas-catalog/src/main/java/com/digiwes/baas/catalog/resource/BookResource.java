package com.digiwes.baas.catalog.resource;

import com.digiwes.baas.catalog.model.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2015/8/20.
 */
@Path("/books")
@Produces({"application/xml","application/json"})
public class BookResource {
    @GET
    @Produces({"application/xml","application/json"})
    public Book getBooks(){
        Book b = new Book();
        b.setBookId("bk_1");
        b.setBookName("Maven Desigin");
        b.setPublisher("xuxiaobin");
        return b;
    }


}
