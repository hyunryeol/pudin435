import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;
 
public class PingTest {
    public static void main(String[] args) {
        String[] addressTmp = { "172.30.2.192"};//IP주소 적고(CMD=>IPCONFIG)
        String[] addressName = { "myComputer"};//이건 PC이름 저장?같은용도야
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