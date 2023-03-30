public class polynomial {
	int maxdegree = 100;
	int added = -1;
	float coef[] = new float[maxdegree];
	int exp[] = new int[maxdegree];

	public boolean addTerm(int e, float c) {
		if (searchTerm(e) != -1) {
			coef[searchTerm(e)] += c;
		} else {
			added++;
			exp[added] = e;
			coef[added] = c;
			sort(exp, coef);
		}
		return true;

	}

	public boolean removeTerm(int e) {
		if (searchTerm(e) != -1) {
			coef[searchTerm(e)] = 0;
			exp[searchTerm(e)] = 0;
			sort(exp, coef);
		}
		for (int i = maxdegree - 1; i >= 0; i--) {
			if (exp[i] != 0) {
				added = i;
				break;
			} else {
				added = -1;
			}
		}
		return true;
	}

	private int searchTerm(int e) {
		for (int i = 0; i <= added; i++) {
			if (exp[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public float searchTerm_M(int e) {
		for (int i = 0; i <= added; i++) {
			if (exp[i] == e) {
				return coef[i];
			}
		}
		return -1;
	}

	public void add(polynomial other) {
		for (int i = 0; i <= other.added; i++) {

			addTerm(other.exp[i], other.coef[i]);

		}
		for (int i = maxdegree - 1; i <= 0; i++) {
			if (exp[i] != 0) {
				added = i;
				break;
			}
		}
	}

	public void sub(polynomial other) {
		for (int i = 0; i <= other.added; i++) {

			addTerm(other.exp[i], -other.coef[i]);

		}
		for (int i = maxdegree - 1; i <= 0; i++) {
			if (exp[i] != 0) {
				added = i;
				break;
			}
		}
	}

	public void mult(polynomial other) {

		for (int i = 0; i <= added; i++) {
			for (int j = 0; j <= other.added; j++) {
				exp[i] += other.exp[j];
				coef[i] *= other.coef[j];
			}
		}
		sort(exp, coef);
		for (int i = maxdegree - 1; i <= 0; i++) {
			if (exp[i] != 0) {
				added = i;
				break;
			}
		}
	}

	public void sort(int a[], float b[]) {
		for (int i = 0; i <= maxdegree - 1; i++) {
			for (int j = i + 1; j <= maxdegree - 1; j++) {
				float q;
				int p;
				if (a[i] < a[j]) {
					p = a[i];
					a[i] = a[j];
					a[j] = p;
					q = b[i];
					b[i] = b[j];
					b[j] = q;
				}
			}
		}
	}

}
