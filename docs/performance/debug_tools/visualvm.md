# VisualVM 
VisualVM is a graphical tool that displays detailed information on Java application running in the Java Virtual Machine. It can be used to troubleshoot and profile those applications [1]. <br>

This tool can be downloaded [here](https://visualvm.github.io/).

## Thread information
To view the thread information follow these steps:
1. Open VisualVM.
2. Select the Java application to track from the Application list on the left panel.
3. Click on the Thread tab from the right panel to view live thread data.
4. Click on the Thread Dump button to generate a thread dump. <br>

![visualVMThreads](images/visualvm_threads.png)

Sample Thread dump output:<br>
![visualVMThreadDump](images/visualvm_thread_dump.png)

Use this [guide](https://dzone.com/articles/how-to-read-a-thread-dump) to understand the output generated.<br>

## References
[1] https://docs.oracle.com/javase/8/docs/technotes/guides/visualvm/index.html