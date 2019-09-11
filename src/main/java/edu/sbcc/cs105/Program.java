/**
 * CS 105 Theory and Practice I
 * CRN: [38065]
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Michael Philbin]
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Michael", 2800);
        Employee employee2 = new Employee("Bob", 2000);

        double testValue1 = employee1.getSalary() * 1.50;

        employee1.raiseSalary(50);

        System.out.println("Name should be Michael: " + employee1.getName() + ". This value should be: " + testValue1 + ". Value got: " + employee1.getSalary());
        System.out.println("Name should be Bob: " + employee2.getName() + ". This value should be: " + employee2.getSalary() + ". Value got: " + employee2.getSalary());
    }
}