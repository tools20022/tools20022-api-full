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
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmClaimOrCompensation
 * AdditionalBusinessProcess7Code.mmClaimOrCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmTaxRefund
 * AdditionalBusinessProcess7Code.mmTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmAutomaticMarketClaim
 * AdditionalBusinessProcess7Code.mmAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmSubjectToTransformation
 * AdditionalBusinessProcess7Code.mmSubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmCancelUnderlyingTrades
 * AdditionalBusinessProcess7Code.mmCancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmConsent
 * AdditionalBusinessProcess7Code.mmConsent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmNoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess7Code.mmNoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmNoSplitElection
 * AdditionalBusinessProcess7Code.mmNoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmSchemeOrPlanOfArrangement
 * AdditionalBusinessProcess7Code.mmSchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmPartialMandatoryPutRedemption
 * AdditionalBusinessProcess7Code.mmPartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmPartialPreFunding
 * AdditionalBusinessProcess7Code.mmPartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#mmFullPrefunding
 * AdditionalBusinessProcess7Code.mmFullPrefunding}</li>
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
 * <li>"CLAI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBusinessProcess7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
 * AdditionalBusinessProcess4Code}</li>
 * </ul>
 */
public class AdditionalBusinessProcess7Code extends AdditionalBusinessProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimOrCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmClaimOrCompensation
	 * AdditionalBusinessProcess4Code.mmClaimOrCompensation}</li>
	 * </ul>
	 */
	public static final MMCode mmClaimOrCompensation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimOrCompensation";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmClaimOrCompensation;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmTaxRefund
	 * AdditionalBusinessProcess4Code.mmTaxRefund}</li>
	 * </ul>
	 */
	public static final MMCode mmTaxRefund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefund";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmTaxRefund;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmAutomaticMarketClaim
	 * AdditionalBusinessProcess4Code.mmAutomaticMarketClaim}</li>
	 * </ul>
	 */
	public static final MMCode mmAutomaticMarketClaim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmAutomaticMarketClaim;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmSubjectToTransformation
	 * AdditionalBusinessProcess4Code.mmSubjectToTransformation}</li>
	 * </ul>
	 */
	public static final MMCode mmSubjectToTransformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmSubjectToTransformation;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlyingTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmCancelUnderlyingTrades
	 * AdditionalBusinessProcess4Code.mmCancelUnderlyingTrades}</li>
	 * </ul>
	 */
	public static final MMCode mmCancelUnderlyingTrades = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmCancelUnderlyingTrades;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmConsent
	 * AdditionalBusinessProcess4Code.mmConsent}</li>
	 * </ul>
	 */
	public static final MMCode mmConsent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmConsent;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaimsAndTransformations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmNoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess4Code.
	 * mmNoAutomaticMarketClaimsAndTransformations}</li>
	 * </ul>
	 */
	public static final MMCode mmNoAutomaticMarketClaimsAndTransformations = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmNoAutomaticMarketClaimsAndTransformations;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSplitElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmNoSplitElection
	 * AdditionalBusinessProcess4Code.mmNoSplitElection}</li>
	 * </ul>
	 */
	public static final MMCode mmNoSplitElection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmNoSplitElection;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeOrPlanOfArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#mmSchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess4Code.mmSchemeOrPlanOfArrangement}</li>
	 * </ul>
	 */
	public static final MMCode mmSchemeOrPlanOfArrangement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmSchemeOrPlanOfArrangement;
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
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
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
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
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
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
			owner_lazy = () -> AdditionalBusinessProcess7Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CLAI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess7Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmObject();
				code_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.mmClaimOrCompensation, AdditionalBusinessProcess7Code.mmTaxRefund, AdditionalBusinessProcess7Code.mmAutomaticMarketClaim,
						AdditionalBusinessProcess7Code.mmSubjectToTransformation, AdditionalBusinessProcess7Code.mmCancelUnderlyingTrades, AdditionalBusinessProcess7Code.mmConsent,
						AdditionalBusinessProcess7Code.mmNoAutomaticMarketClaimsAndTransformations, AdditionalBusinessProcess7Code.mmNoSplitElection, AdditionalBusinessProcess7Code.mmSchemeOrPlanOfArrangement,
						AdditionalBusinessProcess7Code.mmPartialMandatoryPutRedemption, AdditionalBusinessProcess7Code.mmPartialPreFunding, AdditionalBusinessProcess7Code.mmFullPrefunding);
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}