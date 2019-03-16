package com.ljh.study.delegate;

/**
 * @description: 委派模式Boss类
 * @author: Jh Lee
 * @create: 2019-03-15 23:12
 **/
public class Boss {

    //对项目经理发送命令，让项目经理干活
    public void sendCommand(String command){
        new Leader().doWork(command);
    }
}
