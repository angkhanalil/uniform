package com.twc.uniform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ww_order_header {
    @Id
    private int trans_id;
    private String order_no;

    
    public int getTrans_id() {
        return trans_id;
    }
    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }
    public String getOrder_no() {
        return order_no;
    }
    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    
    
}
