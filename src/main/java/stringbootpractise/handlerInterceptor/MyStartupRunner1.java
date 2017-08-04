package stringbootpractise.handlerInterceptor;

import org.springframework.boot.CommandLineRunner;

public class MyStartupRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
