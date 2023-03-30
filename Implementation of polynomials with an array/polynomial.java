
	public class polynomial {
		int maxDegree = 100;
		int Degree;
		int coef[] = new int[maxDegree + 1];

		boolean addTerm(int e, int c) { // O(1)
			if (e > maxDegree)
				return false;
			coef[e] += c;
			if (e > Degree)
				Degree = e;
			return true;
		}

		boolean removeterm1(int e) { 
			if (e > Degree)
				return false;
			coef[e] = 0;
			if (e == Degree) {
				for (int i = e - 1; i > -1; i--) {
					if (coef[i] != 0)
						break;
					Degree = i;
				}
			}
			return true;
		}

		void add(polynomial other) { 

			for (int i = 0; i <= other.Degree; i++) {
				addTerm(i, other.coef[i]);
			}

		}

		void sub(polynomial other) { 
			for (int i = 0; i <= other.Degree; i++) {
				addTerm(i, other.coef[i] * -1);

			}
		}

		public boolean mult(polynomial other) { 
			int temp[] = new int[maxDegree + 1];
			if (Degree + other.Degree > maxDegree) {
				return false;
			}
			for (int i = 0; i <= Degree; i++) {
				for (int j = 0; j <= other.Degree; j++) {
					temp[i + j] += coef[i] * other.coef[j];
				}
			}
			for (int i = 0; i < 101; i++) {
				coef[i] = temp[i];
			}
			return true;
		}

		int searchTerm(int e) { 
			if (coef[e] == 0)
				System.out.print("not found");
			else
				System.out.print(coef[e] + "x^" + e);

			return e;
		}

		void show() {
			for (int i = 1; i < maxDegree; i++) { 
				if (coef[i] == 0) {
					continue;
				}
				System.out.print(coef[i] + "x^" + i + " ");
			}
			if (coef[0] != 0) {
				System.out.print(" " + coef[0]);
			}

		}

		void clear() {
			for (int i = 0; i < maxDegree; i++) {
				coef[i] = 0;
			}
		}

	}


