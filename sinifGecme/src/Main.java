import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        int dersSayisi = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("NOT = Girdiğiniz notlar 0 ve 100 arasında değil ise ortalamaya katılmayacaktır. ");

        System.out.print("Matematik Notunuzu Giriniz : ");
        Matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        Fizik = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        Turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        Kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        Muzik = input.nextInt();

        if (Matematik < 0 || Matematik > 100) {
            Matematik = 0;
            dersSayisi--;
        }

        if (Fizik < 0 || Fizik > 100) {
            Fizik = 0;
            dersSayisi--;
        }

        if (Turkce < 0 || Turkce > 100) {
            Turkce = 0;
            dersSayisi--;
        }

        if (Kimya < 0 || Kimya > 100) {
            Kimya = 0;
            dersSayisi--;
        }

        if (Muzik < 0 || Muzik > 100) {
            Muzik = 0;
            dersSayisi--;
        }

        double ortalama = (Matematik + Fizik + Turkce + Kimya + Muzik) / dersSayisi;
        System.out.println("Derslerinizin ortalaması : " + ortalama);

        if(ortalama<=55){
            System.out.println("Sınıfta Kaldınız.");
        }
        else{
            System.out.println("Tebrikler ! Sınıfı Geçtiniz.");
        }

    }
}
