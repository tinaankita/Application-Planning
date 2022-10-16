package presenter;
import datatransferobjects.response;
import view.view;

public class ConsolePresenter {
    private view consoleDisplay;
    public ConsolePresenter(){
        consoleDisplay = new view();
    }
    public void handleResponse(response responseMessage){
        if (responseMessage.getSuccess()){
            consoleDisplay.display(responseMessage.getMessage());
        }
        else{
            StringBuilder stringbuilder = new StringBuilder();
            for(String error: responseMessage.getErrors()){
                stringbuilder.append(error);
                stringbuilder.append("\n");
            }
            consoleDisplay.display(stringbuilder.toString());
        }
    }
}
