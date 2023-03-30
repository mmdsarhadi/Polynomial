public class polynomial {
	
	term data[] = new term[100];
	int maxdegree = 100;
	int added = -1;
	term z = new term();

	
	public void zero(term data[]) {       
		z.exp = 0;
		z.coef = 0;
		for (int i = 0; i < maxdegree; i++) {
			data[i] = z;
		}
	}

	public void sort(term data[]) {                         
		for (int i = 0; i <= maxdegree - 2; i++) {
			for (int j = i + 1; j <= maxdegree - 1; j++) {
				if (data[i].exp < data[j].exp) {
					term q = new term();
					q = data[i];
					data[i] = data[j];
					data[j] = q;
				}

			}
		}

	}

	private int p_search(int e) {            
		for (int i = 0; i <= added; i++) {
			if (data[i].exp == e) {
				return i;
			}
		}
		return -1;
	}

	public boolean addTerm(int e, float c) {                  
		if (p_search(e) != -1) {
			data[p_search(e)].coef += c;
			if(data[p_search(e)].coef==0) {data[p_search(e)].exp=0;}
		} else {

			added++;
			
			data[added]=new term();
			data[added].coef=c;
			data[added].exp=e;
			sort(data);
		}
		return true;
	}

	public boolean removeTerm(int e) {         
		if (p_search(e) != -1) {
			data[p_search(e)].coef = 0;
			data[p_search(e)].exp = 0;
			sort(data);
		}
		for (int i = maxdegree - 1; i >= 0; i--) {
			if (data[i].exp != 0) {
				added = i;
				break;
			}
		}
		return true;
	}

	public float searchTerm(int e) {             

		for (int i = 0; i <= added; i++) {
			if (data[i].exp == e) {
				return data[i].coef;
			}
		}
		return -1;
	}

	public void add(polynomial other) {           
		for (int i = 0; i <= other.added; i++) {  

			addTerm(other.data[i].exp, other.data[i].coef);

		}

		for (int i = maxdegree - 1; i >= 0; i--) {
			if (data[i].exp != 0) {
				added = i;
				break;
			}
		}
	}

	public void sub(polynomial other) {            
		for (int i = 0; i <= other.added; i++) {
			addTerm(other.data[i].exp, -other.data[i].coef);

			}
		
		for (int i = maxdegree - 1; i >= 0; i--) {
			if (data[i].exp != 0) {
				added = i;
				break;
			}
		}
	}

	public void mult(polynomial other) {            
		for (int i = 0; i <= added; i++) {
			for (int j = 0; j <= other.added; j++) {
				if (data[i].exp + other.data[i].exp < maxdegree) {
					data[i].exp += other.data[j].exp;
					data[i].coef *= other.data[j].coef;
				}
			}
		}
		sort(data);
		for (int i = maxdegree - 1; i >= 0; i--) {
			if (data[i].exp != 0) {
				added = i;
				break;
			}
		}
	}
}
