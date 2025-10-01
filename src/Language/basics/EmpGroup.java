package Language.basics;

public class EmpGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp = new Employees();
		
		String[] empNames = {emp.emp1Name, emp.emp2Name, emp.emp3Name};
        int[] empIds = {emp.emp1Id, emp.emp2Id, emp.emp3Id};
        
        for (int i = 0; i < 2; i++) {
            System.out.println("EmpName: " + empNames[i] + " EmpID: " + empIds[i]);
        }
	}

}
