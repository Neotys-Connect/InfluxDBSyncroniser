package com.neotys.influxdb.datamodel.influxDB;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;
import com.neotys.ascode.swagger.client.model.ElementDefinition;
import com.neotys.ascode.swagger.client.model.Point;
import com.neotys.ascode.swagger.client.model.TestDefinition;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Measurement(name = "neoload_ElementPoints",timeUnit = TimeUnit.MILLISECONDS)
public class NeoLoadElementsPoints extends NeoLoadElementData {
    @Column(name ="from")
    private Long from = null;

    @Column(name ="to")
    private Long to = null;

    @Column(name ="AVG_DURATION")
    private Float AVG_DURATION = null;

    @Column(name ="MIN_DURATION")
    private Float MIN_DURATION = null;

    @Column(name ="MAX_DURATION")
    private Float MAX_DURATION = null;

    @Column(name ="COUNT")
    private Float COUNT = null;

    @Column(name ="THROUGHPUT")
    private Float THROUGHPUT = null;

    @Column(name ="ELEMENTS_PER_SECOND")
    private Float ELEMENTS_PER_SECOND = null;

    @Column(name ="ERRORS")
    private Float ERRORS = null;

    @Column(name ="ERRORS_PER_SECOND")
    private Float ERRORS_PER_SECOND = null;

    @Column(name ="ERROR_RATE")
    private Float ERROR_RATE = null;

    @Column(name ="AVG_TTFB")
    private Float AVG_TTFB = null;

    @Column(name ="MIN_TTFB")
    private Float MIN_TTFB = null;

    @Column(name ="MAX_TTFB")
    private Float MAX_TTFB = null;




    public NeoLoadElementsPoints(TestDefinition testDefinition, ElementDefinition elementDefinition, Point point)
    {
       this.initialize(testDefinition);
       this.initElement(elementDefinition);
       this.to=point.getTo();
       this.from=point.getFrom();
       this.AVG_DURATION=point.getAVGDURATION();
       this.AVG_TTFB=point.getAVGTTFB();
       this.COUNT=point.getCOUNT();
       this.ELEMENTS_PER_SECOND=point.getELEMENTSPERSECOND();
       this.ERROR_RATE=point.getERRORRATE();
       this.ERRORS=point.getERRORS();
       this.ERRORS_PER_SECOND=point.getERRORSPERSECOND();
       this.MAX_DURATION=point.getMAXDURATION();
       this.MIN_DURATION=point.getMINDURATION();
       this.MAX_TTFB=point.getMAXTTFB();
       this.MIN_TTFB=point.getMINTTFB();

       this.time= Instant.ofEpochMilli(testDefinition.getStartDate()+this.to);

    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public Float getAVG_DURATION() {
        return AVG_DURATION;
    }

    public void setAVG_DURATION(Float AVG_DURATION) {
        this.AVG_DURATION = AVG_DURATION;
    }

    public Float getMIN_DURATION() {
        return MIN_DURATION;
    }

    public void setMIN_DURATION(Float MIN_DURATION) {
        this.MIN_DURATION = MIN_DURATION;
    }

    public Float getMAX_DURATION() {
        return MAX_DURATION;
    }

    public void setMAX_DURATION(Float MAX_DURATION) {
        this.MAX_DURATION = MAX_DURATION;
    }

    public Float getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(Float COUNT) {
        this.COUNT = COUNT;
    }

    public Float getTHROUGHPUT() {
        return THROUGHPUT;
    }

    public void setTHROUGHPUT(Float THROUGHPUT) {
        this.THROUGHPUT = THROUGHPUT;
    }

    public Float getELEMENTS_PER_SECOND() {
        return ELEMENTS_PER_SECOND;
    }

    public void setELEMENTS_PER_SECOND(Float ELEMENTS_PER_SECOND) {
        this.ELEMENTS_PER_SECOND = ELEMENTS_PER_SECOND;
    }

    public Float getERRORS() {
        return ERRORS;
    }

    public void setERRORS(Float ERRORS) {
        this.ERRORS = ERRORS;
    }

    public Float getERRORS_PER_SECOND() {
        return ERRORS_PER_SECOND;
    }

    public void setERRORS_PER_SECOND(Float ERRORS_PER_SECOND) {
        this.ERRORS_PER_SECOND = ERRORS_PER_SECOND;
    }

    public Float getERROR_RATE() {
        return ERROR_RATE;
    }

    public void setERROR_RATE(Float ERROR_RATE) {
        this.ERROR_RATE = ERROR_RATE;
    }

    public Float getAVG_TTFB() {
        return AVG_TTFB;
    }

    public void setAVG_TTFB(Float AVG_TTFB) {
        this.AVG_TTFB = AVG_TTFB;
    }

    public Float getMIN_TTFB() {
        return MIN_TTFB;
    }

    public void setMIN_TTFB(Float MIN_TTFB) {
        this.MIN_TTFB = MIN_TTFB;
    }

    public Float getMAX_TTFB() {
        return MAX_TTFB;
    }

    public void setMAX_TTFB(Float MAX_TTFB) {
        this.MAX_TTFB = MAX_TTFB;
    }


}
