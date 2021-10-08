package com.credencial.util.digipro;

/**
 *
 * @author cj_sr
 */
              
public class Documentos
{
    private String Base64;

    private String NombreExpediente;

    private String NombreDocumeto;

    public String getBase64 ()
    {
        return Base64;
    }

    public void setBase64 (String Base64)
    {
        this.Base64 = Base64;
    }

    public String getNombreExpediente ()
    {
        return NombreExpediente;
    }

    public void setNombreExpediente (String NombreExpediente)
    {
        this.NombreExpediente = NombreExpediente;
    }

    public String getNombreDocumeto ()
    {
        return NombreDocumeto;
    }

    public void setNombreDocumeto (String NombreDocumeto)
    {
        this.NombreDocumeto = NombreDocumeto;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Base64 = "+Base64+", NombreExpediente = "+NombreExpediente+", NombreDocumeto = "+NombreDocumeto+"]";
    }
}
			
			