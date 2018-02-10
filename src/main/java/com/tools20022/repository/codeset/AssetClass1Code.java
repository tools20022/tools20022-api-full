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
import com.tools20022.repository.codeset.AssetClass1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTC (The Depository Trust Company) defined asset class.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code#CorporateDebt
 * AssetClass1Code.CorporateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code#CorporateEquity
 * AssetClass1Code.CorporateEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code#MunicipalDebt
 * AssetClass1Code.MunicipalDebt}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassCode AssetClassCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CRPB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClass1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) defined asset class."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClass1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateDebt"</li>
	 * </ul>
	 */
	public static final AssetClass1Code CorporateDebt = new AssetClass1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClass1Code.mmObject();
			codeName = AssetClassCode.CorporateDebt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEquity"</li>
	 * </ul>
	 */
	public static final AssetClass1Code CorporateEquity = new AssetClass1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateEquity";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClass1Code.mmObject();
			codeName = AssetClassCode.CorporateEquity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalDebt"</li>
	 * </ul>
	 */
	public static final AssetClass1Code MunicipalDebt = new AssetClass1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClass1Code.mmObject();
			codeName = AssetClassCode.MunicipalDebt.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClass1Code> codesByName = new LinkedHashMap<>();

	protected AssetClass1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRPB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClass1Code";
				definition = "Specifies DTC (The Depository Trust Company) defined asset class.";
				trace_lazy = () -> AssetClassCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClass1Code.CorporateDebt, com.tools20022.repository.codeset.AssetClass1Code.CorporateEquity,
						com.tools20022.repository.codeset.AssetClass1Code.MunicipalDebt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CorporateDebt.getCodeName().get(), CorporateDebt);
		codesByName.put(CorporateEquity.getCodeName().get(), CorporateEquity);
		codesByName.put(MunicipalDebt.getCodeName().get(), MunicipalDebt);
	}

	public static AssetClass1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClass1Code[] values() {
		AssetClass1Code[] values = new AssetClass1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClass1Code> {
		@Override
		public AssetClass1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClass1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}