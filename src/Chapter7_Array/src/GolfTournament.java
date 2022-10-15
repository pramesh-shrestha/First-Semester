/*In a 9-hole Golf tournament, a player had the following number of hits 3, 5, 1, 3, 3, 2, 4, 2, 3.
Create a class with a main method in which you:
a) Create an int array initialized to contain the 9 values shown above
b) Use a loop to calculate the total number of hits for the 9 holes and the number of
Hole-in-One’s, i.e. the number of elements being equal to 1. (The loop should not
rely on 9 as being the length of the array, but made more general so that it could be
changed later on)
c) After running the loop print out the following:
1. The total number of hits
2. The average hits per hole (the average value of the 9 elements)
3. The number of Hole-in-Ones
*/
public class GolfTournament
{
  public static void main(String[] args)
  {
    int i;
    int total = 0, count = 0;
    int[] hits = {3,5,1,3,3,2,4,2,3};

    for(i = 0; i < hits.length; i++)
    {
      total= total + hits[i];
      if(hits[i] == 1)
      {
        count = count + 1;
      }
    }
    System.out.print("Total hits: " + total);
    System.out.print("\nTotal 1's: " + count);
    System.out.println("\nThe average hits per hole: " + (double)(total/ hits.length));
  }
}
