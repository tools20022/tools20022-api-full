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
 * Specifies the stage of the CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#Approved
 * CorporateActionEventStageCode.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#Deactivated
 * CorporateActionEventStageCode.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#FullReversalLotteryNotification
 * CorporateActionEventStageCode.FullReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#Lapsed
 * CorporateActionEventStageCode.Lapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#PartialReversalLotteryNotification
 * CorporateActionEventStageCode.PartialReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#ActionPeriod
 * CorporateActionEventStageCode.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#RescissionReversalLotteryNotification
 * CorporateActionEventStageCode.RescissionReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#SubjectToApproval
 * CorporateActionEventStageCode.SubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#UnconditionalAsToAcceptance
 * CorporateActionEventStageCode.UnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#WhollyUnconditional
 * CorporateActionEventStageCode.WhollyUnconditional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
 * CorporateActionEventStage1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
 * CorporateActionEventStage2Code}</li>
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
 * "CorporateActionEventStageCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the CA event."</li>
 * </ul>
 */
public class CorporateActionEventStageCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Approved at the relevant meeting, eg, dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Approved at the relevant meeting, eg, dividend."</li>
	 * </ul>
	 */
	public static final MMCode Approved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Approved at the relevant meeting, eg, dividend.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "APPD";
		}
	};
	/**
	 * The offer is closed for acceptance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The offer is closed for acceptance."</li>
	 * </ul>
	 */
	public static final MMCode Deactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "The offer is closed for acceptance.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "CLDE";
		}
	};
	/**
	 * An original or supplemental lottery is being reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullReversalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An original or supplemental lottery is being reversed."</li>
	 * </ul>
	 */
	public static final MMCode FullReversalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullReversalLotteryNotification";
			definition = "An original or supplemental lottery is being reversed.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * The event/offer conditions have not been met and the event/offer is
	 * terminated or lapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The event/offer conditions have not been met and the event/offer is terminated or lapsed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Lapsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lapsed";
			definition = "The event/offer conditions have not been met and the event/offer is terminated or lapsed.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Original call amount is reduced by the agent. The original announcement
	 * is cancelled and a new original lottery is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReversalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original call amount is reduced by the agent. The original announcement is cancelled and a new original lottery is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartialReversalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialReversalLotteryNotification";
			definition = "Original call amount is reduced by the agent. The original announcement is cancelled and a new original lottery is issued.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Open for acceptance until the next specified deadline in the announcement (if any)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ActionPeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Open for acceptance until the next specified deadline in the announcement (if any).";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "PWAL";
		}
	};
	/**
	 * Original and or supplemental lottery details have changed and the lottery
	 * is being cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RescissionReversalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original and or supplemental lottery details have changed and the lottery is being cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RescissionReversalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RescissionReversalLotteryNotification";
			definition = "Original and or supplemental lottery details have changed and the lottery is being cancelled.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * Subject to approval at the relevant meeting, eg, dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject to approval at the relevant meeting, eg, dividend."</li>
	 * </ul>
	 */
	public static final MMCode SubjectToApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubjectToApproval";
			definition = "Subject to approval at the relevant meeting, eg, dividend.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalAsToAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UnconditionalAsToAcceptance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnconditionalAsToAcceptance";
			definition = "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wholly unconditional; all conditions specified in the offer document have been satisfied."
	 * </li>
	 * </ul>
	 */
	public static final MMCode WhollyUnconditional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditional";
			definition = "Wholly unconditional; all conditions specified in the offer document have been satisfied.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "WHOU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("APPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStageCode";
				definition = "Specifies the stage of the CA event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStageCode.Approved, com.tools20022.repository.codeset.CorporateActionEventStageCode.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.FullReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.Lapsed,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.PartialReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.ActionPeriod,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.RescissionReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.UnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStageCode.WhollyUnconditional);
				derivation_lazy = () -> Arrays.asList(CorporateActionEventStage1Code.mmObject(), CorporateActionEventStage2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}