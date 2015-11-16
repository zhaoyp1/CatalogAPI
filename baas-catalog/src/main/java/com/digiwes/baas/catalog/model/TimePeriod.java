package com.digiwes.baas.catalog.model;

/**
 * Created by zhaoyp-pc on 2015/11/12.
 */
public class TimePeriod {

    private String startDateTime;

    private String endDateTime;

    public TimePeriod(String startDateTime,String endDateTime){
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }
}
