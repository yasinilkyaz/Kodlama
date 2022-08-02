public class GamerManager implements GamerService {


    @Override
    public void addGamer(Gamer gamer){
        Mernis mernis=new Mernis();

        if(mernis.checkGamerIsRealPerson(gamer)){
            System.out.println("Person in mernis system");
            System.out.println("New gamer add to db"+gamer.getLastName());
        }else{
            System.out.println("Person not in mernis system");
        }

    }

    @Override
    public void deleteGamer(Gamer gamer) {
        System.out.println("Gamer deleted to db"+gamer.getLastName());
    }



}
