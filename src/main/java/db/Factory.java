package db;

import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import java.net.UnknownHostException;

public class Factory {

	private static MongoClient mongoClient;
	
	private static Morphia morphia;
	
	private static Datastore datastore; 
	
	public static MongoClient getMongoClient() {
		try {
			if (mongoClient == null) {
				mongoClient = new MongoClient(DBParameters.hostName, DBParameters.port);
				return mongoClient;
			} else {
				return mongoClient;
			}
		} catch (UnknownHostException e) {
			System.out.println("Exception caught!");
			return null;
		}
	}
	
	public static Morphia getMorphia() {
		if (morphia == null) {
			morphia = new Morphia();
			return morphia;
		} else {
			return morphia;
		}
	}
	
	public static Datastore getDatastore() {
		getMongoClient();
		getMorphia();
		
		if (datastore == null) {
			datastore = morphia.createDatastore(mongoClient, DBParameters.dBName);
			return datastore;
		} else {
			return datastore;
		}
	}
}
