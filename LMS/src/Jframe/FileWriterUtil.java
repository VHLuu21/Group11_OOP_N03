/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jframe;

/**
 *
 * @author luuvu
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {

    // Phương thức ghi thông tin đăng ký vào file login.txt
    public static void writeSignupDetailsToFile(String name, String pwd, String email, String contact) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\javaProject02\\LMS\\File\\signup.txt", true))) {
            bw.write("Tên đăng nhập: " + name + ", Mật khẩu: " + pwd + ", Email: " + email + ", Liên hệ: " + contact);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
