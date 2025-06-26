package Persons.Employees;
import Lists.List;



public class EmployeesList implements List<Employee> {

    private Employee employees[];
    
    public EmployeesList() {
        this.employees = new Employee[100];
        
    }
    
    @Override
    public Employee find(Object id) {
       for(Employee e :employees){
           if(e.getId().equals(id)){
               return e;
           }
       }
       return null;
    }

    @Override
    public boolean add(Employee e) {
       for (int i = 0; i < 100; i++) {
            if (employees[i]==e) {
                employees[i]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Employee e) {
        for (int i = 0; i < 100; i++) {
            if (employees[i]==e) {
                employees[i]=null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void showAll() {
       for(Employee e : employees){
           System.out.println(e);
       }
    }
    
}
