package com.example.hw3ex2;

//First create Variables and Classes needed for project
//Implement ButtonHandler


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GUI GUIView;
    private Shades showDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Point size = new Point();
        getDisplay().getRealSize(size);
        int w = size.x / Shades.SIDEw;
        int H = size.y / Shades.SIDEh;
        //ButtonHandler bh = new ButtonHandler();
        GUIView = new GUI(this, w, H, Shades.SIDEw, Shades.SIDEh);
       // GUIView.setStatusText(game.result());
        setContentView(GUIView);

    }

    //private class ButtonHandler implements View.OnClickListener{
    //    @Override
     //   public void onClick(View view) {

       // }
   // }




/*
    private class ButtonHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Log.w("MainActivity", "Inside onClick, v=" + v);
            for (int row = 0; row < TicTacToe.SIDE; row++)
                for (int column = 0; column < TicTacToe.SIDE; column++)
                    if (tttView.isButton((Button) v, row, column)) {
                        int play = game.play(row, column);
                        if (play == 1)
                            tttView.setButtonText(row, column, "X");
                        else if (play == 2)
                            tttView.setButtonText(row, column, "O");
                        if (game.isGameOver()) {
                            tttView.setStatusBackgroundColor(Color.RED);
                            tttView.enableButtons(false);
                            tttView.setStatusText(game.result());
                            showNewGameDialog();    // offer to play again
                        }
                    }
        }

    }


    private void showNewGameDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("This is fun");
        alert.setMessage("Play again?");
        PlayDialog playAgain = new PlayDialog();
        alert.setPositiveButton("YES", playAgain);
        alert.setNegativeButton("NO", playAgain);
        alert.show();
    }

    private class PlayDialog implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialogInterface, int id) {
            //yes button
            if (id == -1) {
                game.resetGame();
                tttView.enableButtons(true);
                tttView.resetButtons();
                tttView.setStatusBackgroundColor(Color.GREEN);
                tttView.setStatusText(game.result());
            }
            //no button
            else if (id == -2)
                MainActivity.this.finish();
        }

    }
}*/


}