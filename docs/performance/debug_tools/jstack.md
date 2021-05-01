# jStack [1]
jStack is a command-line tool that displays stack traces of Java threads for a specific process. <br>
It is included with the Oracle and Open JDK distributions. It can be used for debugging JVM threads and detect deadlocks. <br>
If you are using Windows OS, jStack will not work if `dbgeng.dll` (Debugging tools for Windows) is not installed and 'PATH' environment variable doesn't point to the location of `jvm.dll`.<br>

This is a tool that's included with the Oracle and Open JDK distributions. <br>

jStack can be used to get thread information with the following command:<br>

```
$ jstack -l <PID>
```

Replace <PID> with the PID of the Java application to get thread information.
Option `-l` is used print information about thread locks (e.g. deadlocks). Other options to get heap information can be found at [1]<br>

## Thread information
The following thread information shows partial output (without garbage collector data) received from jStack:
```
Full thread dump OpenJDK 64-Bit Server VM (14.0.2+12 mixed mode, sharing):

Threads class SMR info:
_java_thread_list=0x00007f020c001e80, length=12, elements={
0x00007f027802b000, 0x00007f0278306000, 0x00007f0278308000, 0x00007f027830e000,
0x00007f0278310000, 0x00007f0278312000, 0x00007f0278314000, 0x00007f0278316000,
0x00007f0278343800, 0x00007f02783b0800, 0x00007f02783b1800, 0x00007f0224001000
}

"main" #1 prio=5 os_prio=0 cpu=171108.55ms elapsed=171.20s allocated=1048K defined_classes=41 tid=0x00007f027802b000 nid=0x36dd7 runnable  [0x00007f027cd33000]
   java.lang.Thread.State: RUNNABLE
	at CpuHogger.work(CpuHogger.java:5)
	at CpuHogger.main(CpuHogger.java:11)

   Locked ownable synchronizers:
	- None

"Reference Handler" #2 daemon prio=10 os_prio=0 cpu=0.11ms elapsed=171.18s allocated=0B defined_classes=0 tid=0x00007f0278306000 nid=0x36dde waiting on condition  [0x00007f0241e7b000]
   java.lang.Thread.State: RUNNABLE
	at java.lang.ref.Reference.waitForReferencePendingList(java.base@14.0.2/Native Method)
	at java.lang.ref.Reference.processPendingReferences(java.base@14.0.2/Reference.java:241)
	at java.lang.ref.Reference$ReferenceHandler.run(java.base@14.0.2/Reference.java:213)

   Locked ownable synchronizers:
	- None
...

"VM Thread" os_prio=0 cpu=9.51ms elapsed=171.19s tid=0x00007f0278303000 nid=0x36ddd runnable  

```
## References
[1] https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jstack.html <br>