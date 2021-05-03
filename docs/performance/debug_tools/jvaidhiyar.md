#jVaidhiyar
jVaidhiyar is an open source library that retrieves JVM related resource usage and configuration data. <br>

More information about this library can be found [here](https://github.com/padaiyal/jVaidhiyar).
## Thread information
### Code
```
// Get information on JVM threads.
int threadStackDepth = 10;
String commonFormat = "threadName: %s, threadId: %d, state: %s, cpu: %s, allocatedMemoryBytes: %d\n";
ExtendedThreadInfo[] extendedThreadInfos = JvmUtility.getAllExtendedThreadInfo(threadStackDepth);
StringBuilder results = new StringBuilder();
for (ExtendedThreadInfo extendedThreadInfo : extendedThreadInfos) {
   double threadCpuUsage = extendedThreadInfo.getCpuUsage();
   ThreadInfo threadInfo = extendedThreadInfo.getThreadInfo();
   long threadMemoryAllocatedInBytes = extendedThreadInfo.getMemoryAllocatedInBytes();
   String threadPrint = String.format(commonFormat,
       threadInfo.getThreadName(),
       threadInfo.getThreadId(),
       threadInfo.getThreadState().toString(),
       threadCpuUsage,
       threadMemoryAllocatedInBytes
   );
   results.append(threadPrint);
}
System.out.print(results.toString());
```
The `ExtendedThreadInfo` object contains a [ThreadInfo](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.htmlhttps://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html) object which can be used to retrieve more information.

### Sample output
```
threadName: main, threadId: 1, state: RUNNABLE, cpu: -1.0, allocatedMemoryBytes: 7983144
threadName: Reference Handler, threadId: 2, state: RUNNABLE, cpu: -1.0, allocatedMemoryBytes: 0
threadName: Finalizer, threadId: 3, state: WAITING, cpu: -1.0, allocatedMemoryBytes: 0
threadName: Signal Dispatcher, threadId: 4, state: RUNNABLE, cpu: -1.0, allocatedMemoryBytes: 0
threadName: Common-Cleaner, threadId: 11, state: TIMED_WAITING, cpu: -1.0, allocatedMemoryBytes: 0
threadName: Monitor Ctrl-Break, threadId: 12, state: RUNNABLE, cpu: -1.0, allocatedMemoryBytes: 116816
threadName: Notification Thread, threadId: 13, state: RUNNABLE, cpu: -1.0, allocatedMemoryBytes: 0
threadName: pool-1-thread-1, threadId: 15, state: RUNNABLE, cpu: -1.0, allocatedMemoryBytes: 66984
```