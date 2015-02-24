package models;

import java.util.List;

import javax.persistence.*;

import controllers.Application;
import play.data.validation.Constraints.MinLength;
import play.db.ebean.Model;
@Entity
public class Task extends Model {
		@Id
		public int id;
		
		@MinLength(3)
		public String username;
		
		@MinLength(6)
		public String password;
		
		static Finder<Integer,Task> find= new Finder<Integer,Task>(Integer.class,Task.class);
		
		public static void create (Task t){
			t.save();
		}
		public static List<Task> all(){
			return find.all();
			
		}
	public static void remove(int id){
		find.byId(id).delete();
	}
}
