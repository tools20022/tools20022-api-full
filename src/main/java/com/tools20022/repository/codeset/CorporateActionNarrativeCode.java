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
import com.tools20022.repository.codeset.CorporateActionNarrativeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Standard code to specify the narrative type of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#TaxationConditions
 * CorporateActionNarrativeCode.TaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#RegistrationDetails
 * CorporateActionNarrativeCode.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#WithholdingTaxReliefCertification
 * CorporateActionNarrativeCode.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#ICSDRefusalOfMarkUpDownConfirmation
 * CorporateActionNarrativeCode.ICSDRefusalOfMarkUpDownConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#ChasingOfPriorAuthorization
 * CorporateActionNarrativeCode.ChasingOfPriorAuthorization}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode#ConfirmationOfHoldingTransfer
 * CorporateActionNarrativeCode.ConfirmationOfHoldingTransfer}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionNarrativeCode extends MMCode {

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
	public static final CorporateActionNarrativeCode TaxationConditions = new CorporateActionNarrativeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrativeCode.mmObject();
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
	public static final CorporateActionNarrativeCode RegistrationDetails = new CorporateActionNarrativeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrativeCode.mmObject();
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
	public static final CorporateActionNarrativeCode WithholdingTaxReliefCertification = new CorporateActionNarrativeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxReliefCertification";
			definition = "Certification process for withholding tax reduction or exemption based on the tax status of the holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrativeCode.mmObject();
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
	 * "In the context of a corporate action, an International Central Securities Depository (ICSD) refuses a mark-up/mark-down confirmation sent by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionNarrativeCode ICSDRefusalOfMarkUpDownConfirmation = new CorporateActionNarrativeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICSDRefusalOfMarkUpDownConfirmation";
			definition = "In the context of a corporate action, an International Central Securities Depository (ICSD) refuses a mark-up/mark-down confirmation sent by the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrativeCode.mmObject();
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
	public static final CorporateActionNarrativeCode ChasingOfPriorAuthorization = new CorporateActionNarrativeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChasingOfPriorAuthorization";
			definition = "International Central Securities Depository (ICSD) chases the authorisation from the account servicer in order to process the exchange from global temporary to global permanent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrativeCode.mmObject();
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
	public static final CorporateActionNarrativeCode ConfirmationOfHoldingTransfer = new CorporateActionNarrativeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationOfHoldingTransfer";
			definition = "Confirmation of transfer of interests between International Central Securities Depositories (ICSDs) following a corporate actions.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrativeCode.mmObject();
			codeName = "CTIN";
		}
	};
	final static private LinkedHashMap<String, CorporateActionNarrativeCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionNarrativeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TAXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrativeCode";
				definition = "Standard code to specify the narrative type of a corporate action.";
				derivation_lazy = () -> Arrays.asList(CorporateActionNarrative1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionNarrativeCode.TaxationConditions, com.tools20022.repository.codeset.CorporateActionNarrativeCode.RegistrationDetails,
						com.tools20022.repository.codeset.CorporateActionNarrativeCode.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionNarrativeCode.ICSDRefusalOfMarkUpDownConfirmation,
						com.tools20022.repository.codeset.CorporateActionNarrativeCode.ChasingOfPriorAuthorization, com.tools20022.repository.codeset.CorporateActionNarrativeCode.ConfirmationOfHoldingTransfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TaxationConditions.getCodeName().get(), TaxationConditions);
		codesByName.put(RegistrationDetails.getCodeName().get(), RegistrationDetails);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(ICSDRefusalOfMarkUpDownConfirmation.getCodeName().get(), ICSDRefusalOfMarkUpDownConfirmation);
		codesByName.put(ChasingOfPriorAuthorization.getCodeName().get(), ChasingOfPriorAuthorization);
		codesByName.put(ConfirmationOfHoldingTransfer.getCodeName().get(), ConfirmationOfHoldingTransfer);
	}

	public static CorporateActionNarrativeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionNarrativeCode[] values() {
		CorporateActionNarrativeCode[] values = new CorporateActionNarrativeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionNarrativeCode> {
		@Override
		public CorporateActionNarrativeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionNarrativeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}