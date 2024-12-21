

public class HandlingExceptions{
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");  // This will throw NumberFormatException
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
    
}
