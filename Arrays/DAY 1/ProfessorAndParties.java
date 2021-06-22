import java.util.HashMap;

public class ProfessorAndParties {
    public static String PartyType( long a[])
    {
        HashMap<Long, Boolean> map = new HashMap<>();
        for(int i = 0;i<a.length;i++)
        {
            if(map.get(a[i])==null)
            {
                map.put(a[i], true);
            }
            else
            {
                return "BOYS";
            }
        }
        return "GIRLS";
        
    }
    public static void main(String[] args) {
        long arr[] = {1,3,2, 4, 5};
        System.out.println(PartyType(arr));
    }
}
