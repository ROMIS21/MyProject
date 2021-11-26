package com.rohit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;



public class MainC {

	public static void main(String[] args) {

		ArrayList<Album> albums = new ArrayList<>();

		Album album = new Album("Love Aaj Kal", "Arijit Singh");

		album.addSong("Shayad", 04.07);
		album.addSong("Tujhe Kitna Chahne Lage", 04.45);
		album.addSong("Agar Tum Saath Ho", 05.41);
		album.addSong("Nashe Si Chadh Gayi",03.57);
		album.addSong("Shayad", 4.07);

		albums.add(album);

		album = new Album("Shershaah", "B Praak");

		album.addSong("Raataan Lambiyan", 03.50);
		album.addSong("Ranjha", 03.48);
		album.addSong("Kabhii Tumhhe", 03.50);
		album.addSong("JaiHind Ki Senaa",02.31);
		album.addSong("Kabhii Tumhhe (Female Version)",03.38);
		album.addSong("Mann Bharryaa 2.0", 04.26);

		albums.add(album);

		LinkedList<Song> playlist_1 =  new LinkedList<>();

		albums.get(0).addToPlayList("Shayad",playlist_1); 
		albums.get(0).addToPlayList("Tujhe Kitna Chahne Lage",playlist_1); 
		albums.get(0).addToPlayList("Agar Tum Saath Ho",playlist_1); 
		albums.get(1).addToPlayList("Raataan Lambiyan",playlist_1); 
		albums.get(1).addToPlayList("Kabhii Tumhhe",playlist_1); 
		albums.get(1).addToPlayList("Ranjha",playlist_1); 

		play(playlist_1);  
	}
	private static void play (LinkedList<Song> playlist) {
		
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playlist.listIterator();

		if(playlist.size() == 0) { // if the list size is 0 
			System.out.println("This playlist have no song");
		}
		else {
			System.out.println("Now playing " + listIterator.next().toString()); // print the current playing song in the playlist
			printMenu(); // and at the same time print ALl the available option print menu
		}

		while(!quit) { // if user not quit
			int action = sc.nextInt(); // take users input
			sc.nextLine();

			switch (action) {

			case 0:
				System.out.println("PlayList Complete");
				quit = true; // if 0 is pressed it will say the above and will quit
				break;

			case 1: 
				if(!forward) {

					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());		
				}
				else {
					System.out.println("no song availble, reached to the end of the list");
					forward = false;
				}
				break;

			case 2: 
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous(); // if it has any previous song 
					}
					forward = false; // and it wont be forwarded so forward false
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing "+ listIterator.previous().toString());	// if it has any previous song then it will play it 
				}
				else {
					System.out.println("We are at the first song"); // if there is not then it will take you to 1st song
					forward = false; // it want be forwarded because we are talking about previous
				}
				break;

			case 3:
				if(forward){
					if(listIterator.hasPrevious()){
						System.out.println("Now playing "+listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("we are at the start of the list");
					}
				}else {
					if(listIterator.hasNext()){
						System.out.println("now playing "+listIterator.next().toString());
						forward = true; //  will move forward thats y true
					}else {
						System.out.println("we have reached to the end of list");
					}
				}
				break;

			case 4:
				printList(playlist);
				break;
				
			case 5:
				printMenu();
				break;
				
			case 6:
				if (playlist.size() >0){
					listIterator.remove();
					if(listIterator.hasNext()){
						System.out.println("now playing "+listIterator.next().toString());
					}
					else {
						if(listIterator.hasPrevious())
							System.out.println("now playing "+listIterator.previous().toString());
					}

				}
			}
		}

			
		}


		private static void printMenu() {
			System.out.println("Availble option\n press");
			System.out.println("0 - to quit\n" + 
					"1 - to play next song\n"+
					"2 - to play previous song\n" +
					"3 - to replay the current song\n"+
					"4 - list of all songs in playlist\n"+
					"5 - to print all available options\n"+
					"6 -  to delete the current song");
		}

		private static void printList(LinkedList<Song> playlist) {
			Iterator<Song> iterator = playlist.iterator(); 
			System.out.println("------------");

			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("------------");
		}

	}
