package welcome;

public class Header {
    public static String header(String project){
        if (project.equals("leap")){
            return Welcome.leapYear();
        } else if (project.equals("golf")){
            return Welcome.golf();
        }
        return "";
    }
}
