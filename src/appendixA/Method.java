package appendixA;

public class Method {

	public void factoryProcessor(int valA) {
		// int valA;
		if (valA > 2000) {
			System.out.println("True L1, A");
			if (valA > 6000) {
				System.out.println("True L2, C");
			} else {
				System.out.println("False L2, B");
				if (valA > 4000) {
					System.out.println("True L3, D");
				} else {
					System.out.println("False L3, E");
				}
			}
		} else {
			System.out.println("False L1, 1");
			if (valA > 100) {
				System.out.println("True L2, 3");
				if (valA > 600) {
					System.out.println("True L3, 5");
				} else {
					System.out.println("False L3, 4");
					if (valA > 500) {
						System.out.println("True L4, 6");
					} else {
						System.out.println("False L4, 7");
					}
				}
			} else {
				System.out.println("False L2, 2");
			}
		}
	}

}
