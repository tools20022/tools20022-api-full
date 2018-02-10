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
import com.tools20022.repository.codeset.AssetClassProductTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Commodity derivative base product code list.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Agricultural
 * AssetClassProductTypeCode.Agricultural}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Energy
 * AssetClassProductTypeCode.Energy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Environmental
 * AssetClassProductTypeCode.Environmental}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Freight
 * AssetClassProductTypeCode.Freight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Fertilizer
 * AssetClassProductTypeCode.Fertilizer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#IndustrialProduct
 * AssetClassProductTypeCode.IndustrialProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Metal
 * AssetClassProductTypeCode.Metal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#MultiCommodityExotic
 * AssetClassProductTypeCode.MultiCommodityExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Paper
 * AssetClassProductTypeCode.Paper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Polypropylene
 * AssetClassProductTypeCode.Polypropylene}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Inflation
 * AssetClassProductTypeCode.Inflation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#OfficialEconomicStatistic
 * AssetClassProductTypeCode.OfficialEconomicStatistic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#OtherC10
 * AssetClassProductTypeCode.OtherC10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode#Other
 * AssetClassProductTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType7Code
 * AssetClassProductType7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType4Code
 * AssetClassProductType4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType9Code
 * AssetClassProductType9Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType8Code
 * AssetClassProductType8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType3Code
 * AssetClassProductType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType1Code
 * AssetClassProductType1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType11Code
 * AssetClassProductType11Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType5Code
 * AssetClassProductType5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType2Code
 * AssetClassProductType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetClassProductType6Code
 * AssetClassProductType6Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType13Code
 * AssetClassProductType13Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType12Code
 * AssetClassProductType12Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType14Code
 * AssetClassProductType14Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType15Code
 * AssetClassProductType15Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassProductTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Commodity derivative base product code list."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassProductTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commodity of type agricultural.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agricultural"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type agricultural."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Agricultural = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agricultural";
			definition = "Commodity of type agricultural.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "AGRI";
		}
	};
	/**
	 * Commodity of type energy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Energy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type energy."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Energy = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Energy";
			definition = "Commodity of type energy.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "NRGY";
		}
	};
	/**
	 * Commodity of type environmental.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environmental"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type environmental."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Environmental = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environmental";
			definition = "Commodity of type environmental.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "ENVR";
		}
	};
	/**
	 * Commodity of type freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Freight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type freight."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Freight = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Freight";
			definition = "Commodity of type freight.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "FRGT";
		}
	};
	/**
	 * Commodity of type fertilizer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fertilizer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type fertilizer."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Fertilizer = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fertilizer";
			definition = "Commodity of type fertilizer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "FRTL";
		}
	};
	/**
	 * Commodity of type industrial product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndustrialProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type industrial product."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode IndustrialProduct = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustrialProduct";
			definition = "Commodity of type industrial product.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "INDP";
		}
	};
	/**
	 * Commodity of type metal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "METL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type metal."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Metal = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metal";
			definition = "Commodity of type metal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "METL";
		}
	};
	/**
	 * Commodity of type multi commodity exotic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCommodityExotic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type multi commodity exotic."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode MultiCommodityExotic = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCommodityExotic";
			definition = "Commodity of type multi commodity exotic.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "MCEX";
		}
	};
	/**
	 * Commodity of type paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type paper."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Paper = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			definition = "Commodity of type paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "PAPR";
		}
	};
	/**
	 * Commodity of type polypropylene.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Polypropylene"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type polypropylene."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Polypropylene = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Polypropylene";
			definition = "Commodity of type polypropylene.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "POLY";
		}
	};
	/**
	 * Commodity of type inflation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inflation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type inflation."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Inflation = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inflation";
			definition = "Commodity of type inflation.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "INFL";
		}
	};
	/**
	 * Commodity of type official economic statistic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OEST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialEconomicStatistic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type official economic statistic."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode OfficialEconomicStatistic = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialEconomicStatistic";
			definition = "Commodity of type official economic statistic.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "OEST";
		}
	};
	/**
	 * Commodity of other type C10.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherC10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of other type C10."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode OtherC10 = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherC10";
			definition = "Commodity of other type C10.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "OTHC";
		}
	};
	/**
	 * Commodity of other type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of other type."</li>
	 * </ul>
	 */
	public static final AssetClassProductTypeCode Other = new AssetClassProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Commodity of other type.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, AssetClassProductTypeCode> codesByName = new LinkedHashMap<>();

	protected AssetClassProductTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassProductTypeCode";
				definition = "Commodity derivative base product code list.";
				derivation_lazy = () -> Arrays.asList(AssetClassProductType7Code.mmObject(), AssetClassProductType4Code.mmObject(), AssetClassProductType9Code.mmObject(), AssetClassProductType8Code.mmObject(),
						AssetClassProductType3Code.mmObject(), AssetClassProductType1Code.mmObject(), AssetClassProductType11Code.mmObject(), AssetClassProductType5Code.mmObject(), AssetClassProductType2Code.mmObject(),
						AssetClassProductType6Code.mmObject(), AssetClassProductType13Code.mmObject(), AssetClassProductType12Code.mmObject(), AssetClassProductType14Code.mmObject(), AssetClassProductType15Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassProductTypeCode.Agricultural, com.tools20022.repository.codeset.AssetClassProductTypeCode.Energy,
						com.tools20022.repository.codeset.AssetClassProductTypeCode.Environmental, com.tools20022.repository.codeset.AssetClassProductTypeCode.Freight, com.tools20022.repository.codeset.AssetClassProductTypeCode.Fertilizer,
						com.tools20022.repository.codeset.AssetClassProductTypeCode.IndustrialProduct, com.tools20022.repository.codeset.AssetClassProductTypeCode.Metal,
						com.tools20022.repository.codeset.AssetClassProductTypeCode.MultiCommodityExotic, com.tools20022.repository.codeset.AssetClassProductTypeCode.Paper,
						com.tools20022.repository.codeset.AssetClassProductTypeCode.Polypropylene, com.tools20022.repository.codeset.AssetClassProductTypeCode.Inflation,
						com.tools20022.repository.codeset.AssetClassProductTypeCode.OfficialEconomicStatistic, com.tools20022.repository.codeset.AssetClassProductTypeCode.OtherC10,
						com.tools20022.repository.codeset.AssetClassProductTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agricultural.getCodeName().get(), Agricultural);
		codesByName.put(Energy.getCodeName().get(), Energy);
		codesByName.put(Environmental.getCodeName().get(), Environmental);
		codesByName.put(Freight.getCodeName().get(), Freight);
		codesByName.put(Fertilizer.getCodeName().get(), Fertilizer);
		codesByName.put(IndustrialProduct.getCodeName().get(), IndustrialProduct);
		codesByName.put(Metal.getCodeName().get(), Metal);
		codesByName.put(MultiCommodityExotic.getCodeName().get(), MultiCommodityExotic);
		codesByName.put(Paper.getCodeName().get(), Paper);
		codesByName.put(Polypropylene.getCodeName().get(), Polypropylene);
		codesByName.put(Inflation.getCodeName().get(), Inflation);
		codesByName.put(OfficialEconomicStatistic.getCodeName().get(), OfficialEconomicStatistic);
		codesByName.put(OtherC10.getCodeName().get(), OtherC10);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassProductTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassProductTypeCode[] values() {
		AssetClassProductTypeCode[] values = new AssetClassProductTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassProductTypeCode> {
		@Override
		public AssetClassProductTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassProductTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}