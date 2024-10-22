package SingletonDesign;

public class BookMyShow{

    private static volatile BookMyShow INSTANCE = null;
    /*
    1.Make the constructor private
    2.create a single instance variable or a block to assign the instance
    3.make it thread safe (Synchronized keyword)
    */
    private BookMyShow() throws Exception {
        if(INSTANCE != null)
            throw new Exception("can not create an instance as already there has been an instance." +
                    "Please call getInstance method of "+this.getClass());
    }
    public static BookMyShow getInstance() throws Exception {
        if(INSTANCE == null) {
            synchronized(BookMyShow.class) {
                if(INSTANCE == null)
                    INSTANCE = new BookMyShow();
            }
        }
        return INSTANCE;
    }
}
