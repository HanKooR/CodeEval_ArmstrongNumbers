import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int number = Integer.parseInt(line);
            int n = line.length();
            int sumOfPowers = 0;
            for(int i = 0; i < line.length(); i++){
            	sumOfPowers += Math.pow(Integer.parseInt("" + line.charAt(i)), n);
            }
            if(sumOfPowers == number){
            	System.out.println("True");
            }
            else{
            	System.out.println("False");
            }
        }
        buffer.close();
    }
}
