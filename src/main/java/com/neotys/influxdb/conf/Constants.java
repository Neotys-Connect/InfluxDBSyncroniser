package com.neotys.influxdb.conf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final String HEALTH_PATH="/health";
    public static final String WEBHOOKPATH="/webhook";
    public static final String DEFAULT_NL_SAAS_API_URL="";
    public static final String DEFAULT_NL_WEB_API_URL="";
    public static final String API_URL_VERSION="/v1";
    public static final String TESTID_KEY="testid";

    public static final String SECRET_API_TOKEN="NL_API_TOKEN";
    public static final String SECRET_NL_WEB_HOST="NL_WEB_HOST";
    public static final String SECRET_SSL="ssl";
    public static final String SECRET_NL_API_HOST="NL_API_HOST";
    public static final String SECRET_PORT="PORT";
    public static String LOGING_LEVEL_KEY="logging-level";
    public static int HTTP_PORT=8080;
    public static final String SECRET_INFLUXDB_HOST="InfluxDBHost";
    public static final String SECRET_INFLUXDB_PORT="InfluxDBport";
    public static final String DEFAULT_INFLUXDB_PORT="8086";
    public static final String SECRET_INFLUXDB_DATABASE="InfluxDBdatabase";
    public static final String SECRET_INFLUXDB_USER ="INfluxDBuser";
    public static final String SECRET_INFLUXDB_PASSWORD ="INfluxDBpassword";



    public static final String SLA_TYPE_PERINTERVAL="PerTimeInterval";
    public static final String SLA_TYPE_PERTEST="PerRun";


    public static final String NEOLOAD="neoload";


    public static final String HTTPS="https://";
    public static final String NEOLAOD_WEB_URL="/#!result/";
    public static final String NEOLAOD_WEB_LASTPART_URL="/overview";

    public static final String NEOLOAD_ENDSTATUS="PASSED";

    //-----SLA Status

    public static final List<String> ELEMENT_LIST_CATEGORY = Arrays.asList("TRANSACTION");

   // public static final List<String> ELEMENT_LIST_CATEGORY = new ArrayList<>(  Arrays.asList("TRANSACTION", "PAGE","REQUEST"));
    public static final String ELEMENT_STATISTICS="AVG_DURATION,MIN_DURATION,MAX_DURATION,COUNT,THROUGHPUT,ELEMENTS_PER_SECOND,ERRORS,ERRORS_PER_SECOND,ERROR_RATE,AVG_TTFB,MIN_TTFB,MAX_TTFB" ;

}
