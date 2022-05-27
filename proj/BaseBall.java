import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class BaseBall {
    public void main(String[] args){
        Getput();
    }
    Random rand = new Random();
    Scanner keyboard = new Scanner(System.in);
    boolean rand_mode = false;
    int mode = 0;
    String[] yups = new String[] { "Regretably, things will go your way.", "Things will somehow go your way??",
            "Your failure is inevitable, wait, forgot the not.", "You'll be happy about the future, but I won't.",
            "Things are supposed to go your way, but I'll pretend they won't." };
    String[] perhaps = new String[] { "If I say perhaps, will you leave?",
            "What do you believe in your heart? Cause it'll give you better guidance than I can!",
            "Go ask an 8-ball, I don't fricking know!", "Bold of you to assume I know!" };
    String[] no = new String[] { "Absolutely the fuck not!", "abcdefghijklm NOPE",
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
    boolean div_2 = false;
    boolean div_3 = false;
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


    public static String get_str( Array arr ) {
        int lengt = arr.length;
        int val = rand.nextInt(lengt);
        String tex = arr[val];
        return tex;
    }

    void Getput() {
            Ans_hold = get_str(opens);
            System.out.print(Ans_hold);
            System.out.print("Question: ");
            question = keyboard.next();
    }
}