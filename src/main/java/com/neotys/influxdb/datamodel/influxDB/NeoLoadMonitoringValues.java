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
    private Long count = null;

    @Column(name ="min")
    private Float min = null;

    @Column(name ="max")
    private Float max = null;

    @Column(name ="sum")
    private Float sum = null;

    @Column(name ="avg")
    private Float avg = null;

    public NeoLoadMonitoringValues(TestDefinition testDefinition, CounterDefinition counterDefinition, CounterValues values)
    {
        this.initialize(testDefinition);
        this.init_monitoringdata(counterDefinition);
        this.count=values.getCount();
        this.avg=values.getAvg();
        this.max=values.getMax();
        this.min=values.getMin();
        this.sum=values.getSum();
        this.time= Instant.ofEpochMilli(testDefinition.getEndDate());
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    public Float getAvg() {
        return avg;
    }

    public void setAvg(Float avg) {
        this.avg = avg;
    }
}
