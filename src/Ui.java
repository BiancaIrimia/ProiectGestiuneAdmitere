public class Ui {
    private Controller c=new Controller();

    public void meniu()
    {
        System.out.println("1. Inscriere candidat\n"+"2. Afisare candidati inscrisi dupa ID\n"+"3. Afisare candidati inscrisi in ordine alfabetica\n"+"4. Afisare repartizare sali\n"+"5. Introducere note admitere si calculare medie admitere\n"+"6. Afisare lista admisi/respinsi\n"+"0. Exit.");
    }

    public static void testCandidat()
    {
        Candidat c=new Candidat();
        c.setNume("ana");
        c.setCnp("345");
        c.setDisciplina("pescarie");
        c.setId(2);
        c.setMedieAdmitere(4.99);
        c.setMedieBac(5.99);
        c.setNotaAdmitere(4.99);
        c.setNotaProbaBac(3.4);
        c.setNrSala("a322");
        c.setAdmis("admis");
       System.out.println( c.getNotaAdmitere());
        System.out.println(c.getAdmis());

        System.out.println(c);
    }

    public static void testRepo()
    {
        Repo r=new Repo();
        r.citireCandidat();
        r.citireCandidat();
       // r.writetoFile();
        System.out.println(r);
    }

    public static void testController()
    {
        Controller con=new Controller();

        Candidat c=new Candidat();
        c.setNume("ana");
        c.setCnp("345");
        c.setDisciplina("pescarie");
        c.setMedieBac(5.99);
        c.setNotaProbaBac(3.4);
        c.setNrSala("a322");

        Candidat c1=new Candidat();
        c1.setNume("amaaaa");
        c1.setCnp("3454342");
        c1.setDisciplina("golf");
        c1.setMedieBac(5.99);
        c1.setNotaProbaBac(3.4);
        c1.setNrSala("a3");
        c1.setId(1);

        Candidat c2=new Candidat();
        c2.setNume("andrei");
        c2.setCnp("3454342");
        c2.setDisciplina("mini golf");
        c2.setMedieBac(5.99);
        c2.setNotaProbaBac(3.4);
        c2.setNrSala("a2");
       // c2.setMedieAdmitere(5.0);
        c2.setId(2);
        con.addCandidat(c);
        con.addCandidat(c1);
        con.addCandidat(c2);
       // con.introducereNoteAdmitere();
       // con.setMedieAdmitere1(c);
       // con.calculMedii();
        con.repartizareSali();
        con.afisareCandidatiSali();
        //con.listaFinala();
        //boolean ift=false;
       // ift=con.sortareDupaNume();
       // if(ift==true)
        //con.resortareID();


        System.out.println(con.getR());
    }


    public void run()
    {
        meniu();
       double optiune=-1;
        boolean ift=false;
        c.readFromFile();
        c.repartizareSali();
        while(optiune!=0)
        {
            optiune=c.citireOpt();
            if(optiune==1)
            {
                c.inscriere();
            }
            if(optiune==2)
            {   if(ift==true)
                    c.resortareID();
                c.afistot(c.getSize(), c.getR());

            }
            if(optiune==3)
            {
                ift=c.sortareDupaNume();
                c.afistot(c.getSize(), c.getR());
            }
            if(optiune==4)
            {  c.repartizareSali();
               c.afisareCandidatiSali();
               c.afistot(c.getSize(), c.getR());

            }
            if(optiune==5)
            {
                c.introducereNoteAdmitere();
                c.calculMedii();
            }
            if(optiune==6)
            {
                c.sortareMedieAdmitere();
                c.listaFinala();
                c.afistot(c.getSize(), c.getR());

            }


        }

    }

    public static void main(String []args)
    {
       // testCandidat();
       // testRepo();
       // testController();
        Ui ui=new Ui();
        ui.run();

    }

}
