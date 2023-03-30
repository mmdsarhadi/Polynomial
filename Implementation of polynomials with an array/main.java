Description :

	This is a small project for polynomials using an array. with which you can add, subtract, multiply,
	Or search and remove polynomials, doing this for long polynomials on paper is time consuming.
	
	Attention !! 
		1- The code is written in Java language
		2- The code is not optimal !
		
		
		

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		polynomial p0 = new polynomial(); 
		polynomial p1 = new polynomial();
		
		while (true) {
			System.out.print(
					" \n 1.The first polynomial \n 2.The second polynomial \n 3.the show \n 4.Search \n 5. clear \n Please enter the desired number : ");
			int menu = input.nextInt();
			if (menu == 1) {
				System.out.print(
						" \n 1.addTerm \n 2.removeterm \n 3.add \n 4.sub \n 5.mul \n Please enter the desired number  : ");
				int Submenu1 = input.nextInt();
				if (Submenu1 == 1) {
					System.out.print("Please enter the power :");
					int a = input.nextInt();
					System.out.print("Please enter the coefficient :");
					int b = input.nextInt();
					p0.addTerm(a, b);

				}

				if (Submenu1 == 2) {
					System.out.print("Please enter the power :");
					int power01 = input.nextInt();
					p0.removeterm1(power01);
				}
				if (Submenu1 == 3) {
					p0.add(p1);
				}
				if (Submenu1 == 4) {
					p0.sub(p1);
				}
				if (Submenu1 == 5) {
					p0.mult(p1);
				}
			}
			if (menu == 2) {
				System.out.print(
						" \n 1.addTerm \n 2.removeterm \n 3.add \n 4.sub \n 5.mul \n Please enter the desired number  : ");
				int Submenu2 = input.nextInt();
				if (Submenu2 == 1) {
					System.out.print("Please enter the power :");
					int power10 = input.nextInt();
					System.out.print("Please enter the coefficient :");
					int coefficient = input.nextInt();
					p1.addTerm(power10, coefficient);

				}
				if (Submenu2 == 2) {
					System.out.print("Please enter the power :");
					int power01 = input.nextInt();
					p1.removeterm1(power01);
				}
				if (Submenu2 == 3) {
					p1.add(p0);
				}
				if (Submenu2 == 4) {
					p1.sub(p0);
				}
				if (Submenu2 == 5) {
					p1.mult(p0);
				}
			}
			if (menu == 3) {
				System.out.print(
						" \n 1.The first polynomial \n 2.The second polynomial \n Please enter the desired number  : ");
				int Polynomial = input.nextInt();
				if (Polynomial == 1) {
					p0.show();
				}
				if (Polynomial == 2) {
					p1.show();
				}

			}
			if (menu == 4) {
				System.out.print(
						" \n 1.The first polynomial \n 2.The second polynomial \n Please enter the desired number  : ");
				int Polynomial = input.nextInt();
				if (Polynomial == 1) {
					System.out.print("Please enter the power :");
					int power01 = input.nextInt();
					p0.searchTerm(power01);
				}
				if (Polynomial == 2) {
					System.out.print("Please enter the power :");
					int power01 = input.nextInt();
					p1.searchTerm(power01);

				}

			}
			if (menu == 5) {
				System.out.print(
						" \n 1.The first polynomial \n 2.The second polynomial \n Please enter the desired number  : ");
				int Polynomial = input.nextInt();
				if (Polynomial == 1) {
					p0.clear();

				}
				if (Polynomial == 2) {
					p1.clear();
				}

			}
		}
	}

}
