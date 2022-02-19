package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] time = new int[]{60, 3600, 3600*24, 3600*24*7, 3600*24*30};
        Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> arrayList = new ArrayList<>();
       ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            arrayList2.add(arrayList.get(i) * time[i]);
        }
        System.out.println("------------------");
        Collections.sort(arrayList2);
        Collections.sort(arrayList2, Collections.reverseOrder());
        System.out.println(arrayList2);
        Collections.shuffle(arrayList2);
        System.out.println(Collections.max(arrayList2));
        System.out.println(Collections.min(arrayList2));
        Collections.fill(arrayList2, 24);
        System.out.println(arrayList2);

    }
}

/*
Программа должна содержать класс Main, в котором необходимо создать список ArrayList из цифр.

        Список из цифр должен содержать количество секунд в минуте, часе, сутках, неделе и месяце из 30 дней (все значения должны быть вычислены в программе)

        С помощью класса Collections нужно:
        * отсортировать список
* распечать список отсортированный в обратном порядке
        * перемещать и затем найти максимальное и минимальное значение в   списке и распечатать его
* заполнить весь список числом 42`
 */
