/**
 Describing shadowing problem :
    - shadowing problem in java is nothing but the name collision between formal arguments
      of the method and instance variable of the object.

    - When the formal argument variable name is same as the instance variable name thus, the 
      this problem is known as shadowing problem.

    - Shadowing problem causes compiler to not able to distinguish between instance variable
      and local variable of the method.

    - As a result of shadowing problem instance variable doesn't get initialize and assigning 
      local variable value to itself.
    
    - Example :
                public void setNum1(int num1) {
                    num1 = num1;
                }
    - In above example compiler won't able to distinguish between local num1 and instance num1
      In such cases JVM always gives preference to local variables, thus instance remain uninitialize 
      and it reassigning local to local.

    - To resolve shadowing problem java provides a facility called as "this" reference.

    - this is a reference variable which refers to the caller object of the method.
    - this implicit reference variable that is present in every instance method of the class.
    - this is used to resolve the shadowing problem by refering instance variable in method so, that 
      it can be easily distinguish between local and instance variable.
    
    - Example :
                public void setNum1(int num1) {
                    this.num1 = num1;
                }
    - Here, this is the reference variable used to distinguish between local num1 and instance num1
      as a result value of the local variable is assigned into instance variable, thus it resolves the 
      shadowing problem.
*/

class ShadowingProblemClass {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

public class ResolvingShadowingProblem {
    public static void main(String[] args) {
        // creating object of ShadowingProblemClass
        ShadowingProblemClass spc = new ShadowingProblemClass();

        // setting values through setters
        spc.setNum1(10);
        spc.setNum2(20);

        // getting values through getters
        System.out.println("num1 : " + spc.getNum1());
        System.out.println("num2 : " + spc.getNum2());
    }
}
