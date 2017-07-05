package com.rosegun.plugin;

import java.io.Serializable;

/**
 * Created by qct on 2017/1/2.
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分页查询开始记录位置.
     */
    private int begin;

    /**
     * 分页查看下结束位置.
     */
    private int end;

    /**
     * 每页显示记录数.
     */
    private int length = 20;

    /**
     * 查询结果总记录数.
     */
    private int totalRecords;

    /**
     * 当前页码.
     */
    private int pageNo;

    /**
     * 总共页数.
     */
    private int pageCount;

    public Page() {
    }

    /**
     * 构造函数.
     */
    public Page(int begin, int length) {
        this.begin = begin;
        this.length = length;
        this.end = this.begin + this.length;
        this.pageNo = (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
    }

    /**
     * @param begin
     * @param length
     * @param totalRecords
     */
    public Page(int begin, int length, int totalRecords) {
        this(begin, length);
        this.totalRecords = totalRecords;
    }

    /**
     * 设置页数，自动计算数据范围.
     */
    public Page(int pageNo) {
        this.pageNo = pageNo;
        pageNo = pageNo > 0 ? pageNo : 1;
        this.begin = this.length * (pageNo - 1);
        this.end = this.length * pageNo;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Page{" +
            "begin=" + begin +
            ", end=" + end +
            ", length=" + length +
            ", totalRecords=" + totalRecords +
            ", pageNo=" + pageNo +
            ", pageCount=" + pageCount +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Page page = (Page) o;

        if (begin != page.begin) {
            return false;
        }
        if (end != page.end) {
            return false;
        }
        if (length != page.length) {
            return false;
        }
        if (totalRecords != page.totalRecords) {
            return false;
        }
        if (pageNo != page.pageNo) {
            return false;
        }
        return pageCount == page.pageCount;
    }

    @Override
    public int hashCode() {
        int result = begin;
        result = 31 * result + end;
        result = 31 * result + length;
        result = 31 * result + totalRecords;
        result = 31 * result + pageNo;
        result = 31 * result + pageCount;
        return result;
    }
}
