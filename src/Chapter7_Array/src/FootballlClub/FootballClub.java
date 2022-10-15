package FootballlClub;

import java.util.ArrayList;

public class FootballClub
{
  private String name;
  private ArrayList<FootballPlayer> team;

  //constructor
  public FootballClub(String name)
  {
    this.name = name;
    team = new ArrayList<>();
  }

  //signPlayer
  public void signPlayer(FootballPlayer player, String fieldPosition,
      int number)
  {
    team.add(player);
//    player.setFieldPosition(fieldPosition);
//    player.assignNumber(number);
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).equals(player))
      {
        team.get(i).setFieldPosition(fieldPosition);
        team.get(i).assignNumber(number);
      }
    }
  }

  //trainGoalkeepers
  public void trainGoalkeepers()
  {
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getFieldPosition().equals("goalkeeper"))
      {
        team.get(i).train();
      }
    }
  }

  //trainOutfieldPlayers
  public void trainOutfieldPlayers()
  {
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getFieldPosition().equals("Defender") || team.get(i)
          .getFieldPosition().equals("Midfielder") || team.get(i)
          .getFieldPosition().equals("Forward"))
      {
        team.get(i).train();
      }
    }
  }
    //getCaptain
    public FootballPlayer getCaptain () {
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getIsCaptain())
      {
        return team.get(i);
      }
    }
    return null;

    }

    //setNewCaptain
    public void setNewCaptain ( int number)
    {
      for(int i = 0; i < team.size(); i++)
      {
        if(team.get(i).getIsCaptain())
        {
          team.get(i).setIsCaptain(false);
        }
      }
      for(int i = 0; i < team.size(); i++)
      {
        if(team.get(i).getNumber() == number)
        {
          team.get(i).setIsCaptain(true);
        }
      }
    }

    //getPlayersInPosition
  public ArrayList<FootballPlayer> getPlayersInPosition(String position)
  {
    ArrayList<FootballPlayer> temp = new ArrayList<>();
    for(int i = 0; i < team.size(); i++)
    {
      if(team.get(i).getFieldPosition().equals(position))
      {
        temp.add(team.get(i));
      }
    }return temp;
  }

  //toString
  public String toString()
  {
    String str = "";
    for(int i = 0; i < team.size(); i++)
    {
      str += team.get(i) + " ";
    }
    return str + name;
  }




}
