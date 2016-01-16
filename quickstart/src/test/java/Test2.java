import org.springside.modules.mapper.JsonMapper;


public class Test2 {

	public static void main(String[] args) {
		
		String json="[{\"name\":\"title\",\"value\":\"fdsfdas\"},{\"name\":\"grade\",\"value\":\"5\"},{\"name\":\"grade\",\"value\":\"5\"},{\"name\":\"kemu\",\"value\":\"yinyu\"},{\"name\":\"content\",\"value\":\"dfsafdsafdsa\"},{\"name\":\"contentUrl\",\"value\":\"\"}]";
		JsonMapper mapper = new JsonMapper();
		System.out.println(mapper.toJson(new PawaysQuestion()));

	}

}
