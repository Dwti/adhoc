package com.du.studyjava;

public  class Telphone {
	
	  private float screen;
	  private float cup;
	  private float mem;
	  private String color;
	  private int var;
	  private static String className;
	  String name="你好！我是皮皮虾";
	  //静态初始化块:只能给静态成员变量赋初值
	  static{
		  className="8班";
		  System.out.println("静态初始化块对classsName赋值");
	  }
	  //初始化块
	  {
		  screen=6f;
		  System.out.println("初始化块对screen赋值");
	  }
	  public class Inner{
		  String name;
		  
		public String getName() {
			return name;
			
		}

		public void setName(String name) {
			this.name = name;
		}
		  // 普通的方法
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
	  
	 //无参构造方法 
    public Telphone(){	
    	 cup=88.88f;
//    	 System.out.println("皮皮虾我们走。。。。无参数");
//    	 System.out.println("构造函数对cup赋值");
    	 System.out.println("父类执行了");
  		
    }
   //有参数的构造方法
    public Telphone(float newscreen,float newcup,float newmem,String newcolor){
    	screen=newscreen;
    	cup=newcup;
    	mem=newmem;
    	color=newcolor;
    	System.out.println("皮皮虾我们走。。。。有参数"+screen+cup+mem+color);
    }
    public  void call(){
	 int locavar=0;
	 System.out.println("皮皮虾我们走"+screen+cup+mem+color);
	
    }
    public void sedMessage(){
	 int var=1;
	 System.out.println("皮皮虾我们走了"+var);
    }
}
