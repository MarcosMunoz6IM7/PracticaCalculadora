package marcosfernando.edu.mx.ipn.practicacalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    Double x,y,r;
    String tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButtonUno(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickButtonDos(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickButtonTres(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickButtonCuatro(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickButtonCinco(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickButtonSeis(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickButtonSiete(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickButtonOcho(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickButtonNueve(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickButtonCero(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "0");
    }

    public void onClickButtonPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        x = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView)
    {
        tipo="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        tipo="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        tipo="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        tipo="/";
        onClickOperacionCapturaNumero1(miView);
    }


    public void onClickSen(View miView)
    {
        tipo="sen";
    }

    public void onClickCos(View miView)
    {
        tipo="cos";
    }

    public void onClickTan(View miView)
    {
        tipo="tan";
    }

    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        y = Double.parseDouble(tv.getText().toString());

        try {

            if (tipo.equals("+")) {
                r = x + y;
            } else if (tipo.equals("-")) {
                r = x - y;
            } else if (tipo.equals("*")) {
                r = x * y;
            } else if (tipo.equals("/")) {
                r = x / y;
            } else if (tipo.equals("sen")){
                r = Math.sin(y);
            } else if (tipo.equals("cos")){
                r = Math.cos(y);
            } else if (tipo.equals("tan")){
                r = Math.tan(y);
            }
            tv.setText(r.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }
    }

    public void onClickLimpia(View miView)
    {
        x=0.0;
        y=0.0;
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText("");
    }
}
