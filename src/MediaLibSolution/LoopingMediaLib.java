package MediaLibSolution;

public class LoopingMediaLib {
    public static void main(String[] args) {
        String s = MediaFile.readString();
        /*while (s != null) {
            System.out.println("From file : " + s);
            s = MediaFile.readString();
            }*/
//        while (s != null) {
//            String title = s.substring(0, s.indexOf("|"));
//            System.out.println("Title : " + title);
//            String rating = s.substring(s.indexOf("|"), s.length());
//            System.out.println("Rating : " + rating);
//            System.out.println();
//            s = MediaFile.readString();
//        }
        while (s != null) {
            String title = s.substring(0, s.indexOf("|"));
            int rating = Integer.parseInt(s.substring(s.indexOf("|") + 2, s.length()));
            if (rating >= 9) {
                System.out.println("Title : " + title);
                System.out.println("Rating : " + rating);
            }
            s = MediaFile.readString();
        }
    }
}