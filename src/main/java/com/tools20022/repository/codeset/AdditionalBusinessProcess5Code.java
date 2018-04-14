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
import com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#AutomaticMarketClaim
 * AdditionalBusinessProcess5Code.AutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#SubjectToTransformation
 * AdditionalBusinessProcess5Code.SubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#CancelUnderlyingTrades
 * AdditionalBusinessProcess5Code.CancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#NoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess5Code.NoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#NoSplitElection
 * AdditionalBusinessProcess5Code.NoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#SchemeOrPlanOfArrangement
 * AdditionalBusinessProcess5Code.SchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#Consent
 * AdditionalBusinessProcess5Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#PartialMandatoryPutRedemption
 * AdditionalBusinessProcess5Code.PartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#FullPrefunding
 * AdditionalBusinessProcess5Code.FullPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#PartialPreFunding
 * AdditionalBusinessProcess5Code.PartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#RequiredAction
 * AdditionalBusinessProcess5Code.RequiredAction}</li>
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
 * "AdditionalBusinessProcess5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code
 * AdditionalBusinessProcess1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalBusinessProcess5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code
	 * AdditionalBusinessProcess5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#AutomaticMarketClaim
	 * AdditionalBusinessProcess1Code.AutomaticMarketClaim}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code AutomaticMarketClaim = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.AutomaticMarketClaim;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.AutomaticMarketClaim.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#SubjectToTransformation
	 * AdditionalBusinessProcess1Code.SubjectToTransformation}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code SubjectToTransformation = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.SubjectToTransformation;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SubjectToTransformation.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlyingTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#CancelUnderlyingTrades
	 * AdditionalBusinessProcess1Code.CancelUnderlyingTrades}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code CancelUnderlyingTrades = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.CancelUnderlyingTrades;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.CancelUnderlyingTrades.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaimsAndTransformations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#NoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess1Code.NoAutomaticMarketClaimsAndTransformations}
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code NoAutomaticMarketClaimsAndTransformations = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.NoAutomaticMarketClaimsAndTransformations;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoAutomaticMarketClaimsAndTransformations.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSplitElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#NoSplitElection
	 * AdditionalBusinessProcess1Code.NoSplitElection}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code NoSplitElection = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.NoSplitElection;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoSplitElection.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeOrPlanOfArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#SchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess1Code.SchemeOrPlanOfArrangement}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code SchemeOrPlanOfArrangement = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.SchemeOrPlanOfArrangement;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SchemeOrPlanOfArrangement.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#Consent
	 * AdditionalBusinessProcess1Code.Consent}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code Consent = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			previousVersion_lazy = () -> AdditionalBusinessProcess1Code.Consent;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.Consent.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code PartialMandatoryPutRedemption = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.PartialMandatoryPutRedemption.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code FullPrefunding = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.FullPrefunding.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPreFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code PartialPreFunding = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPreFunding";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.PartialPreFunding.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess5Code RequiredAction = new AdditionalBusinessProcess5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredAction";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.mmObject();
			codeName = AdditionalBusinessProcessCode.RequiredAction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AdditionalBusinessProcess5Code> codesByName = new LinkedHashMap<>();

	protected AdditionalBusinessProcess5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACLA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess5Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				previousVersion_lazy = () -> AdditionalBusinessProcess1Code.mmObject();
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.AutomaticMarketClaim, com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.SubjectToTransformation,
						com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.CancelUnderlyingTrades, com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.NoAutomaticMarketClaimsAndTransformations,
						com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.NoSplitElection, com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.SchemeOrPlanOfArrangement,
						com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.Consent, com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.PartialMandatoryPutRedemption,
						com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.FullPrefunding, com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.PartialPreFunding,
						com.tools20022.repository.codeset.AdditionalBusinessProcess5Code.RequiredAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AutomaticMarketClaim.getCodeName().get(), AutomaticMarketClaim);
		codesByName.put(SubjectToTransformation.getCodeName().get(), SubjectToTransformation);
		codesByName.put(CancelUnderlyingTrades.getCodeName().get(), CancelUnderlyingTrades);
		codesByName.put(NoAutomaticMarketClaimsAndTransformations.getCodeName().get(), NoAutomaticMarketClaimsAndTransformations);
		codesByName.put(NoSplitElection.getCodeName().get(), NoSplitElection);
		codesByName.put(SchemeOrPlanOfArrangement.getCodeName().get(), SchemeOrPlanOfArrangement);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(PartialMandatoryPutRedemption.getCodeName().get(), PartialMandatoryPutRedemption);
		codesByName.put(FullPrefunding.getCodeName().get(), FullPrefunding);
		codesByName.put(PartialPreFunding.getCodeName().get(), PartialPreFunding);
		codesByName.put(RequiredAction.getCodeName().get(), RequiredAction);
	}

	public static AdditionalBusinessProcess5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalBusinessProcess5Code[] values() {
		AdditionalBusinessProcess5Code[] values = new AdditionalBusinessProcess5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalBusinessProcess5Code> {
		@Override
		public AdditionalBusinessProcess5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalBusinessProcess5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}