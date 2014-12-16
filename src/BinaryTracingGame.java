import java.util.ArrayList;
import java.util.*;

public class BinaryTracingGame
	{
	private static ArrayList guessArray = new ArrayList();
	private static int target;
	private static int left = 0;
	private static int right = guessArray.size();
	private static int middle = (left + right) / 2;
	private static int leftGuess;
	private static int rightGuess;
	private static int middleGuess;
	private static int counter = 0;

	public static void main(String[] args)
		{
		System.out.println("Hello, lets play a binary guessing game.");
		creatingArray();
		Collections.sort(guessArray);
		System.out.println("Your Array is " + guessArray);
		System.out.println(target);
		System.out.println("Im going to have you guess what the number is for left, right and middle.");
		play();
		if(leftGuess == left && rightGuess == right && middleGuess == middle)
			{
			counter = counter + 3;
					play();
			}
		else if(leftGuess == left && rightGuess == right && middleGuess != middle)
			{
			counter = counter + 2;
			play();
			}
		}

	public static void creatingArray()
		{
		int number = 0;
		while (number != -1)
			{

			System.out
					.println("Input the next number you want to be in the Array. when you are finished input a -1");
			Scanner userInput = new Scanner(System.in);
			number = userInput.nextInt();
			if (number == -1)
				{

				} else
				{
				guessArray.add(number);
				}
			target = (int) (Math.random() * guessArray.size());
			target = (int) guessArray.get(target);
			}
		}

	public static int play()
		{
		
		
		Scanner userInput2 = new Scanner(System.in);
		leftGuess = userInput2.next();
		Scanner userInput3 = new Scanner(System.in);
		rightGuess = userInput3.next();
		Scanner userInput4 = new Scanner(System.in);
		middleGuess = userInput4.next();
		
			if (target < (int) guessArray.get(middle))
				{
				right = middle - 1;
				} else if (target > (int) guessArray.get(middle))
				{
				left = middle + 1;
				} else
				{
				return middle;
				}
		return -1;
		}
	}
