package Exam;

import hibernate.example.Models.Alumno;
import hibernate.example.Models.AlumnoDao;

public class ExampleApplication {

	public static void main(String[] args)
	{
		AlumnoDao dao = new AlumnoDao();
		Alumno alumno1 = new Alumno("112", "Jose", "Perez");
		Alumno alumno2 = new Alumno("221", "Esteban", "Quito");
		Alumno alumno3 = new Alumno("344", "Ulrica", "Godofreda");
		
		dao.createAlumno(alumno1);
		dao.createAlumno(alumno2);
		dao.createAlumno(alumno3);
		
		alumno2.setNombre("Estefano");
		dao.getAlumnos("Jose", "Perez");
		dao.updateAlumno(alumno2);
		
		dao.removeAlumno(alumno1);
		
		for(Alumno al : dao.getAlumnos())
		{
			System.out.println(al.toString());
		}
		
	}
}
