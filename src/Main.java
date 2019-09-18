import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 200,
//                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        //�����߳���=����߳���
//        ExecutorService pool = Executors.newFixedThreadPool(5);

        //��һ�̳߳�
        ExecutorService pool = Executors.newSingleThreadExecutor();

        //�����̳߳�
//        ExecutorService pool = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++) {
            Task task=new Task(i);
            pool.execute(task);
        }
        pool.shutdown();

        //��ʱ�̳߳�
//        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        // �Թ̶�Ƶ��ִ��
       /* pool.scheduleAtFixedRate(
                new Runnable() {
                                     @Override
                                     public void run() {
                                         System.out.println("����ִ������");
                                         try {
                                             Thread.sleep(3000);
                                         } catch (InterruptedException e) {
                                             e.printStackTrace();
                                         }
                                         System.out.println("�߳�ִ�����");
                                     }
                                 },
                0,4,TimeUnit.SECONDS);*/

       // ��ʱִ�У���һ�߳�ִ�������ִ�У�
       /* pool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("����ִ������");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("�߳�ִ�����");
            }
        },0,4,TimeUnit.SECONDS);*/



    }


}
