FROM java:8
ADD gcptest.jar gcptest.jar
CMD /usr/bin/java -jar gcptest.jar
