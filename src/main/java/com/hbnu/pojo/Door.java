package com.hbnu.pojo;

public class Door {
    private int id;
    private String name;
    private String tel;
    private String addr;


    public Door() {
    }

    public Door(int id, String name, String tel, String addr) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    /**
     * 获取
     * @return doorId
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String toString() {
        return "Door{doorId = " + id + ", name = " + name + ", tel = " + tel + ", addr = " + addr + "}";
    }
}
