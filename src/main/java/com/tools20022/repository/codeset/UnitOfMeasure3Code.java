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
import com.tools20022.repository.codeset.UnitOfMeasure3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Kilogram
 * UnitOfMeasure3Code.Kilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Each
 * UnitOfMeasure3Code.Each}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#GBTon
 * UnitOfMeasure3Code.GBTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Metre
 * UnitOfMeasure3Code.Metre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Inch
 * UnitOfMeasure3Code.Inch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Yard
 * UnitOfMeasure3Code.Yard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#GBGallon
 * UnitOfMeasure3Code.GBGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Gram
 * UnitOfMeasure3Code.Gram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Centimetre
 * UnitOfMeasure3Code.Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareMetre
 * UnitOfMeasure3Code.SquareMetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Foot
 * UnitOfMeasure3Code.Foot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Mile
 * UnitOfMeasure3Code.Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareInch
 * UnitOfMeasure3Code.SquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareFoot
 * UnitOfMeasure3Code.SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareMile
 * UnitOfMeasure3Code.SquareMile}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Ounce
 * UnitOfMeasure3Code.Ounce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#GBPint
 * UnitOfMeasure3Code.GBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#USPint
 * UnitOfMeasure3Code.USPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#GBQuart
 * UnitOfMeasure3Code.GBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#USQuart
 * UnitOfMeasure3Code.USQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#USGallon
 * UnitOfMeasure3Code.USGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Millimetre
 * UnitOfMeasure3Code.Millimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Kilometre
 * UnitOfMeasure3Code.Kilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareYard
 * UnitOfMeasure3Code.SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareMillimetre
 * UnitOfMeasure3Code.SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareCentimetre
 * UnitOfMeasure3Code.SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#SquareKilometre
 * UnitOfMeasure3Code.SquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#CubicMillimetre
 * UnitOfMeasure3Code.CubicMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Centilitre
 * UnitOfMeasure3Code.Centilitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Litre
 * UnitOfMeasure3Code.Litre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Pound
 * UnitOfMeasure3Code.Pound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#USTon
 * UnitOfMeasure3Code.USTon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#USBarrel
 * UnitOfMeasure3Code.USBarrel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Box
 * UnitOfMeasure3Code.Box}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Bottle
 * UnitOfMeasure3Code.Bottle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Carton
 * UnitOfMeasure3Code.Carton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Container
 * UnitOfMeasure3Code.Container}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Crate
 * UnitOfMeasure3Code.Crate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#CubicInch
 * UnitOfMeasure3Code.CubicInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#CubicMeter
 * UnitOfMeasure3Code.CubicMeter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#GBFluidOunce
 * UnitOfMeasure3Code.GBFluidOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#USFluidOunce
 * UnitOfMeasure3Code.USFluidOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Bag
 * UnitOfMeasure3Code.Bag}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code#Bale
 * UnitOfMeasure3Code.Bale}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
 * UnitOfMeasure2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"KGM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = December 12, 2018</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Kilogram = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Each"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Each = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Each";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Each.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code GBTon = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.GBTon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Metre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Inch = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Yard = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code GBGallon = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Gram = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Centimetre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareMetre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Foot = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Mile = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareInch = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareFoot = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareMile = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ounce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Ounce = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ounce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Ounce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code GBPint = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code USPint = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code GBQuart = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code USQuart = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code USGallon = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Millimetre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Kilometre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareYard = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareMillimetre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareCentimetre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code SquareKilometre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMillimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code CubicMillimetre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.CubicMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Centilitre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Litre = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Pound = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code USTon = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.USTon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBarrel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code USBarrel = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBarrel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.USBarrel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Box"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Box = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Box";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Box.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bottle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Bottle = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bottle";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Bottle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carton"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Carton = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carton";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Carton.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Container"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Container = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Container";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Container.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Crate = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Crate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicInch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code CubicInch = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.CubicInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code CubicMeter = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMeter";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.CubicMeter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBFluidOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code GBFluidOunce = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBFluidOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.GBFluidOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFluidOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code USFluidOunce = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USFluidOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.USFluidOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Bag = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bag";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Bag.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure3Code Bale = new UnitOfMeasure3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bale";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure3Code.mmObject();
			codeName = UnitOfMeasure2Code.Bale.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure3Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("KGM");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("December 12, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "UnitOfMeasure3Code";
				definition = "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20.";
				trace_lazy = () -> UnitOfMeasure2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure3Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure3Code.Each, com.tools20022.repository.codeset.UnitOfMeasure3Code.GBTon,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure3Code.Inch, com.tools20022.repository.codeset.UnitOfMeasure3Code.Yard,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure3Code.Gram, com.tools20022.repository.codeset.UnitOfMeasure3Code.Centimetre,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure3Code.Foot, com.tools20022.repository.codeset.UnitOfMeasure3Code.Mile,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareFoot, com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareMile,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Ounce, com.tools20022.repository.codeset.UnitOfMeasure3Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure3Code.USPint,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.GBQuart, com.tools20022.repository.codeset.UnitOfMeasure3Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure3Code.USGallon,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Millimetre, com.tools20022.repository.codeset.UnitOfMeasure3Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareYard,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure3Code.SquareKilometre,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.CubicMillimetre, com.tools20022.repository.codeset.UnitOfMeasure3Code.Centilitre, com.tools20022.repository.codeset.UnitOfMeasure3Code.Litre,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Pound, com.tools20022.repository.codeset.UnitOfMeasure3Code.USTon, com.tools20022.repository.codeset.UnitOfMeasure3Code.USBarrel,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Box, com.tools20022.repository.codeset.UnitOfMeasure3Code.Bottle, com.tools20022.repository.codeset.UnitOfMeasure3Code.Carton,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Container, com.tools20022.repository.codeset.UnitOfMeasure3Code.Crate, com.tools20022.repository.codeset.UnitOfMeasure3Code.CubicInch,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.CubicMeter, com.tools20022.repository.codeset.UnitOfMeasure3Code.GBFluidOunce, com.tools20022.repository.codeset.UnitOfMeasure3Code.USFluidOunce,
						com.tools20022.repository.codeset.UnitOfMeasure3Code.Bag, com.tools20022.repository.codeset.UnitOfMeasure3Code.Bale);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Each.getCodeName().get(), Each);
		codesByName.put(GBTon.getCodeName().get(), GBTon);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(Ounce.getCodeName().get(), Ounce);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(CubicMillimetre.getCodeName().get(), CubicMillimetre);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(USTon.getCodeName().get(), USTon);
		codesByName.put(USBarrel.getCodeName().get(), USBarrel);
		codesByName.put(Box.getCodeName().get(), Box);
		codesByName.put(Bottle.getCodeName().get(), Bottle);
		codesByName.put(Carton.getCodeName().get(), Carton);
		codesByName.put(Container.getCodeName().get(), Container);
		codesByName.put(Crate.getCodeName().get(), Crate);
		codesByName.put(CubicInch.getCodeName().get(), CubicInch);
		codesByName.put(CubicMeter.getCodeName().get(), CubicMeter);
		codesByName.put(GBFluidOunce.getCodeName().get(), GBFluidOunce);
		codesByName.put(USFluidOunce.getCodeName().get(), USFluidOunce);
		codesByName.put(Bag.getCodeName().get(), Bag);
		codesByName.put(Bale.getCodeName().get(), Bale);
	}

	public static UnitOfMeasure3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure3Code[] values() {
		UnitOfMeasure3Code[] values = new UnitOfMeasure3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure3Code> {
		@Override
		public UnitOfMeasure3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}