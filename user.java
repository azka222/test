
public class user {

    String email;
    String nama;
    String pass;
    String pass2;
    String type;

    //Register
    user (String nama, String email, String pass, String pass2){
        this.nama = nama;
        this.email = email;
        this.pass = pass;
        this.pass2 = pass2;
    }

    //Login
    user (String email, String email2, String pass3){
        this.email = email;
        this.pass = email2;
        this.type = pass3;
    }   

    public boolean validationPass(String pass, String pass2){
        if(pass.equals(pass2)){
            return true;
        }else{
            return false;
        }
        
    }
}



