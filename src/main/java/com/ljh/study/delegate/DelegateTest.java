package com.ljh.study.delegate;

/**
 * @description: 委派模式测试类
 * @author: Jh Lee
 * @create: 2019-03-15 23:30
 **/
public class DelegateTest {

    public static void main(String[] args) {
        //实例化一个老板
        Boss boss = new Boss();
        //让这个老板发送一条命令，老板想要对数据加密
        boss.sendCommand("数据加密");
    }
}
