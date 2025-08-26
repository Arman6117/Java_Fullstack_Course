package _13_Polymorphism;

public class Development {
    int phNo;
    String chat;

    Development(int phNo, String chat) {
        this.chat = chat;
        this.phNo = phNo;
    }

    void whatsApp() {
        System.out.println("WhatsApp No: " + phNo);
        System.out.println("Chat box: " + chat);
    }

    void whatsApp(int... calls) {
        int count = 0, dplCnt = 1, dplNo = 0;
        for (int i = 0; i < calls.length; i++) {
            for (int j = i + 1; j < calls.length; j++) {
                if (calls[i] == calls[j]) {
                    dplNo = calls[i];
                    dplCnt++;
                }
            }
            count++;
            System.out.println("Call from: " + calls[i]);
        }
        System.out.println(dplCnt > 1 ? dplCnt + " calls from " + dplNo : null);
        System.out.println("Total received calls: " + count);
    }

    void whatsApp(int vc, String status) {
        System.out.println("Received VC: " + vc);
        System.out.println("Status: " + status);
    }

    void whatsApp(float amount, int number) {
        System.out.println("Processing Payment.....");

        System.out.println("Successfully paid: "+amount + " to " + number);
    }
}

class WhatsAppClient {
    public static void main(String[] args) {
        Development obj = new Development(23444, "Hellow");
        obj.whatsApp();
        System.out.println("------------------------------------------");
        obj.whatsApp(290011);
        System.out.println("------------------------------------");
        obj.whatsApp(123, 111, 333, 55, 111, 44);
        System.out.println("--------------------------------------");
        obj.whatsApp(3, "Hlloo");
        System.out.println("--------------------------------------");
        obj.whatsApp(2000, 1234);
    }
}