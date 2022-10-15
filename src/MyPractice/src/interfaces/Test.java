package interfaces;

public class Test
{
  public static void main(String[] args)
  {
    SmartPhone smartPhone = new SmartPhone();
    //can call every method including Phone, camera and music player
    smartPhone.click();
    smartPhone.pause();
    smartPhone.play();
    smartPhone.record();
    smartPhone.stop();
    smartPhone.call();
    smartPhone.sms();

    Camera camera = smartPhone;
    //only methods available in Camera interface are allowed to be called
    camera.click();
    camera.record();

    MusicPlayer musicPlayer = smartPhone;
    //only methods available in musicPlayer interface are allowed to be called
    musicPlayer.pause();
    musicPlayer.play();
    musicPlayer.stop();

    Phone phone = smartPhone;
    //only methods available in Phone class are allowed to be called
    phone.call();
    phone.sms();
  }
}
