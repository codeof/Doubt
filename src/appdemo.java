import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class appdemo
{
    public static void main(String[] args)
    {
        List<Either< Exception,Integer> > ls=new ArrayList<>();
        for( int i=0;i<10;i++)
        {
            ls.add(Either.Right(null));
        }
        ls.stream()
                .map(Either.lift(e->e.dosome(e)))
                .collect(Collectors.toList());
        ls.stream()
                .forEach(System.out.println(e->{e.getLeft().toString())});
    }


}
