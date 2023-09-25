class JVMExecutor{
	public static void main(String[] bule){
		
	
	JVM jvm=new JVM();
	jvm.setPurpose("which provides runtime environment for bytecode");
	jvm.setVersion("java 21");
	jvm.setPlatform("Java platform-independent");
		
	Java java=new Java();
	java.jvm=jvm;
	java.hostCompanyName="Sun Microsystems";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Hosting Company Name : "+java.hostCompanyName);
	System.out.println("Purpose : "+java.jvm.getPurpose());
	System.out.println("Version : "+java.jvm.getVersion());
	System.out.println("Platfrom : "+java.jvm.getPlatform());
	System.out.println("------------------------------------------------------------------------");							
	}
}