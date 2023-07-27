class Prog082
{
  enum week{SUN,MON,TUE,WED,THU,FRI,SAT};
  public static void main(String args[])
   {
     week w=week.THU;
     switch(w)
       {
	 		case SUN : System.out.println("Sunday");
		   		break;
	 		case MON : System.out.println("MONday");
		   		break;
	 		case TUE : System.out.println("TUESday");
		   		break;
	 		case WED : System.out.println("WEDNESday");
		   		break;
	 		case THU : System.out.println("THURSday");
		   		break;
 			case FRI : System.out.println("FRIday");
		   		break;
	 		case SAT : System.out.println("SATURday");
		   		break;
	}

   }
}