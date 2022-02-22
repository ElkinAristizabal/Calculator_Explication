package com.calculator.service.calcservice;

public class Response {

    private int x;
    private int y;

    private int resutl;

    private long hola;

    public Response(int x, int y, int resutl) {
        this.x = x;
        this.y = y;
        this.resutl = resutl;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getResutl() {
        return resutl;
    }

}

    Se crean las variables x,y,result, donde result es el resultado de
    la operacion requerida entre x,y.
