

| Scenario | Steps Performed | Expected Lifecycle | Observed Lifecycle | Key Learning |
| ----- | ----- | ----- | ----- | ----- |
| **Basic Launch & Back Press**  **Home Button Press**  **Recent Apps / Task Switch**   | Main → Second → Back Main-\> Home-\> Reopen Main-\> Switch-\> Came back | onPause → **onStop** → onCreateB-\>onStartB-\> onResumeB  onCreate-\>onStart-\>onResume-\>onPause-\>onStop-\>onRestart-\>onStart-\>onResume onCreate-\>onStart-\>onResume-\>onPause-\>onStop-\>onRestart-\>onStart-\>onResume  | Oberverd A mistake Matches Expected Matches Expected | **onPause** Main \-\> then second onCreate-\>onStart-\>onResume-\>**onStop(Main)** No surprise Works same like scenario 2nd **Note:No Activity creation** |
| **Config Change Process Death & Restoration** | Rotate screen Open app → Switch → Come back. | onPause → onStop → onDestroy → onCreate → onStart → onResume onCreate → onStart → onResume \-\> onPause → onStop → onDestroy  | Not matches With expectation Observed Not calling  onSaveInstaneState & onRestoreInstance | Learned about config changes When **Enable** \-\> onConfigurationChanged called for both orientation Disable \-\> Default behaviour Learned New thing |

