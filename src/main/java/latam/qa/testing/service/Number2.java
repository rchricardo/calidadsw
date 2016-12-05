package latam.qa.testing.service;

public class Number {

    public String stringCalc(int x, int y){
    	return String.format("%d,%d",x,y);
    }

   public int divideNumeros(int a, int b){
	if(b==0){
return 0;
}else{
int retorno = a/b;
return retorno;
}
	

}
}
