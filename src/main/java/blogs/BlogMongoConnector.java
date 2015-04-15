package blogs;

import org.mongodb.morphia.Datastore;
import java.util.Collection;
import db.Factory;

public class BlogMongoConnector implements BlogStorage{

	private Datastore ds;
	
	public BlogMongoConnector() {
		ds = Factory.getDatastore();
	}
	
	public Collection<BlogPost> findAll() {		
		return ds.find(BlogPost.class).order("timestamp").asList();
	}
	
	public void insert(BlogPost post) {
		ds.save(post);
	}
}
