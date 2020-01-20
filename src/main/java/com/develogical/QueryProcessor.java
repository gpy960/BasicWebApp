package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("yes")) {
            return "恭喜你意识到了这一点";
        }
        if (query.toLowerCase().contains("no")) {
            return "别挣扎了，你是";
        }
        return "";
    }
}
