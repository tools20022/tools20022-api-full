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
import com.tools20022.repository.codeset.CorporateActionEventStageV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the stage of the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#Approved
 * CorporateActionEventStageV2Code.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#Deactivated
 * CorporateActionEventStageV2Code.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#CancellationAndReRun
 * CorporateActionEventStageV2Code.CancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#Lapsed
 * CorporateActionEventStageV2Code.Lapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#SupplementalCancellationAndReRun
 * CorporateActionEventStageV2Code.SupplementalCancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#ActionPeriod
 * CorporateActionEventStageV2Code.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#SupplementalCancellation
 * CorporateActionEventStageV2Code.SupplementalCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#SubjectToApproval
 * CorporateActionEventStageV2Code.SubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#UnconditionalAsToAcceptance
 * CorporateActionEventStageV2Code.UnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#WhollyUnconditional
 * CorporateActionEventStageV2Code.WhollyUnconditional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
 * CorporateActionEventStage3Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code
 * CorporateActionEventStage4Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"APPD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStageV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the corporate action event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStageV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Approved at the relevant meeting, for example, dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Approved at the relevant meeting, for example, dividend."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code Approved = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			definition = "Approved at the relevant meeting, for example, dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "APPD";
		}
	};
	/**
	 * Offer is closed for acceptance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offer is closed for acceptance."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code Deactivated = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			definition = "Offer is closed for acceptance.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "CLDE";
		}
	};
	/**
	 * Cancellation and re-run of an original lottery or an original and
	 * supplemental lottery. A subsequent lottery will be performed under a new
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAndReRun"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation and re-run of an original lottery or an original and supplemental lottery. A subsequent lottery will be performed under a new event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code CancellationAndReRun = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAndReRun";
			definition = "Cancellation and re-run of an original lottery or an original and supplemental lottery. A subsequent lottery will be performed under a new event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Event/offer conditions have not been met and the event/offer is
	 * terminated or lapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event/offer conditions have not been met and the event/offer is terminated or lapsed."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code Lapsed = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapsed";
			definition = "Event/offer conditions have not been met and the event/offer is terminated or lapsed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Cancellation and re-run of a supplemental lottery only. A subsequent new
	 * supplemental lottery will be performed under the original event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalCancellationAndReRun"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation and re-run of a supplemental lottery only. A subsequent new supplemental lottery will be performed under the original event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code SupplementalCancellationAndReRun = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellationAndReRun";
			definition = "Cancellation and re-run of a supplemental lottery only. A subsequent new supplemental lottery will be performed under the original event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Open for acceptance until the next specified deadline in the announcement
	 * (if any).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Open for acceptance until the next specified deadline in the announcement (if any)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code ActionPeriod = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Open for acceptance until the next specified deadline in the announcement (if any).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "PWAL";
		}
	};
	/**
	 * A supplemental lottery is being cancelled by the issuer. No subsequent
	 * lottery will be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A supplemental lottery is being cancelled by the issuer. No subsequent lottery will be performed."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code SupplementalCancellation = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellation";
			definition = "A supplemental lottery is being cancelled by the issuer. No subsequent lottery will be performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * Subject to approval at the relevant meeting, for example, dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject to approval at the relevant meeting, for example, dividend."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code SubjectToApproval = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToApproval";
			definition = "Subject to approval at the relevant meeting, for example, dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "SUAP";
		}
	};
	/**
	 * The required level of acceptances specified in the terms of the offer has
	 * been achieved but there are still outstanding conditions to fulfil.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalAsToAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code UnconditionalAsToAcceptance = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalAsToAcceptance";
			definition = "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "UNAC";
		}
	};
	/**
	 * Wholly unconditional; all conditions specified in the offer document have
	 * been satisfied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
	 * CorporateActionEventStageV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wholly unconditional; all conditions specified in the offer document have been satisfied."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageV2Code WhollyUnconditional = new CorporateActionEventStageV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditional";
			definition = "Wholly unconditional; all conditions specified in the offer document have been satisfied.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmObject();
			codeName = "WHOU";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStageV2Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStageV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("APPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStageV2Code";
				definition = "Specifies the stage of the corporate action event.";
				derivation_lazy = () -> Arrays.asList(CorporateActionEventStage3Code.mmObject(), CorporateActionEventStage4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStageV2Code.Approved, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.CancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.Lapsed,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.SupplementalCancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.ActionPeriod,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.SupplementalCancellation, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.UnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.WhollyUnconditional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(CancellationAndReRun.getCodeName().get(), CancellationAndReRun);
		codesByName.put(Lapsed.getCodeName().get(), Lapsed);
		codesByName.put(SupplementalCancellationAndReRun.getCodeName().get(), SupplementalCancellationAndReRun);
		codesByName.put(ActionPeriod.getCodeName().get(), ActionPeriod);
		codesByName.put(SupplementalCancellation.getCodeName().get(), SupplementalCancellation);
		codesByName.put(SubjectToApproval.getCodeName().get(), SubjectToApproval);
		codesByName.put(UnconditionalAsToAcceptance.getCodeName().get(), UnconditionalAsToAcceptance);
		codesByName.put(WhollyUnconditional.getCodeName().get(), WhollyUnconditional);
	}

	public static CorporateActionEventStageV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStageV2Code[] values() {
		CorporateActionEventStageV2Code[] values = new CorporateActionEventStageV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStageV2Code> {
		@Override
		public CorporateActionEventStageV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStageV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}