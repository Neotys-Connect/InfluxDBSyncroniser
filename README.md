# NeoLoad INFLUXDB Grafana Synchroniser

This project is stream out all data of a neoload test to InfluxDB
This project has one container :
* `neoload_influxdbsync` : container that will listen for NeoLoad WEB webhook calls. ONce received a notification ( "test started") the service will extract the NeoLoad and feed the InfluxDB database.

## WebHook Handler : neoload_influxdbsync

###Configuration
The webhook handler is a web service package in a container : `neotyspartnersolution/neoload_influxdbsync`
The container will required different to define ther right environement variables

####  Docker environement variables 
To be able to import NeoLoad test results you will need to specify :
* `NL_WEB_HOST`: Hostname of the webui of NeoLoad WEB
* `NL_API_HOST` : Hostname of the rest-api of NeoLoad WEB
* `NL_API_TOKEN` : API token of NeoLoad WEB ( [how to generate an API token](https://www.neotys.com/documents/doc/nlweb/latest/en/html/#24270.htm))
* `PORT`  : Port that the service will listen to
* `logging-level` : Logging level of the service ( DEBUG, INFO, ERROR)
* `InfluxDBdatabase` : InfluxDB database that will receive all the NeoLoad measurements
* `INfluxDBuser` : INfluxdb user that the service will connnect. this user needs to have the write permission on the database
* `INfluxDBpassword` : Password to connect to influxdb
* `InfluxDBHost` : Hostname to connect to the influxdb database
* `InfluxDBport` : api port of the influxdb . ( default 8086)

#### Run the webhookHandler

Requirements : Server having :
* docker installed
* acessible from NeoLoad WEB ( Saas our your managemend instance of NeoLoad WEB)

The deployment will use  :
* `/deploy/docker-compose.yaml` to connect spin up the service, influxdb and grafana

Make sure to update the docker-compose file by specifying the Environment variables.

the deployment will be done by running the following command :
```bash
docker-compose -f <docker file> up -d
```
#### Configure the WebHook in your NeoLoad Web Account to send a notification to your WebHook service

The webhookhandler service is listenning to 2 disctinct endpoints :
* `/Health` : Get request build to check if the webhookhandler is up
* `/webhook` : POST request to receive the webhook from NeoLoad WEB

The Webhookhandler is expecting the following Json Payload :
```json
{
	"testid" : "TESTID"
}
```

To configure the webhook in NeoLoad WEB you will need to :
1. Connect to NeoLoad WEB
2. Click on 
3. Click On the TAB named WebHook
4. Create a new Webhook ( [How to create a webhook](https://www.neotys.com/documents/doc/nlweb/latest/en/html/#27141.htm))
5. URL of the webhook : http://<IP of you WEBHOOKHANDLER>:8080/webhook
6. Events : Test started
7. Payload :
```json
{
            "testid": "$(test_result_id)"
}
```
<p align="center"><img src="/screenshots/webhook.png" alt="InfluxDB webhok" /></p>
