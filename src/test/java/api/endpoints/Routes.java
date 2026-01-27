package api.endpoints;

public class Routes {

    public static String baseUrl = Path.baseUrl;
    // Auth module
    public static String postLoginEndpoint = baseUrl + "auth/login";
    public static String getCurrentUser = baseUrl + "auth/me";


    // User module

    public static String getUser = baseUrl + "users";
    public static String getSingleUser = baseUrl + "users/{id}";
    public static String getSearchUser = baseUrl + "users/search";
    public static String getFilterUser = baseUrl + "users/filter";
    public static String getUserCartByUserId = baseUrl + "users/{id}/carts";
    public static String getUserPostByUserId = baseUrl + "users/{id}/posts";
    public static String getUserToDoByUserId = baseUrl + "users/{id}/todos";
    public static String postNewUser = baseUrl + "users/add";
    public static String updateUser = baseUrl + "users/{id}";
    public static String deleteUser = baseUrl + "users/{id}";
}
