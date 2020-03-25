package com.neotys.influxdb.datamodel.influxDB;


import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;
import com.neotys.ascode.swagger.client.model.ElementDefinition;
import com.neotys.ascode.swagger.client.model.ElementValues;
import com.neotys.ascode.swagger.client.model.TestDefinition;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Measurement(name = "neoload_ElementValues",timeUnit = TimeUnit.MILLISECONDS)
public class NeoLoadElementsValues extends  NeoLoadElementData {

    @Column(name ="count")
    private Long count = null;

    @Column(name ="elementPerSecond")
    private Float elementPerSecond = null;

    @Column(name ="minDuration")
    private Long minDuration = null;

    @Column(name ="maxDuration")
    private Long maxDuration = null;

    @Column(name ="sumDuration")
    private Long sumDuration = null;

    @Column(name ="avgDuration")
    private Float avgDuration = null;

    @Column(name ="minTTFB")
    private Long minTTFB = null;

    @Column(name ="maxTTFB")
    private Long maxTTFB = null;

    @Column(name ="sumTTFB")
    private Long sumTTFB = null;

    @Column(name ="avgTTFB")
    private Float avgTTFB = null;

    @Column(name ="sumDownloadedBytes")
    private Long sumDownloadedBytes = null;

    @Column(name ="downloadedBytesPerSecond")
    private Float downloadedBytesPerSecond = null;

    @Column(name ="successCount")
    private Long successCount = null;

    @Column(name ="successPerSecond")
    private Float successPerSecond = null;

    @Column(name ="successRate")
    private Float successRate = null;

    @Column(name ="failureCount")
    private Long failureCount = null;

    @Column(name ="failurePerSecond")
    private Float failurePerSecond = null;

    @Column(name ="failureRate")
    private Float failureRate = null;

    @Column(name ="percentile50")
    private Float percentile50=null;
    @Column(name ="percentile90")
    private Float  percentile90=null;

    @Column(name ="percentile95")
    private Float percentile95=null;

    @Column(name ="percentile99")
    private Float percentile99=null;

    public NeoLoadElementsValues(TestDefinition testDefinition, ElementDefinition elementDefinition, ElementValues values)
    {
        this.initialize(testDefinition);
        this.initElement(elementDefinition);
        this.count=values.getCount();
        this.avgDuration=values.getAvgDuration();
        this.avgTTFB=values.getAvgTTFB();
        this.downloadedBytesPerSecond=values.getDownloadedBytesPerSecond();
        this.elementPerSecond=values.getElementPerSecond();
        this.failureCount=values.getFailureCount();
        this.failurePerSecond=values.getFailurePerSecond();
        this.failureRate=values.getFailureRate();
        this.maxDuration=values.getMaxDuration();
        this.maxTTFB=values.getMaxTTFB();
        this.minDuration=values.getMinDuration();
        this.minTTFB=values.getMinTTFB();
        this.percentile50=values.getPercentile50();
        this.percentile90=values.getPercentile90();
        this.percentile95=values.getPercentile95();
        this.percentile99=values.getPercentile99();
        this.successCount=values.getSuccessCount();
        this.successPerSecond=values.getSuccessPerSecond();
        this.successRate=values.getSuccessRate();
        this.sumDownloadedBytes=values.getSumDownloadedBytes();
        this.sumDuration=values.getSumDuration();
        this.sumTTFB=this.getSumTTFB();
        this.time= Instant.ofEpochMilli(testDefinition.getEndDate());
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Float getElementPerSecond() {
        return elementPerSecond;
    }

    public void setElementPerSecond(Float elementPerSecond) {
        this.elementPerSecond = elementPerSecond;
    }

    public Long getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
    }

    public Long getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Long getSumDuration() {
        return sumDuration;
    }

    public void setSumDuration(Long sumDuration) {
        this.sumDuration = sumDuration;
    }

    public Float getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(Float avgDuration) {
        this.avgDuration = avgDuration;
    }

    public Long getMinTTFB() {
        return minTTFB;
    }

    public void setMinTTFB(Long minTTFB) {
        this.minTTFB = minTTFB;
    }

    public Long getMaxTTFB() {
        return maxTTFB;
    }

    public void setMaxTTFB(Long maxTTFB) {
        this.maxTTFB = maxTTFB;
    }

    public Long getSumTTFB() {
        return sumTTFB;
    }

    public void setSumTTFB(Long sumTTFB) {
        this.sumTTFB = sumTTFB;
    }

    public Float getAvgTTFB() {
        return avgTTFB;
    }

    public void setAvgTTFB(Float avgTTFB) {
        this.avgTTFB = avgTTFB;
    }

    public Long getSumDownloadedBytes() {
        return sumDownloadedBytes;
    }

    public void setSumDownloadedBytes(Long sumDownloadedBytes) {
        this.sumDownloadedBytes = sumDownloadedBytes;
    }

    public Float getDownloadedBytesPerSecond() {
        return downloadedBytesPerSecond;
    }

    public void setDownloadedBytesPerSecond(Float downloadedBytesPerSecond) {
        this.downloadedBytesPerSecond = downloadedBytesPerSecond;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public Float getSuccessPerSecond() {
        return successPerSecond;
    }

    public void setSuccessPerSecond(Float successPerSecond) {
        this.successPerSecond = successPerSecond;
    }

    public Float getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Float successRate) {
        this.successRate = successRate;
    }

    public Long getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Long failureCount) {
        this.failureCount = failureCount;
    }

    public Float getFailurePerSecond() {
        return failurePerSecond;
    }

    public void setFailurePerSecond(Float failurePerSecond) {
        this.failurePerSecond = failurePerSecond;
    }

    public Float getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(Float failureRate) {
        this.failureRate = failureRate;
    }

    public Float getPercentile50() {
        return percentile50;
    }

    public void setPercentile50(Float percentile50) {
        this.percentile50 = percentile50;
    }

    public Float getPercentile90() {
        return percentile90;
    }

    public void setPercentile90(Float percentile90) {
        this.percentile90 = percentile90;
    }

    public Float getPercentile95() {
        return percentile95;
    }

    public void setPercentile95(Float percentile95) {
        this.percentile95 = percentile95;
    }

    public Float getPercentile99() {
        return percentile99;
    }

    public void setPercentile99(Float percentile99) {
        this.percentile99 = percentile99;
    }
}
