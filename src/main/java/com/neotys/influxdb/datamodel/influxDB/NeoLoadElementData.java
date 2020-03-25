package com.neotys.influxdb.datamodel.influxDB;



import org.influxdb.annotation.Column;

import com.neotys.ascode.swagger.client.model.ElementDefinition;

import java.util.ArrayList;
import java.util.List;

public class NeoLoadElementData extends NeoLoadCommonData {
    @Column(name ="name",tag = true)
    private String name = null;

    @Column(name ="path")
    private List<String> path = null;

    @Column(name ="type",tag = true)
    private String type = null;

    public void initElement(ElementDefinition elementDefinition)
    {
        this.name=elementDefinition.getName();
        this.path=new ArrayList<>();
        this.path.addAll(elementDefinition.getPath());
        this.type=elementDefinition.getType();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
