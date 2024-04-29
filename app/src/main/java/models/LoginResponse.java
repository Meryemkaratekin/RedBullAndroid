package models;


public class LoginResponse {
    private String token; // Örneğin, JWT gibi bir kimlik doğrulama token'ı
    private String message; // Yanıt mesajı (örneğin, "Login successful")

    private String userName; // İsteğe bağlı kullanıcı adı veya başka bir bilgi

    // Getter ve setter'lar
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
}
}