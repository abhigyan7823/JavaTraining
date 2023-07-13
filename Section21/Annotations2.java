
package Section21;

/**
 *
 * @author abhigyan_bhadoria
 */
@interface MyAnno{
    String name();
    String project();
    String date() default "12/03";
    String version() default "16";
}
@MyAnno(name="abhi",project="bank")
public class Annotations2 {
    int data;
    public static void main(String[] args) {
        int x;
    }
    
}
