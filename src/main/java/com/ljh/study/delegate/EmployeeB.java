package com.ljh.study.delegate;

/**
 * @description: 员工B
 *  擅长SQL语句
 * @author: Jh Lee
 * @create: 2019-03-15 23:18
 **/
public class EmployeeB implements Employee {
    @Override
    public void doWork() {
        System.out.println("我是员工B，我擅长编写SQL语句，我开始工作了！");
    }
}
