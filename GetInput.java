import java.io.IOException;

public class GetInput {
	
	public static String GetString()
    {
        String word = new String();
        byte A[]= new byte[100];
        try {
            System.in.read(A);
        }
        catch(IOException ex) {
        }
        for (byte a:A) {
            if (a == 13 || a == 10)
                break;
            word += ((char)a);
        }
        return word;
    }
  ///////////////////////////////////////
    public static int GetNumber()
    {
        byte A[]= new byte[100];
        try {
            System.in.read(A);
        }
        catch(IOException ex) {
        }
        int b=0;
        for (byte a:A) {
            if (a == 13 || a == 10)
                break;
            b *= 10;
            b += a - 48;

        }
        return b;
    }
    
}
