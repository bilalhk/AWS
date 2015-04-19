package blogs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.Date;

@RestController
public class BlogController{

	@Autowired
	private BlogStorage blogs;

	@RequestMapping(value="/blogs", method=RequestMethod.GET)
	public Collection<BlogPost> getAll() {
		return blogs.findAll();
	}

	@RequestMapping(value="/blogs", method=RequestMethod.POST)
	public BlogPost addPost(@RequestBody BlogPost post) {
		post.setTimestamp(new Date());
		blogs.insert(post);
		return post;
	}
}