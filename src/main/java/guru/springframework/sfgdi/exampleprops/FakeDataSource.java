package guru.springframework.sfgdi.exampleprops;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/06/20, Wed
 */
public class FakeDataSource {
    private String user;
    private String pwd;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
