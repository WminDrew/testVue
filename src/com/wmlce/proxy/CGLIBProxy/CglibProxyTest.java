package com.wmlce.proxy.CGLIBProxy;


public class CglibProxyTest {
    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl buyHouseProxyInstance = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        buyHouseProxyInstance.buyHouse();
    }
}
