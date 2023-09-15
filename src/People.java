//-*- coding:utf-8 _*-
//"""
//@Created by Mao on 2023/9/15 20:17
//@Author:mao
//@Github:https://github.com/masterchange14?tab=projects
//@Gitee:https://gitee.com/master_change13
// 
//@File: python_test.py
//@Time: 2023
//@Motto:不积跬步无以至千里，不积小流无以成江海，程序人生的精彩需要坚持不懈地积累！
//@target: 大厂offer，高年薪
//
//@@ written by GuangZhi Mao
//
//@from:
//@code target:
//"""

import java.util.StringTokenizer;

public class People {
    String name;
    int age;
    String gender;
    String email;

    public People(String name, int age, String gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public String toString() {
        return name + " " + age + " " + gender + " " + email;
    }

    public static void main(String[] args) {
        String str = "GuangZhi Mao 25 male <guangzhi.mao@gmail.com>";
        StringTokenizer st = new StringTokenizer(str);
    }
}
