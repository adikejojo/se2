package Presentation;

public class picture {
	String picture(String name){
		switch(name){
		case "search":return "src/picture/exprInfoCheck.png"; 
		case "searchHL":return "src/picture/exprInfoCheckHL.png";
		
		}
		return "src/picture/exprInfoCheck.png";
	}
}
