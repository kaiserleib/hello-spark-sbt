package hello;

import static spark.Spark.get;

public class Application {
	public static void main( String[] args) {
        get("/hello", (req, res) -> {
            return "Hello  World!";
        });
    }
}
