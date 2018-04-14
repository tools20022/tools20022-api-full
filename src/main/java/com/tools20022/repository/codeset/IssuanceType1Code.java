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
import com.tools20022.repository.codeset.IssuanceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies undertaking issuance type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#CounterUndertakingRequestForLocalUndertaking
 * IssuanceType1Code.CounterUndertakingRequestForLocalUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#CounterUndertakingRequestForCounterUndertaking
 * IssuanceType1Code.CounterUndertakingRequestForCounterUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#UndertakingIssuedDirect
 * IssuanceType1Code.UndertakingIssuedDirect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#UndertakingIssuedViaConfirmingParty
 * IssuanceType1Code.UndertakingIssuedViaConfirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#UndertakingViaAdvisingParty
 * IssuanceType1Code.UndertakingViaAdvisingParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
 * IssuanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuanceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies undertaking issuance type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CRQL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IssuanceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingRequestForLocalUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final IssuanceType1Code CounterUndertakingRequestForLocalUndertaking = new IssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForLocalUndertaking";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceType1Code.mmObject();
			codeName = IssuanceTypeCode.CounterUndertakingRequestForLocalUndertaking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingRequestForCounterUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final IssuanceType1Code CounterUndertakingRequestForCounterUndertaking = new IssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForCounterUndertaking";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceType1Code.mmObject();
			codeName = IssuanceTypeCode.CounterUndertakingRequestForCounterUndertaking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuedDirect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final IssuanceType1Code UndertakingIssuedDirect = new IssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedDirect";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceType1Code.mmObject();
			codeName = IssuanceTypeCode.UndertakingIssuedDirect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuedViaConfirmingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final IssuanceType1Code UndertakingIssuedViaConfirmingParty = new IssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedViaConfirmingParty";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceType1Code.mmObject();
			codeName = IssuanceTypeCode.UndertakingIssuedViaConfirmingParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingViaAdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final IssuanceType1Code UndertakingViaAdvisingParty = new IssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingViaAdvisingParty";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceType1Code.mmObject();
			codeName = IssuanceTypeCode.UndertakingViaAdvisingParty.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, IssuanceType1Code> codesByName = new LinkedHashMap<>();

	protected IssuanceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRQL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuanceType1Code";
				definition = "Specifies undertaking issuance type.";
				trace_lazy = () -> IssuanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuanceType1Code.CounterUndertakingRequestForLocalUndertaking,
						com.tools20022.repository.codeset.IssuanceType1Code.CounterUndertakingRequestForCounterUndertaking, com.tools20022.repository.codeset.IssuanceType1Code.UndertakingIssuedDirect,
						com.tools20022.repository.codeset.IssuanceType1Code.UndertakingIssuedViaConfirmingParty, com.tools20022.repository.codeset.IssuanceType1Code.UndertakingViaAdvisingParty);
				length = 4;
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CounterUndertakingRequestForLocalUndertaking.getCodeName().get(), CounterUndertakingRequestForLocalUndertaking);
		codesByName.put(CounterUndertakingRequestForCounterUndertaking.getCodeName().get(), CounterUndertakingRequestForCounterUndertaking);
		codesByName.put(UndertakingIssuedDirect.getCodeName().get(), UndertakingIssuedDirect);
		codesByName.put(UndertakingIssuedViaConfirmingParty.getCodeName().get(), UndertakingIssuedViaConfirmingParty);
		codesByName.put(UndertakingViaAdvisingParty.getCodeName().get(), UndertakingViaAdvisingParty);
	}

	public static IssuanceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IssuanceType1Code[] values() {
		IssuanceType1Code[] values = new IssuanceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IssuanceType1Code> {
		@Override
		public IssuanceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IssuanceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}