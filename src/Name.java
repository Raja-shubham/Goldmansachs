import practiceInterview.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Name {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("shubham","sinha","sahil","sharma"));
        List<Integer> integers = List.of(1,2,3,4);
//        System.out.println( name.stream().map(String::toUpperCase).collect(Collectors.toList()));
//        System.out.println(integers.stream().filter(integer -> integer%2==0).map(n->Math.pow(n,2)).collect(Collectors.toList()));
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", 30, 50000),
                new Employee("Jane", "", 25, 60000),
                new Employee("John", "xu", 25, 1250),
                new Employee("John", "", 30, 1250),
                new Employee("Jane", "Doe", 30, 50000)
        );
//        List<Employee> sortedEmployees = employees.stream()
//                .sorted(Comparator.comparing(Employee::getFirstname)
//                        .thenComparing(Employee::getLastname)
//                        .thenComparing(Employee::getAge)
//                        .thenComparing(Employee::getSal)).collect(Collectors.toList());
//        System.out.println(sortedEmployees);

        var x =employees.stream().filter(employee -> employee.getSal()>1000 && !employee.getLastname().equals("")).map(employee -> employee.getLastname().toUpperCase()).collect(Collectors.toList());
        System.out.println(x);
        var c = employees.stream().collect(Collectors.groupingBy(Employee::getSal,LinkedHashMap::new,Collectors.counting()));
    //    var f =employees.stream().collect(Collectors.groupingBy(e->e.getSal())).entrySet();
    //    System.out.println(f);
    }

}
