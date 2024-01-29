package com.tms.lesson7_hw.task1.job;

import com.tms.lesson7_hw.task1.output.IOutput;

public class Accountant implements IOutput {
    public String jobName = "Accountant";
    public int id = 1;


    @Override
    public void output() {
        System.out.println(this.jobName);
    }
}
