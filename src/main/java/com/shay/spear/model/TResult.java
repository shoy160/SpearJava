package com.shay.spear.model;

public class TResult<T> extends DResult {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
