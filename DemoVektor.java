import java.util.Vector;

class DemoVector { 
    public static void main (String[] args){
        Vector<Integer> deret = new Vector<Integer>();

        System.out.println("Panjang deret awal: "+deret.size());

        for (int i = 0; i < 10; i++){
            deret.add(i * 10);
        }

        System.out.println("\nPanjang deret setelah ditambah elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        System.out.println("\nMemeriksa apakah vector kosong: ");
        System.out.println(deret.isEmpty());    

        System.out.println("\nMencari indeks dari suatu nilai di dalam vector: ");
        System.out.println(deret.indexOf(60));  
        System.out.println(deret.indexOf(70));  
        System.out.println(deret.indexOf(80));  

        
        
    }
}