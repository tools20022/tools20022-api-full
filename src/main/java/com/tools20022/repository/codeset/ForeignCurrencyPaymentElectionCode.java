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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the foreign currency payment is offered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode#mmOffered
 * ForeignCurrencyPaymentElectionCode.mmOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode#mmNotOffered
 * ForeignCurrencyPaymentElectionCode.mmNotOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode#mmMandatory
 * ForeignCurrencyPaymentElectionCode.mmMandatory}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code
 * ForeignCurrencyPaymentElection1Code}</li>
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
 * <li>"OFFD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignCurrencyPaymentElectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the foreign currency payment is offered."</li>
 * </ul>
 */
public class ForeignCurrencyPaymentElectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Foreign currency payment is offered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode
	 * ForeignCurrencyPaymentElectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign currency payment is offered."</li>
	 * </ul>
	 */
	public static final MMCode mmOffered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offered";
			definition = "Foreign currency payment is offered.";
			owner_lazy = () -> ForeignCurrencyPaymentElectionCode.mmObject();
			codeName = "OFFD";
		}
	};
	/**
	 * Foreign currency payment is not offered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode
	 * ForeignCurrencyPaymentElectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotOffered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign currency payment is not offered."</li>
	 * </ul>
	 */
	public static final MMCode mmNotOffered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotOffered";
			definition = "Foreign currency payment is not offered.";
			owner_lazy = () -> ForeignCurrencyPaymentElectionCode.mmObject();
			codeName = "NOFD";
		}
	};
	/**
	 * Foreign currency payment is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode
	 * ForeignCurrencyPaymentElectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign currency payment is mandatory."</li>
	 * </ul>
	 */
	public static final MMCode mmMandatory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandatory";
			definition = "Foreign currency payment is mandatory.";
			owner_lazy = () -> ForeignCurrencyPaymentElectionCode.mmObject();
			codeName = "MAND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OFFD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignCurrencyPaymentElectionCode";
				definition = "Specifies whether the foreign currency payment is offered.";
				code_lazy = () -> Arrays.asList(ForeignCurrencyPaymentElectionCode.mmOffered, ForeignCurrencyPaymentElectionCode.mmNotOffered, ForeignCurrencyPaymentElectionCode.mmMandatory);
				derivation_lazy = () -> Arrays.asList(ForeignCurrencyPaymentElection1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}