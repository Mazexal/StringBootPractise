package stringbootpractise.task;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Mazexal on 2017/7/28.
 */
public class SchedulerTask {
    private int count=0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
}
