package selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class FileWritingconceptInJva {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//WRITING FILES 
		
	//TYPE 1: BY USING FILE WRITER
		
		// file write pannanumn first  athoda
		//1. file location and athukku
		//2. content thevai
	/*	
		String filelocation = "D://FileWritingConceptInJvammm.txt" ; // "D:// pottu namma d drive la kooda store pannikalam " // i am creating file in this own class
		String Content = "best thing in the world is being alone and crying alone"; // content for this file
		
		//using java to write file
		FileWriter filewriter = new FileWriter(filelocation);
		
		filewriter.write(Content);
		filewriter.close();                //ippo file create aayirukkum
		
		*/
		
		//disadvantages :
	//	                   file ahh direct ahh file writer la eluthurappo disc level la intha operarion nadakkum so perfomence less ahh irukkum
//		 to overcome this performence ahh boost panna tha namma BUFFERD WRITER USE pandram . 
		
		
//---------------------------------------------------------------------------------------------	
		
/*	//TYPE 2 : BY USING BUFFERED WRITER
		
		//eluthura content ahh namma buffer la eluthittu antha buffer vachi write panndram
		//same file writer maari than but direct ahh write pannama buffered writer vachi write pandram
		
		String filelocation = "D://FileWritingConceptInbuffer.txt" ;
		String Content = "best thing in the world is being alone and crying alone"; 
		
		FileWriter filewriter = new FileWriter(filelocation);
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		bufferedwriter.write(Content);
		bufferedwriter.close();           */
		
//--------------------------------------------------------------------------------------------------------
	/*	
		//TYPE 3 : FILEOUTPUTSTREAM	
		
		String filelocation = "D://FileWritingConceptbufileoutputstream.txt" ;
		String Content = "best thing in the world is being alone and crying alone"; 
		
//		it will write raw array bite information
	
		// FileOutputStream la location ahh kuduthukanum
		FileOutputStream fileoutputstream  = new FileOutputStream(filelocation);
		
		//content ahh byte ahh change pannikanum
	byte[] contentbyte=	Content.getBytes();
		
	    fileoutputstream.write(contentbyte);
	    fileoutputstream.close();
		
		*/
		
		
//------------------------------------------------------------------------------------------------------
		
	/*	//TYPE 4 : PATH
		                 // java 7 la irunthu javaa la file write panna PATH Oru method kuduthaanga, ithum raw byte ahh thaan file ahh write pannum
		
		String filelocation = "D://FileWritingwithPATH.txt" ;
		String Content = "best thing in the world is being alone and crying alone"; 
		
		//intha path ndrathu java.noi ndra or interface la thaan irukku
		
		Path path = Paths.get(filelocation);
		
		Files.write(path, Content.getBytes());    */
		
		
//------------------------------------------------------------------------------------------------------------
		
//--------------------------------- file reading concept -----------------------------------------------------------
		
		
//		file reading um file write maari thaan write athila namma read use pannananum
		
		//athey maari file oda location tharanum
		
		String filelocation = "D://FileWritingConceptInJvammm.txt" ;
		
		FileReader filereader = new FileReader(filelocation);
		
		BufferedReader bfreader = new BufferedReader(filereader);
		// reader la readline() nu method vachi thaan read panna poram
		
		String contentinfile ;
		
		
		// ipdi read panna ennoda file ethna line irunthaalum , firest line ahh mattum thaan read panni tharum
		
		// ippo ennoda file la neraiya lines irukku atha epdi read pannanumna, namma while loop thaan use panni aaganum
		
		// athukku naan first ennoda empty string onnu creare panni athukkula namma contentla irukka ella lineyum read panna popram
		
//		String Alllineincontent;
		
		// ethu varaikkum while loop run aaganuna namma file conetent la next line null ahh illatha vara irukka varaikum read panna moram
		
		// athu yenna namma read line use panni read pandrappo firstline mattm thaan read pannum , antha line ed la \n pottu encounter aagi nidrum
		
		//so athula irukka ella lineyum read pannanum, file ala adutha line empty yaa illatha varaikkum read pandran,read panni
		// contentinfile ndra instace la store pandran   
		
		
		while((contentinfile=bfreader.readLine())!=null) {
			// inga nan buffer la line ahh read panni contentinfile ahh potutu adutha line nall ahh irukka varaikm read pandran. apdinna 5 line appuram 5vathu line illana
//			nall n vanthu execution stop aayirum
			System.out.println( contentinfile);
			
		}
		
		
		
		
		

	}

}
