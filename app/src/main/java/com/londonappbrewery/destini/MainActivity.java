package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonAnswer1;
    Button mButtonAnswer2;
    TextView mStory;
    int mCurrentStory;
    String mStoryPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonAnswer1 = (Button) findViewById(R.id.buttonTop);
        mButtonAnswer2 = (Button) findViewById(R.id.buttonBottom);
        mStory = (TextView) findViewById(R.id.storyTextView);
        mCurrentStory = 1;

        if (savedInstanceState!=null) {
            mCurrentStory=1;
            mButtonAnswer1.setVisibility(View.VISIBLE);
            mButtonAnswer2.setVisibility(View.VISIBLE);
        }

        setupStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentStory==1) {
                    mCurrentStory=3;
                }
                else if (mCurrentStory==2) {
                    mCurrentStory=3;
                }
                else if (mCurrentStory==3) {
                    mCurrentStory=6;
                };
                setupStory();
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentStory==1) {
                    mCurrentStory=2;
                }
                else if (mCurrentStory==2) {
                    mCurrentStory=4;
                }
                else if (mCurrentStory==3) {
                    mCurrentStory=5;
                };
                setupStory();
            }
        });

    }

    private void setupStory() {
        mStoryPath = mStoryPath + "," + mCurrentStory;

        switch (mCurrentStory) {
            case 1:
                mStory.setText(R.string.T1_Story);
                mButtonAnswer1.setText(R.string.T1_Ans1);
                mButtonAnswer2.setText(R.string.T1_Ans2);
                break;
            case 2:
                mStory.setText(R.string.T2_Story);
                mButtonAnswer1.setText(R.string.T2_Ans1);
                mButtonAnswer2.setText(R.string.T2_Ans2);
                break;
            case 3:
                mStory.setText(R.string.T3_Story);
                mButtonAnswer1.setText(R.string.T3_Ans1);
                mButtonAnswer2.setText(R.string.T3_Ans2);
                break;
            case 4:
                mStory.setText(R.string.T4_End);
                mButtonAnswer1.setVisibility(View.GONE);
                mButtonAnswer2.setVisibility(View.GONE);
                break;
            case 5:
                mStory.setText(R.string.T5_End);
                mButtonAnswer1.setVisibility(View.GONE);
                mButtonAnswer2.setVisibility(View.GONE);
                break;
            case 6:
                mStory.setText(R.string.T6_End);
                mButtonAnswer1.setVisibility(View.GONE);
                mButtonAnswer2.setVisibility(View.GONE);
                break;
        }
    }
}
