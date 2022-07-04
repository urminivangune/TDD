package checkstring;

public class ass9 {
	public static String removespecial(String str) {
	       String convertedstring;
	      convertedstring= str.replaceAll("[^a-zA-Z ]", "");
			return convertedstring;
		}
			
		
		public static void main(String[] args) {
			System.out.println(ass9.removespecial("This@ Red $car-."));
		}
	}

