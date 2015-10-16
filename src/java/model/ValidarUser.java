package model;

public class ValidarUser {
    
    public String validar(String user,String password)
    {
        if(user.equals("marco") && password.equals("minutti"))
        {
            return "true";
        }
        return "false";
    }
    }

