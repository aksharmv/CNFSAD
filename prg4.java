package lab;

interface MediaPlayer
{
	public void play(String filename);
}

interface AdvancedMediaPlayer
{
	public void playfile(String filename);
}

class mp3player implements MediaPlayer
{
	public void play(String filename)
	{
		System.out.println("playing using mp3player :"+filename);
	}
}

class mp4player implements AdvancedMediaPlayer
{
	public void playfile(String filename)
	{
		System.out.println("playing using mp4player :"+filename);
	}
}

class vlcplayer implements AdvancedMediaPlayer
{
	public void playfile(String filename)
	{
		System.out.println("playing using vlcplayer :"+filename);
	}
}

class AdvancedMediaAdapter implements MediaPlayer
{
	private AdvancedMediaPlayer amp;
	public AdvancedMediaAdapter(AdvancedMediaPlayer amp)
	{
		this.amp=amp;
	}
	public void play(String filename)
	{
		System.out.println("playing using advanced media adapter ");
		amp.playfile(filename);
	}
}

public class prg4
{
	public static void main(String [] args)
	{
		MediaPlayer player=new mp3player();
		player.play("test.mp3");
		player=new AdvancedMediaAdapter(new mp4player());
		player.play("test1.mp4");
		player=new AdvancedMediaAdapter(new vlcplayer());
		player.play("test2.mp4");
	}
}
