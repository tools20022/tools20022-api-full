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
import com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#ClaimOrCompensation
 * AdditionalBusinessProcess4Code.ClaimOrCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#TaxRefund
 * AdditionalBusinessProcess4Code.TaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#AutomaticMarketClaim
 * AdditionalBusinessProcess4Code.AutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#SubjectToTransformation
 * AdditionalBusinessProcess4Code.SubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#CancelUnderlyingTrades
 * AdditionalBusinessProcess4Code.CancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#Consent
 * AdditionalBusinessProcess4Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#NoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess4Code.NoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#NoSplitElection
 * AdditionalBusinessProcess4Code.NoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code#SchemeOrPlanOfArrangement
 * AdditionalBusinessProcess4Code.SchemeOrPlanOfArrangement}</li>
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
 * "AdditionalBusinessProcess4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code
 * AdditionalBusinessProcess7Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess3Code
 * AdditionalBusinessProcess3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalBusinessProcess4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimOrCompensation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#ClaimOrCompensation
	 * AdditionalBusinessProcess7Code.ClaimOrCompensation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code ClaimOrCompensation = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimOrCompensation";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.ClaimOrCompensation);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.ClaimOrCompensation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#TaxRefund
	 * AdditionalBusinessProcess7Code.TaxRefund}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code TaxRefund = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefund";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.TaxRefund);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.TaxRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#AutomaticMarketClaim
	 * AdditionalBusinessProcess7Code.AutomaticMarketClaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code AutomaticMarketClaim = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.AutomaticMarketClaim);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.AutomaticMarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#SubjectToTransformation
	 * AdditionalBusinessProcess7Code.SubjectToTransformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code SubjectToTransformation = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.SubjectToTransformation);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SubjectToTransformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#CancelUnderlyingTrades
	 * AdditionalBusinessProcess7Code.CancelUnderlyingTrades}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code CancelUnderlyingTrades = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.CancelUnderlyingTrades);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.CancelUnderlyingTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#Consent
	 * AdditionalBusinessProcess7Code.Consent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code Consent = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.Consent);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#NoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess7Code.NoAutomaticMarketClaimsAndTransformations}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code NoAutomaticMarketClaimsAndTransformations = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.NoAutomaticMarketClaimsAndTransformations);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoAutomaticMarketClaimsAndTransformations.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#NoSplitElection
	 * AdditionalBusinessProcess7Code.NoSplitElection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code NoSplitElection = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.NoSplitElection);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoSplitElection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess4Code
	 * AdditionalBusinessProcess4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess7Code#SchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess7Code.SchemeOrPlanOfArrangement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess4Code SchemeOrPlanOfArrangement = new AdditionalBusinessProcess4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.SchemeOrPlanOfArrangement);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SchemeOrPlanOfArrangement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AdditionalBusinessProcess4Code> codesByName = new LinkedHashMap<>();

	protected AdditionalBusinessProcess4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLAI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess4Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess7Code.mmObject());
				previousVersion_lazy = () -> AdditionalBusinessProcess3Code.mmObject();
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.ClaimOrCompensation, com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.TaxRefund,
						com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.AutomaticMarketClaim, com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.SubjectToTransformation,
						com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.CancelUnderlyingTrades, com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.Consent,
						com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.NoAutomaticMarketClaimsAndTransformations, com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.NoSplitElection,
						com.tools20022.repository.codeset.AdditionalBusinessProcess4Code.SchemeOrPlanOfArrangement);
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
	}

	public static AdditionalBusinessProcess4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalBusinessProcess4Code[] values() {
		AdditionalBusinessProcess4Code[] values = new AdditionalBusinessProcess4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalBusinessProcess4Code> {
		@Override
		public AdditionalBusinessProcess4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalBusinessProcess4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}