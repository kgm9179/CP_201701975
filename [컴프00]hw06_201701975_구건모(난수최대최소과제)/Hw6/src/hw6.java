
public class hw6 {

	public static void main(String[] args) {
		int[] random = new int[10];
		for(int i=0; i<10; i++) {
			random[i]=(int)(Math.random()*100);
				}
			// �����߻�
System.out.println("--- ���� 10�� ��� ---");
int git2;
int max= random[0];
int mim= random[0];
//�ִ� �ּ� �Ǵ�
for(int i=0; i<10; i++) {
	System.out.println(random[i]);
	if(max<=random[i])
	max = random[i];
    if(mim>=random[i])
	mim = random[i];
}
System.out.println("--- ��³� ---");

System.out.println("�ִ밪: "+max);

System.out.println("�ּҰ�: "+mim);



	}

}
