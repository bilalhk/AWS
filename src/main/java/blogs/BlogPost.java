package blogs;

import org.mongodb.morphia.annotations.Entity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import java.util.Date;
import users.User;

@Entity("blogPosts")
public class BlogPost {
	
	@Id private ObjectId id;
	
	private String title;
	private User author;
	private String content;
	
	private Date timestamp;
		
	public BlogPost(User auth, String cont) {
		timestamp = new Date();
		author = auth;
		content = cont;
	}
	
	public BlogPost() {}
	
	public void setAuthor(User auth) {author = auth;}
	
	public void setContent(String cont) {content = cont;}
	
	public void setTimestamp(Date ts) {timestamp = ts;}
	
	public void setTitle(String tit) {title = tit;}
	
	public User getAuthor() {return author;}
	
	public String getContent() {return content;}
	
	public Date getTimestamp() {return timestamp;}
	
	public String getTitle() {return title;}
}