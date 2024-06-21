import java.io.*;
class new_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File root=new File("C:\\Users\\venga\\OneDrive\\");
		String search=("java nptel.pdf");
		Finder fin=new Finder(root,search);
		Thread t=new Thread(fin);
		t.start();
	}

}