package singleton;

public class Database {

	private String connectionString="www.mydb.ro";	// where the db is hosted
	
	public Database() {
		
	}
	
	private void connect() {
		// connect to db
	}
	
	public static Database INSTANCE = null;
	public static Database getInstance() {
		if(INSTANCE == null)
		{
			INSTANCE = new Database();
		}
		return INSTANCE;
	}
}
