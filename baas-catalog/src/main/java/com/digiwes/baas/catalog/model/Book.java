package com.digiwes.baas.catalog.model;

import org.glassfish.jersey.linking.InjectLink;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;

/**
 * Created by zhaoyp on 2015/8/13.
 */
public class Book {

    private String bookId;
    private String bookName;
    private String publisher;

    public Book(String name){
       this.bookName =name;
    }

    public Book(){

    }
    @InjectLink(value="books/{bookId}", style=InjectLink.Style.ABSOLUTE)
    private URI href;

    public URI getHref() {
        return href;
    }

    public void setHref(URI href) {
        this.href = href;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
