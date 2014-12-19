import java.awt.*;
import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.*;
import java.awt.Desktop;
import java.net.URI;




import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import com.temboo.Library.YouTube.Search.ListSearchResults;
import com.temboo.Library.YouTube.Search.ListSearchResults.ListSearchResultsInputSet;
import com.temboo.Library.YouTube.Search.ListSearchResults.ListSearchResultsResultSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;




import javax.swing.*;
public class tembootest2 {
	static String[] title, linkId;
	protected static String search, trillz;
	protected static JTextField textField;
	protected static JTextArea txt0, txt1, txt2, txt3, txt4, trillField, trl0, trl1,trl2, trl3, trl;
	protected static Image[] image;
	protected static ImageIcon[] imagez;
	protected static JPanel card1, trill;
	protected static JLabel imaj0, imaj1, imaj2, imaj3, imaj4, trimaj0, trimaj1, trimaj2, trimaj3, trimaj4;
	protected static JTabbedPane jtp;
	protected static JScrollPane trillPane0, trillPane1, trillPane2, trillPane3, trillpane4;
	
	
	
	
	public static void CreateGui() throws Exception{
		JFrame f1 = new JFrame();
		JPanel cards;
		
		jtp = new JTabbedPane(JTabbedPane.TOP);
		
		card1 = new JPanel();
		trill = new JPanel();
		
		card1.setLayout(null);
		card1.setBackground(Color.BLACK);
		
		//Search Tabs

		txt0 = new JTextArea(title[0] + "\n" + "https://www.youtube.com/watch?v=" + linkId[0]);
		txt0.setEditable(false);
		JScrollPane scrollPane0 = new JScrollPane(txt0);
		scrollPane0.setBounds(150,50,400,50);
		card1.add(scrollPane0);
		

		txt1 = new JTextArea(title[1] + "\n" + "https://www.youtube.com/watch?v=" + linkId[1]);
		txt1.setEditable(false);
		JScrollPane scrollPane1 = new JScrollPane(txt1);	
		scrollPane1.setBounds(150,150,400,50);
		card1.add(scrollPane1);
		

		txt2 = new JTextArea(title[2] + "\n" + "https://www.youtube.com/watch?v=" + linkId[2]);
		txt2.setEditable(false);
		JScrollPane scrollPane2 = new JScrollPane(txt2);	
		scrollPane2.setBounds(150,250,400,50);
		card1.add(scrollPane2);
		

		txt3 = new JTextArea(title[3] + "\n" + "https://www.youtube.com/watch?v=" + linkId[3]);
		txt3.setEditable(false);
		JScrollPane scrollPane3 = new JScrollPane(txt3);	
		scrollPane3.setBounds(150,350,400,50);
		card1.add(scrollPane3);


		txt4 = new JTextArea(title[4] + "\n" + "https://www.youtube.com/watch?v=" + linkId[4]);
		txt4.setEditable(false);
		JScrollPane scrollPane4 = new JScrollPane(txt4);	
		scrollPane4.setBounds(150,450,400,50);
		card1.add(scrollPane4);
		
		//Buttons
		
		JButton btn0 = new JButton("Trill It!");
		btn0.setBounds(560,50,100,30);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String tril = txt0.getText();
				trillField.setText(tril);
				jtp.setSelectedIndex(1);
			}
		});
		card1.add(btn0);
		// Watch Button
		JButton watch0 = new JButton("Watch It!");
		watch0.setBounds(560,80,100,30);
		watch0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Desktop.isDesktopSupported())
				{
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=" + linkId[0]));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					}
				}
			}
		});	
		card1.add(watch0);	
		
		JButton btn1 = new JButton("Trill It!");
		btn1.setBounds(560,150,100,30);
		//162 original
		btn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				String tril = txt1.getText();
				trillField.setText(tril);
				jtp.setSelectedIndex(1);
			}
		});
		card1.add(btn1);
		// Watch Button
		JButton watch1 = new JButton("Watch It!");
		watch1.setBounds(560,180,100,30);
		watch1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Desktop.isDesktopSupported())
				{
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=" + linkId[1]));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					}
				}
			}
		});	
		card1.add(watch1);	
		
		
		
		JButton btn2 = new JButton("Trill It!");
		btn2.setBounds(560,250,100,30);
		btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				String tril = txt2.getText();
				trillField.setText(tril);
				jtp.setSelectedIndex(1);
			}
		});
		card1.add(btn2);
		// Watch Button
		JButton watch2 = new JButton("Watch It!");
		watch2.setBounds(560,280,100,30);
		watch2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Desktop.isDesktopSupported())
				{
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=" + linkId[2]));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					}
				}
			}
		});	
		card1.add(watch2);	
		
		
		
		JButton btn3 = new JButton("Trill It!");
		btn3.setBounds(560,350,100,30);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String tril = txt3.getText();
				trillField.setText(tril);
				jtp.setSelectedIndex(1);
			}
		});
		card1.add(btn3);
		// Watch Button
		JButton watch3 = new JButton("Watch It!");
		watch3.setBounds(560,380,100,30);
		watch3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Desktop.isDesktopSupported())
				{
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=" + linkId[3]));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					}
				}
			}
		});	
		card1.add(watch3);		
		
		
		
		
		JButton btn4 = new JButton("Trill It!");
		btn4.setBounds(560,450,100,30);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String tril = txt4.getText();
				trillField.setText(tril);
				jtp.setSelectedIndex(1);
			}
		});	
		card1.add(btn4);
		
		// Wathch Button
		JButton watch4 = new JButton("Watch It!");
		watch4.setBounds(560,480,100,30);
		watch4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Desktop.isDesktopSupported())
				{
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=" + linkId[4]));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					}
				}
			}
		});	
		card1.add(watch4);
		
		/*
		JButton playOnline = new JButton("Play");
		playOnline.setBounds(560,40,100,30);
		playOnline.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(Desktop.isDesktopSupported())
				{
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=" + linkId[0]));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println();
					}
				}
			}
			
		});
		*/
		
		//Thumbnails
		try{
			URL uRL = new URL("http://rack.1.mshcdn.com/media/ZgkyMDEzLzA4LzI5Lzg2L3lvdXR1YmVsb2dvLjNmZmMzLmpwZwpwCXRodW1iCTk1MHg1MzQjCmUJanBn/334cf6a5/be5/youtube-logo.jpg");
			Image imag = ImageIO.read(uRL);
			Image newimg = imag.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			imaj0 = new JLabel(new ImageIcon(newimg));
			imaj0.setBounds(20,50,50,50);
			card1.add(imaj0);
			
			imaj1 = new JLabel(new ImageIcon(newimg));
			imaj1.setBounds(20,150,50,50);
			card1.add(imaj1);
			
			imaj2 = new JLabel(new ImageIcon(newimg));
			imaj2.setBounds(20,250,50,50);
			card1.add(imaj2);
			
			imaj3 = new JLabel(new ImageIcon(newimg));
			imaj3.setBounds(20,350,50,50);
			card1.add(imaj3);
			
			imaj4 = new JLabel(new ImageIcon(newimg));
			imaj4.setBounds(20,450,50,50);
			card1.add(imaj4);
		
		
		}catch(NullPointerException e){
			System.out.println();
		}
	
			
		//Search Bar and update Search
		
		textField = new JTextField(20);
		textField.setBounds(100,5,500,40);
		textField.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		          search = textField.getText();
		          Tembyoutube();
		          //CreateGui();
		          txt0.setText(title[0] + "\n" + "https://www.youtube.com/watch?v=" + linkId[0]);
		          txt1.setText(title[1] + "\n" + "https://www.youtube.com/watch?v=" + linkId[1]);
		          txt2.setText(title[2] + "\n" + "https://www.youtube.com/watch?v=" + linkId[2]);
		          txt3.setText(title[3] + "\n" + "https://www.youtube.com/watch?v=" + linkId[3]);
		          txt4.setText(title[4] + "\n" + "https://www.youtube.com/watch?v=" + linkId[4]);
		  		
		          
		          try{
		        	  
			          ImageIcon img0 = new ImageIcon(image[0]);
			          Image imgtemp = img0.getImage();
			          Image newimg = imgtemp.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			          img0 = new ImageIcon(newimg);
			          imaj0.setIcon(img0);
			          
			          ImageIcon img1 = new ImageIcon(image[1]);
			          imgtemp = img1.getImage();
			          newimg = imgtemp.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			          img1 = new ImageIcon(newimg);
			          imaj1.setIcon(img1);
			          
			          ImageIcon img2 = new ImageIcon(image[2]);
			          imgtemp = img2.getImage();
			          newimg = imgtemp.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			          img2 = new ImageIcon(newimg);
			          imaj2.setIcon(img2);
			          
			          ImageIcon img3 = new ImageIcon(image[3]);
			          imgtemp = img3.getImage();
			          newimg = imgtemp.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			          img3 = new ImageIcon(newimg);
			          imaj3.setIcon(img3);
			          
			          ImageIcon img4 = new ImageIcon(image[4]);
			          imgtemp = img4.getImage();
			          newimg = imgtemp.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			          img4 = new ImageIcon(newimg);
			          imaj4.setIcon(img4);
		          }
		          catch(NullPointerException e1){
		        	  System.out.println();
		          }
		          
		          textField.selectAll();
		        }
		      });
		card1.add(textField);
		
		
		//trill page
		
		trill.setBackground(Color.BLACK);
		trill.setLayout(null);
		
		trillField = new JTextArea();
		trillField.setEditable(true);
		trillField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
			}
			public void focusLost(FocusEvent e){
				trillz = trillField.getText();
				trillField.selectAll();
				
			}
		});
		JScrollPane trillScrollPane = new JScrollPane(trillField);
		trillScrollPane.setBounds(150,5,400,60);
		trill.add(trillScrollPane);
		
		trimaj0 = new JLabel();
		trimaj0.setBounds(20,90,50,50);
		
		trl0 = new JTextArea();
		trl0.setEditable(false);
		trillPane0 = new JScrollPane(trl0);	
		trillPane0.setBounds(150,90,400,70);
	
		JButton trillit = new JButton("Trill It");
		trillit.setBounds(560,40,100,30);
		trillit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				ImageIcon img0 = new ImageIcon(image[0]);
		        trimaj0.setIcon(img0);
				trill.add(trimaj0);
				
				trl0.setText(trillField.getText());
				trill.add(trillPane0);

			}
		});

		trill.add(trillit);
		
		
		jtp.addTab("Search", card1);
		jtp.addTab("Trill", trill);
		

		//set the layout to BorderLayout
		// add the cards JPanel to the center
		f1.setLayout(new BorderLayout());
		f1.add(jtp, BorderLayout.CENTER);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(700,580);
		f1.setTitle("Test Frame");
		f1.setVisible(true);

	}
	
