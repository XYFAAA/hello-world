import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 200,
//                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        //核心线程数=最大线程数
//        ExecutorService pool = Executors.newFixedThreadPool(5);

        //单一线程池
        ExecutorService pool = Executors.newSingleThreadExecutor();

        //缓存线程池
//        ExecutorService pool = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++) {
            Task task=new Task(i);
            pool.execute(task);
        }
        pool.shutdown();

        //定时线程池
//        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        // 以固定频率执行
       /* pool.scheduleAtFixedRate(
                new Runnable() {
                                     @Override
                                     public void run() {
                                         System.out.println("正在执行任务");
                                         try {
                                             Thread.sleep(3000);
                                         } catch (InterruptedException e) {
                                             e.printStackTrace();
                                         }
                                         System.out.println("线程执行完毕");
                                     }
                                 },
                0,4,TimeUnit.SECONDS);*/

       // 延时执行（上一线程执行完后再执行）
       /* pool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("正在执行任务");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程执行完毕");
            }
        },0,4,TimeUnit.SECONDS);*/



    }


}
