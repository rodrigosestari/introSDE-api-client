package userinterface;

import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import systemlogic.processcentricservices.api.sw.Api;
import systemlogic.processcentricservices.api.sw.GetGoalValitationResponse.Goalview;
import systemlogic.processcentricservices.api.sw.GetGoalsResponse.Goals;
import systemlogic.processcentricservices.api.sw.ReadPersonHistoryResponse.MeasureProfile;
import systemlogic.processcentricservices.soap.sw.Person;


public class Client {

	static URL url = null;
	static QName qname = null;
	static Service service = null;
	static Api api = null;
	static URI uri = null;
	static URI uriAdapter = null;
	static String type = "";
	static Integer idPerson = null;

	public static void main(String[] args) throws Exception {
		setUrl(new URL("https://api-introsde.herokuapp.com/ws/api?wsdl"));
		setQname(new QName("http://sw.api.processcentricservices.systemlogic/", "ApiService"));
		setService(Service.create(url, qname));
		setApi(getService().getPort(Api.class));


		System.out.println("Rodrigo Joni Sestari");
		String input = "";
		while (!input.equals("exit")) {
			if (null == idPerson) {
				System.out.println("1 - List id all People");
				System.out.println("2 - Enter person");
				System.out.println("e - exit");
				type = scanner();
				switch (type) {

				case "1": {
					System.out.println(api.readPersonList());
				}
				break;
				case "2": {
					System.out.print("Person id: ");
					type = scanner();
					try {
						Person p =  api.readPerson(Long.parseLong(type));
						if (null != p) {
							idPerson = p.getIdPerson();
						}
					} catch (Exception e) {
						idPerson = null;
					}

				}
				break;
				case "e": {
					input = "exit";
				}
				break;
				default:
					input = "exit";
					break;
				}
			} else {
				System.out.println("1 - get measure types");
				System.out.println("2 - get measure history");
				System.out.println("3 - save measure");
				System.out.println("4 - get Goals");
				System.out.println("5 - get goal valitation");
				System.out.println("6 - create goal");
				System.out.println("7 - connect Adapter");
				System.out.println("e - exit");
				type = scanner();

				switch (type) {

				case "2": {
					System.out.print("measure: ");
					String pmeasure = scanner().toLowerCase();
					try {
						MeasureProfile mv = api.readPersonHistory(Long.valueOf(idPerson), pmeasure);
						if (null != mv) {
							for (MeasureProfile.Measure m : mv.getMeasure()) {
								System.out.println(m.toString());
							}

						}
					} catch (Exception e) {

					}

				}
				break;
				case "1": {
					System.out.println(api.readMeasureTypes());
				}
				break;
				case "3": {
					boolean result = false;
					try {
						System.out.print("measure: ");
						String pmeasure = scanner().toLowerCase();

						System.out.print("value: ");
						String pvalue = scanner();

						System.out.print("data: ");
						String pdta = scanner();
						result = api.savePersonMeasure(Long.valueOf(idPerson), pmeasure, Float.parseFloat(pvalue), pdta);  								
					} catch (Exception e) {
						result = false;
					}

					if (result) {
						System.out.println("measure salved!");
					} else {
						System.out.println("error");
					}
				}
				break;
				case "4": {
					try {
						Goals glist = api.getGoals(Long.valueOf(idPerson)); 
								
						if (null != glist) {
							for (Goals.Goal goal : glist.getGoal()) {
								System.out.println(goal.toString());
							}

						}else{
							System.out.println("don't exist");
						}
					} catch (Exception e) {
						System.out.println("error");
					}

				}
				break;
				case "5": {
					try {
						System.out.print("ID goal: ");
						String idgoal = scanner();
						Goalview goal = api.getGoalValitation(Long.parseLong(idgoal)); 
								
						if (null != goal) {
							System.out.print(goal.toString());

						}else{
							System.out.println("don't exist");
						}
					} catch (Exception e) {
						System.out.println("error");
					}

				}
				break;
				case "6": {
					try {
						System.out.print("measure: ");
						String measure = scanner().toLowerCase();
						System.out.print("Start date: ");
						String start = scanner();
						System.out.print("end date: ");
						String end = scanner();
						System.out.print("type (DAILY, MONTHLY): ");
						String type = scanner();
						System.out.println("signal (LESS, EQUAL, GRATER, LESS_EQUAL, GRATER_EQUAL,  ");
						System.out.print("LESS_SUM, EQUAL_SUM, GRATER_SUM, LESS_EQUAL_SUM, GRATER_EQUAL_SUM): ");

						String signal = scanner();
						System.out.print("value: ");
						String value = scanner();

						boolean result = api.saveGoal(Long.valueOf(idPerson), measure, start, end, type, signal, value);
						if (result) {
							System.out.println("goal created");

						} else {
							System.out.println("error");
						}
					} catch (Exception e) {
						System.out.println("error");
					}

				}
				break;

				case "7": {
					try {
						System.out.print("insert your token: ");
						String token = scanner();
						System.out.print("import: Weight(w)  Blood Pressure(b)");
						String tipo = scanner().toLowerCase();						
						boolean result = false;
						switch (tipo) {
						case "w":
							result = api.importMeasure(Long.valueOf(idPerson), token,"Weight");
							break;
							
						case "b":
							result = api.importMeasure(Long.valueOf(idPerson), token,"BloodPressure");
							break;
							
						default:
							break;
						}
						
						if (result) {
							System.out.println("measure imported");
						} else {
							System.out.println("error");
						}

					} catch (Exception e) {
						System.out.println("error");
					}

				}
				break;
				case "e": {
					input = "exit";
				}
				break;
				default:
					input = "exit";
					break;
				}
			}

		}

	}

	public static String scanner() {
		Scanner input = new Scanner(System.in);
		String writeSomething = input.nextLine();
		return writeSomething;
	}

	public static URL getUrl() {
		return url;
	}

	public static QName getQname() {
		return qname;
	}

	public static Service getService() {
		return service;
	}



	public static void setUrl(URL url) {
		Client.url = url;
	}

	public static void setQname(QName qname) {
		Client.qname = qname;
	}

	public static void setService(Service service) {
		Client.service = service;
	}


	public static URI getUri() {
		return uri;
	}

	public static void setUri(URI uri) {
		Client.uri = uri;
	}

	public static URI getUriAdapter() {
		return uriAdapter;
	}

	public static void setUriAdapter(URI uriAdapter) {
		Client.uriAdapter = uriAdapter;
	}

	public static Api getApi() {
		return api;
	}

	public static void setApi(Api api) {
		Client.api = api;
	}


}