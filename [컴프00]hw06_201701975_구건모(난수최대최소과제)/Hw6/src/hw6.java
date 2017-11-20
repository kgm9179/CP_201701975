
public class hw6 {

	public static void main(String[] args) {
		int[] random = new int[10];
		for(int i=0; i<10; i++) {
			random[i]=(int)(Math.random()*100);
				}
			// 난수발생
System.out.println("--- 난수 10개 출력 ---");
int git2;
int max= random[0];
int mim= random[0];
//최대 최소 판단
for(int i=0; i<10; i++) {
	System.out.println(random[i]);
	if(max<=random[i])
	max = random[i];
    if(mim>=random[i])
	mim = random[i];
}
System.out.println("--- 출력끝 ---");

System.out.println("최대값: "+max);

System.out.println("최소값: "+mim);



	}

}
