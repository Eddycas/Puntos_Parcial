import java.io.*;


public class Parcial_4 {
	 static BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
	 static BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
	    
 public static void main(String[] args) throws IOException {
	   
	 int [] Day = new int [7];
	 bw.write ("Digite el valor del Producto por Dia \n");
	 bw.flush();

	 int i;
	 for (i = 0; i < Day.length; i++) {
		 
		 int valor = Integer.parseInt(br.readLine() );
		 Day[i] = valor;
	 }
	 
	 int Menor = Day[0];
	 int Mayor = Day[0];
	 int diferencia=0;
	 
	 for (int j = 0; j < Day.length; j++) {
			
			 if(Day[j] < Menor){
				 
				 Menor = Day[j];
			 }
		 
	 }
	 
	 System.out.println(Menor);
	 
	 for (int x = 0; x < Day.length; x++) {
			 
			 
			 if(Day[x] > Mayor){
	 
				 Mayor = Day[x];
			 }		  
      }

	 System.out.println(Mayor);
	 
	 diferencia = Mayor - Menor;
	 
	 System.out.println("La ganancia es de " + diferencia);
	 
   }
}