/*	@Override
	public void actionPerformed(ActionEvent e) {
		search = textField.getText();
		Tembyoutube();
		textField.selectAll();                                                                                        
		
	}*/
	
	public static void Tembyoutube(){
		
    	// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
    	// TembooSession session = new TembooSession("katpark2993", "myFirstApp", "6c523e8fc6b7498eb1578d2450991b20");
		try{
    
	    	TembooSession session = new TembooSession("katpark2993", "myFirstApp", "6c523e8fc6b7498eb1578d2450991b20");
	
	    	ListSearchResults listSearchResultsChoreo = new ListSearchResults(session);
	
	    	// Get an InputSet object for the choreo
	    	ListSearchResultsInputSet listSearchResultsInputs = listSearchResultsChoreo.newInputSet();
	
	    	title = new String[5];
	    	linkId = new String[5];
	    	image = new Image[5];
	    	imagez = new ImageIcon[5];
	    	
	    	// Set inputs
	    	listSearchResultsInputs.set_Query(search);
	
	    	// Execute Choreo
	    	ListSearchResultsResultSet listSearchResultsResults = listSearchResultsChoreo.execute(listSearchResultsInputs);
	    	
	    	
	    	
	    	
	    	// Parse JSON response (The mess you got returned is called JSON, it's actually really cool if you dealt with it before)
	    	JSONObject results = new JSONObject(listSearchResultsResults.get_Response());
	    	
	    	// Get array of item
	    	JSONArray items = results.getJSONArray("items");
	    	
	    	
	    	for(int i = 0; i < 5; ++i){
	    	
	    		JSONObject item = items.getJSONObject(i);
			
				JSONObject link = item.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("high");
				String thumbnail = link.getString("url");
				
				URL url = new URL(thumbnail);
				image[i] = ImageIO.read(url);
				//System.out.println(image[i]);
				
				// Get the snippet object within the first item
		    	JSONObject snippet = item.getJSONObject("snippet");
		    	JSONObject getid = item.getJSONObject("id"); 
		    	
		    	
		    	// Parse the title and description fields
		    	
		    	
		    	title[i] = snippet.getString("title");
		    	linkId[i] = getid.getString("videoId");
		    	//String description = snippet.getString("link");
		
		    	// Print title and description
		/*    	System.out.println(title[i]);
		    	System.out.println("https://www.youtube.com/watch?v="+linkId[i]);
		    	System.out.println();*/
		    	//System.out.println(description);
	    	
	    		}
    		}
    	catch(Exception e){
    		System.out.println();
    	}
		
	}
	
    public static void main(String[] args) throws Exception{
    	
    	Tembyoutube();
    	CreateGui();
    	
    		
        }


    

    }
