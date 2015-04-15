package blogs;

import java.util.Collection;

public interface BlogStorage {

	public Collection<BlogPost> findAll();
	
	public void insert(BlogPost p);
}
