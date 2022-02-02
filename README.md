# Activity Task



## 기존의 실험계획

1. *BroadcastReceiver*에서 BOOT Event를 수신 받으면 *Service*를 실행시킨다.
2. 실행된 *Service*에서 *Receiver*를 등록하는데, **SCREEN_ON** , **OFF EVENT**를 Filter에 담아서 등록한다.
3. 이후 **SCREEN_ON EVENT**마다 *BroadcastActivity*를 실행하면서, Task의 정보에 따라 내용이 어떻게 되는지 확인



## 현실

BOOT Event가 탐지가 안되서 AActivity에서 startService로 대신함. SCREEN_ON , OFF 만 가능함



## 결과

- 기존의 task가 다른 *component*(ex. *service, BroadcastReceiver*) 이들은 기존 액티비티의 task에 들어가 있지 않기 때문에, Activity를 실행하기 위해선 Flag로 

***Intent.FLAG_ACTIVITY_NEW_TASK***를 통해서 task 공간을 새롭게 만들면서 stack에 담겨야 한다.

- 만약, BroadcastActivity를 실행하고 BroadCast1, BroadCast2, BroadCast 이런식으로 새로운 Task stack에 activity가 담겨진 상태로 다시 AActivity로 돌아간후 다시 SCREEN_ON Event를 통해서 실행할 경우, 기존 Task에 담겨져 있던 내용들이 전부 다 나온다. -> 이는 navigation하는 과정에서 꽤 어색할 수도 있다.
- **Intent.FLAG_ACTIVITY_NEW_TASK**를 사용해서 Activity를 생성할 경우, 새로운 창이 뜨는 듯한 애니메이션과 함께 Activity가 보여지고, Background Task에는 새로운 Task로 보여지게 된다. 용도에 맞게끔 잘 사용해야할 거 같다.