## jmap [1]
jmap is a tool to print and export information on the JVM memory. <br>
This is a tool that's included with the Oracle and Open JDK distributions. <br>
It can be used to generate a heap dump as follows:
```
$ jmap -dump:live,file=<DESTINATION_FILEPATH> <JAVA_PROCESS_ID>
```
The options used in the command are as follows:
* live: If set, it only exports objects that are still referred. This parameter is optional
* file: The destination heap dump file.
* pid: Java process ID.

Other options to get heap information can be found at [1]. <br>
The output would be a .hprof file generated in the destination path provided. <br>
It can be opened with tools like Eclipse Memory Analyzer Tool (MAT) as shown [here](https://www.vogella.com/tutorials/EclipseMemoryAnalyzer/article.html).


# References
[1] https://docs.oracle.com/javase/7/docs/technotes/tools/share/jmap.html <br>
