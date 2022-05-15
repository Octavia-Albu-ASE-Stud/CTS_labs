package singleton;

public class DatabaseSynchronized {

private static DatabaseSynchronized INSTANCE=null;
	
	private DatabaseSynchronized() {
		
	}
	
	public static DatabaseSynchronized getInstance() {
		if(INSTANCE==null) {
			synchronized (DatabaseSynchronized.class) {
				if(INSTANCE==null) {
					INSTANCE=new DatabaseSynchronized();
				}
			}
			
		}

		return INSTANCE;
	}
	
}
