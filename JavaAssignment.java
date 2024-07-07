
package javaassignment;
import java.util.Scanner;

public class JavaAssignment {

    private static int scenario = 1;  
    private static String playername = "Player";

    public static Object[] getarray(int gotv){
        //array to return multiple data
        Object[] objects = new Object[2]; //to return anything individual
        String[] Options = new String[5]; //to return game/scene options
        int[] Results = new int[5]; //to update where options will lead to

        switch (gotv) {
            case 1: 
            objects[0] = "You are born in Germany, year 1919. In 1939, \r\n" + "World War II just started, and you just received your war draft letter."; //story context
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Serve your country and join the Third Reich,becoming a soldier of glory."; 
            Options[2] = "Run away from the Third Reich, but you and your loved ones will be executed for treason.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 2; Results[1] = 20; Results[2] = 1; Results[3] = 1; //what next scene should be
            break;
            
            case 2: 
            objects[0] = "You took basic training lessons, and is now an official Third Reich soldier.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 3; Results[1] = 2; Results[2] = 2; Results[3] = 2; //what next scene should be
            break;

            case 3: 
            objects[0] = "Your first assignment is to invade Poland in September 1939. You are required to raid a small outpost in a city at broad daylight.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "You choose your best friends as your squad. They all use rifles."; 
            Options[2] = "You tag along demolision specalists as your squad. They use high explosive offensive weapons.";
            Options[3] = "You choose to support field medics. They carry pistols and medkits.";
            Options[4] = "None";
            
            Results[0] = 4; Results[1] = 27; Results[2] = 29; Results[3] = 3; //what next scene should be
            break;

            case 4: 
            objects[0] = "During the raid, your squad effectively wipe out the outpost with little to no issue thanks to your close bond and teamwork.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Return to base with zero casualties."; 
            Options[2] = "Continue advancing into the city.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 5; Results[1] = 6; Results[2] = 4; Results[3] = 4; //what next scene should be
            break;

            case 5: 
            objects[0] = "Upon returning to base, your entire squad was promoted to Corporal.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Visit the hospital."; 
            Options[2] = "Look around the camp.";
            Options[3] = "Attempt to escape the base and flee to neighbouring countries at night.";
            Options[4] = "Return to the city to advance your foothold.";
            
            Results[0] = 7; Results[1] = 8; Results[2] = 20; Results[3] = 6; //what next scene should be
            break;

            case 6: 
            objects[0] = "Your squad ventures deeper into the city. Where do you visit?";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "The heart of the city."; 
            Options[2] = "The edge of the city.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 9; Results[1] = 10; Results[2] = 6; Results[3] = 6; //what next scene should be
            break;

            case 7: 
            objects[0] = "Upon entering the hospital, you are greeted by the ward nurse, Lea.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 31; Results[1] = 7; Results[2] = 7; Results[3] = 7; //what next scene should be
            break;

            case 8: 
            objects[0] = "You look around the camp at the horros of war. Soldiers broken and battered, war does not offer glory, only guts.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Visit the hospital."; 
            Options[2] = "Attempt to escape the base and flee to neighbouring countries at night.";
            Options[3] = "Return to the city to advance your foothold.";
            Options[4] = "None";
            
            Results[0] = 7; Results[1] = 20; Results[2] = 6; Results[3] = 8; //what next scene should be
            break;

            case 9: 
            objects[0] = "You now stand in the broken and ruined heart of Poland. Debris and craters fill the streets. You are suddenly ambushed!";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Turn around and retreat."; 
            Options[2] = "Stand and fight!";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 11; Results[1] = 12; Results[2] = 9; Results[3] = 9; //what next scene should be
            break;

            case 10: 
            objects[0] = "You now stand on a riverbank. The sound of flowing river, nearby crickets and distant gunshots echo through the air.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Escape the war with your squad."; 
            Options[2] = "Advance into the city to increase your foothold.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 14; Results[1] = 6; Results[2] = 10; Results[3] = 10; //what next scene should be
            break;

            case 11 : 
            objects[0] = "The enemy overwhelms you, your squad is being wiped out and you have little time to choose your next move.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Sacrifice yourself to let your squad escape."; 
            Options[2] = "Fight to the death with the rest of your squad.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 13; Results[1] = 12; Results[2] = 11; Results[3] = 11; //what next scene should be
            break;

            case 12 : 
            objects[0] = "The enemy overwhelms you, you were shot in the head and killed in action. Your squad was wiped out. (Bad Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 11; Results[1] = 11; Results[2] = 11; Results[3] = 11; //what next scene should be
            break;

            case 13 : 
            objects[0] = "You stayed back to hold off the enemy for as long as you can. Allowing the rest of your squad to escape. Eventually you died a hero and was killed in action. (Good Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 13; Results[1] = 13; Results[2] = 13; Results[3] = 13; //what next scene should be
            break;

            case 14 : 
            objects[0] = "Your squadmates rip their country logo off their uniforms. Looking back at you one last time.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Join them to escape. Nobody is watching and no one will know."; 
            Options[2] = "Shoot them for deserting. A true soldier does not disappoint their country.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 15; Results[1] = 16; Results[2] = 14; Results[3] = 14; //what next scene should be
            break;

            case 15 : 
            objects[0] = "You ran and ran. Running through forests, crossing rivers, and climbing mountains.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario Eventually you've reached your freedom, free from the horrors of war.
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 17; Results[1] = 15; Results[2] = 15; Results[3] = 15; //what next scene should be
            break;

            case 16 : 
            objects[0] = "A firefight broke out, gunshots exchanged from both sides.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 18; Results[1] = 16; Results[2] = 16; Results[3] = 16; //what next scene should be
            break;

            case 17 : 
            objects[0] = "Eventually you've reached your freedom, free from the horrors of war. You live the rest of your life alone in the wilderness. (Good Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 17; Results[1] = 17; Results[2] = 17; Results[3] = 17; //what next scene should be
            break;

            case 18 : 
            objects[0] = "Did war taught you to shoot your own friends?";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 19; Results[1] = 18; Results[2] = 18; Results[3] = 18; //what next scene should be
            break;

            case 19 : 
            objects[0] = "You and your friends lied in the river, bleeding out and slowly dying. No guts and no glory. (Bad Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 19; Results[1] = 19; Results[2] = 19; Results[3] = 19; //what next scene should be
            break;
            case 20 : 
            objects[0] = "You escape during the night, running into the treelines.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "You leave everyone behind and escape alone."; 
            Options[2] = "You bring along your loved ones.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 21; Results[1] = 22; Results[2] = 20; Results[3] = 20; //what next scene should be
            break;

            case 21 : 
            objects[0] = "You ran and ran, leaving your loved ones behind. Eventually they were raided and executed. You are the last person alive.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Bring a pistol for self defense."; 
            Options[2] = "Continue running.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 23; Results[1] = 24; Results[2] = 21; Results[3] = 21; //what next scene should be
            break;

            case 22 :  
            objects[0] = "You ran and ran, bringing your loved ones. Eventually you are caught up and confronted for treason.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 54; Results[1] = 22; Results[2] = 22; Results[3] = 22; //what next scene should be
            break;

            case 23 : 
            objects[0] = "Unfortunately, you could not escape the country in time, eventually you are caught up and confronted for treason.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 25; Results[1] = 23; Results[2] = 23; Results[3] = 23; //what next scene should be
            break;
			
			case 24 : 
            objects[0] = "How would you escape?";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Boat away at the seashore."; 
            Options[2] = "Cross the country border and surrender.";
            Options[3] = "Camp out in the thick woods.";
            Options[4] = "Climb the mountains to get across the country.";
            
            Results[0] = 53; Results[1] = 23; Results[2] = 23; Results[3] = 55; //what next scene should be
            break;

            case 25 : 
            objects[0] = "You are now surrounded by the Third Reich.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Fight back!"; 
            Options[2] = "Surrender.";
            Options[3] = "Run away.";
            Options[4] = "None";
            
            Results[0] = 26; Results[1] = 26; Results[2] = 26; Results[3] = 25; //what next scene should be
            break;

            case 26 : 
            objects[0] = "You were quickly shot and executed. Your legacy and bloodline ends with you. (Bad Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 26; Results[1] = 26; Results[2] = 26; Results[3] = 26; //what next scene should be
            break;
            case 27 : 
            objects[0] = "During the raid, a crate of explosives were hit by an enemy's grenade, setting it off.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 28; Results[1] = 27; Results[2] = 27; Results[3] = 27; //what next scene should be
            break;
            case 28 : 
            objects[0] = "The crate creates a chain-reaction explosion and wipes out you and your squad. You were blown into a million pieces. (Bad Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 28; Results[1] = 28; Results[2] = 28; Results[3] = 28; //what next scene should be
            break;
            case 29 : 
            objects[0] = "During the raid, you were critically injured during a shootout. Luckily a medic in your team was present and patched you up just in time from bleeding out.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 30; Results[1] = 29; Results[2] = 29; Results[3] = 29; //what next scene should be
            break;
            case 30 : 
            objects[0] = "You awaken in the hospital after being carried back by reinforcements.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 7; Results[1] = 30; Results[2] = 30; Results[3] = 30; //what next scene should be
            break;
            case 31 : 
            objects[0] = "Lea had seen just as much the average soldier in a battlefield, countless of injured men lie in beds and floor, limbs and body parts missing.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 32; Results[1] = 31; Results[2] = 31; Results[3] = 31; //what next scene should be
            break;
            case 32 : 
            objects[0] = "Rations were scarce, soldiers would have to fight to even have a proper meal as they were not enough for everyone.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 33; Results[1] = 32; Results[2] = 32; Results[3] = 32; //what next scene should be
            break;
            case 33 : 
            objects[0] = "Only healthy soldiers were lucky enough to queue and get rations. "+playername+" was lucky enough to be considered one of them.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 34; Results[1] = 33; Results[2] = 33; Results[3] = 33; //what next scene should be
            break;
            case 34 : 
            objects[0] = "While eating your dinner, you notice Lea sitting in the corner of the ward. She looks hungry and exhausted.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Approach to offer your meatball soup."; 
            Options[2] = "Ignore and continue eating your dinner.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 35; Results[1] = 42; Results[2] = 34; Results[3] = 34; //what next scene should be
            break;
            case 35 : 
            objects[0] = "Lea looks up at you, a wounded soldier so selfless enough to offer their only meal of the day. You both immediately bonded over that.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 36; Results[1] = 35; Results[2] = 35; Results[3] = 35; //what next scene should be
            break;
            case 36 : 
            objects[0] = "Over the next few days recovering in the ward, Lea would constantly sneak rations for you and find chances to have small talk with you.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 37; Results[1] = 36; Results[2] = 36; Results[3] = 36; //what next scene should be
            break;
            case 37 : 
            objects[0] = "As you both get to know each other. Lea is an anti-war activist but forced to serve as a medic due to her academic background. Similar to you being threatened to join the army.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 38; Results[1] = 37; Results[2] = 37; Results[3] = 37; //what next scene should be
            break;
            case 38 : 
            objects[0] = "As you near full recovery, Lea constantly persuades you to quit the military and leave together. Otherwise you will end up back in the frontlines again.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Escape with Lea to the North, where nobody will find us in the thick woods."; 
            Options[2] = "Stay and return back to the battlefield to serve your country and protect your family.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 39; Results[1] = 40; Results[2] = 38; Results[3] = 38; //what next scene should be
            break;
            case 39 : 
            objects[0] = "Both Lea and you escape to the North and find a small cabin where you both decide to rest for the night. However, you both soon hear the sound of commotion outside the cabin. Looking through the window, you see a group of enemy soldiers passing by, and some of them approach the cabin.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Arm yourself with a knife."; 
            Options[2] = "Run away from the cabin.";
            Options[3] = "Infiltrate as enemy soldiers.";
            Options[4] = "None";
            
            Results[0] = 49; Results[1] = 48; Results[2] = 0; Results[3] = 39; //what next scene should be
            break;
            case 40 : 
            objects[0] = "Upon learning that "+playername+" needs to return to the battlefield, Lea becomes incredibly angry and sadly leaves "+playername;
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 41; Results[1] = 40; Results[2] = 40; Results[3] = 40; //what next scene should be
            break;
            case 41 : 
            objects[0] = "Once you fully recover, you are instantly assigned to another country for combat. However during a mission, your unit was wiped out by enemy artillery.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Become a deserter and run away."; 
            Options[2] = "Pick up your rifle and hold your position.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 43; Results[1] = 44; Results[2] = 41; Results[3] = 41; //what next scene should be
            break;
            case 42 : 
            objects[0] = "Days pass as you slowly and steadily recover.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 41; Results[1] = 42; Results[2] = 42; Results[3] = 42; //what next scene should be
            break;
            case 43 : 
            objects[0] = "You became a deserter, but when the Third Reich pursues deserters, you were unfortunately captured. Despite attempting to break free, you were ultimately taken to a military court and sentenced to 10 years of imprisonment. After serving their sentence, you are released and now live a life marked by the shame of being labelled a rebel. (Good Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 43; Results[1] = 43; Results[2] = 43; Results[3] = 43; //what next scene should be
            break;
            case 44 : 
            objects[0] = "You stand your ground, raising your rifle and aiming into the endless depth of enemy trenches.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Fire at the enemy medic on your left."; 
            Options[2] = "Fire at the enemy charging towards you.";
            Options[3] = "Fire at the enemy shooting from your right.";
            Options[4] = "Fire at the enemy behind cover in the distance.";
            
            Results[0] = 45; Results[1] = 46; Results[2] = 45; Results[3] = 45; //what next scene should be
            break;
            case 45 : 
            objects[0] = "You were ultimately overpowered by the overwhelming number of enemies and perishes in a pool of blood. (Bad Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 45; Results[1] = 45; Results[2] = 45; Results[3] = 45; //what next scene should be
            break;
            case 46 : 
            objects[0] = "You cycle your rifle bolt and took aim again. The soldier falls face down into the mud on your feet.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Fire at the enemy medic on your left."; 
            Options[2] = "Fire at the enemy climbing out of enemy trenches.";
            Options[3] = "Fire at the enemy shooting from your right.";
            Options[4] = "Fire at the enemy behind cover in the distance.";
            
            Results[0] = 45; Results[1] = 45; Results[2] = 47; Results[3] = 45; //what next scene should be
            break;
            case 47 : 
            objects[0] = "You cycle your rifle bolt and took aim again. The soldier falls onto their back, their eyes rolling back as they slowly bleed out.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Fire at the enemy medic on your left, who is now aiming their weapon at you."; 
            Options[2] = "Fire at the enemy firing at you at front.";
            Options[3] = "Fire at the enemy executing your ally at the far right.";
            Options[4] = "Fire at the enemy aiming at you from behind cover.";
            
            Results[0] = 45; Results[1] = 45; Results[2] = 45; Results[3] = 45; //what next scene should be
            break;
            case 48 : 
            objects[0] = "Both of you leave the cabin and run into the darkness, but the noise was loud enough to alert nearby enemy soldiers who started to chase after. Eventually they catch up and execute both of you. (Bad Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 48; Results[1] = 48; Results[2] = 48; Results[3] = 48; //what next scene should be
            break;
            case 49 : 
            objects[0] = "You stab the first soldier who comes through the cabin door. They fall onto the floor immediately, bleeding out to their death.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Continue attacking the next soldier with your knife."; 
            Options[2] = "Escape with Lea into the woods.";
            Options[3] = "Pick up the soldier's gun and use it against the rest of the soldiers.";
            Options[4] = "None";
            
            Results[0] = 45; Results[1] = 48; Results[2] = 50; Results[3] = 49; //what next scene should be
            break;
            case 50 : 
            objects[0] = "You successfully wipe out an entire unit of soldiers, but now you have to leave the cabin as nearby soldiers are alerted.";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "Stay and hold out in the cabin."; 
            Options[2] = "Escape with Lea into the woods.";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 51; Results[1] = 48; Results[2] = 50; Results[3] = 50; //what next scene should be
            break;
            case 51 : 
            objects[0] = "When reinforcement arrives, you were overpowered quickly and both Lea and you are executed.";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 51; Results[1] = 51; Results[2] = 51; Results[3] = 51; //what next scene should be
            break;
            case 52 : 
            objects[0] = "Both Lea and you attempt to infiltrate the enemy's ranks but are apprehended. You both are taken to a concentration camp where you both endure brutal living conditions. Eventually, after the war ends in 1945, and you both are repatriated and return home to lead ordinary lives. (Best Ending)";
            objects[1] = false; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 52; Results[1] = 52; Results[2] = 52; Results[3] = 52; //what next scene should be
            break;
			case 53 : 
            objects[0] = "You tried your best, but you are eventually overwhelmed by mother nature and perished. (Bad Ending)";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 53; Results[1] = 53; Results[2] = 53; Results[3] = 53; //what next scene should be
            break;
			case 54 : 
            objects[0] = "As time passes, you were eventually caught, you fought hard but you perished during the fire fight. (Bad Ending)";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 54; Results[1] = 54; Results[2] = 54; Results[3] = 54; //what next scene should be
            break;
			case 55 : 
            objects[0] = "With enough luck, you barely survived and reached the other end of the country. You now walk free from your past, and as a war escapist. (Good Ending)";
            objects[1] = true; //is not a game over screen (false to stop game, true to continue)

            //user's options to this scenario
            Options[1] = "None"; 
            Options[2] = "None";
            Options[3] = "None";
            Options[4] = "None";
            
            Results[0] = 55; Results[1] = 55; Results[2] = 55; Results[3] = 55; //what next scene should be
            break;


        } return new Object[]{objects,Options,Results}; //returning tables 
    }

    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); //for future use
        boolean tocontinue = true; boolean keepgamegoing = true; //storing variables only
        int totalOptionsChose = 0;

        while(tocontinue == true){
            System.out.println("Welcome to Battlefield: 1939, type 'Enter' to play, 'Exit' to quit!");
            String menuinput = input.nextLine(); //menu screen

            if (menuinput.equals("Enter")){ //proceed with game

                System.out.println("Enter your character's name:");
                playername = input.nextLine();
            
                while(keepgamegoing == true){
                totalOptionsChose++; //increasing user total amount of choices

                //obtain stuff
                Object[] arrayObjects = getarray(scenario); //getting all arrays we need
                Object[] objectArray = (Object[]) arrayObjects[0]; //subtitle
                String[] OptionsArray = (String[]) arrayObjects[1]; //user options
                int[] ResultsArray = (int[]) arrayObjects[2]; //results of choices

                //loading items
                System.out.println("\n"+objectArray[0]); //subtitle / story context

                //is this a game over scene?
                if (objectArray[1] != null){keepgamegoing = (boolean) objectArray[1];}
                else{keepgamegoing = true;}

                //printing out user's options
                for (int i = 1; i < OptionsArray.length ; i++) {
                    System.out.println("Option "+i+" : "+OptionsArray[i]); //user's options
                }
                
                if (keepgamegoing == true){
                     //telling user what to input
                    System.out.println("--------------------------------------"); 
                    System.out.println("Enter your choice: 1-4"); 
                    int userinput = input.nextInt();

                    if (userinput == 1){scenario = ResultsArray[0]; 
                    }else if(userinput == 2){scenario = ResultsArray[1]; 
                    }else if(userinput == 3){scenario = ResultsArray[2]; 
                    }else if(userinput == 4){scenario = ResultsArray[3];
                    }else if(userinput == 505){keepgamegoing = false;} //manual quit
                    else{System.out.println("Invalid choice!");} //repeating scenario  
                }               
            }

            //game over screen
            System.out.println("Game Over! You took "+totalOptionsChose+" to complete the game!");
            tocontinue = false; //stop main loop and end game entirely
            
        }else if(menuinput.equals("Exit")){System.out.println("Bye!"); tocontinue = false;} //quit game
        else{System.out.println("Invalid input!");} //invalid input
        }

    }
}