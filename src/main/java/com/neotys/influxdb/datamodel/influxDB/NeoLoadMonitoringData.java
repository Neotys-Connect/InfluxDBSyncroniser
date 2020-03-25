package com.neotys.influxdb.datamodel.influxDB;

import org.influxdb.annotation.Column;

import com.neotys.ascode.swagger.client.model.CounterDefinition;

import java.util.ArrayList;
import java.util.List;

public class NeoLoadMonitoringData extends  NeoLoadCommonData {

    @Column(name ="name",tag = true)
    private String name = null;

    @Column(name ="path")
    private List<String> path = null;

    public void init_monitoringdata(CounterDefinition definition)
    {
        this.name=definition.getName();
        this.path=new ArrayList<>();
        this.path.addAll(definition.getPath());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }
}
