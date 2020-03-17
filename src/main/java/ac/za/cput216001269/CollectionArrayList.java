package ac.za.cput216001269;

import java.util.List;

public class CollectionArrayList
{
    public List<String>[] ArrayListCollection(List<String> input)
    {
       List<String>[] answer = new List[3];
       List<String> list;

       for (String i : input)
       {
            if (i.charAt(0) == 'a' || i.charAt(0) == 'A')
            {
                if (answer[0] == null)
                {
                    list = new java.util.ArrayList<>();
                }
                else
                {
                    list = answer[0];
                }
                list.add(i);
                answer[0] = list;
            }
           else if (i.charAt(0) == 'b' || i.charAt(0) == 'B')
           {
               if (answer[1] == null)
               {
                   list = new java.util.ArrayList<>();
               }
               else
               {
                   list = answer[1];
               }
               list.add(i);
               answer[1] = list;
           }
           else
            {
                if (answer[2] == null)
                {
                    list = new java.util.ArrayList<>();
                }
                else
                {
                    list = answer[2];
                }
                list.add(i);
                answer[2] = list;
            }
       }
       return answer;
    }
}
