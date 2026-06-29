package lesson7;

public class Task10 {
    public static void main(String[] args) {
        Employee dev = new Developer("Alice", 3000.0, 500.0);
        Employee mgr = new Manager("Bob", 4000.0, 5);

        System.out.println(dev.info());
        System.out.println(mgr.info());
    }

    abstract static class Employee {
        public String name;
        private int id;
        private static int lastId = 0;

        public Employee(String name) {
            this.name = name;
            this.id = generateId();
        }

        private static synchronized int generateId() {
            return ++lastId;
        }

        public abstract double calculateSalary();

        public String info() {
            return "[" + id + "] " + name + ", salary: " + calculateSalary();
        }
    }

    static class Developer extends Employee {
        private double baseSalary;
        private double bonus;

        public Developer(String name, double baseSalary, double bonus) {
            super(name);
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }
    }

    static class Manager extends Employee {
        private double baseSalary;
        private int teamSize;

        public Manager(String name, double baseSalary, int teamSize) {
            super(name);
            this.baseSalary = baseSalary;
            this.teamSize = teamSize;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + (teamSize * 100.0);
        }
    }
}

