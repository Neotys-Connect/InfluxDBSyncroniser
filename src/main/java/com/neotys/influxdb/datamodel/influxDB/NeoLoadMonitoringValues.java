package com.neotys.influxdb.datamodel.influxDB;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;
import com.neotys.ascode.swagger.client.model.CounterDefinition;
import com.neotys.ascode.swagger.client.model.CounterValues;
import com.neotys.ascode.swagger.client.model.CustomMonitorValues;
import com.neotys.ascode.swagger.client.model.TestDefinition;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Measurement(name = "neoload_MonitoringValues",timeUnit = TimeUnit.MILLISECONDS)
public class NeoLoadMonitoringValues extends NeoLoadMonitoringData {
    @Column(name ="count")
    private Long count ;

    @Column(name ="min")
    private Double min;

    @Column(name ="max")
    private Double max ;

    @Column(name ="sum")
    private Double sum;

    @Column(name ="avg")
    private Double avg ;

    public NeoLoadMonitoringValues(TestDefinition testDefinition, CounterDefinition counterDefinition, CounterValues values)
    {
        this.initialize(testDefinition);
        this.init_monitoringdata(counterDefinition);
        this.count=values.getCount();
        this.avg= setValue(values.getAvg());
        this.max= setValue(values.getMax());
        this.min= setValue(values.getMin());
        this.sum= setValue(values.getSum());
        this.time= Instant.ofEpochMilli(testDefinition.getEndDate());
    }

    public String toString()
    {
        StringBuilder result=new StringBuilder();
        result.append("Monitroing Points :");
        result.append("count:"+count);
        result.append(" avg:"+avg);
        result.append(" max:"+max);
        result.append(" min:"+min);
        result.append(" sum:"+sum);

        result.append(" author :"+this.author);
        result.append(" tesname :"+this.testname);
        result.append(" project :"+this.projectname);
        result.append(" scenario :"+this.scenario);
        result.append(" enddate :"+this.endDate);
        result.append(" startdate :"+this.startDate);
        result.append(" path :"+this.getPath());
        result.append(" metricname :"+this.getName());
        result.append(" time :"+this.time);
        return result.toString();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }
}
