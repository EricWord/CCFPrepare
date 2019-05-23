package Code0522;

import java.util.Scanner;

/**
 * @Description 寻找最大矩形
 * @Author eric
 * @Version V1.0.0
 * @Date 2019/5/22
 */
public class FindMaxRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //矩形的数量
        int n = input.nextInt();
        //各个矩形的高度
        int high[] = new int[n];
        //最大面积
        int maxArea = 0;
        //输入
        for (int i = 0; i < n; i++) {
            high[i] = input.nextInt();

        }

        //进行n次寻找，寻找宽度分别为1-n的矩形
        for (int i = 0; i < n; i++) {//本层循环是寻找是每次增量一个矩形，小矩形拼接成大矩形
            System.out.println("i="+i+":");
            for (int j = 0; j < n - i; j++) {
                System.out.print("j="+j+" ");
                int minH = high[j];
                System.out.print("minH="+minH+" ");
                //在这个范围里找最小的高
                for (int k = j + 1; k < j + i + 1; k++) {
                    if (high[k] < minH)
                        minH = high[k];
                    System.out.print("k层循环,"+"k="+k+" minH="+minH+" ");
                }
                int area = minH * (i + 1);
                System.out.print("area="+area+" ");
                if (area > maxArea)
                    maxArea = area;
                System.out.println("maxArea="+maxArea+" ");
            }


        }
        System.out.println("最终结果，最大面积为："+maxArea);


    }
}
