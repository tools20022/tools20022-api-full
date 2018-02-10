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
import com.tools20022.repository.codeset.IssuanceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the undertaking issuance type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#UndertakingIssuedDirect
 * IssuanceTypeCode.UndertakingIssuedDirect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#UndertakingViaAdvisingParty
 * IssuanceTypeCode.UndertakingViaAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#UndertakingIssuedViaConfirmingParty
 * IssuanceTypeCode.UndertakingIssuedViaConfirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#CounterUndertakingRequestForLocalUndertaking
 * IssuanceTypeCode.CounterUndertakingRequestForLocalUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#CounterUndertakingRequestForCounterUndertaking
 * IssuanceTypeCode.CounterUndertakingRequestForCounterUndertaking}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuanceType1Code
 * IssuanceType1Code}</li>
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
 * <li>"ISSU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuanceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the undertaking issuance type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IssuanceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking issued direct to the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
	 * IssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuedDirect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking issued direct to the beneficiary. "</li>
	 * </ul>
	 */
	public static final IssuanceTypeCode UndertakingIssuedDirect = new IssuanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedDirect";
			definition = "Undertaking issued direct to the beneficiary. ";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Undertaking issued to the beneficiary via an advising party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
	 * IssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingViaAdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking issued to the beneficiary via an advising party."</li>
	 * </ul>
	 */
	public static final IssuanceTypeCode UndertakingViaAdvisingParty = new IssuanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingViaAdvisingParty";
			definition = "Undertaking issued to the beneficiary via an advising party.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceTypeCode.mmObject();
			codeName = "ISAD";
		}
	};
	/**
	 * Undertaking issued to the beneficiary via a confirming party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
	 * IssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuedViaConfirmingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking issued to the beneficiary via a confirming party."</li>
	 * </ul>
	 */
	public static final IssuanceTypeCode UndertakingIssuedViaConfirmingParty = new IssuanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedViaConfirmingParty";
			definition = "Undertaking issued to the beneficiary via a confirming party.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceTypeCode.mmObject();
			codeName = "ISCO";
		}
	};
	/**
	 * Counter-undertaking issued to a correspondent with a request to issue a
	 * local undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
	 * IssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRQL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingRequestForLocalUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counter-undertaking issued to a correspondent with a request to issue a local undertaking. "
	 * </li>
	 * </ul>
	 */
	public static final IssuanceTypeCode CounterUndertakingRequestForLocalUndertaking = new IssuanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForLocalUndertaking";
			definition = "Counter-undertaking issued to a correspondent with a request to issue a local undertaking. ";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceTypeCode.mmObject();
			codeName = "CRQL";
		}
	};
	/**
	 * Counter-undertaking issued to a correspondent with a request to issue
	 * another counter-undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
	 * IssuanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRQC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingRequestForCounterUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counter-undertaking issued to a correspondent with a request to issue another counter-undertaking."
	 * </li>
	 * </ul>
	 */
	public static final IssuanceTypeCode CounterUndertakingRequestForCounterUndertaking = new IssuanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForCounterUndertaking";
			definition = "Counter-undertaking issued to a correspondent with a request to issue another counter-undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuanceTypeCode.mmObject();
			codeName = "CRQC";
		}
	};
	final static private LinkedHashMap<String, IssuanceTypeCode> codesByName = new LinkedHashMap<>();

	protected IssuanceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ISSU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuanceTypeCode";
				definition = "Specifies the undertaking issuance type.";
				derivation_lazy = () -> Arrays.asList(IssuanceType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuanceTypeCode.UndertakingIssuedDirect, com.tools20022.repository.codeset.IssuanceTypeCode.UndertakingViaAdvisingParty,
						com.tools20022.repository.codeset.IssuanceTypeCode.UndertakingIssuedViaConfirmingParty, com.tools20022.repository.codeset.IssuanceTypeCode.CounterUndertakingRequestForLocalUndertaking,
						com.tools20022.repository.codeset.IssuanceTypeCode.CounterUndertakingRequestForCounterUndertaking);
				length = 4;
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UndertakingIssuedDirect.getCodeName().get(), UndertakingIssuedDirect);
		codesByName.put(UndertakingViaAdvisingParty.getCodeName().get(), UndertakingViaAdvisingParty);
		codesByName.put(UndertakingIssuedViaConfirmingParty.getCodeName().get(), UndertakingIssuedViaConfirmingParty);
		codesByName.put(CounterUndertakingRequestForLocalUndertaking.getCodeName().get(), CounterUndertakingRequestForLocalUndertaking);
		codesByName.put(CounterUndertakingRequestForCounterUndertaking.getCodeName().get(), CounterUndertakingRequestForCounterUndertaking);
	}

	public static IssuanceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IssuanceTypeCode[] values() {
		IssuanceTypeCode[] values = new IssuanceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IssuanceTypeCode> {
		@Override
		public IssuanceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IssuanceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}