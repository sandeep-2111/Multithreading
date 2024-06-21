import java.io.File;

public class Finder implements Runnable{
	private File root ;
	private String search;
	public Finder(File root2, String search2) {
		super();
		this.root = root2;
		this.search = search2;
	}
	public void run() {
		search();
	}
	public void search() {
		File[] l=root.listFiles();
		for(File f:l) {
		if(f.isDirectory()) {
			Finder fin=new Finder(f,search);
			Thread t=new Thread(fin);
			t.start();
		}
		else {
			if(f.getName().equals(search)||f.getName().equals("Lab.java")) {
				System.out.println("Found"+f.getAbsolutePath());
				//break;
			}
			}
	}
	}

}
