/*
 * 
 */
package com.Board.Map;

import java.util.ArrayList;

import com.Board.MapController;

import javafx.scene.shape.Polygon;


/**
 * The Class Map.
 */
public class Map {

	/** The continents. */
	private ArrayList<Continent> continents;
	
	/** The country shapes. */
	private CountryShapes countryShapes;
	
	/** The shapes. */
	private ArrayList<Polygon> shapes;

	
	/**
	 * Instantiates a new map.
	 */
	public Map() {
		continents = new ArrayList<Continent>();
		countryShapes = new CountryShapes();
		shapes = new ArrayList<Polygon>();
		initMap();		
		
	}
	
	/**
	 * Initializes the entire Map with Continents and Countries.
	 */
	//TO BE IMPLEMENTED
	private void initMap() {
		
		//All of the Continents 
		Continent northAmerica = new Continent("North America");
		Continent southAmerica = new Continent("South America");
		Continent europe = new Continent("Europe");
		Continent africa = new Continent("Africa");
		Continent asia = new Continent("Asia");
		Continent australia = new Continent("Australia");
		
		// All of the Countries
			//North America
				Country alaska = new Country("Alaska", countryShapes.getPolygon("alaska"));
				Country alberta = new Country("Alberta", countryShapes.getPolygon("Alberta"));								
				Country centralAmerica = new Country("Central America", countryShapes.getPolygon("central america"));
				Country easternUnitedStates = new Country("Eastern United States", countryShapes.getPolygon("Eastern United States"));
				Country greenland = new Country("Greenland", countryShapes.getPolygon("greenland"));
				Country northwestTerritory = new Country("Northwest Territory", countryShapes.getPolygon("northwest territory"));
				Country ontario = new Country("Ontario", countryShapes.getPolygon("ontario"));
				Country quebec = new Country("Quebec", countryShapes.getPolygon("quebec"));
				Country westernunitedstates = new Country("Western United States", countryShapes.getPolygon("western united states"));
			//South America
				Country argentina = new Country("Argentina", countryShapes.getPolygon("argentina"));
				Country brazil = new Country("Brazil", countryShapes.getPolygon("brazil"));
				Country peru = new Country("Peru", countryShapes.getPolygon("peru"));
				Country venezuela = new Country("Venezuela", countryShapes.getPolygon("venezuela"));
			//Europe
				Country greatbritain = new Country("Great Britain", countryShapes.getPolygon("great britain"));
				Country iceland = new Country("Iceland", countryShapes.getPolygon("iceland"));
				Country northerneurope = new Country("Northern Europe", countryShapes.getPolygon("northern europe"));
				Country scandinavia = new Country("Scandinavia", countryShapes.getPolygon("scandinavia"));
				Country southerneurope = new Country("Southern Europe", countryShapes.getPolygon("southern europe"));
				Country ukraine = new Country("Ukraine", countryShapes.getPolygon("ukraine"));
				Country westerneurope = new Country("Western Europe", countryShapes.getPolygon("western europe"));
			//Africa
				Country congo = new Country("Congo", countryShapes.getPolygon("congo"));
				Country eastafrica = new Country("East Africa", countryShapes.getPolygon("east africa"));
				Country egypt = new Country("Egypt", countryShapes.getPolygon("egypt"));
				Country madagascar = new Country("Madagascar", countryShapes.getPolygon("madagascar"));
				Country northafrica = new Country("North Africa", countryShapes.getPolygon("north africa"));
				Country southafrica = new Country("South Africa", countryShapes.getPolygon("south africa"));
			//Asia
				Country afghanistan = new Country("Afghanistan", countryShapes.getPolygon("Afghanistan"));
				Country china = new Country("China", countryShapes.getPolygon("China"));
				Country india = new Country("India", countryShapes.getPolygon("India"));
				Country irkutsk = new Country("Irkutsk", countryShapes.getPolygon("Irkutsk"));
				Country japan = new Country("Japan", countryShapes.getPolygon("Japan"));
				Country kamchatka = new Country("Kamchatka", countryShapes.getPolygon("Kamchatka"));
				Country middleeast = new Country("Middle East", countryShapes.getPolygon("Middle East"));
				Country mongolia = new Country("Mongolia", countryShapes.getPolygon("Mongolia"));
				Country siam = new Country("Siam", countryShapes.getPolygon("Siam"));
				Country siberia = new Country("Siberia", countryShapes.getPolygon("Siberia"));
				Country ural = new Country("Ural", countryShapes.getPolygon("Ural"));
				Country yakutsk = new Country("Yakutsk", countryShapes.getPolygon("Yakutsk"));
			//Australia
				Country easternaustralia = new Country("Eastern Australia", countryShapes.getPolygon("Eastern Australia"));
				Country indonesia = new Country("Indonesia", countryShapes.getPolygon("Indonesia"));
				Country newguinea = new Country("New Guinea", countryShapes.getPolygon("New Guinea"));
				Country westernaustralia = new Country("Western Australia", countryShapes.getPolygon("Western Australia"));
				
				
				
			// BORDERS
				//North America
					//1.Alaska
						alaska.addBorder(northwestTerritory);
						alaska.addBorder(alberta);
						alaska.addBorder(kamchatka);
					//2.Alberta
						alberta.addBorder(alaska);
						alberta.addBorder(northwestTerritory);
						alberta.addBorder(ontario);
						alberta.addBorder(westernunitedstates);
					//3.Central America
						centralAmerica.addBorder(westernunitedstates);
						centralAmerica.addBorder(easternUnitedStates);
						centralAmerica.addBorder(venezuela);
					//4. Eastern United States
						easternUnitedStates.addBorder(centralAmerica);
						easternUnitedStates.addBorder(ontario);
						easternUnitedStates.addBorder(quebec);
						easternUnitedStates.addBorder(westernunitedstates);
					//5.Greenland
						greenland.addBorder(quebec);
						greenland.addBorder(ontario);
						greenland.addBorder(northwestTerritory);
						greenland.addBorder(iceland);
					//6.North West Territory
						northwestTerritory.addBorder(alaska);
						northwestTerritory.addBorder(alberta);
						northwestTerritory.addBorder(ontario);
						northwestTerritory.addBorder(greenland);
					//7.Ontario
						ontario.addBorder(alberta);
						ontario.addBorder(quebec);
						ontario.addBorder(easternUnitedStates);
						ontario.addBorder(westernunitedstates);
						ontario.addBorder(greenland);
						ontario.addBorder(northwestTerritory);
					//8.Quebec
						quebec.addBorder(ontario);
						quebec.addBorder(easternUnitedStates);
						quebec.addBorder(greenland);
					//9.western United States
						westernunitedstates.addBorder(alberta);
						westernunitedstates.addBorder(ontario);
						westernunitedstates.addBorder(easternUnitedStates);
						westernunitedstates.addBorder(centralAmerica);
				//South America
					//1.Argentina
						argentina.addBorder(peru);
						argentina.addBorder(brazil);
					//2. Brazil
						brazil.addBorder(argentina);
						brazil.addBorder(peru);
						brazil.addBorder(venezuela);
						brazil.addBorder(northafrica);
					//3. Peru
						peru.addBorder(argentina);
						peru.addBorder(brazil);
						peru.addBorder(venezuela);
					//4. Venezuela
						venezuela.addBorder(brazil);
						venezuela.addBorder(peru);
						venezuela.addBorder(centralAmerica);
				//Africa
					//1.Congo
						congo.addBorder(southafrica);
						congo.addBorder(northafrica);
						congo.addBorder(eastafrica);
					//2.East Africa
						eastafrica.addBorder(congo);
						eastafrica.addBorder(madagascar);
						eastafrica.addBorder(egypt);
						eastafrica.addBorder(northafrica);
						eastafrica.addBorder(southafrica);
						eastafrica.addBorder(middleeast);
					//3.Egypt
						egypt.addBorder(northafrica);
						egypt.addBorder(southerneurope);
						egypt.addBorder(eastafrica);
						egypt.addBorder(middleeast);
					//4.Madagascar
						madagascar.addBorder(southafrica);
						madagascar.addBorder(eastafrica);
					//5.North Africa
						northafrica.addBorder(brazil);
						northafrica.addBorder(egypt);
						northafrica.addBorder(congo);
						northafrica.addBorder(eastafrica);
						northafrica.addBorder(westerneurope);
					//6.South Africa
						southafrica.addBorder(congo);
						southafrica.addBorder(madagascar);
						southafrica.addBorder(eastafrica);
				//Europe
					//1.Great Britian
						greatbritain.addBorder(iceland);
						greatbritain.addBorder(westerneurope);
						greatbritain.addBorder(scandinavia);
						greatbritain.addBorder(northerneurope);
					//2.Iceland
						iceland.addBorder(greatbritain);
						iceland.addBorder(scandinavia);
						iceland.addBorder(greenland);
					//3.Northern Europe
						northerneurope.addBorder(greatbritain);
						northerneurope.addBorder(westerneurope);
						northerneurope.addBorder(ukraine);
						northerneurope.addBorder(scandinavia);
						northerneurope.addBorder(southerneurope);
					//4.Scandinavia
						scandinavia.addBorder(greatbritain);
						scandinavia.addBorder(iceland);
						scandinavia.addBorder(northerneurope);
						scandinavia.addBorder(ukraine);
					//5.Southern Europe
						southerneurope.addBorder(egypt);
						southerneurope.addBorder(northafrica);
						southerneurope.addBorder(northerneurope);
						southerneurope.addBorder(westerneurope);
						southerneurope.addBorder(ukraine);
						southerneurope.addBorder(middleeast);
					//6.Ukraine
						ukraine.addBorder(southerneurope);
						ukraine.addBorder(northerneurope);
						ukraine.addBorder(scandinavia);
						ukraine.addBorder(middleeast);
						ukraine.addBorder(afghanistan);
						ukraine.addBorder(ural);
				   //7. Western Europe
						westerneurope.addBorder(southerneurope);
						westerneurope.addBorder(northerneurope);
						westerneurope.addBorder(greatbritain);
						westerneurope.addBorder(northafrica);
				//Asia
				   //1.Afghanistan
						afghanistan.addBorder(ukraine);
						afghanistan.addBorder(middleeast);
						afghanistan.addBorder(india);
						afghanistan.addBorder(china);
						afghanistan.addBorder(ural);
				   //2.China
						china.addBorder(afghanistan);
						china.addBorder(india);
						china.addBorder(mongolia);
						china.addBorder(siam);
						china.addBorder(ural);
						china.addBorder(siberia);
				  //3.India
						india.addBorder(china);
						india.addBorder(afghanistan);
						india.addBorder(middleeast);
						india.addBorder(siam);
				//4.Irkutsk
						irkutsk.addBorder(siberia);
						irkutsk.addBorder(yakutsk);
						irkutsk.addBorder(mongolia);
						irkutsk.addBorder(kamchatka);
			    //5.Japan
						japan.addBorder(mongolia);
						japan.addBorder(kamchatka);
				//6.Kamchatka
						kamchatka.addBorder(alaska);
						kamchatka.addBorder(japan);
						kamchatka.addBorder(irkutsk);
						kamchatka.addBorder(mongolia);
						kamchatka.addBorder(yakutsk);
				//7.Middle east
						middleeast.addBorder(india);
						middleeast.addBorder(afghanistan);
						middleeast.addBorder(egypt);
						middleeast.addBorder(eastafrica);
						middleeast.addBorder(southerneurope);
						middleeast.addBorder(ukraine);
				//8.Mongolia
						mongolia.addBorder(irkutsk);
						mongolia.addBorder(japan);
						mongolia.addBorder(kamchatka);
						mongolia.addBorder(china);
						mongolia.addBorder(siberia);
				//9.Siam
						siam.addBorder(india);
						siam.addBorder(china);
						siam.addBorder(indonesia);
				//10.Siberia
						siberia.addBorder(mongolia);
						siberia.addBorder(irkutsk);
						siberia.addBorder(ural);
						siberia.addBorder(china);
						siberia.addBorder(yakutsk);
						
				//11.Ural
						ural.addBorder(ukraine);
						ural.addBorder(afghanistan);
						ural.addBorder(siberia);
						ural.addBorder(china);
				//12. Yakutsk
						yakutsk.addBorder(siberia);
						yakutsk.addBorder(irkutsk);
						yakutsk.addBorder(kamchatka);
			//Australia
				//1. Eastern Australia
						easternaustralia.addBorder(newguinea);
						easternaustralia.addBorder(westernaustralia);
				//2. Indonesia
						indonesia.addBorder(siam);
						indonesia.addBorder(newguinea);
						indonesia.addBorder(westernaustralia);
				//3.New Guinea
						newguinea.addBorder(easternaustralia);
						newguinea.addBorder(westernaustralia);
						newguinea.addBorder(indonesia);
				//4. Western Australia
						westernaustralia.addBorder(easternaustralia);
						westernaustralia.addBorder(indonesia);
						westernaustralia.addBorder(newguinea);
						
			// ADDING CONTINITENTS TO THE CONTINENT LIST
						//AND ADDING COUNTRIES TO CONTINENTS
		continents.add(northAmerica);
			northAmerica.addCountry(alaska);
			northAmerica.addCountry(alberta);			
			northAmerica.addCountry(ontario);
			northAmerica.addCountry(quebec);
			northAmerica.addCountry(centralAmerica);
			northAmerica.addCountry(westernunitedstates);
			northAmerica.addCountry(easternUnitedStates);
			northAmerica.addCountry(greenland);
			northAmerica.addCountry(northwestTerritory);
			
			
		continents.add(europe);
			europe.addCountry(greatbritain);
			europe.addCountry(scandinavia);
			europe.addCountry(southerneurope);
			europe.addCountry(northerneurope);
			europe.addCountry(ukraine);
			europe.addCountry(iceland);
			europe.addCountry(westerneurope);
			
		continents.add(southAmerica);
			southAmerica.addCountry(peru);
			southAmerica.addCountry(brazil);
			southAmerica.addCountry(argentina);
			southAmerica.addCountry(venezuela);

		continents.add(australia);
			australia.addCountry(westernaustralia);
			australia.addCountry(newguinea);
			australia.addCountry(indonesia);
			australia.addCountry(easternaustralia);
		continents.add(asia);
			asia.addCountry(yakutsk);
			asia.addCountry(ural);
			asia.addCountry(siberia);
			asia.addCountry(siam);
			asia.addCountry(mongolia);
			asia.addCountry(afghanistan);
			asia.addCountry(china);
			asia.addCountry(japan);
			asia.addCountry(kamchatka);
			asia.addCountry(irkutsk);
			asia.addCountry(india);
			asia.addCountry(middleeast);
		continents.add(africa);
			africa.addCountry(egypt);
			africa.addCountry(eastafrica);
			africa.addCountry(northafrica);
			africa.addCountry(southafrica);
			africa.addCountry(madagascar);
			africa.addCountry(congo);
			
			
		//Continents Bonuses
			northAmerica.setContinentBonus(5);
			australia.setContinentBonus(2);
			southAmerica.setContinentBonus(2);
			asia.setContinentBonus(7);
			europe.setContinentBonus(5);
			africa.setContinentBonus(3);
			
			
		//TEMPORARY
			
	}
	
	
	/**
	 * Gets the ArrayList of Continents.
	 *
	 * @return the ArrayList of Continents
	 */
	public ArrayList<Continent> getContinents() {
		return continents;
	}
	

	/**
	 * Sets the map controller.
	 *
	 * @param m - the new map controller
	 */
	public void setMapController(MapController m) {
		for (Continent cont : continents) {
			for (Country c : cont.getCountries()) {
				c.setMapController(m);
			}
		}
	}
	
	/*public Country getMapCover() {
		//Polygon p = new Polygon
	}*/
	
	/**
	 * Gets the shapes.
	 *
	 * @return the shapes
	 */
	public ArrayList<Polygon> getShapes() {
		return shapes;
	}
}
