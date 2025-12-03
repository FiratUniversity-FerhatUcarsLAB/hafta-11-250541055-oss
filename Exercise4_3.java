public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
┌──────────────────────────────┐
│            ping()            │
│  - println(".")              │
└──────────────────────────────┘
┌──────────────────────────────┐
│           baffle()           │
│  - print(" wug")             │
│  - ping() çağırdı            │
└──────────────────────────────┘
┌──────────────────────────────┐
│            zoop()            │
│  - baffle() çağırdı          │
│  - sonra " You wugga " yaz.  │
└──────────────────────────────┘
┌──────────────────────────────┐
│            main()            │
│  - print("No, I ") yazdı     │
│  - sonra zoop() çağırdı      │
└──────────────────────────────┘


Çıktı
  No, I  wug. You wugga  wug.I  wug.
  
    
