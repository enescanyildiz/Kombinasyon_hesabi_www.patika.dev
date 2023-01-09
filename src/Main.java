import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n,r,fark;
        int n_fac=1,r_fac=1,fark_fac=1;
        System.out.println("-------------------C(n,r) Kombinasyon Hesabı-------------------");
        System.out.print("C(n,r) kombinasyon gösteriminde hesaplanacak 'n' değerini giriniz: ");
        n=input.nextInt();
        System.out.print("C(n,r) kombinasyon gösteriminde hesaplanacak 'r' değerini giriniz: ");
        r=input.nextInt();
        System.out.println("Hesaplanacak kombinasyon= C("+n+","+r+")");
        fark=n-r;
        for(int i=1; i<=n;i++)
        {
            n_fac=n_fac*i;
        }
        for(int i=1; i<=r;i++)
        {
            r_fac=r_fac*i;
        }
        for(int i=1; i<=fark;i++)
        {
            fark_fac=fark_fac*i;
        }
        int sonuc=n_fac/(r_fac*fark_fac);
        System.out.println("Sonuç= "+sonuc);
    }
}
