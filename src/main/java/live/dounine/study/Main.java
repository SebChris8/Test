package live.dounine.study;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void sendTime(int n) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //��ȡ���ڸ�ʽ
        EmailUtil emailUtil = new EmailUtil();
        for (int i = 0; i < n; i++) {
            String time = df.format(new Date()); // new Date()��ȡϵͳʱ��
            emailUtil.send("1398775803@qq.com", "1398775803@qq.com", "Time", time);  //�����ʼ�
        }
    }

    public static void main(String [] agrs) throws Exception {
        sendTime(1);  
    }
}
