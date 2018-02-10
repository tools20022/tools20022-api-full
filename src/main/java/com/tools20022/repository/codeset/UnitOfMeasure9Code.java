/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UnitOfMeasure9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the unit of measure by means of a code. The code is taken from
 * UN/ECE Recommendation 20.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Bag
 * UnitOfMeasure9Code.Bag}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Bale
 * UnitOfMeasure9Code.Bale}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Bottle
 * UnitOfMeasure9Code.Bottle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Box
 * UnitOfMeasure9Code.Box}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Carton
 * UnitOfMeasure9Code.Carton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Centilitre
 * UnitOfMeasure9Code.Centilitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Centimetre
 * UnitOfMeasure9Code.Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Container
 * UnitOfMeasure9Code.Container}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Crate
 * UnitOfMeasure9Code.Crate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#CubicInch
 * UnitOfMeasure9Code.CubicInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#CubicMeters
 * UnitOfMeasure9Code.CubicMeters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#CubicMillimetre
 * UnitOfMeasure9Code.CubicMillimetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Piece
 * UnitOfMeasure9Code.Piece}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Foot
 * UnitOfMeasure9Code.Foot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#GBFuildOunce
 * UnitOfMeasure9Code.GBFuildOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#GBGallon
 * UnitOfMeasure9Code.GBGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#GBPint
 * UnitOfMeasure9Code.GBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#GBQuart
 * UnitOfMeasure9Code.GBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#GBTon
 * UnitOfMeasure9Code.GBTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Gram
 * UnitOfMeasure9Code.Gram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Inch
 * UnitOfMeasure9Code.Inch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Kilogram
 * UnitOfMeasure9Code.Kilogram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Kilometre
 * UnitOfMeasure9Code.Kilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Litre
 * UnitOfMeasure9Code.Litre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Metre
 * UnitOfMeasure9Code.Metre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#MetricTons
 * UnitOfMeasure9Code.MetricTons}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Mile
 * UnitOfMeasure9Code.Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Millimetre
 * UnitOfMeasure9Code.Millimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#MilliLitre
 * UnitOfMeasure9Code.MilliLitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Pound
 * UnitOfMeasure9Code.Pound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USOunce
 * UnitOfMeasure9Code.USOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareCentimetre
 * UnitOfMeasure9Code.SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareFoot
 * UnitOfMeasure9Code.SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareInch
 * UnitOfMeasure9Code.SquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareKilometre
 * UnitOfMeasure9Code.SquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareMetre
 * UnitOfMeasure9Code.SquareMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareMile
 * UnitOfMeasure9Code.SquareMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareMillimetre
 * UnitOfMeasure9Code.SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#SquareYard
 * UnitOfMeasure9Code.SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USBarrel
 * UnitOfMeasure9Code.USBarrel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USFluidOunce
 * UnitOfMeasure9Code.USFluidOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USGallon
 * UnitOfMeasure9Code.USGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USPint
 * UnitOfMeasure9Code.USPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USQuart
 * UnitOfMeasure9Code.USQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#USTon
 * UnitOfMeasure9Code.USTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Yard
 * UnitOfMeasure9Code.Yard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#GBOunce
 * UnitOfMeasure9Code.GBOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Acre
 * UnitOfMeasure9Code.Acre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Are
 * UnitOfMeasure9Code.Are}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code#Hectare
 * UnitOfMeasure9Code.Hectare}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
 * UnitOfMeasureCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bag"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Bag = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bag";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Bag.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bale"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Bale = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bale";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Bale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bottle"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Bottle = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bottle";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Bottle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Box"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Box = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Box";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Box.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Carton = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carton";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Carton.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Centilitre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Centimetre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Container"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Container = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Container";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Container.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crate"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Crate = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Crate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code CubicInch = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.CubicInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeters"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code CubicMeters = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMeters";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.CubicMeters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code CubicMillimetre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.CubicMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Piece = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Piece";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Piece.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Foot = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBFuildOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code GBFuildOunce = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBFuildOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.GBFuildOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code GBGallon = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code GBPint = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code GBQuart = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code GBTon = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.GBTon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Gram = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Inch = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Kilogram = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Kilometre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Litre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Metre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MetricTons"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code MetricTons = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MetricTons";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.MetricTons.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Mile = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Millimetre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code MilliLitre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MilliLitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.MilliLitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Pound = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USOunce = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareCentimetre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareFoot = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareInch = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareKilometre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareMetre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareMile = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareMillimetre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code SquareYard = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBarrel"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USBarrel = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBarrel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USBarrel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFluidOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USFluidOunce = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USFluidOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USFluidOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USGallon = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USPint = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USQuart = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code USTon = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.USTon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Yard = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code GBOunce = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.GBOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Acre = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Acre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Are = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Are";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Are.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure9Code
	 * UnitOfMeasure9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure9Code Hectare = new UnitOfMeasure9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hectare";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure9Code.mmObject();
			codeName = UnitOfMeasureCode.Hectare.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure9Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnitOfMeasure9Code";
				definition = "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20.";
				trace_lazy = () -> UnitOfMeasureCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure9Code.Bag, com.tools20022.repository.codeset.UnitOfMeasure9Code.Bale, com.tools20022.repository.codeset.UnitOfMeasure9Code.Bottle,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Box, com.tools20022.repository.codeset.UnitOfMeasure9Code.Carton, com.tools20022.repository.codeset.UnitOfMeasure9Code.Centilitre,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Centimetre, com.tools20022.repository.codeset.UnitOfMeasure9Code.Container, com.tools20022.repository.codeset.UnitOfMeasure9Code.Crate,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.CubicInch, com.tools20022.repository.codeset.UnitOfMeasure9Code.CubicMeters, com.tools20022.repository.codeset.UnitOfMeasure9Code.CubicMillimetre,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Piece, com.tools20022.repository.codeset.UnitOfMeasure9Code.Foot, com.tools20022.repository.codeset.UnitOfMeasure9Code.GBFuildOunce,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure9Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure9Code.GBQuart,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.GBTon, com.tools20022.repository.codeset.UnitOfMeasure9Code.Gram, com.tools20022.repository.codeset.UnitOfMeasure9Code.Inch,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure9Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure9Code.Litre,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure9Code.MetricTons, com.tools20022.repository.codeset.UnitOfMeasure9Code.Mile,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Millimetre, com.tools20022.repository.codeset.UnitOfMeasure9Code.MilliLitre, com.tools20022.repository.codeset.UnitOfMeasure9Code.Pound,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.USOunce, com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareFoot,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareMetre,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareMile, com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasure9Code.SquareYard,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.USBarrel, com.tools20022.repository.codeset.UnitOfMeasure9Code.USFluidOunce, com.tools20022.repository.codeset.UnitOfMeasure9Code.USGallon,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.USPint, com.tools20022.repository.codeset.UnitOfMeasure9Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure9Code.USTon,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Yard, com.tools20022.repository.codeset.UnitOfMeasure9Code.GBOunce, com.tools20022.repository.codeset.UnitOfMeasure9Code.Acre,
						com.tools20022.repository.codeset.UnitOfMeasure9Code.Are, com.tools20022.repository.codeset.UnitOfMeasure9Code.Hectare);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bag.getCodeName().get(), Bag);
		codesByName.put(Bale.getCodeName().get(), Bale);
		codesByName.put(Bottle.getCodeName().get(), Bottle);
		codesByName.put(Box.getCodeName().get(), Box);
		codesByName.put(Carton.getCodeName().get(), Carton);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(Container.getCodeName().get(), Container);
		codesByName.put(Crate.getCodeName().get(), Crate);
		codesByName.put(CubicInch.getCodeName().get(), CubicInch);
		codesByName.put(CubicMeters.getCodeName().get(), CubicMeters);
		codesByName.put(CubicMillimetre.getCodeName().get(), CubicMillimetre);
		codesByName.put(Piece.getCodeName().get(), Piece);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(GBFuildOunce.getCodeName().get(), GBFuildOunce);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(GBTon.getCodeName().get(), GBTon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(MetricTons.getCodeName().get(), MetricTons);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(MilliLitre.getCodeName().get(), MilliLitre);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(USOunce.getCodeName().get(), USOunce);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(USBarrel.getCodeName().get(), USBarrel);
		codesByName.put(USFluidOunce.getCodeName().get(), USFluidOunce);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(USTon.getCodeName().get(), USTon);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(GBOunce.getCodeName().get(), GBOunce);
		codesByName.put(Acre.getCodeName().get(), Acre);
		codesByName.put(Are.getCodeName().get(), Are);
		codesByName.put(Hectare.getCodeName().get(), Hectare);
	}

	public static UnitOfMeasure9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure9Code[] values() {
		UnitOfMeasure9Code[] values = new UnitOfMeasure9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure9Code> {
		@Override
		public UnitOfMeasure9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}