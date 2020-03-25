package com.neotys.influxdb.datamodel.influxDB;



import org.influxdb.annotation.Column;

import com.neotys.ascode.swagger.client.model.ElementDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NeoLoadElementData extends NeoLoadCommonData {
    @Column(name ="name",tag = true)
    private String name = "";

    @Column(name ="path" ,tag = true)
    private String path ="";

    @Column(name ="type",tag = true)
    private String type = "";

    public void initElement(ElementDefinition elementDefinition)
    {
        this.name=elementDefinition.getName();

        if(elementDefinition.getPath()!=null)
            this.path=elementDefinition.getPath().stream().collect(Collectors.joining("/"));
        else
            this.path="";

        this.type=elementDefinition.getType();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
