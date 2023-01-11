
public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
    public static void throwCustomException() throws Exception {
        //throw new CustomException(message: null);
    
    //public static void main(String[] args)
        try{
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("You didn't create an instance of the class.");
        }
    }
}
