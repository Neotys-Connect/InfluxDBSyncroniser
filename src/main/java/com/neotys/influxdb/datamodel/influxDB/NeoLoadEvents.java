package com.neotys.influxdb.datamodel.influxDB;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;
import com.neotys.ascode.swagger.client.model.EventDefinition;
import com.neotys.ascode.swagger.client.model.TestDefinition;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Measurement(name = "neoload_events",timeUnit = TimeUnit.MILLISECONDS)
public class NeoLoadEvents extends NeoLoadCommonData {

    @Column(name ="code",tag = true)
    String code;
    @Column(name ="fullname")
    String fullname;
    @Column(name ="type",tag = true)
    String type;
    @Column(name ="source")
    String source;
    @Column(name ="eventTime")
    Long eventTime;
    @Column(name ="name",tag = true)
    private String name = null;


    public NeoLoadEvents(TestDefinition definition, EventDefinition eventDefinition,String elementname)
    {
        this.initialize(definition);
        this.code=eventDefinition.getCode();
        this.fullname=eventDefinition.getFullname();
        this.type=eventDefinition.getType().getValue();
        this.source=eventDefinition.getSource();
        this.eventTime=eventDefinition.getOffset();
        this.name=elementname;
        this.time= Instant.ofEpochMilli(definition.getStartDate()+eventDefinition.getOffset());
    }

    public String toString()
    {
        StringBuilder result=new StringBuilder();
        result.append("Monitroing Points :");
        result.append("code:"+code);
        result.append(" fullname:"+fullname);
        result.append(" type:"+type);

        result.append(" author :"+this.author);
        result.append(" tesname :"+this.testname);
        result.append(" project :"+this.projectname);
        result.append(" scenario :"+this.scenario);
        result.append(" enddate :"+this.endDate);
        result.append(" startdate :"+this.startDate);
        result.append(" source :"+source);
        result.append(" eventTime :"+eventTime);
        result.append(" name :"+name);
        result.append(" metricname :"+this.getName());
        result.append(" time :"+this.time);
        return result.toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }



}
