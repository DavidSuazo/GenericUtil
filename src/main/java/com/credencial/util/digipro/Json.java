package com.credencial.util.digipro;

/**
 *
 * @author cj_sr
 */
                
public class Json
{
    private String Titulo;

    private String Valor;

    public String getTitulo ()
    {
        return Titulo;
    }

    public void setTitulo (String Titulo)
    {
        this.Titulo = Titulo;
    }

    public String getValor ()
    {
        return Valor;
    }

    public void setValor (String Valor)
    {
        this.Valor = Valor;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Titulo = "+Titulo+", Valor = "+Valor+"]";
    }
}
			