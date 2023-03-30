public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int e;
		float c;
		polynomial p0 = new polynomial();
		polynomial p1 = new polynomial();
		p0.zero(p0.data);
		p1.zero(p1.data);
		int pol;
		int x;
		while (true) {
			System.out.println("0. add term  ");
			System.out.println("1. remove term");
			System.out.println("2. search term");
			System.out.println("3. add polynomial");
			System.out.println("4. sub polynomial");
			System.out.println("5. mult polynomial");
			System.out.println("6.print polynomial");
			System.out.println("7. exit");
			x = input.nextInt();
			switch (x) {
			case 0:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					System.out.println("exp: ");
					e = input.nextInt();
					System.out.println("coef: ");
					c = input.nextFloat();
					p0.addTerm(e, c);
				} else if (pol == 1) {
					System.out.println("exp: ");
					e = input.nextInt();
					System.out.println("coef :");
					c = input.nextFloat();
					p1.addTerm(e, c);
				}
				break;
			case 1:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					System.out.println("exp :");
					e = input.nextInt();
					p0.removeTerm(e);
				} else if (pol == 1) {
					System.out.println("exp :");
					e = input.nextInt();
					p1.removeTerm(e);
				}
				break;
			case 2:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					System.out.println("exp: ");
					e = input.nextInt();
					System.out.println("COEF :" + p0.searchTerm(e));
				} else if (pol == 1) {
					System.out.println("exp: ");
					e = input.nextInt();
					System.out.println("COEF :" + p1.searchTerm(e));
				}
				break;
			case 3:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					p0.add(p1);
				} else if (pol == 1) {
					p1.add(p0);
				}
				break;
			case 4:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					p0.sub(p1);
				} else if (pol == 1) {
					p1.sub(p0);
				}
				break;
			case 5:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					p0.mult(p1);
				} else if (pol == 1) {
					p1.mult(p0);
				}
				break;
			case 6:
				System.out.println("0.p0 , 1.p1");
				pol = input.nextInt();
				if (pol == 0) {
					for (int i = 0; i <= p0.added; i++) {
						if (p0.data[i].coef != 0) {
							System.out.print("+" + p0.data[i].coef + "x^" + p0.data[i].exp+" ");
						}
					}
					System.out.println();
				} else if (pol == 1) {
					for (int i = 0; i <= p1.added; i++) {
						if (p1.data[i].coef != 0) {
							System.out.print("+" + p1.data[i].coef + "x^" + p1.data[i].exp+" ");
						}
					}
					System.out.println();
				}
				break;
			case 7:
				System.exit(0);
			}
		}
	}

}
