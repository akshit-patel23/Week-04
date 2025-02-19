package reflection.advance.injection;

public class Service {
    private Repository repo;
@Inject
    public Service(Repository repo){
        this.repo=repo;
    }
    public void task(){
       repo.repository();
    }
}
