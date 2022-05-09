import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Enter image file name to be encrypted(with png extension)");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		Crypter c = new Crypter(s); // Key picture.
		System.out.println("Enter text to be encrypted");
		String text = sc.nextLine();
		System.out.println("Enter image file name after encryption(with png extension)");
		String jot = sc.nextLine(); 
		//Crypt
		c.encrypt(text,jot);
		
		//Decrypt
		System.out.println("decrypted data");
		System.out.println(c.deCrypt(jot));
		
	}
}


