FROM java:8
ADD /target/gcptest.jar gcptest.jar
CMD /usr/bin/java -jar gcptest.jar
