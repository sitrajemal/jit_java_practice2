public class Break {






        public static void main(String[] args) {
            int counter=1;

            wow: for(int i=0;i<7;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(j==3)
                        break wow;
                    System.out.print(i+"\t");

                }
                System.out.println();

            }



        }}










