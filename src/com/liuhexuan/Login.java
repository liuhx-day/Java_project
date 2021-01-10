package com.liuhexuan;
/**
 * @Current File Name: Login.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/8 0:13
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

import javax.swing.*;

/**
 * @ClassName Login
 * @Description TODO:登录功能
 * @Author 刘赫轩
 * @Date 2021/1/8 0:13
 * @Version 1.0
 **/
public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().Login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton loginbutton;
    private JLabel username;
    private JLabel valid;
    private JLabel pwd;
    private JPasswordField pwdfield;
    private JTextField usernamefiled;
    private JTextField validfield;
    private JPanel Login;
}
