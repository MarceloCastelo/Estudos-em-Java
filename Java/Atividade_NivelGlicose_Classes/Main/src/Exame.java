

 class Exame {
    
    //Atributos.
    private int idExame;
    private String nomePaciente;                                            
    private int nivelGlicose;
   
    //get
    public int getIdExame() {
        return idExame;
    }
    
    public int getNivelGlicose() {
        return nivelGlicose;
    }
    
    public String getNomePaciente() {
        return nomePaciente;
    }
    
    //set
    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }
    
    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }
    
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }


   
    //Método Abstrato.

     String obterDiagnostico(){
    if (nivelGlicose <= 99){
        return "Normal";
    } else if (nivelGlicose == 100 || nivelGlicose <= 125){
        return "Pré-Diabetes";
    } else {
        return "diabetes";
    }
       
    }

   
}
