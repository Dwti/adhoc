package com.du.studyjava;

public  class Telphone {
	
	  private float screen;
	  private float cup;
	  private float mem;
	  private String color;
	  private int var;
	  private static String className;
	  String name="��ã�����ƤƤϺ";
	  //��̬��ʼ����:ֻ�ܸ���̬��Ա��������ֵ
	  static{
		  className="8��";
		  System.out.println("��̬��ʼ�����classsName��ֵ");
	  }
	  //��ʼ����
	  {
		  screen=6f;
		  System.out.println("��ʼ�����screen��ֵ");
	  }
	  public class Inner{
		  String name;
		  
		public String getName() {
			return name;
			
		}

		public void setName(String name) {
			this.name = name;
		}
		  // ��ͨ�ķ���
		public void print(){
			 System.out.println(Telphone.this.name);
		}
	  }
	  
	  
	  public float getScreen() {
			return screen;
		}
	  public void setScreen(float screen) {
			this.screen =screen ;
		}
	  public float getCup() {
			return cup;
		}
	  public void setCup(float cup) {
			this.cup = cup;
		}
	  public float getMem() {
			return mem;
		}
	  public void setMem(float mem) {
			this.mem = mem;
		}
	  public String getColor() {
			return color;
		}
	  public void setColor(String color) {
			this.color = color;
		}
	  public int getVar() {
			return var;
		}
	  public void setVar(int var) {
			this.var = var;
		}
	  public static String getClassName() {
			return className;
		}
	  public static void setClassName(String className) {
			Telphone.className = className;
		}
	  
	 //�޲ι��췽�� 
    public Telphone(){	
    	 cup=88.88f;
//    	 System.out.println("ƤƤϺ�����ߡ��������޲���");
//    	 System.out.println("���캯����cup��ֵ");
    	 System.out.println("����ִ����");
  		
    }
   //�в����Ĺ��췽��
    public Telphone(float newscreen,float newcup,float newmem,String newcolor){
    	screen=newscreen;
    	cup=newcup;
    	mem=newmem;
    	color=newcolor;
    	System.out.println("ƤƤϺ�����ߡ��������в���"+screen+cup+mem+color);
    }
    public  void call(){
	 int locavar=0;
	 System.out.println("ƤƤϺ������"+screen+cup+mem+color);
	
    }
    public void sedMessage(){
	 int var=1;
	 System.out.println("ƤƤϺ��������"+var);
    }
}
