package com.tms.lesson7_hw.task1.job;

import com.tms.lesson7_hw.task1.output.IOutput;

public class Director implements IOutput {
    public String jobName = "Director";
    public int id = 3;

    @Override
    public void output() {
        System.out.println(this.jobName);
    }
}
