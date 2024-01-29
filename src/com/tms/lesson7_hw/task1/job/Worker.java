package com.tms.lesson7_hw.task1.job;

import com.tms.lesson7_hw.task1.output.IOutput;

public class Worker implements IOutput {
    public String jobName = "Worker";
    public int id = 2;

    @Override
    public void output() {
        System.out.println(this.jobName);
    }
}
