public class Task implements Runnable {

    private int num;
    public Task(int num) {
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println("����ִ������  "+num);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("�߳�"+num+"ִ�����");
    }
}
