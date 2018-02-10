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
import com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Automatic Reinvestment of Cash distributed by accumulating funds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#Final
 * CorporateActionFrequencyType5Code.Final}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#Interim
 * CorporateActionFrequencyType5Code.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#Reinvestment
 * CorporateActionFrequencyType5Code.Reinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#Regular
 * CorporateActionFrequencyType5Code.Regular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#Special
 * CorporateActionFrequencyType5Code.Special}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#SpecialDividendWithReinvestment
 * CorporateActionFrequencyType5Code.SpecialDividendWithReinvestment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
 * CorporateActionFrequencyTypeV2Code}</li>
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
 * "CorporateActionFrequencyType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Automatic Reinvestment of Cash distributed by accumulating funds."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code
 * CorporateActionFrequencyType3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionFrequencyType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#Final
	 * CorporateActionFrequencyType3Code.Final}</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType5Code Final = new CorporateActionFrequencyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.Final;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.mmObject();
			codeName = CorporateActionFrequencyTypeV2Code.Final.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#Interim
	 * CorporateActionFrequencyType3Code.Interim}</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType5Code Interim = new CorporateActionFrequencyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.Interim;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.mmObject();
			codeName = CorporateActionFrequencyTypeV2Code.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#Reinvestment
	 * CorporateActionFrequencyType3Code.Reinvestment}</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType5Code Reinvestment = new CorporateActionFrequencyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.Reinvestment;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.mmObject();
			codeName = CorporateActionFrequencyTypeV2Code.Reinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#Regular
	 * CorporateActionFrequencyType3Code.Regular}</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType5Code Regular = new CorporateActionFrequencyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.Regular;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.mmObject();
			codeName = CorporateActionFrequencyTypeV2Code.Regular.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#Special
	 * CorporateActionFrequencyType3Code.Special}</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType5Code Special = new CorporateActionFrequencyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.Special;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.mmObject();
			codeName = CorporateActionFrequencyTypeV2Code.Special.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendWithReinvestment"</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType5Code SpecialDividendWithReinvestment = new CorporateActionFrequencyType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendWithReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.mmObject();
			codeName = CorporateActionFrequencyTypeV2Code.SpecialDividendWithReinvestment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionFrequencyType5Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionFrequencyType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyType5Code";
				definition = "Automatic Reinvestment of Cash distributed by accumulating funds.";
				previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmObject();
				trace_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.Final, com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.Interim,
						com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.Reinvestment, com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.Regular,
						com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.Special, com.tools20022.repository.codeset.CorporateActionFrequencyType5Code.SpecialDividendWithReinvestment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Reinvestment.getCodeName().get(), Reinvestment);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(SpecialDividendWithReinvestment.getCodeName().get(), SpecialDividendWithReinvestment);
	}

	public static CorporateActionFrequencyType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionFrequencyType5Code[] values() {
		CorporateActionFrequencyType5Code[] values = new CorporateActionFrequencyType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionFrequencyType5Code> {
		@Override
		public CorporateActionFrequencyType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionFrequencyType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}