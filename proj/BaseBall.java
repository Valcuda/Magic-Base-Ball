import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
//import java.io;

public class BaseBall {
//Setting up variables \/

    Random rand = new Random();
    Scanner keyboard = new Scanner(System.in);

//These arrays contain the potential responses. If you want to add more, you can simply add new strings directly to the array.
//Their length isn't hard-coded
    String[] yups = new String[] { "Regretably, things will go your way.", "Things will somehow go your way??",
            "Your failure is inevitable, wait, forgot the not.", "You'll be happy about the future, but I won't.",
            "Things are supposed to go your way, but I'll pretend they won't." };
    String[] perhaps = new String[] { "If I say perhaps, will you leave?",
            "What do you believe in your heart? Cause it'll give you better guidance than I can!",
            "Go ask an 8-ball, I don't fricking know!", "Bold of you to assume I know!" };
    String[] no = new String[] { "Absolutely the fuck not!", "a b c d e f g h i j k l m NOPE",
            "I have no doubt in you. I also like lying.", "If you wanted a yes, you should've asked the 8-ball",
            "If I had to guess, I'd say yes, but I'm not, so I say no." };

    String[] harder = new String[] { "Hey! Focus more! I can predict if you don't! You'll have to ask me again now!",
            "Ohhh, I see it! Yes I see it! You're not concentrating enough!",
            "The future is as clear as water in a nice stream...getting poluted by factory above.",
            "Hold on, the 8-balls are hogging up the prediction lines. Ask me again.",
            "Ermm, yes, the answer is....no....wait yes! wait....perhaps? No no.....hmmmm....crud it, ask me again",
            "The future is as clear as invisible tape to me, I can't see it at all.",
            "I have an idea, go ask an 8-ball and tell me what they said, or ask me again.",
            "YOUR NOT FOCUSING HARD ENOUGH!!! FOCUS!!!!!" };

    String question;

//This array contains all the potential openers. As with the answers, the length isn't hard coded.
    String[] opens = new String[] { "Yo, I'm on a tight schedule, so make this quick!", "*Yawn*, what's your question?",
            "Okay big nose, what's your question?", "If you want nice answers, get a dam 8-ball",
            "Let me peer into the future, and laugh at your missery!",
            "The boss says I need to be nicer, I told him he needs to look nicer. That's why I'm a base ball.",
            "8-Balls, Crystal Balls, why not a base ball?",
            "Why do balls hold such mythical power? Seriously, what's up with that?",
            "Ask me a dumb question and I'll kick you in the base balls.",
            "So you've returned. I was hoping you wouldn't.",
            "I'm in a good mood today! Oh wait...it's you. Never mind." };

    String Ans_hold;

//This function gets a random string from the array passed to it as an argument
    public String get_str( String[] arr ) {
        int lengt = Array.getLength(arr);
        int val = rand.nextInt(lengt);
        String tex = arr[val];
        return tex;
    }

//This function is what should be called when the BaseBall is used by itself. It gets the question from the user, then outputs the answer.
//If you wanted to implement this program into another program, you shouldn't use this function
    void Getput() {
            Ans_hold = get_str(opens);
            System.out.print(Ans_hold);
            System.out.print("\nQuestion: ");
            question = keyboard.next();

            String MyFinalAnswer = GetMeThatDarnAnswer(question);
            System.out.print(MyFinalAnswer);

        //To walk you through this function, here it is in psudo code
        /*
        Ans_hold = random string from "open" Array
        Print Ans_hold to the terminal
        Print "[enter key] Question: " to the terminal
        question = what the user types next

        run GetMeThatDarnAnswer with the variable question as the argument.
        Print the output of GetMeThatDarnAnswer
        */

//This function is used to convert the question into an answer.
//If you wanted to use this in another program, this would be the function you'd call, giving it the question you got from the user
    }

    public String GetMeThatDarnAnswer( String ans ) {
        ans = ans.toUpperCase();
        int hashQ = ans.hashCode();
        int DRoot = digital_root(hashQ);
        int Tree = getMe3(DRoot);
        String MyFinalAnswer = FinalAnswer(Tree);
        return MyFinalAnswer;

        //Due to this just being a lot of function calls, I'll skip on the psudo code.
        //The main thing that's important here however, is that it takes the hash of the user input, and feeds it to digital_root()
    }
    

//This function gets the digital root of an integer. A digital root being the sum of all numbers in the int added together
//This gives the program a list of known values to work with, those being between 1-9, and on VERY rare occasion, 0.
    public int digital_root( int num ) {
            if (num<10) return num;
            int out = 0;
            while(num>0) {
                    out += num % 10;
                    num = num / 10;
            }
            while(out>=10) out = out/10;
            return out;

        //Here is the psudo code version
        /*
        if num is less than 10, send it back.
        create the variable called out
        While num is greather than 0,
            set out to the value of num mondulo (remainder when deviding) by 10
            set num to itself devided by 10
        While out is greater than or equal to 10, devide it by 10
        return the value of out
        */
        //The last while statement is in case any number greater than 10 somehow slips by.
        //In testing, this happened with a 30, so deviding it by 10 just gave us 3.
    }


//This function takes a value between 0 - 9, and makes it into 1, 2, or 3
//This way, the numbers line up perfectly with the amount of response types: Yes, No, Maybe
    public int getMe3( int num ) {
            if (num <= 0) return num+1;

            while(num>3) {
                    num = num/2;
            }
            if (num <= 0) return num+1;
            return num;
        //Psudo code version
        /*
        if num is less than or equal to 0, add 1 to it and toss it back.
        */
    }

    public String FinalAnswer( int num ) {
            if (num>3) return "Run getMe3, fucking idiot";
            if (num<=0) return "Less Than 0";

            String ans = "";

            if (num == 3) {
                 ans = get_str(perhaps);
                 return ans;
            }
            else if (num == 2) {
                    ans = get_str(no);
                    return ans;
            }
            else {
                    ans = get_str(yups);
                    return ans;
            }
    }

}