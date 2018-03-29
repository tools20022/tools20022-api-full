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
import com.tools20022.repository.codeset.EligibilityTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of eligibility.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EligibilityTypeCode#Securities
 * EligibilityTypeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EligibilityTypeCode#IssuerCSD
 * EligibilityTypeCode.IssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EligibilityTypeCode#Country
 * EligibilityTypeCode.Country}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EligibilityType1Code
 * EligibilityType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SECU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EligibilityTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of eligibility."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EligibilityTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Eligibility applies at securities level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityTypeCode
	 * EligibilityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Eligibility applies at securities level."</li>
	 * </ul>
	 */
	public static final EligibilityTypeCode Securities = new EligibilityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			definition = "Eligibility applies at securities level.";
			owner_lazy = () -> com.tools20022.repository.codeset.EligibilityTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Eligibility applies at the level of issuer CSD.<br>
	 * All of the securities issued by the issuer CSD are eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityTypeCode
	 * EligibilityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility applies at the level of issuer CSD.\r\nAll of the securities issued by the issuer CSD are eligible."
	 * </li>
	 * </ul>
	 */
	public static final EligibilityTypeCode IssuerCSD = new EligibilityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "Eligibility applies at the level of issuer CSD.\r\nAll of the securities issued by the issuer CSD are eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.EligibilityTypeCode.mmObject();
			codeName = "ISCS";
		}
	};
	/**
	 * Eligibility applies at country level.<br>
	 * All of the securities issued in that country are eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityTypeCode
	 * EligibilityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility applies at country level.\r\nAll of the securities issued in that country are eligible."
	 * </li>
	 * </ul>
	 */
	public static final EligibilityTypeCode Country = new EligibilityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Eligibility applies at country level.\r\nAll of the securities issued in that country are eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.EligibilityTypeCode.mmObject();
			codeName = "CTRY";
		}
	};
	final static private LinkedHashMap<String, EligibilityTypeCode> codesByName = new LinkedHashMap<>();

	protected EligibilityTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SECU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EligibilityTypeCode";
				definition = "Defines the type of eligibility.";
				derivation_lazy = () -> Arrays.asList(EligibilityType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EligibilityTypeCode.Securities, com.tools20022.repository.codeset.EligibilityTypeCode.IssuerCSD,
						com.tools20022.repository.codeset.EligibilityTypeCode.Country);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(IssuerCSD.getCodeName().get(), IssuerCSD);
		codesByName.put(Country.getCodeName().get(), Country);
	}

	public static EligibilityTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EligibilityTypeCode[] values() {
		EligibilityTypeCode[] values = new EligibilityTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EligibilityTypeCode> {
		@Override
		public EligibilityTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EligibilityTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}