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
 * Specifies the type of securities proceeds; whether they are newly issued or
 * not, defeased or non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
 * NewSecuritiesIssuanceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#mmDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType2Code.mmDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#mmExistingIssue
 * NewSecuritiesIssuanceType2Code.mmExistingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#mmNewIssue
 * NewSecuritiesIssuanceType2Code.mmNewIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#mmNonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType2Code.mmNonDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#mmUnknown
 * NewSecuritiesIssuanceType2Code.mmUnknown}</li>
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
 * "NewSecuritiesIssuanceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
 * NewSecuritiesIssuanceType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class NewSecuritiesIssuanceType2Code extends NewSecuritiesIssuanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefeasedSecurityIndicator"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#mmDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType5Code.mmDefeasedSecurityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDefeasedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmDefeasedSecurityIndicator);
			owner_lazy = () -> NewSecuritiesIssuanceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingIssue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#mmExistingIssue
	 * NewSecuritiesIssuanceType5Code.mmExistingIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExistingIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingIssue";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmExistingIssue);
			owner_lazy = () -> NewSecuritiesIssuanceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#mmNewIssue
	 * NewSecuritiesIssuanceType5Code.mmNewIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNewIssue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssue";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmNewIssue);
			owner_lazy = () -> NewSecuritiesIssuanceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDefeasedSecurityIndicator"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#mmNonDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType5Code.mmNonDefeasedSecurityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonDefeasedSecurityIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmNonDefeasedSecurityIndicator);
			owner_lazy = () -> NewSecuritiesIssuanceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#mmUnknown
	 * NewSecuritiesIssuanceType5Code.mmUnknown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmUnknown);
			owner_lazy = () -> NewSecuritiesIssuanceType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType2Code";
				definition = "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased.";
				nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmDefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmExistingIssue,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmNewIssue, com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmNonDefeasedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmUnknown);
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}