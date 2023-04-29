package inheritance;

	abstract public class AnimalPrac{
		public int nooflegs = 4;
		public boolean hastail = true;
		
		public int getnooflegs() {
			return this.nooflegs;
		}
		public void setnooflegs(int nooflegs) {
			this.nooflegs = nooflegs;
		}
		public boolean gethastail() {
			return this.hastail;
		}
		public void sethastail(boolean hastail) {
			this.hastail = hastail;
		}
		public abstract String says();
	
}
