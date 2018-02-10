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
import com.tools20022.repository.codeset.UnitOfMeasure1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unit of measure of the item purchased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Piece
 * UnitOfMeasure1Code.Piece}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Ton
 * UnitOfMeasure1Code.Ton}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Foot
 * UnitOfMeasure1Code.Foot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBGallon
 * UnitOfMeasure1Code.GBGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USGallon
 * UnitOfMeasure1Code.USGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Gram
 * UnitOfMeasure1Code.Gram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Inch
 * UnitOfMeasure1Code.Inch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Kilogram
 * UnitOfMeasure1Code.Kilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Pound
 * UnitOfMeasure1Code.Pound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Metre
 * UnitOfMeasure1Code.Metre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Centimetre
 * UnitOfMeasure1Code.Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Millimetre
 * UnitOfMeasure1Code.Millimetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Litre
 * UnitOfMeasure1Code.Litre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Centilitre
 * UnitOfMeasure1Code.Centilitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#MilliLitre
 * UnitOfMeasure1Code.MilliLitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBOunce
 * UnitOfMeasure1Code.GBOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USOunce
 * UnitOfMeasure1Code.USOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBQuart
 * UnitOfMeasure1Code.GBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USQuart
 * UnitOfMeasure1Code.USQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBPint
 * UnitOfMeasure1Code.GBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USPint
 * UnitOfMeasure1Code.USPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Mile
 * UnitOfMeasure1Code.Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Kilometre
 * UnitOfMeasure1Code.Kilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Yard
 * UnitOfMeasure1Code.Yard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareKilometre
 * UnitOfMeasure1Code.SquareKilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Hectare
 * UnitOfMeasure1Code.Hectare}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Are
 * UnitOfMeasure1Code.Are}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareMetre
 * UnitOfMeasure1Code.SquareMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareCentimetre
 * UnitOfMeasure1Code.SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareMillimetre
 * UnitOfMeasure1Code.SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareMile
 * UnitOfMeasure1Code.SquareMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareYard
 * UnitOfMeasure1Code.SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareFoot
 * UnitOfMeasure1Code.SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareInch
 * UnitOfMeasure1Code.SquareInch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Acre
 * UnitOfMeasure1Code.Acre}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PIEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of measure of the item purchased."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
 * UnitOfMeasure6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Piece
	 * UnitOfMeasure6Code.Piece}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Piece = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Piece";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Piece);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Piece.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ton"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Ton
	 * UnitOfMeasure6Code.Ton}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Ton = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ton";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Ton);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Ton.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Foot
	 * UnitOfMeasure6Code.Foot}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Foot = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Foot);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBGallon
	 * UnitOfMeasure6Code.GBGallon}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBGallon = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.GBGallon);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USGallon
	 * UnitOfMeasure6Code.USGallon}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USGallon = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.USGallon);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Gram
	 * UnitOfMeasure6Code.Gram}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Gram = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Gram);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Inch
	 * UnitOfMeasure6Code.Inch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Inch = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Inch);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Kilogram
	 * UnitOfMeasure6Code.Kilogram}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Kilogram = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Kilogram);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Pound
	 * UnitOfMeasure6Code.Pound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Pound = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Pound);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Metre
	 * UnitOfMeasure6Code.Metre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Metre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Metre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Centimetre
	 * UnitOfMeasure6Code.Centimetre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Centimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Centimetre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Millimetre
	 * UnitOfMeasure6Code.Millimetre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Millimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Millimetre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Litre
	 * UnitOfMeasure6Code.Litre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Litre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Litre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Centilitre
	 * UnitOfMeasure6Code.Centilitre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Centilitre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Centilitre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#MilliLitre
	 * UnitOfMeasure6Code.MilliLitre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code MilliLitre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MilliLitre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.MilliLitre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.MilliLitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBOunce
	 * UnitOfMeasure6Code.GBOunce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBOunce = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBOunce";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.GBOunce);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USOunce
	 * UnitOfMeasure6Code.USOunce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USOunce = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USOunce";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.USOunce);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBQuart
	 * UnitOfMeasure6Code.GBQuart}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBQuart = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.GBQuart);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USQuart
	 * UnitOfMeasure6Code.USQuart}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USQuart = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.USQuart);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBPint
	 * UnitOfMeasure6Code.GBPint}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBPint = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.GBPint);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USPint
	 * UnitOfMeasure6Code.USPint}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USPint = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.USPint);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Mile
	 * UnitOfMeasure6Code.Mile}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Mile = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Mile);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Kilometre
	 * UnitOfMeasure6Code.Kilometre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Kilometre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Kilometre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Yard
	 * UnitOfMeasure6Code.Yard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Yard = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Yard);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareKilometre
	 * UnitOfMeasure6Code.SquareKilometre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareKilometre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareKilometre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Hectare
	 * UnitOfMeasure6Code.Hectare}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Hectare = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hectare";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Hectare);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Hectare.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Are
	 * UnitOfMeasure6Code.Are}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Are = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Are";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Are);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Are.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareMetre
	 * UnitOfMeasure6Code.SquareMetre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareMetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareMetre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareCentimetre
	 * UnitOfMeasure6Code.SquareCentimetre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareCentimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareCentimetre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareMillimetre
	 * UnitOfMeasure6Code.SquareMillimetre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareMillimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareMillimetre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareMile
	 * UnitOfMeasure6Code.SquareMile}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareMile = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareMile);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareYard
	 * UnitOfMeasure6Code.SquareYard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareYard = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareYard);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareFoot
	 * UnitOfMeasure6Code.SquareFoot}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareFoot = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareFoot);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareInch
	 * UnitOfMeasure6Code.SquareInch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareInch = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.SquareInch);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Acre
	 * UnitOfMeasure6Code.Acre}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Acre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acre";
			nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.Acre);
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Acre.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure1Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PIEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasure1Code";
				definition = "Unit of measure of the item purchased.";
				nextVersions_lazy = () -> Arrays.asList(UnitOfMeasure6Code.mmObject());
				trace_lazy = () -> UnitOfMeasureCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure1Code.Piece, com.tools20022.repository.codeset.UnitOfMeasure1Code.Ton, com.tools20022.repository.codeset.UnitOfMeasure1Code.Foot,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure1Code.USGallon, com.tools20022.repository.codeset.UnitOfMeasure1Code.Gram,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Inch, com.tools20022.repository.codeset.UnitOfMeasure1Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure1Code.Pound,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Centimetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Millimetre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Litre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Centilitre, com.tools20022.repository.codeset.UnitOfMeasure1Code.MilliLitre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.GBOunce, com.tools20022.repository.codeset.UnitOfMeasure1Code.USOunce, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBQuart,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure1Code.USPint,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Mile, com.tools20022.repository.codeset.UnitOfMeasure1Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Yard,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Hectare, com.tools20022.repository.codeset.UnitOfMeasure1Code.Are,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareMillimetre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareMile, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareYard, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareFoot,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure1Code.Acre);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Piece.getCodeName().get(), Piece);
		codesByName.put(Ton.getCodeName().get(), Ton);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(MilliLitre.getCodeName().get(), MilliLitre);
		codesByName.put(GBOunce.getCodeName().get(), GBOunce);
		codesByName.put(USOunce.getCodeName().get(), USOunce);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(Hectare.getCodeName().get(), Hectare);
		codesByName.put(Are.getCodeName().get(), Are);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(Acre.getCodeName().get(), Acre);
	}

	public static UnitOfMeasure1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure1Code[] values() {
		UnitOfMeasure1Code[] values = new UnitOfMeasure1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure1Code> {
		@Override
		public UnitOfMeasure1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}