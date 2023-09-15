//-*- coding:utf-8 _*-
//"""
//@Created by Mao on 2023/9/15 18:59
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

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class copy {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //定义连接参数
        String url = "jdbc:mysql://localhost:3306/javatest?useSSL=false&serverTimezone=UTC&characterEncoding=utf-8&useUnicode=true&allowPublicKeyRetrieval=true";
        String user = "root";
        String pwd = "123456";

        //进行连接
        Connection conn = DriverManager.getConnection(url, user, pwd);

        if (conn != null) {
            System.out.println("连接成功");
            //创建Statement对象
            Statement statement =  conn.createStatement();

            //执行SQL语句
            String  sql = "select * from user";
            ResultSet resultSet = statement.executeQuery(sql);
            //判断是否查询到结果
            if (resultSet != null) {
                System.out.println("查询成功");
//                System.out.println(resultSet.next());

                ArrayList<People> peoples = new ArrayList<People>();
                while (resultSet.next()){
//                    System.out.println("running");

                    //对数据进行处理
                    String name = resultSet.getString(1);
                    int age = resultSet.getInt(2);
                    String gender = resultSet.getString(3);
                    String email = resultSet.getString(4);
                    People people  = new People(name, age, gender, email);
                    peoples.add(people);

                }

                //遍历输出
                for (People people:peoples){
                    System.out.println(people.toString());
                }

                //关闭连接
                conn.close();
                statement.close();
                resultSet.close();
                System.out.println("关闭连接");
            }

        }else{
            System.out.println("连接失败");
        }
    }
}
