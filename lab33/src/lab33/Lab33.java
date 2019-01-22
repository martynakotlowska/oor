/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab33;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author marty
 */
public class Lab33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        print("running...");
		Document document;
		try {
			//Get Document object after parsing the html from given url.
			document = Jsoup.connect("https://www.wikihow.com/wikiHowTo?search=cook+an+egg").get();

			String title = document.title(); //Get title
			print("  Title: " + title); //Print title.

		} catch (IOException e) {
			e.printStackTrace();
		}
		print("done");
	}

	public static void print(String string) {
		System.out.println(string);
	}
        
    }
    

