public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        double age = sc.nextDouble();

        System.out.print("Enter gender (m/f): ");
        char gender = sc.next().charAt(0);

        if (gender == 'm' || gender == 'M') {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender == 'f' || gender == 'F') {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("Invalid gender input!");
        }

        sc.close();
    }
