package JarraEx4.mamifero;

/* MAM�FEROS */
class Cachorro extends Mamifero {
	
	private boolean tipoLatido=false;
	
	public void setLateAlto() {
		
		this.tipoLatido=true;
		
	}
	
	public void setLateBaixo() {
		
		this.tipoLatido=false;
		
	}
	
	public void falar() {}
	
}