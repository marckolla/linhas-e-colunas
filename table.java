public class table {

  public static void main(String[ ] argv) {

    if (! (argv.length > 0) ) {
    System.out.printf("\n Sem argumentos \n\n");

    } else {
            
        int linha = Integer.parseInt(argv[0]);
        int coluna = Integer.parseInt(argv[1]);
      
        System.out.printf("<table>\n");
        for(int i = 0;i < linha;i++) {
            System.out.printf("<tr>%dº linha",i + 1);
            for(int j = 0;j < coluna;j++){
                System.out.printf("<td> %dº coluna </td>",j+1);
                }
            System.out.printf("</tr>\n");

        }
        System.out.printf("</table>\n");

    }

  }
}