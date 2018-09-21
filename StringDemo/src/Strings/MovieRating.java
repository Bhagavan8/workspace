package Strings;
public class MovieRating{

public static String movieRating(String string) {
	   String[] input=string.split(" ");
	   
	   String[] goodWords= {"good","amazing","better"};
	   String[] badWords= {"bad","not-good","worst"};
	   int goodWordsCount=wordsCounter(input,goodWords);
	   int badWordsCount=wordsCounter(input,badWords);
	   double rating=5.0/2.0;;
	   if(goodWordsCount==badWordsCount) {
		   return rating+"/5";
	   }else if(goodWordsCount>badWordsCount) {	   
		   rating = goodWordsCount-badWordsCount;
		  rating=(rating/5)*2;
		  if(rating>2.5)
			  return 5+"/5";
		  else
			  return ((5.0/2.0)+rating)+"/5";
	   }else {
		   rating = badWordsCount-goodWordsCount;
			  rating=(rating/5)*2;
			  if(rating>2)
				  return 1+"/5";
			  else  
			  return (5.0/2.0)-rating+"/5";
	   }
}
public static int wordsCounter(String[] input,String[] words) {
	   int k=0;
	   for(int j=0;j<words.length;j++) {
	   			for(int i=0;i<input.length;i++) {		
		   			if(words[j].equals(input[i]))
		   				k++;
		   		}
	   		}
	   
	   return k;
}
public static void main(String[] args) {
	System.out.println(MovieRating.movieRating("good this film is amazing all the fights are very good , twist in the film was amazing , some sceens are bad , comedy is very bad"));
}
}