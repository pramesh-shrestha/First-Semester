package interfaces;

public class SmartPhone extends Phone implements Camera,MusicPlayer
{


  //methods of Camera interface
  @Override public void click()
  {
    System.out.println("Smart phone clicking photo");
  }
  @Override public void record()
  {
    System.out.println("Smart phone recording video");
  }

  //methods of MusicPlayer interface
  @Override public void play()
  {
    System.out.println("Smart phone playing music");
  }

  @Override public void pause()
  {
    System.out.println("Smart phone paused music");

  }


  @Override public void stop()
  {
    System.out.println("Smart phone stopped music");
  }
}
