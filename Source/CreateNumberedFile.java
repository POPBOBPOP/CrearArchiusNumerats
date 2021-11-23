import java.util.*;
import java.io.*;


public class CreateNumberedFile {

	public static void main(String[] args) {
		
		String filename,name,extension,zeroes;int number, objective,oldLength = 0;boolean wantZeroes=false;
		Scanner tecl = new Scanner(System.in);
		Scanner teclint = new Scanner(System.in);
		System.out.println("What name do you want the files to have?");
		name=tecl.nextLine();
		System.out.println("What extension would you like the files to have? Include the dot.");
		extension=tecl.nextLine();
		System.out.println("How many files would you like to make?Remember we are making numbered files.");
		objective=teclint.nextInt();
		System.out.println("Introduce the number with which you would like to start from. So the offset number.");
		number=teclint.nextInt();
		System.out.println("Do you want to introduce zeroes before the number(They will disappear accordingly when the number increments in digits)? If you want to, introduce the zeroes you want(Type them), otherwise click enter to skip it.");
		zeroes=tecl.nextLine();
		
		if(zeroes.isEmpty()==false) {
			oldLength=Integer.toString(number).length();
			wantZeroes=true;
		}
		
		for(;objective>0;number++,objective--) {
			if(wantZeroes==true) {
				if(Integer.toString(number).length()>oldLength) {
					oldLength=Integer.toString(number).length();
					if(zeroes.length()>1) {
						zeroes=zeroes.substring(1);
					}else {
						zeroes="";
					}
				}
			}
			
			filename=name+zeroes+number+extension;
			try {
				File named=new File(filename);
				if(named.createNewFile()) {
					System.out.println("File created: "+named.getAbsolutePath());
				}else {
					System.out.println("File already exists or there was an error.");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
	}
}
