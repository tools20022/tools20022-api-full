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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Standard code to specify the narrative type of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#mmTaxationConditions
 * CorporateActionNarrativeCode.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#mmRegistrationDetails
 * CorporateActionNarrativeCode.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#mmWithholdingTaxReliefCertification
 * CorporateActionNarrativeCode.mmWithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#mmICSDRefusalOfMarkUpDownConfirmation
 * CorporateActionNarrativeCode.mmICSDRefusalOfMarkUpDownConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#mmChasingOfPriorAuthorization
 * CorporateActionNarrativeCode.mmChasingOfPriorAuthorization}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#mmConfirmationOfHoldingTransfer
 * CorporateActionNarrativeCode.mmConfirmationOfHoldingTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
 * CorporateActionNarrative1Code}</li>
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
 * <li>"TAXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrativeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Standard code to specify the narrative type of a corporate action."</li>
 * </ul>
 */
public class CorporateActionNarrativeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides taxation conditions that cannot be included within the
	 * structured fields of this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
	 * CorporateActionNarrativeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides taxation conditions that cannot be included within the structured fields of this message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxationConditions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message.";
			owner_lazy = () -> CorporateActionNarrativeCode.mmObject();
			codeName = "TAXE";
		}
	};
	/**
	 * Provides information required for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
	 * CorporateActionNarrativeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * </ul>
	 */
	public static final MMCode mmRegistrationDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			owner_lazy = () -> CorporateActionNarrativeCode.mmObject();
			codeName = "REGI";
		}
	};
	/**
	 * Certification process for withholding tax reduction or exemption based on
	 * the tax status of the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
	 * CorporateActionNarrativeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certification process for withholding tax reduction or exemption based on the tax status of the holder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithholdingTaxReliefCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxReliefCertification";
			definition = "Certification process for withholding tax reduction or exemption based on the tax status of the holder.";
			owner_lazy = () -> CorporateActionNarrativeCode.mmObject();
			codeName = "WTRC";
		}
	};
	/**
	 * In the context of a corporate action, an International Central Securities
	 * Depository (ICSD) refuses a mark-up/mark-down confirmation sent by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
	 * CorporateActionNarrativeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RFMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICSDRefusalOfMarkUpDownConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the context of  a corporate action, an International Central Securities Depository (ICSD)  refuses a mark-up/mark-down confirmation sent by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmICSDRefusalOfMarkUpDownConfirmation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICSDRefusalOfMarkUpDownConfirmation";
			definition = "In the context of  a corporate action, an International Central Securities Depository (ICSD)  refuses a mark-up/mark-down confirmation sent by the account servicer.";
			owner_lazy = () -> CorporateActionNarrativeCode.mmObject();
			codeName = "RFMC";
		}
	};
	/**
	 * International Central Securities Depository (ICSD) chases the
	 * authorisation from the account servicer in order to process the exchange
	 * from global temporary to global permanent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
	 * CorporateActionNarrativeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChasingOfPriorAuthorization"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Central Securities Depository (ICSD) chases the authorisation from the account servicer in order to process the exchange from global temporary to global permanent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChasingOfPriorAuthorization = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChasingOfPriorAuthorization";
			definition = "International Central Securities Depository (ICSD) chases the authorisation from the account servicer in order to process the exchange from global temporary to global permanent.";
			owner_lazy = () -> CorporateActionNarrativeCode.mmObject();
			codeName = "PAUT";
		}
	};
	/**
	 * Confirmation of transfer of interests between International Central
	 * Securities Depositories (ICSDs) following a corporate actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
	 * CorporateActionNarrativeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationOfHoldingTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of transfer of interests between International Central Securities Depositories (ICSDs) following a corporate actions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConfirmationOfHoldingTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationOfHoldingTransfer";
			definition = "Confirmation of transfer of interests between International Central Securities Depositories (ICSDs) following a corporate actions.";
			owner_lazy = () -> CorporateActionNarrativeCode.mmObject();
			codeName = "CTIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TAXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrativeCode";
				definition = "Standard code to specify the narrative type of a corporate action.";
				code_lazy = () -> Arrays.asList(CorporateActionNarrativeCode.mmTaxationConditions, CorporateActionNarrativeCode.mmRegistrationDetails, CorporateActionNarrativeCode.mmWithholdingTaxReliefCertification,
						CorporateActionNarrativeCode.mmICSDRefusalOfMarkUpDownConfirmation, CorporateActionNarrativeCode.mmChasingOfPriorAuthorization, CorporateActionNarrativeCode.mmConfirmationOfHoldingTransfer);
				derivation_lazy = () -> Arrays.asList(CorporateActionNarrative1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}