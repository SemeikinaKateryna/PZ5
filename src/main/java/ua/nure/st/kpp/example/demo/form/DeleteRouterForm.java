package ua.nure.st.kpp.example.demo.form;

public class DeleteRouterForm {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DeleteRouterForm(int id) {
		this.id = id;
	}

	public DeleteRouterForm() {
	}

	@Override
	public String toString() {
		return "DeleteRouterForm{" +
				"id=" + id +
				'}';
	}
}
