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
import com.tools20022.repository.codeset.AdditionalBusinessProcessCode;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmAutomaticMarketClaim
 * AdditionalBusinessProcess5Code.mmAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmSubjectToTransformation
 * AdditionalBusinessProcess5Code.mmSubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmCancelUnderlyingTrades
 * AdditionalBusinessProcess5Code.mmCancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmNoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess5Code.mmNoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmNoSplitElection
 * AdditionalBusinessProcess5Code.mmNoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmSchemeOrPlanOfArrangement
 * AdditionalBusinessProcess5Code.mmSchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmConsent
 * AdditionalBusinessProcess5Code.mmConsent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmPartialMandatoryPutRedemption
 * AdditionalBusinessProcess5Code.mmPartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmFullPrefunding
 * AdditionalBusinessProcess5Code.mmFullPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmPartialPreFunding
 * AdditionalBusinessProcess5Code.mmPartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#mmRequiredAction
 * AdditionalBusinessProcess5Code.mmRequiredAction}</li>
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
 * "AdditionalBusinessProcess5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
 * AdditionalBusinessProcess1Code}</li>
 * </ul>
 */
public class AdditionalBusinessProcess5Code extends AdditionalBusinessProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmAutomaticMarketClaim
	 * AdditionalBusinessProcess1Code.mmAutomaticMarketClaim}</li>
	 * </ul>
	 */
	public static final MMCode mmAutomaticMarketClaim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmAutomaticMarketClaim;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmSubjectToTransformation
	 * AdditionalBusinessProcess1Code.mmSubjectToTransformation}</li>
	 * </ul>
	 */
	public static final MMCode mmSubjectToTransformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmSubjectToTransformation;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlyingTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmCancelUnderlyingTrades
	 * AdditionalBusinessProcess1Code.mmCancelUnderlyingTrades}</li>
	 * </ul>
	 */
	public static final MMCode mmCancelUnderlyingTrades = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmCancelUnderlyingTrades;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaimsAndTransformations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmNoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess1Code.
	 * mmNoAutomaticMarketClaimsAndTransformations}</li>
	 * </ul>
	 */
	public static final MMCode mmNoAutomaticMarketClaimsAndTransformations = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmNoAutomaticMarketClaimsAndTransformations;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSplitElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmNoSplitElection
	 * AdditionalBusinessProcess1Code.mmNoSplitElection}</li>
	 * </ul>
	 */
	public static final MMCode mmNoSplitElection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmNoSplitElection;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeOrPlanOfArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmSchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess1Code.mmSchemeOrPlanOfArrangement}</li>
	 * </ul>
	 */
	public static final MMCode mmSchemeOrPlanOfArrangement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmSchemeOrPlanOfArrangement;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#mmConsent
	 * AdditionalBusinessProcess1Code.mmConsent}</li>
	 * </ul>
	 */
	public static final MMCode mmConsent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmConsent;
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPutRedemption"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialMandatoryPutRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPutRedemption";
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrefunding"</li>
	 * </ul>
	 */
	public static final MMCode mmFullPrefunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrefunding";
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPreFunding"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialPreFunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPreFunding";
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAction"</li>
	 * </ul>
	 */
	public static final MMCode mmRequiredAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredAction";
			owner_lazy = () -> AdditionalBusinessProcess5Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACLA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess5Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
				code_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.mmAutomaticMarketClaim, AdditionalBusinessProcess5Code.mmSubjectToTransformation, AdditionalBusinessProcess5Code.mmCancelUnderlyingTrades,
						AdditionalBusinessProcess5Code.mmNoAutomaticMarketClaimsAndTransformations, AdditionalBusinessProcess5Code.mmNoSplitElection, AdditionalBusinessProcess5Code.mmSchemeOrPlanOfArrangement,
						AdditionalBusinessProcess5Code.mmConsent, AdditionalBusinessProcess5Code.mmPartialMandatoryPutRedemption, AdditionalBusinessProcess5Code.mmFullPrefunding, AdditionalBusinessProcess5Code.mmPartialPreFunding,
						AdditionalBusinessProcess5Code.mmRequiredAction);
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}