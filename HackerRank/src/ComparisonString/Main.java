package ComparisonString;

public class Main {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);


        for (int i = 0; i <= s.length() - k; i++){
            String extraer = s.substring(i, i+k);
            int index1 = extraer.compareTo(smallest);
            int index2 = extraer.compareTo(largest);

            if (index1 < 0){
                smallest = extraer;
            }
            if(index2 > 0){
                largest = extraer;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",3));
    }
}
