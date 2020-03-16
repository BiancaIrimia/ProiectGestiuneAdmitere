import java.text.DecimalFormat;

class Formatari {
  //  private DecimalFormat df = new DecimalFormat("#.##");
    public static void capTabel22(){
        String sir="ID\t |Nume\t  |Prenume\t\t |CNP\t\t  |Medie Bac\t   |Nota proba Bac\t  |Disciplina\t  |Nota admitere\t  |Medie admitere\t \t\t |Sala\t\t\t\t  |Status\t";
        Linii(180,'=');
        System.out.println(sir);
        Linii(180,'=');
    }
    public static void Formatari22(int i, Repo r) {
        DecimalFormat df = new DecimalFormat("#.##");
        String []s=new String[11];
        s[0]=Integer.toString(r.getCandidat(i).getId());
        s[1]=r.getCandidat(i).getNume();
        s[2]=r.getCandidat(i).getPrenume();
        s[3]=r.getCandidat(i).getCnp();
        s[4]=Double.toString(r.getCandidat(i).getMedieBac());
        s[5]=Double.toString(r.getCandidat(i).getNotaProbaBac());
        s[6]=r.getCandidat(i).getDisciplina();
        s[7]=Double.toString(r.getCandidat(i).getNotaAdmitere());
        s[8]=Double.toString(Double.parseDouble(df.format(r.getCandidat(i).getMedieAdmitere())));
        s[9]=r.getCandidat(i).getNrSala();
        s[10]=r.getCandidat(i).getAdmis();
        System.out.printf("|%-3s|%-10s|%-10s|%-19s|%-13s|%-16s|%-20s|%-20s|%-15s|%-15s|%13s|\n",s);	//afisare formatata
    }

    public static void Linii (int nrLinii,char c){
        for(int i=0;i<nrLinii;i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
