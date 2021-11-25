import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    public UserInterface() throws IOException, InterruptedException
    {
        FightFacade fightFacade = new FightFacade();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            System.out.println("Choose what you wish to do by inputing the needed number: \n" +
                    "1. Watch a random fight \n" +
                    "2. Go to an arena \n" +
                    "3. Exit");
            String userInput = reader.readLine();
            if(userInput.equals("1"))
            {
                fightFacade.randomFight();
            }
            else if(userInput.equals("3"))
                break;
            else
            {
                System.out.println("Please, enter the right number");
            }
        }


    }
}
