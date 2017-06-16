package com.cloudtcc.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by as on 2017/6/15.
 */
public class PageBean implements Serializable{
    private Long total;
    private List <?> rows;

    public PageBean (Long total, List<?> rows){
        this.total = total;
        this.rows = rows;
    }

    public PageBean (Integer total,List<?> rows){
        this.total = total.longValue();
        this.rows = rows;
    }

    public PageBean(){

    }
    public List <?> getRows() {
        return rows;
    }

    public void setRows(List <?> rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
