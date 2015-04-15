package blogs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogControllerConf {
	
	@Bean
	public BlogStorage blogStorageFactory() {
		return new BlogMongoConnector();
	}
}
