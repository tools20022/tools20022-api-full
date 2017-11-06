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
import com.tools20022.repository.codeset.AdditionalBusinessProcessCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the additional business process linked to a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
 * AdditionalBusinessProcessCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmAutomaticMarketClaim
 * AdditionalBusinessProcess1Code.mmAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmSubjectToTransformation
 * AdditionalBusinessProcess1Code.mmSubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmCancelUnderlyingTrades
 * AdditionalBusinessProcess1Code.mmCancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmNoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess1Code.mmNoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmNoSplitElection
 * AdditionalBusinessProcess1Code.mmNoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmSchemeOrPlanOfArrangement
 * AdditionalBusinessProcess1Code.mmSchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmConsent
 * AdditionalBusinessProcess1Code.mmConsent}</li>
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
 * <li>"ACLA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBusinessProcess1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
 * AdditionalBusinessProcess5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AdditionalBusinessProcess1Code extends AdditionalBusinessProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticMarketClaim"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmAutomaticMarketClaim
	 * AdditionalBusinessProcess5Code.mmAutomaticMarketClaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAutomaticMarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmAutomaticMarketClaim);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToTransformation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmSubjectToTransformation
	 * AdditionalBusinessProcess5Code.mmSubjectToTransformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSubjectToTransformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmSubjectToTransformation);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlyingTrades"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmCancelUnderlyingTrades
	 * AdditionalBusinessProcess5Code.mmCancelUnderlyingTrades}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancelUnderlyingTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmCancelUnderlyingTrades);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaimsAndTransformations"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmNoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess5Code.
	 * mmNoAutomaticMarketClaimsAndTransformations}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoAutomaticMarketClaimsAndTransformations = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmNoAutomaticMarketClaimsAndTransformations);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSplitElection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmNoSplitElection
	 * AdditionalBusinessProcess5Code.mmNoSplitElection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoSplitElection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmNoSplitElection);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeOrPlanOfArrangement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmSchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess5Code.mmSchemeOrPlanOfArrangement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSchemeOrPlanOfArrangement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmSchemeOrPlanOfArrangement);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
	 * AdditionalBusinessProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmConsent
	 * AdditionalBusinessProcess5Code.mmConsent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConsent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmConsent);
			owner_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACLA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess1Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmAutomaticMarketClaim, com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmSubjectToTransformation,
						com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmCancelUnderlyingTrades, com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmNoAutomaticMarketClaimsAndTransformations,
						com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmNoSplitElection, com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmSchemeOrPlanOfArrangement,
						com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmConsent);
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}