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
import com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code list for Energy related derivative contracts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code#Coal
 * AssetClassSubProductEnergyType1Code.Coal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code#Electricity
 * AssetClassSubProductEnergyType1Code.Electricity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code#Oil
 * AssetClassSubProductEnergyType1Code.Oil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code#InterEnergy
 * AssetClassSubProductEnergyType1Code.InterEnergy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code#NaturalGas
 * AssetClassSubProductEnergyType1Code.NaturalGas}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code#Other
 * AssetClassSubProductEnergyType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
 * AssetClassSubProductTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassSubProductEnergyType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code list for Energy related derivative contracts."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductEnergyType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnergyType1Code Coal = new AssetClassSubProductEnergyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coal";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Coal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electricity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnergyType1Code Electricity = new AssetClassSubProductEnergyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electricity";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Electricity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnergyType1Code Oil = new AssetClassSubProductEnergyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oil";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Oil.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterEnergy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnergyType1Code InterEnergy = new AssetClassSubProductEnergyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterEnergy";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.InterEnergy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalGas"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnergyType1Code NaturalGas = new AssetClassSubProductEnergyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalGas";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.NaturalGas.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnergyType1Code Other = new AssetClassSubProductEnergyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductEnergyType1Code> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductEnergyType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AssetClassSubProductEnergyType1Code";
				definition = "Code list for Energy related derivative contracts.";
				trace_lazy = () -> AssetClassSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.Coal, com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.Electricity,
						com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.Oil, com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.InterEnergy,
						com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.NaturalGas, com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Coal.getCodeName().get(), Coal);
		codesByName.put(Electricity.getCodeName().get(), Electricity);
		codesByName.put(Oil.getCodeName().get(), Oil);
		codesByName.put(InterEnergy.getCodeName().get(), InterEnergy);
		codesByName.put(NaturalGas.getCodeName().get(), NaturalGas);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassSubProductEnergyType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductEnergyType1Code[] values() {
		AssetClassSubProductEnergyType1Code[] values = new AssetClassSubProductEnergyType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductEnergyType1Code> {
		@Override
		public AssetClassSubProductEnergyType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductEnergyType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}