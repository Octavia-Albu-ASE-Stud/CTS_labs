package singleton;

public class DatabaseEarlyInitialization {
	
	//private static DatabaseEarlyInitialization INSTANCE=new DatabaseEarlyInitialization();
		private static DatabaseEarlyInitialization INSTANCE=null;
		
		static {
			try {
				INSTANCE=new DatabaseEarlyInitialization(-1);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		private DatabaseEarlyInitialization(int something) throws Exception {
			if(something<0) {
				throw new Exception();
			}
		}
		
		public static DatabaseEarlyInitialization getInstance() {
			return INSTANCE;
		}

}
