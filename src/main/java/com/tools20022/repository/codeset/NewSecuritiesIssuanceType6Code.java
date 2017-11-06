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
import com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of securities proceeds; whether they are defeased or
 * non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
 * NewSecuritiesIssuanceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#mmDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.mmDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#mmNonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.mmNonDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#mmRefundedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.mmRefundedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#mmNonRefundedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.mmNonRefundedSecurityIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewSecuritiesIssuanceType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are defeased or non-defeased."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code
 * NewSecuritiesIssuanceType3Code}</li>
 * </ul>
 */
public class NewSecuritiesIssuanceType6Code extends NewSecuritiesIssuanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code#mmDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType3Code.mmDefeasedSecurityIndicator}</li>
	 * </ul>
	 */
	public static final MMCode mmDefeasedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.mmDefeasedSecurityIndicator;
			owner_lazy = () -> NewSecuritiesIssuanceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code#mmNonDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType3Code.mmNonDefeasedSecurityIndicator}</li>
	 * </ul>
	 */
	public static final MMCode mmNonDefeasedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.mmNonDefeasedSecurityIndicator;
			owner_lazy = () -> NewSecuritiesIssuanceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedSecurityIndicator"</li>
	 * </ul>
	 */
	public static final MMCode mmRefundedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedSecurityIndicator";
			owner_lazy = () -> NewSecuritiesIssuanceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundedSecurityIndicator"</li>
	 * </ul>
	 */
	public static final MMCode mmNonRefundedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundedSecurityIndicator";
			owner_lazy = () -> NewSecuritiesIssuanceType6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType6Code";
				definition = "Specifies the type of securities proceeds; whether they are defeased or non-defeased.";
				previousVersion_lazy = () -> NewSecuritiesIssuanceType3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmDefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmNonDefeasedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmRefundedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmNonRefundedSecurityIndicator);
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}