import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {

    private int p;

    void setName(int t) {
        if (t > 10) {
            p = t % 10;
        }else if (t<=10){
            p=t;
        }
    }
    int getName() {
        return p;
    }
}

class TestTrafficLights {
    public static void main(String[] args) throws IOException {
        TrafficLights k = new TrafficLights();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value");
        int t = Integer.parseInt(br.readLine());
        k.setName(t);
        //int green =3;
        //int red =2;

        int p = k.getName();
        System.out.println(p);

        if (0 <= p && p <= 3 || 6 <= p && p <= 8) {
            System.out.println("Green");
        }
        if (4 <= p && p <= 5 || 9 <= p && p <= 10) {
            System.out.println("Red");
        }
    }
}


