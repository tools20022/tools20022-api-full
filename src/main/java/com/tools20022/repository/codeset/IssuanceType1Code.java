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
import com.tools20022.repository.codeset.IssuanceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies undertaking issuance type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IssuanceTypeCode
 * IssuanceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#mmCounterUndertakingRequestForLocalUndertaking
 * IssuanceType1Code.mmCounterUndertakingRequestForLocalUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#mmCounterUndertakingRequestForCounterUndertaking
 * IssuanceType1Code.mmCounterUndertakingRequestForCounterUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#mmUndertakingIssuedDirect
 * IssuanceType1Code.mmUndertakingIssuedDirect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#mmUndertakingIssuedViaConfirmingParty
 * IssuanceType1Code.mmUndertakingIssuedViaConfirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code#mmUndertakingViaAdvisingParty
 * IssuanceType1Code.mmUndertakingViaAdvisingParty}</li>
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
 * <li>"CRQL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuanceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies undertaking issuance type."</li>
 * </ul>
 */
public class IssuanceType1Code extends IssuanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingRequestForLocalUndertaking"</li>
	 * </ul>
	 */
	public static final MMCode mmCounterUndertakingRequestForLocalUndertaking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForLocalUndertaking";
			owner_lazy = () -> IssuanceType1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingRequestForCounterUndertaking"</li>
	 * </ul>
	 */
	public static final MMCode mmCounterUndertakingRequestForCounterUndertaking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingRequestForCounterUndertaking";
			owner_lazy = () -> IssuanceType1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuedDirect"</li>
	 * </ul>
	 */
	public static final MMCode mmUndertakingIssuedDirect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedDirect";
			owner_lazy = () -> IssuanceType1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuedViaConfirmingParty"</li>
	 * </ul>
	 */
	public static final MMCode mmUndertakingIssuedViaConfirmingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuedViaConfirmingParty";
			owner_lazy = () -> IssuanceType1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingViaAdvisingParty"</li>
	 * </ul>
	 */
	public static final MMCode mmUndertakingViaAdvisingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingViaAdvisingParty";
			owner_lazy = () -> IssuanceType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CRQL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuanceType1Code";
				definition = "Specifies undertaking issuance type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuanceType1Code.mmCounterUndertakingRequestForLocalUndertaking,
						com.tools20022.repository.codeset.IssuanceType1Code.mmCounterUndertakingRequestForCounterUndertaking, com.tools20022.repository.codeset.IssuanceType1Code.mmUndertakingIssuedDirect,
						com.tools20022.repository.codeset.IssuanceType1Code.mmUndertakingIssuedViaConfirmingParty, com.tools20022.repository.codeset.IssuanceType1Code.mmUndertakingViaAdvisingParty);
				trace_lazy = () -> IssuanceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}