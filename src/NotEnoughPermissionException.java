public class NotEnoughPermissionException extends Exception{

    public NotEnoughPermissionException(){
        super();
    }

    public NotEnoughPermissionException (String massage){
        super(massage);
    }
}
