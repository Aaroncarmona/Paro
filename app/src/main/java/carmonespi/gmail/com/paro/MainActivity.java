package carmonespi.gmail.com.paro;

import android.animation.Animator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class MainActivity extends Base implements View.OnClickListener {

    private BottomSheetBehavior mBottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomSheet = findViewById( R.id.bottom_sheet );
        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        mBottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setScaleX(0);
        //fab.setScaleY(0);

        //if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
          //  final Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),
            //        android.R.interpolator.fast_out_slow_in);

            /*fab.animate()
                    .scaleX(1)
                    .scaleY(1)
                    .setInterpolator(interpolador)
                    .setDuration(600)
                    .setStartDelay(1000)
                    .setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            fab.animate()
                                    .scaleY(0)
                                    .scaleX(0)
                                    .setInterpolator(interpolador)
                                    .setDuration(600)
                                    .start();
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });*/
        //}


    }

    boolean click = false;
    @Override
    public void onClick(View v) {
        click = !click;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),
                    android.R.interpolator.fast_out_slow_in);

            v.animate()
                    .rotation(click ? 45f : 0)
                    .setInterpolator(interpolador)
                    .start();
        }
    }
}
