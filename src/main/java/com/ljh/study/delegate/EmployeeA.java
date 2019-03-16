package com.ljh.study.delegate;

/**
 * @description: 员工A
 * 擅长数据加密
 * @author: Jh Lee
 * @create: 2019-03-15 23:18
 **/
public class EmployeeA implements Employee {
    @Override
    public void doWork() {
        System.out.println("我是员工A，我擅长数据加密，我开始工作了！");
    }
}
