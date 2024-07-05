import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float kg, boy, vkIndex, maxSaglikliKilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        kg = input.nextFloat();

        System.out.print("Boyunuzu giriniz (metre cinsinden, örneğin 1,8): ");
        boy = input.nextFloat();

        vkIndex = kg / (boy * boy);
        maxSaglikliKilo = 30 * (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vkIndex);
        System.out.println("Maksimum sağlıklı kilonuz: " + maxSaglikliKilo + " kg");

        if (vkIndex < 20) {
            System.out.println("İdeal kilodasınız.");
        } else if (vkIndex >= 20 && vkIndex < 30) {
            System.out.println("Aşırı yağlısınız.");
        } else if (vkIndex >= 30) {
            System.out.println("Obezsiniz.");
        }

        if (kg > maxSaglikliKilo) {
            System.out.println("Sağlığınız için dikkat etmelisiniz.");
        }

        input.close();
    }
}
