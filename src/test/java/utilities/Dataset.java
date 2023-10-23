package utilities;

import org.testng.annotations.DataProvider;

public class Dataset {

    public static String username = "standard_user";
    public static String password = "secret_sauce";


    @DataProvider(name = "invalidData")
    public Object[][] data(){
        Object[][] dataset = {
                {"", "", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"username", "password", "Epic sadface: Username and password do not match any user in this service"},
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
        };
    return dataset;
    }

    @DataProvider(name = "validData")
    public Object data2(){
        Object[][] dataset = {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
        };
        return dataset;
    }

    @DataProvider(name = "singlevalidData")
    public Object data3(){
        Object[][] dataset = {
                {"standard_user", "secret_sauce"}

        };
        return dataset;
    }

}
