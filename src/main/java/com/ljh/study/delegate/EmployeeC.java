package com.ljh.study.delegate;

/**
 * @description: 员工C
 * 擅长性能优化
 * @author: Jh Lee
 * @create: 2019-03-15 23:18
 **/
public class EmployeeC  implements Employee{
    @Override
    public void doWork() {
        System.out.println("我是员工C，我擅长JVM性能优化，我开始工作了！");
    }
}
