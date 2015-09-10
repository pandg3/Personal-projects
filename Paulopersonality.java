
public class Paulopersonality {
public static void main(String[] args) {



speak("Hello");		
speak("I am a code driven program created to present Paulo, or the person who brought me to be");
speak("Paulo is the brother of Gabriel, who is currently in this class, here is a pic, if youve never seen paulos bro before, which you should have, if not, pay more attention!");
new Picture2();
try {
    Thread.sleep(3000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();}
speak("We also have a loving dog, named Qawei, like the island");
speak("Look, I know, its hard for me to say Qawei");
speak("Hobbys include sailing in the small Sabot, which looks like this");
new picture_gui();
try {
    Thread.sleep(5000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();}
speak("If I could, I myself would try, as so far to get into a robot to try sailing, cause it looks fun");
speak("Also, to bring me to life, he would need to code");
speak("it can be fairly easy, or hard, both depending on what you want to do, or the system you use or run on");
speak("I run on java, but there is some others, including python, and proscesing");
speak("Paulo has behn out of the US to places like Brazil, Japan, and China");
speak("A good thing is that he knows portugies,so that makes it easier to speek to his grand-parents");
speak("let me try");
speak("oi, tudobom?");
speak("again, I have dificulty speaking, because I am a computer, I talk with code, not english");
speak("other hobbies include snowbording, trolling gabriel, Gaming, Playing the piano, and basketball");
speak("anyways, Thats about it, thanks for watching");
}






static void speak(String words)
{
	try
	{
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e)
	{
		e.printStackTrace();
	}
}

}

