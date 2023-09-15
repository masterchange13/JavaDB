//-*- coding:utf-8 _*-
//"""
//@Created by Mao on 2023/9/15 17:01
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
//""
// 导入jdbc
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


// 创建一个数据库连接
public class db {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        try {
            Class.forName(driver);
            //建立连接
            conn = DriverManager.getConnection(url, user, password);

            //创建Statement对象
            //执行sql语句
            stmt = conn.createStatement();
            sql = "select * from user";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" + rs.getString("age") + "\t" + rs.getString("gender") + rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
























