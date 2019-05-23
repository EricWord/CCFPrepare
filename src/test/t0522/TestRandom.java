package test.t0522;

import org.junit.Test;

import java.util.Random;

/**
 * @Description 测试随机数
 * @Author eric
 * @Version V1.0.0
 * @Date 2019/5/22
 */
public class TestRandom {

    @Test
    public void test1(){
        Random random = new Random();
//        random.setSeed(20);
        int i = random.nextInt(100);
        System.out.println(i);


    }


}
