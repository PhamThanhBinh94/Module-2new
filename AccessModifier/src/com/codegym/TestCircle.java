package com.codegym;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"red");
        System.out.println(circle.getRadius() + " " + circle.getArea());
    }
}
