1. Open Powershell and move to Kafka Folder
PS C:\WINDOWS\system32> cd C:\Kafka\kafka_2.13-3.9.0\
2. Commands to start Zookeeper and Kafka :

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Open offsetexplorer software

- cluster name- local kafka
- Bootstrap Server- localhost:9092
- kafka cluster version- 3.1
- then create topic[right click and then create]
- then go to partition and add data as message key, value ex- key- message, value- Welcome to Full Stack Java Developer Pune
- go to properties instead of byte Array select String type
- and run/ rettrieve message using play icon

-------------------------------------------------------------------------------------------------
Created ProdcuerService and ConsumerService which help in Asynchronous communication where data is not lost

