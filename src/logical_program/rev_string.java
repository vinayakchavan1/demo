package logical_program;

public class rev_string {

    public static void main(String[] args) {


        String org="vinayak";
        String rev="";

        for(int i=org.length()-1; i>=0; i--)
        {
            rev=rev+org.charAt(i);
        }

        System.out.println(rev);

    }
}
