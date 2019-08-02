package com.springcloud.entities;

/**
 * @author Wtq
 * @date 2019/7/31 - 9:35
 */

public class Dept {
    private Long deptno;

    public Dept() {
    }

    public Dept(Long deptno, String dname, String mydb) {

        this.deptno = deptno;
        this.dname = dname;
        this.mydb = mydb;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", mydb='" + mydb + '\'' +
                '}';
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getMydb() {
        return mydb;
    }

    public void setMydb(String mydb) {
        this.mydb = mydb;
    }

    private String dname;
    private String mydb;


}
