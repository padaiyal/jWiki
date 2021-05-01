# Java Flight Recorder
Java Flight Recorder (JFR) is a tool used for troubleshooting and profiling data about running Java applications. It is integrated into the Java Virtual Machine (JVM) [1] since JDK 7(u4) [3]. It can be used to get thread dump, heap dump, and garbage collection information.

JFR can be used by adding the following VMOptions:

`-XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=duration=<duration>,filename=<jfrFilePath>` <br>

The options used in the command are as follows:
* -XX:+FlightRecorder: Enable JFR.
* -XX:+UnlockCommercialFeatures: because the FlightRecorder is a commercial feature it has to be unlocked to run it. This flag is not needed if you are using OpenJDK (>=8).
* -XX:StartFlightRecording=option=optionValue: It allows to configure JFR.
    * duration: The duration that JFR will run.
    * filename: The file path to save the output [2]. <br>

Other JFR options can be found [here](https://docs.oracle.com/javacomponents/jmc-5-4/jfr-runtime-guide/comline.htm#JFRUH189). <br>
JFR generates a .jfr file which can be opened with tools like JDK Mission Control as shown [here](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr005.html#BABGIJAF) and [here](https://www.overops.com/blog/oracle-java-mission-control-the-ultimate-guide/). <br>

## References
[1] https://docs.oracle.com/javacomponents/jmc-5-4/jfr-runtime-guide/about.htm#JFRUH170 <br>
[2] https://docs.oracle.com/javacomponents/jmc-5-4/jfr-runtime-guide/run.htm#JFRUH176 <br>
[3] https://www.overops.com/blog/oracle-java-mission-control-the-ultimate-guide/ <br>
