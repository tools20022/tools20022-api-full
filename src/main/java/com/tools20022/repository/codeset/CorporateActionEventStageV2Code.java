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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the stage of the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmApproved
 * CorporateActionEventStageV2Code.mmApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmDeactivated
 * CorporateActionEventStageV2Code.mmDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmCancellationAndReRun
 * CorporateActionEventStageV2Code.mmCancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmLapsed
 * CorporateActionEventStageV2Code.mmLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmSupplementalCancellationAndReRun
 * CorporateActionEventStageV2Code.mmSupplementalCancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmActionPeriod
 * CorporateActionEventStageV2Code.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmSupplementalCancellation
 * CorporateActionEventStageV2Code.mmSupplementalCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmSubjectToApproval
 * CorporateActionEventStageV2Code.mmSubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmUnconditionalAsToAcceptance
 * CorporateActionEventStageV2Code.mmUnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code#mmWhollyUnconditional
 * CorporateActionEventStageV2Code.mmWhollyUnconditional}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateActionEventStageV2Code {

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
	public static final MMCode mmApproved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			definition = "Approved at the relevant meeting, for example, dividend.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			definition = "Offer is closed for acceptance.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmCancellationAndReRun = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAndReRun";
			definition = "Cancellation and re-run of an original lottery or an original and supplemental lottery. A subsequent lottery will be performed under a new event.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmLapsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapsed";
			definition = "Event/offer conditions have not been met and the event/offer is terminated or lapsed.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	 * "Cancellation and re-run of a supplemental lottery only.  A subsequent new supplemental lottery will be performed under the original event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSupplementalCancellationAndReRun = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellationAndReRun";
			definition = "Cancellation and re-run of a supplemental lottery only.  A subsequent new supplemental lottery will be performed under the original event.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmActionPeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Open for acceptance until the next specified deadline in the announcement (if any).";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	 * "A supplemental lottery is being cancelled by the issuer. No subsequent lottery will be performed. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSupplementalCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellation";
			definition = "A supplemental lottery is being cancelled by the issuer. No subsequent lottery will be performed. ";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmSubjectToApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToApproval";
			definition = "Subject to approval at the relevant meeting, for example, dividend.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmUnconditionalAsToAcceptance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalAsToAcceptance";
			definition = "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
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
	public static final MMCode mmWhollyUnconditional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditional";
			definition = "Wholly unconditional; all conditions specified in the offer document have been satisfied.";
			owner_lazy = () -> CorporateActionEventStageV2Code.mmObject();
			codeName = "WHOU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("APPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStageV2Code";
				definition = "Specifies the stage of the corporate action event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmApproved, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmDeactivated,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmCancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmLapsed,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmSupplementalCancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmActionPeriod,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmSupplementalCancellation, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmSubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmUnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStageV2Code.mmWhollyUnconditional);
				derivation_lazy = () -> Arrays.asList(CorporateActionEventStage3Code.mmObject(), CorporateActionEventStage4Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}