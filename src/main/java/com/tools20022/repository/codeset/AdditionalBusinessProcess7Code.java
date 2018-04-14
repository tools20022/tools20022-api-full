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
import com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the additional business process linked to a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#ClaimOrCompensation
 * AdditionalBusinessProcess7Code.ClaimOrCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#TaxRefund
 * AdditionalBusinessProcess7Code.TaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#AutomaticMarketClaim
 * AdditionalBusinessProcess7Code.AutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#SubjectToTransformation
 * AdditionalBusinessProcess7Code.SubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#CancelUnderlyingTrades
 * AdditionalBusinessProcess7Code.CancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#Consent
 * AdditionalBusinessProcess7Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#NoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess7Code.NoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#NoSplitElection
 * AdditionalBusinessProcess7Code.NoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#SchemeOrPlanOfArrangement
 * AdditionalBusinessProcess7Code.SchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#PartialMandatoryPutRedemption
 * AdditionalBusinessProcess7Code.PartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#PartialPreFunding
 * AdditionalBusinessProcess7Code.PartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#FullPrefunding
 * AdditionalBusinessProcess7Code.FullPrefunding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
 * AdditionalBusinessProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBusinessProcess7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
 * AdditionalBusinessProcess4Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalBusinessProcess7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
	 * AdditionalBusinessProcess7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimOrCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#ClaimOrCompensation
	 * AdditionalBusinessProcess4Code.ClaimOrCompensation}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code ClaimOrCompensation = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimOrCompensation";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.ClaimOrCompensation;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.ClaimOrCompensation.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#TaxRefund
	 * AdditionalBusinessProcess4Code.TaxRefund}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code TaxRefund = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefund";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.TaxRefund;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.TaxRefund.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#AutomaticMarketClaim
	 * AdditionalBusinessProcess4Code.AutomaticMarketClaim}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code AutomaticMarketClaim = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.AutomaticMarketClaim;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.AutomaticMarketClaim.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#SubjectToTransformation
	 * AdditionalBusinessProcess4Code.SubjectToTransformation}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code SubjectToTransformation = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.SubjectToTransformation;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SubjectToTransformation.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlyingTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#CancelUnderlyingTrades
	 * AdditionalBusinessProcess4Code.CancelUnderlyingTrades}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code CancelUnderlyingTrades = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.CancelUnderlyingTrades;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.CancelUnderlyingTrades.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#Consent
	 * AdditionalBusinessProcess4Code.Consent}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code Consent = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.Consent;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.Consent.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaimsAndTransformations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#NoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess4Code.NoAutomaticMarketClaimsAndTransformations}
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code NoAutomaticMarketClaimsAndTransformations = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.NoAutomaticMarketClaimsAndTransformations;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoAutomaticMarketClaimsAndTransformations.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSplitElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#NoSplitElection
	 * AdditionalBusinessProcess4Code.NoSplitElection}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code NoSplitElection = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.NoSplitElection;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoSplitElection.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeOrPlanOfArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#SchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess4Code.SchemeOrPlanOfArrangement}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code SchemeOrPlanOfArrangement = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			previousVersion_lazy = () -> AdditionalBusinessProcess4Code.SchemeOrPlanOfArrangement;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SchemeOrPlanOfArrangement.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code PartialMandatoryPutRedemption = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.PartialMandatoryPutRedemption.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPreFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code PartialPreFunding = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPreFunding";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.PartialPreFunding.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess7Code FullPrefunding = new AdditionalBusinessProcess7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.mmObject();
			codeName = AdditionalBusinessProcessCode.FullPrefunding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AdditionalBusinessProcess7Code> codesByName = new LinkedHashMap<>();

	protected AdditionalBusinessProcess7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLAI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess7Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				previousVersion_lazy = () -> AdditionalBusinessProcess4Code.mmObject();
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.ClaimOrCompensation, com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.TaxRefund,
						com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.AutomaticMarketClaim, com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.SubjectToTransformation,
						com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.CancelUnderlyingTrades, com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.Consent,
						com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.NoAutomaticMarketClaimsAndTransformations, com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.NoSplitElection,
						com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.SchemeOrPlanOfArrangement, com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.PartialMandatoryPutRedemption,
						com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.PartialPreFunding, com.tools20022.repository.codeset.AdditionalBusinessProcess7Code.FullPrefunding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClaimOrCompensation.getCodeName().get(), ClaimOrCompensation);
		codesByName.put(TaxRefund.getCodeName().get(), TaxRefund);
		codesByName.put(AutomaticMarketClaim.getCodeName().get(), AutomaticMarketClaim);
		codesByName.put(SubjectToTransformation.getCodeName().get(), SubjectToTransformation);
		codesByName.put(CancelUnderlyingTrades.getCodeName().get(), CancelUnderlyingTrades);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(NoAutomaticMarketClaimsAndTransformations.getCodeName().get(), NoAutomaticMarketClaimsAndTransformations);
		codesByName.put(NoSplitElection.getCodeName().get(), NoSplitElection);
		codesByName.put(SchemeOrPlanOfArrangement.getCodeName().get(), SchemeOrPlanOfArrangement);
		codesByName.put(PartialMandatoryPutRedemption.getCodeName().get(), PartialMandatoryPutRedemption);
		codesByName.put(PartialPreFunding.getCodeName().get(), PartialPreFunding);
		codesByName.put(FullPrefunding.getCodeName().get(), FullPrefunding);
	}

	public static AdditionalBusinessProcess7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalBusinessProcess7Code[] values() {
		AdditionalBusinessProcess7Code[] values = new AdditionalBusinessProcess7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalBusinessProcess7Code> {
		@Override
		public AdditionalBusinessProcess7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalBusinessProcess7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}