package com.ljh.study.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 委派模式项目经理
 * @author: Jh Lee
 * @create: 2019-03-15 23:12
 **/
public class Leader {

    //这里的项目经理预先知道了团队里面每个人的特长，特点，我们放在一个map容器里面，通过leader的构造方法存入，当然我们也可以通过数据库表来进行存放
    private Map<String,Employee> register = new HashMap<>();

    public Leader() {
        register.put("数据加密",new EmployeeA());
        register.put("SQL编写",new EmployeeB());
        register.put("JVM性能优化",new EmployeeC());
    }

    //项目经理干活方法，通过对每一个员工的了解，让对应的员工去做对应是，通过命令委派给员工
    public void doWork(String command){
        this.register.get(command).doWork();
    }
}
