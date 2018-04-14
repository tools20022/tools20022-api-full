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
import com.tools20022.repository.codeset.UnitOfMeasure2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Kilogram
 * UnitOfMeasure2Code.Kilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Each
 * UnitOfMeasure2Code.Each}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#GBTon
 * UnitOfMeasure2Code.GBTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Metre
 * UnitOfMeasure2Code.Metre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Inch
 * UnitOfMeasure2Code.Inch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Yard
 * UnitOfMeasure2Code.Yard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#GBGallon
 * UnitOfMeasure2Code.GBGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Gram
 * UnitOfMeasure2Code.Gram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Centimetre
 * UnitOfMeasure2Code.Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareMetre
 * UnitOfMeasure2Code.SquareMetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Foot
 * UnitOfMeasure2Code.Foot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Mile
 * UnitOfMeasure2Code.Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareInch
 * UnitOfMeasure2Code.SquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareFoot
 * UnitOfMeasure2Code.SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareMile
 * UnitOfMeasure2Code.SquareMile}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Ounce
 * UnitOfMeasure2Code.Ounce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#GBPint
 * UnitOfMeasure2Code.GBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#USPint
 * UnitOfMeasure2Code.USPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#GBQuart
 * UnitOfMeasure2Code.GBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#USQuart
 * UnitOfMeasure2Code.USQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#USGallon
 * UnitOfMeasure2Code.USGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Millimetre
 * UnitOfMeasure2Code.Millimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Kilometre
 * UnitOfMeasure2Code.Kilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareYard
 * UnitOfMeasure2Code.SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareMillimetre
 * UnitOfMeasure2Code.SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareCentimetre
 * UnitOfMeasure2Code.SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#SquareKilometre
 * UnitOfMeasure2Code.SquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#CubicMillimetre
 * UnitOfMeasure2Code.CubicMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Centilitre
 * UnitOfMeasure2Code.Centilitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Litre
 * UnitOfMeasure2Code.Litre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Pound
 * UnitOfMeasure2Code.Pound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#USTon
 * UnitOfMeasure2Code.USTon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#USBarrel
 * UnitOfMeasure2Code.USBarrel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Box
 * UnitOfMeasure2Code.Box}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Bottle
 * UnitOfMeasure2Code.Bottle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Carton
 * UnitOfMeasure2Code.Carton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Container
 * UnitOfMeasure2Code.Container}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Crate
 * UnitOfMeasure2Code.Crate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#CubicInch
 * UnitOfMeasure2Code.CubicInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#CubicMeter
 * UnitOfMeasure2Code.CubicMeter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#GBFluidOunce
 * UnitOfMeasure2Code.GBFluidOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#USFluidOunce
 * UnitOfMeasure2Code.USFluidOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Bag
 * UnitOfMeasure2Code.Bag}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#Bale
 * UnitOfMeasure2Code.Bale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code#MetricTon
 * UnitOfMeasure2Code.MetricTon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
 * UnitOfMeasure3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
 * UnitOfMeasure4Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure2Code"</li>
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
public class UnitOfMeasure2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Basic unit of mass in the SI system, 1000 grams.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KGM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Basic unit of mass in the SI system, 1000 grams."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Kilogram = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kilogram";
			definition = "Basic unit of mass in the SI system, 1000 grams.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "KGM";
		}
	};
	/**
	 * Unit of count defining the number of items regarded as separate units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Each"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of count defining the number of items regarded as separate units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Each = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Each";
			definition = "Unit of count defining the number of items regarded as separate units.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "EA";
		}
	};
	/**
	 * Measure of weight, in Britain 2240lb (long ton).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of weight, in Britain 2240lb (long ton)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code GBTon = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBTon";
			definition = "Measure of weight, in Britain 2240lb (long ton).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "LTN";
		}
	};
	/**
	 * Unit of length in the metric system, equal to 39.37 inches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of length in the metric system, equal to 39.37 inches."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Metre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Metre";
			definition = "Unit of length in the metric system, equal to 39.37 inches.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MTR";
		}
	};
	/**
	 * Measure of length equal to 2.54 cm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of length equal to 2.54 cm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Inch = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inch";
			definition = "Measure of length equal to 2.54 cm.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "INH";
		}
	};
	/**
	 * Unit of length equal to 3 feet or 0.9144 metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of length equal to 3 feet or 0.9144 metre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Yard = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yard";
			definition = "Unit of length equal to 3 feet or 0.9144 metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "LY";
		}
	};
	/**
	 * Unit of volume that is equal to 8 GB pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 8 GB pints."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code GBGallon = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBGallon";
			definition = "Unit of volume that is equal to 8 GB pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "GLI";
		}
	};
	/**
	 * Unit of measure that is equal to a 1, 000th of a kilo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is equal to a 1, 000th of a kilo."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Gram = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gram";
			definition = "Unit of measure that is equal to a 1, 000th of a kilo.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "GRM";
		}
	};
	/**
	 * One 100th part of a metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "One 100th part of a metre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Centimetre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centimetre";
			definition = "One 100th part of a metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "CMT";
		}
	};
	/**
	 * Measure of a surface, one metre by one metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one metre by one metre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareMetre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMetre";
			definition = "Measure of a surface, one metre by one metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MTK";
		}
	};
	/**
	 * Unit of length equal to 1/3 yard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of length equal to 1/3 yard."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Foot = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Foot";
			definition = "Unit of length equal to 1/3 yard.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "FOT";
		}
	};
	/**
	 * Unit of length equal to 1, 760 yards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "1A"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of length equal to 1, 760 yards."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Mile = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mile";
			definition = "Unit of length equal to 1, 760 yards.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "1A";
		}
	};
	/**
	 * Measure of a surface, one inch by one inch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one inch by one inch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareInch = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareInch";
			definition = "Measure of a surface, one inch by one inch.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "INK";
		}
	};
	/**
	 * Measure of a surface, one foot by one foot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one foot by one foot."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareFoot = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareFoot";
			definition = "Measure of a surface, one foot by one foot.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "FTK";
		}
	};
	/**
	 * Measure of a surface, one mile by one mile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one mile by one mile."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareMile = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMile";
			definition = "Measure of a surface, one mile by one mile.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MIK";
		}
	};
	/**
	 * Unit of weight equal to a sixteenth of a pound.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONZ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ounce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of weight equal to a sixteenth of a pound."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Ounce = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ounce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "ONZ";
		}
	};
	/**
	 * Unit of volume that is equal to 568 cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 568 cubic centimetres."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code GBPint = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBPint";
			definition = "Unit of volume that is equal to 568 cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "PTI";
		}
	};
	/**
	 * Unit of volume that is equal to 473 cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 473 cubic centimetres."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code USPint = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USPint";
			definition = "Unit of volume that is equal to 473 cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "PT";
		}
	};
	/**
	 * Unit of volume that is equal to 2 GB pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 2 GB pints."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code GBQuart = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBQuart";
			definition = "Unit of volume that is equal to 2 GB pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "QTI";
		}
	};
	/**
	 * Unit of volume that is equal to 2 US pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 2 US pints."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code USQuart = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USQuart";
			definition = "Unit of volume that is equal to 2 US pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "QT";
		}
	};
	/**
	 * Unit of volume that is equal to 8 US pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 8 US pints."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code USGallon = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USGallon";
			definition = "Unit of volume that is equal to 8 US pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "GLL";
		}
	};
	/**
	 * Unit of measure that is a thousandth of one metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is a thousandth of one metre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Millimetre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Millimetre";
			definition = "Unit of measure that is a thousandth of one metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MMT";
		}
	};
	/**
	 * Unit of measure that is equal to 1, 000 meters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KTM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is equal to 1, 000 meters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Kilometre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kilometre";
			definition = "Unit of measure that is equal to 1, 000 meters.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "KTM";
		}
	};
	/**
	 * Measure of a surface, one yard by one yard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YDK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one yard by one yard."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareYard = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareYard";
			definition = "Measure of a surface, one yard by one yard.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "YDK";
		}
	};
	/**
	 * Measure of a surface, one millimetre by one millimetre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one millimetre by one millimetre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareMillimetre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMillimetre";
			definition = "Measure of a surface, one millimetre by one millimetre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MMK";
		}
	};
	/**
	 * Measure of a surface, one centimetre by one centimetre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one centimetre by one centimetre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareCentimetre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareCentimetre";
			definition = "Measure of a surface, one centimetre by one centimetre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "CMK";
		}
	};
	/**
	 * Measure of a surface, one kilometre by one kilometre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KMK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one kilometre by one kilometre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code SquareKilometre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareKilometre";
			definition = "Measure of a surface, one kilometre by one kilometre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "KMK";
		}
	};
	/**
	 * Unit of volume that is equal to one thousandth of a litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMillimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to one thousandth of a litre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code CubicMillimetre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CubicMillimetre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MMQ";
		}
	};
	/**
	 * Unit of volume that is equal to one hundredth of a litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to one hundredth of a litre."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Centilitre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centilitre";
			definition = "Unit of volume that is equal to one hundredth of a litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "CLT";
		}
	};
	/**
	 * Unit of volume that is equal to a thousand cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to a thousand cubic centimetres."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Litre = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Litre";
			definition = "Unit of volume that is equal to a thousand cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "LTR";
		}
	};
	/**
	 * Unit of weight equal to 0.454 kilograms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of weight equal to 0.454 kilograms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Pound = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pound";
			definition = "Unit of weight equal to 0.454 kilograms.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "LBR";
		}
	};
	/**
	 * Measure of weight, in the US 2000lb (short ton).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of weight, in the US 2000lb (short ton)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code USTon = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTon";
			definition = "Measure of weight, in the US 2000lb (short ton).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "STN";
		}
	};
	/**
	 * Unit of volume equal to 158, 9873 litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBarrel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume equal to 158, 9873 litre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code USBarrel = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBarrel";
			definition = "Unit of volume equal to 158, 9873 litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "BLL";
		}
	};
	/**
	 * Code for a box.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Box"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a box."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Box = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Box";
			definition = "Code for a box.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "BX";
		}
	};
	/**
	 * Code for a bottle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bottle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a bottle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Bottle = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bottle";
			definition = "Code for a bottle.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "BO";
		}
	};
	/**
	 * Code for a carton.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carton"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a carton."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Carton = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carton";
			definition = "Code for a carton.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "CT";
		}
	};
	/**
	 * Code for a container.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Container"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a container."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Container = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Container";
			definition = "Code for a container.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "CH";
		}
	};
	/**
	 * Code for a crate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a crate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Crate = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crate";
			definition = "Code for a crate.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "CR";
		}
	};
	/**
	 * Measure of a volume, one inch by one inch by one inch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicInch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a volume, one inch by one inch by one inch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code CubicInch = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicInch";
			definition = "Measure of a volume, one inch by one inch by one inch.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "INQ";
		}
	};
	/**
	 * Measure of a volume, one meter by one meter by one meter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a volume, one meter by one meter by one meter."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code CubicMeter = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMeter";
			definition = "Measure of a volume, one meter by one meter by one meter.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "MTQ";
		}
	};
	/**
	 * Unit of volume equal to 2, 841 306 centilitre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OZI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBFluidOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume equal to 2, 841 306 centilitre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code GBFluidOunce = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBFluidOunce";
			definition = "Unit of volume equal to 2, 841 306 centilitre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "OZI";
		}
	};
	/**
	 * Unit of volume equal to 2, 957 353 centilitre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OZA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFluidOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume equal to 2, 957 353 centilitre."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code USFluidOunce = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USFluidOunce";
			definition = "Unit of volume equal to 2, 957 353 centilitre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "OZA";
		}
	};
	/**
	 * Code for a bag.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a bag."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Bag = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bag";
			definition = "Code for a bag.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "BG";
		}
	};
	/**
	 * Code for a bale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a bale."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code Bale = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bale";
			definition = "Code for a bale.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "BL";
		}
	};
	/**
	 * Measure of weight, equal to 1000 kilograms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
	 * UnitOfMeasure2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MetricTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of weight, equal to 1000 kilograms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnitOfMeasure2Code MetricTon = new UnitOfMeasure2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MetricTon";
			definition = "Measure of weight, equal to 1000 kilograms.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure2Code.mmObject();
			codeName = "TNE";
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure2Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure2Code() {
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
				name = "UnitOfMeasure2Code";
				definition = "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20.";
				derivation_lazy = () -> Arrays.asList(UnitOfMeasure3Code.mmObject(), UnitOfMeasure4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure2Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure2Code.Each, com.tools20022.repository.codeset.UnitOfMeasure2Code.GBTon,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure2Code.Inch, com.tools20022.repository.codeset.UnitOfMeasure2Code.Yard,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure2Code.Gram, com.tools20022.repository.codeset.UnitOfMeasure2Code.Centimetre,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure2Code.Foot, com.tools20022.repository.codeset.UnitOfMeasure2Code.Mile,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareFoot, com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareMile,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Ounce, com.tools20022.repository.codeset.UnitOfMeasure2Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure2Code.USPint,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.GBQuart, com.tools20022.repository.codeset.UnitOfMeasure2Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure2Code.USGallon,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Millimetre, com.tools20022.repository.codeset.UnitOfMeasure2Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareYard,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure2Code.SquareKilometre,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.CubicMillimetre, com.tools20022.repository.codeset.UnitOfMeasure2Code.Centilitre, com.tools20022.repository.codeset.UnitOfMeasure2Code.Litre,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Pound, com.tools20022.repository.codeset.UnitOfMeasure2Code.USTon, com.tools20022.repository.codeset.UnitOfMeasure2Code.USBarrel,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Box, com.tools20022.repository.codeset.UnitOfMeasure2Code.Bottle, com.tools20022.repository.codeset.UnitOfMeasure2Code.Carton,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Container, com.tools20022.repository.codeset.UnitOfMeasure2Code.Crate, com.tools20022.repository.codeset.UnitOfMeasure2Code.CubicInch,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.CubicMeter, com.tools20022.repository.codeset.UnitOfMeasure2Code.GBFluidOunce, com.tools20022.repository.codeset.UnitOfMeasure2Code.USFluidOunce,
						com.tools20022.repository.codeset.UnitOfMeasure2Code.Bag, com.tools20022.repository.codeset.UnitOfMeasure2Code.Bale, com.tools20022.repository.codeset.UnitOfMeasure2Code.MetricTon);
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
		codesByName.put(MetricTon.getCodeName().get(), MetricTon);
	}

	public static UnitOfMeasure2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure2Code[] values() {
		UnitOfMeasure2Code[] values = new UnitOfMeasure2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure2Code> {
		@Override
		public UnitOfMeasure2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}