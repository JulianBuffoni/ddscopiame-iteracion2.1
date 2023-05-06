package ar.utn.dds.copiame;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class RevisorRevisionesListController implements Handler {
	private AnalsisRepository repo;

	public RevisorRevisionesListController(AnalsisRepository repo) {
		this.repo = repo;
	}

	@Override
	public void handle(Context ctx) throws Exception {
		ctx.json(repo.all());
	}

}
