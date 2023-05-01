public class languages {
    String languages;

    languages(String a){
        languages = a;
        System.out.println(languages + " is language.");
    }

    public static void main(String[] args) {
        languages l = new languages("Sinhala");
        languages l1 = new languages("English");
        languages l2 = new languages("Tamil");
    }
}
