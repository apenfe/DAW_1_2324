package Moudev2022;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

public class aspectRatio06{
	
	public static void main(String[] args) {
		
		String url ="https://avatars.githubusercontent.com/u/17043402?v=4"; //460*460
		
		
		System.out.println(aspectRatio(3,3));
		
	}
	
	public static String aspectRatio(int a, int b) {
		
		int ratio=a/b;
		
		return "";
		
		    
	}

}