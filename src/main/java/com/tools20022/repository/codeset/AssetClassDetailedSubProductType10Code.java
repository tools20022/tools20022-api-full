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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Further sub product code list for commodity derivative Non-Precious.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Aluminium
 * AssetClassDetailedSubProductType10Code.Aluminium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#AluminiumAlloy
 * AssetClassDetailedSubProductType10Code.AluminiumAlloy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Cobalt
 * AssetClassDetailedSubProductType10Code.Cobalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Copper
 * AssetClassDetailedSubProductType10Code.Copper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#IronOre
 * AssetClassDetailedSubProductType10Code.IronOre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Molybdenum
 * AssetClassDetailedSubProductType10Code.Molybdenum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#NASAAC
 * AssetClassDetailedSubProductType10Code.NASAAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Nickel
 * AssetClassDetailedSubProductType10Code.Nickel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Steel
 * AssetClassDetailedSubProductType10Code.Steel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Tin
 * AssetClassDetailedSubProductType10Code.Tin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Zinc
 * AssetClassDetailedSubProductType10Code.Zinc}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Other
 * AssetClassDetailedSubProductType10Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code#Lead
 * AssetClassDetailedSubProductType10Code.Lead}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductTypeCode
 * AssetClassDetailedSubProductTypeCode}</li>
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
 * "AssetClassDetailedSubProductType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further sub product code list for commodity derivative Non-Precious."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassDetailedSubProductType10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aluminium"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Aluminium = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aluminium";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Aluminium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AluminiumAlloy"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code AluminiumAlloy = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AluminiumAlloy";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.AluminiumAlloy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cobalt"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Cobalt = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cobalt";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Cobalt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copper"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Copper = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Copper";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Copper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IronOre"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code IronOre = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IronOre";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.IronOre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Molybdenum"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Molybdenum = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Molybdenum";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Molybdenum.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NASAAC"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code NASAAC = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NASAAC";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.NASAAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nickel"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Nickel = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nickel";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Nickel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Steel"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Steel = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Steel";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Steel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tin"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Tin = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tin";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Tin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zinc"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Zinc = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Zinc";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Zinc.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Other = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code
	 * AssetClassDetailedSubProductType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lead"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType10Code Lead = new AssetClassDetailedSubProductType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lead";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Lead.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassDetailedSubProductType10Code> codesByName = new LinkedHashMap<>();

	protected AssetClassDetailedSubProductType10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassDetailedSubProductType10Code";
				definition = "Further sub product code list for commodity derivative Non-Precious.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Aluminium, com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.AluminiumAlloy,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Cobalt, com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Copper,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.IronOre, com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Molybdenum,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.NASAAC, com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Nickel,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Steel, com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Tin,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Zinc, com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Other,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType10Code.Lead);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Aluminium.getCodeName().get(), Aluminium);
		codesByName.put(AluminiumAlloy.getCodeName().get(), AluminiumAlloy);
		codesByName.put(Cobalt.getCodeName().get(), Cobalt);
		codesByName.put(Copper.getCodeName().get(), Copper);
		codesByName.put(IronOre.getCodeName().get(), IronOre);
		codesByName.put(Molybdenum.getCodeName().get(), Molybdenum);
		codesByName.put(NASAAC.getCodeName().get(), NASAAC);
		codesByName.put(Nickel.getCodeName().get(), Nickel);
		codesByName.put(Steel.getCodeName().get(), Steel);
		codesByName.put(Tin.getCodeName().get(), Tin);
		codesByName.put(Zinc.getCodeName().get(), Zinc);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Lead.getCodeName().get(), Lead);
	}

	public static AssetClassDetailedSubProductType10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassDetailedSubProductType10Code[] values() {
		AssetClassDetailedSubProductType10Code[] values = new AssetClassDetailedSubProductType10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassDetailedSubProductType10Code> {
		@Override
		public AssetClassDetailedSubProductType10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassDetailedSubProductType10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}