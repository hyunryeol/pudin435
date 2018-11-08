import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;
 
public class PingTest {
    public static void main(String[] args) {
        String[] addressTmp = { "172.30.2.192"};//IP�ּ� ����(CMD=>IPCONFIG)
        String[] addressName = { "myComputer"};//�̰� PC�̸� ����?�����뵵��
        while (true) {
            for (int i = 0; i < addressTmp.length; i++) {
 
                try {
                    Thread.sleep(3000);
                    InetAddress targetIp = InetAddress.getByName(addressTmp[i]);
 
                    boolean value = targetIp.isReachable(5000);
                    if (value) {
                        System.out.println(addressTmp[i] + "-" + addressName[i]
                                + " =>onLinePC");
                    } else {
                        System.out.println(addressTmp[i] + "-" + addressName[i]
                                + " =>offLinePC");
 
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}