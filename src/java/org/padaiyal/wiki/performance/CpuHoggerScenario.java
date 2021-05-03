/**
 * Application that has a thread that hoggers most of the CPU compared to other threads.
 */
public class CpuHoggerScenario {

  /**
   * Number of iterations.
   */
  private static final long maxIterations = Integer.MAX_VALUE;

  /**
   * Creates three normal threads and a CPU hogger thread.
   *
   * @param args The arguments provided to the application.
   */
  public static void main(String[] args) {
    int maxNormalThreads = 3;
    for (int i = 0; i < maxNormalThreads; i++) {
      Thread normalThread = new Thread(new NormalThread());
      normalThread.setName(String.format("NormaThread-%d", i));
      normalThread.start();
    }
    Thread cpuHogger = new Thread(new CpuHogger());
    cpuHogger.setName("CpuHogger");
    cpuHogger.start();
  }

  /**
   * Abstraction of the thread that hoggers most of the CPU usage.
   */
  static class CpuHogger implements Runnable {

    /**
     * Increases a counter continuously until the maximum provided is reached.
     */
    @Override
    public void run() {
      int counter = 0;
      for (long i = 0; i < maxIterations; i++) {
        System.out.println(counter++);
      }
    }
  }

  /**
   * Abstraction of the thread that hoggers most of the CPU usage.
   */
  static class NormalThread implements Runnable {

    /**
     * Increases a counter until the maximum provided is reached, but sleeps in between iterations.
     */
    @Override
    public void run() {
      int counter = 0;
      for (long i = 0; i < maxIterations; i++) {
        try {
          Thread.sleep(1_000);
        } catch (InterruptedException ignored) {
        }
        System.out.println(counter++);
      }
    }
  }
}
