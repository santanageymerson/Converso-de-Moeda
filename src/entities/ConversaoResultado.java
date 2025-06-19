package entities;

import com.google.gson.annotations.SerializedName;

public class ConversaoResultado {

    @SerializedName("conversion_result")
    private Double ResultadoConversao;

    public ConversaoResultado() {
    }


    @Override
    public String toString() {
        return "Resultado da Conversão =" + ResultadoConversao ;
    }
}
