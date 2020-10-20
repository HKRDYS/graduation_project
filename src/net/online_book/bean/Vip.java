package net.online_book.bean;

import java.util.Date;

/**
 * @author 
 * */

public class Vip {
    private int id,uid,vip_type;
    private Date begin_time,end_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getVip_type() {
        return vip_type;
    }

    public void setVip_type(int vip_type) {
        this.vip_type = vip_type;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", uid=" + uid +
                ", vip_type=" + vip_type +
                ", begin_time=" + begin_time +
                ", end_time=" + end_time +
                '}';
    }
}
