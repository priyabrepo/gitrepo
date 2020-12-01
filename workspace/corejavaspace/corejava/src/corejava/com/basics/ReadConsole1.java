package corejava.com.basics;

public class ReadConsole1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String name = System.console().readLine();
            // this does not work in not interactive envirnment like anIDE
            System.out.println(name);
	}

}
