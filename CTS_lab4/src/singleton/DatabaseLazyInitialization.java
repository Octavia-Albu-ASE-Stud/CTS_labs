package singleton;
//singleton
//1. private constructor
//2. additional method which calls the constructor
//3.INSTANCE of the class used in the method
public class DatabaseLazyInitialization {
	
	
	private String connectionString="ww.mydb.ro";
	
	private DatabaseLazyInitialization() {
		connect();
	}
	
	private void connect() {
		//connect to db
		
	}
	
	public static DatabaseLazyInitialization INSTANCE=null;
	
	//Singleton lazy initialization(created later when needed)- NOT thread safe
	public static DatabaseLazyInitialization getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new DatabaseLazyInitialization();
		}
		return INSTANCE;
	}
	

}
