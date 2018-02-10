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
import com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#AutomaticMarketClaim
 * AdditionalBusinessProcess1Code.AutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#SubjectToTransformation
 * AdditionalBusinessProcess1Code.SubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#CancelUnderlyingTrades
 * AdditionalBusinessProcess1Code.CancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#NoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcess1Code.NoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#NoSplitElection
 * AdditionalBusinessProcess1Code.NoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#SchemeOrPlanOfArrangement
 * AdditionalBusinessProcess1Code.SchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess1Code#Consent
 * AdditionalBusinessProcess1Code.Consent}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalBusinessProcess1Code extends MMCode {

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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#AutomaticMarketClaim
	 * AdditionalBusinessProcess5Code.AutomaticMarketClaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code AutomaticMarketClaim = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticMarketClaim";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.AutomaticMarketClaim);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.AutomaticMarketClaim.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#SubjectToTransformation
	 * AdditionalBusinessProcess5Code.SubjectToTransformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code SubjectToTransformation = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToTransformation";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.SubjectToTransformation);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SubjectToTransformation.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#CancelUnderlyingTrades
	 * AdditionalBusinessProcess5Code.CancelUnderlyingTrades}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code CancelUnderlyingTrades = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlyingTrades";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.CancelUnderlyingTrades);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.CancelUnderlyingTrades.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#NoAutomaticMarketClaimsAndTransformations
	 * AdditionalBusinessProcess5Code.NoAutomaticMarketClaimsAndTransformations}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code NoAutomaticMarketClaimsAndTransformations = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.NoAutomaticMarketClaimsAndTransformations);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoAutomaticMarketClaimsAndTransformations.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#NoSplitElection
	 * AdditionalBusinessProcess5Code.NoSplitElection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code NoSplitElection = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSplitElection";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.NoSplitElection);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NoSplitElection.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#SchemeOrPlanOfArrangement
	 * AdditionalBusinessProcess5Code.SchemeOrPlanOfArrangement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code SchemeOrPlanOfArrangement = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.SchemeOrPlanOfArrangement);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.SchemeOrPlanOfArrangement.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess5Code#Consent
	 * AdditionalBusinessProcess5Code.Consent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess1Code Consent = new AdditionalBusinessProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.Consent);
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.mmObject();
			codeName = AdditionalBusinessProcessCode.Consent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AdditionalBusinessProcess1Code> codesByName = new LinkedHashMap<>();

	protected AdditionalBusinessProcess1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACLA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess1Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalBusinessProcess5Code.mmObject());
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.AutomaticMarketClaim, com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.SubjectToTransformation,
						com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.CancelUnderlyingTrades, com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.NoAutomaticMarketClaimsAndTransformations,
						com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.NoSplitElection, com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.SchemeOrPlanOfArrangement,
						com.tools20022.repository.codeset.AdditionalBusinessProcess1Code.Consent);
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
	}

	public static AdditionalBusinessProcess1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalBusinessProcess1Code[] values() {
		AdditionalBusinessProcess1Code[] values = new AdditionalBusinessProcess1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalBusinessProcess1Code> {
		@Override
		public AdditionalBusinessProcess1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalBusinessProcess1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}