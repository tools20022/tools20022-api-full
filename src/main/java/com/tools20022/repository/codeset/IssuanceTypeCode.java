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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the undertaking issuance type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#mmUndertakingIssuedDirect
 * IssuanceTypeCode.mmUndertakingIssuedDirect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#mmUndertakingViaAdvisingParty
 * IssuanceTypeCode.mmUndertakingViaAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#mmUndertakingIssuedViaConfirmingParty
 * IssuanceTypeCode.mmUndertakingIssuedViaConfirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#mmCounterUndertakingRequestForLocalUndertaking
 * IssuanceTypeCode.mmCounterUndertakingRequestForLocalUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode#mmCounterUndertakingRequestForCounterUndertaking
 * IssuanceTypeCode.mmCounterUndertakingRequestForCounterUndertaking}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class IssuanceTypeCode {

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
	public static final MMCode mmUndertakingIssuedDirect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedDirect";
			definition = "Undertaking issued direct to the beneficiary. ";
			owner_lazy = () -> IssuanceTypeCode.mmObject();
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
	public static final MMCode mmUndertakingViaAdvisingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingViaAdvisingParty";
			definition = "Undertaking issued to the beneficiary via an advising party.";
			owner_lazy = () -> IssuanceTypeCode.mmObject();
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
	public static final MMCode mmUndertakingIssuedViaConfirmingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedViaConfirmingParty";
			definition = "Undertaking issued to the beneficiary via a confirming party.";
			owner_lazy = () -> IssuanceTypeCode.mmObject();
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
	public static final MMCode mmCounterUndertakingRequestForLocalUndertaking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForLocalUndertaking";
			definition = "Counter-undertaking issued to a correspondent with a request to issue a local undertaking. ";
			owner_lazy = () -> IssuanceTypeCode.mmObject();
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
	public static final MMCode mmCounterUndertakingRequestForCounterUndertaking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForCounterUndertaking";
			definition = "Counter-undertaking issued to a correspondent with a request to issue another counter-undertaking.";
			owner_lazy = () -> IssuanceTypeCode.mmObject();
			codeName = "CRQC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ISSU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuanceTypeCode";
				definition = "Specifies the undertaking issuance type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuanceTypeCode.mmUndertakingIssuedDirect, com.tools20022.repository.codeset.IssuanceTypeCode.mmUndertakingViaAdvisingParty,
						com.tools20022.repository.codeset.IssuanceTypeCode.mmUndertakingIssuedViaConfirmingParty, com.tools20022.repository.codeset.IssuanceTypeCode.mmCounterUndertakingRequestForLocalUndertaking,
						com.tools20022.repository.codeset.IssuanceTypeCode.mmCounterUndertakingRequestForCounterUndertaking);
				derivation_lazy = () -> Arrays.asList(IssuanceType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}