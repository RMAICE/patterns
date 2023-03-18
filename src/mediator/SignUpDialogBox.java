package mediator;

public class SignUpDialogBox {
    private TextBox userName = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox agreementCheckbox = new CheckBox();
    private Button loginButton = new Button();

    public SignUpDialogBox() {
        userName.addEventHandler(this::inputsChanged);
        password.addEventHandler(this::inputsChanged);
        agreementCheckbox.addEventHandler(this::inputsChanged);
    }

    public void simulateUserInput() {
        userName.setContent("test");
        password.setContent("test");
        agreementCheckbox.setChecked(false);

        System.out.println(loginButton.isEnabled());
    }

    private void inputsChanged() {
        var usernameText = userName.getContent();
        var passwordText = password.getContent();
        var isAgreementChecked = agreementCheckbox.isChecked();
        var isUsernameFilled = (usernameText != null && !usernameText.isEmpty());
        var isPasswordFilled = (passwordText != null && !passwordText.isEmpty());

        var isButtonEnabled = isUsernameFilled && isPasswordFilled && isAgreementChecked;

        loginButton.setEnabled(isButtonEnabled);
    }
}
