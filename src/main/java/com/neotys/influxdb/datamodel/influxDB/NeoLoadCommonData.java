package com.neotys.influxdb.datamodel.influxDB;

import org.influxdb.annotation.Column;

import com.neotys.ascode.swagger.client.model.TestDefinition;

import java.time.Instant;

public class NeoLoadCommonData {
    @Column(name ="testname", tag = true)
    String testname;
    @Column(name ="projectname" ,tag = true)
    String projectname;
    @Column(name ="scenario",tag = true)
    String scenario;
    @Column(name ="author",tag = true)
    String author;
    @Column(name ="startDate" ,tag = true)
    Long startDate;
    @Column(name ="endDate" ,tag = true)
    Long endDate;
    @Column(name="time")
    Instant time;

    public void initialize(TestDefinition definition)
    {
        this.author=definition.getAuthor();
        this.endDate=definition.getEndDate();
        this.testname=definition.getName();
        this.projectname=definition.getProject();
        this.scenario=definition.getScenario();
        this.startDate=definition.getStartDate();
    }

    public Double setValue(Float value)
    {
        if(value!=null)
            return Double.valueOf(value);
        else
            return Double.valueOf(0);
    }

    public Instant getEventTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }
}
