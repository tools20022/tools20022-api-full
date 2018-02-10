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
import com.tools20022.repository.codeset.CorporateActionNarrative1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the narrative type of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code#TaxationConditions
 * CorporateActionNarrative1Code.TaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code#RegistrationDetails
 * CorporateActionNarrative1Code.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code#WithholdingTaxReliefCertification
 * CorporateActionNarrative1Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code#ICSDRefusalOfMarkUpDownConfirmation
 * CorporateActionNarrative1Code.ICSDRefusalOfMarkUpDownConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code#ChasingOfPriorAuthorization
 * CorporateActionNarrative1Code.ChasingOfPriorAuthorization}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code#ConfirmationOfHoldingTransfer
 * CorporateActionNarrative1Code.ConfirmationOfHoldingTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrativeCode
 * CorporateActionNarrativeCode}</li>
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
 * "CorporateActionNarrative1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the narrative type of a corporate action."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionNarrative1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
	 * CorporateActionNarrative1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * </ul>
	 */
	public static final CorporateActionNarrative1Code TaxationConditions = new CorporateActionNarrative1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrative1Code.mmObject();
			codeName = CorporateActionNarrativeCode.TaxationConditions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
	 * CorporateActionNarrative1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * </ul>
	 */
	public static final CorporateActionNarrative1Code RegistrationDetails = new CorporateActionNarrative1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrative1Code.mmObject();
			codeName = CorporateActionNarrativeCode.RegistrationDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
	 * CorporateActionNarrative1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionNarrative1Code WithholdingTaxReliefCertification = new CorporateActionNarrative1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrative1Code.mmObject();
			codeName = CorporateActionNarrativeCode.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
	 * CorporateActionNarrative1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICSDRefusalOfMarkUpDownConfirmation"</li>
	 * </ul>
	 */
	public static final CorporateActionNarrative1Code ICSDRefusalOfMarkUpDownConfirmation = new CorporateActionNarrative1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICSDRefusalOfMarkUpDownConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrative1Code.mmObject();
			codeName = CorporateActionNarrativeCode.ICSDRefusalOfMarkUpDownConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
	 * CorporateActionNarrative1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChasingOfPriorAuthorization"</li>
	 * </ul>
	 */
	public static final CorporateActionNarrative1Code ChasingOfPriorAuthorization = new CorporateActionNarrative1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChasingOfPriorAuthorization";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrative1Code.mmObject();
			codeName = CorporateActionNarrativeCode.ChasingOfPriorAuthorization.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNarrative1Code
	 * CorporateActionNarrative1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationOfHoldingTransfer"</li>
	 * </ul>
	 */
	public static final CorporateActionNarrative1Code ConfirmationOfHoldingTransfer = new CorporateActionNarrative1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfHoldingTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNarrative1Code.mmObject();
			codeName = CorporateActionNarrativeCode.ConfirmationOfHoldingTransfer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionNarrative1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionNarrative1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TAXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative1Code";
				definition = "Specifies the narrative type of a corporate action.";
				trace_lazy = () -> CorporateActionNarrativeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionNarrative1Code.TaxationConditions, com.tools20022.repository.codeset.CorporateActionNarrative1Code.RegistrationDetails,
						com.tools20022.repository.codeset.CorporateActionNarrative1Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionNarrative1Code.ICSDRefusalOfMarkUpDownConfirmation,
						com.tools20022.repository.codeset.CorporateActionNarrative1Code.ChasingOfPriorAuthorization, com.tools20022.repository.codeset.CorporateActionNarrative1Code.ConfirmationOfHoldingTransfer);
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

	public static CorporateActionNarrative1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionNarrative1Code[] values() {
		CorporateActionNarrative1Code[] values = new CorporateActionNarrative1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionNarrative1Code> {
		@Override
		public CorporateActionNarrative1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionNarrative1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}