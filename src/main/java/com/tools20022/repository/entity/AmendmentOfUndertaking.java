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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification of an undertaking such as an guarantee or standby letter of
 * credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmendmentOfUndertaking"
 * src="doc-files/AmendmentOfUndertaking.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#DateOfIssuance
 * AmendmentOfUndertaking.DateOfIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#ChangeOfAmount
 * AmendmentOfUndertaking.ChangeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#Undertaking
 * AmendmentOfUndertaking.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#BeneficiaryConsentRequestIndicator
 * AmendmentOfUndertaking.BeneficiaryConsentRequestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#AmendmentIdentification
 * AmendmentOfUndertaking.AmendmentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#UndertakingAmendment
 * Undertaking.UndertakingAmendment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1#UndertakingAmendmentDetails
 * UndertakingAmendmentMessage1.UndertakingAmendmentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#UndertakingAmendmentMessage
 * Amendment2.UndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment6#UndertakingAmendmentMessage
 * Amendment6.UndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1#UndertakingAmendmentResponseDetails
 * UndertakingAmendmentResponseMessage1.UndertakingAmendmentResponseDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment9#UndertakingAmendmentResponseMessage
 * Amendment9.UndertakingAmendmentResponseMessage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1 Amendment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1
 * UndertakingAmendmentMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment2 Amendment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment6 Amendment6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3 Amendment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment8 Amendment8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment7 Amendment7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1
 * UndertakingAmendmentResponseMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment9 Amendment9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmendmentOfUndertaking"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification of an undertaking such as an guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class AmendmentOfUndertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date the amendment is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#DateOfIssuance
	 * Amendment1.DateOfIssuance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the amendment is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DateOfIssuance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment1.DateOfIssuance);
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateOfIssuance";
			definition = "Date the amendment is issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Decrease (negative) or increase (positive) of the undertaking as a result
	 * of the amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Amount1Choice#IncreaseAmount
	 * Amount1Choice.IncreaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Amount1Choice#DecreaseAmount
	 * Amount1Choice.DecreaseAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeOfAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decrease (negative) or increase (positive) of the undertaking as a result of the amendment. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChangeOfAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Amount1Choice.IncreaseAmount, com.tools20022.repository.choice.Amount1Choice.DecreaseAmount);
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeOfAmount";
			definition = "Decrease (negative) or increase (positive) of the undertaking as a result of the amendment. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Contents of an UndertakingAmendmentResponse message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#UndertakingAmendment
	 * Undertaking.UndertakingAmendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#LocalUndertaking
	 * Amendment1.LocalUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment2#ConfirmationDetails
	 * Amendment2.ConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#UndertakingIdentification
	 * Amendment3.UndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#CounterUndertaking
	 * Amendment3.CounterUndertaking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of an UndertakingAmendmentResponse message."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment1.LocalUndertaking, com.tools20022.repository.msg.Amendment2.ConfirmationDetails, com.tools20022.repository.msg.Amendment3.UndertakingIdentification,
					com.tools20022.repository.msg.Amendment3.CounterUndertaking);
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Contents of an UndertakingAmendmentResponse message.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.UndertakingAmendment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether or not a request for consent is required from the
	 * beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#BeneficiaryConsentRequestIndicator
	 * Amendment1.BeneficiaryConsentRequestIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryConsentRequestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not a request for consent is required from the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficiaryConsentRequestIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment1.BeneficiaryConsentRequestIndicator);
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryConsentRequestIndicator";
			definition = "Indicates whether or not a request for consent is required from the beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identification of the amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment8#Identification
	 * Amendment8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment7#AmendmentIdentification
	 * Amendment7.AmendmentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the amendment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmendmentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment8.Identification, com.tools20022.repository.msg.Amendment7.AmendmentIdentification);
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmendmentIdentification";
			definition = "Identification of the amendment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmendmentOfUndertaking";
				definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.UndertakingAmendment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingAmendmentMessage1.UndertakingAmendmentDetails, com.tools20022.repository.msg.Amendment2.UndertakingAmendmentMessage,
						com.tools20022.repository.msg.Amendment6.UndertakingAmendmentMessage, com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1.UndertakingAmendmentResponseDetails,
						com.tools20022.repository.msg.Amendment9.UndertakingAmendmentResponseMessage);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmendmentOfUndertaking.DateOfIssuance, com.tools20022.repository.entity.AmendmentOfUndertaking.ChangeOfAmount,
						com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking, com.tools20022.repository.entity.AmendmentOfUndertaking.BeneficiaryConsentRequestIndicator,
						com.tools20022.repository.entity.AmendmentOfUndertaking.AmendmentIdentification);
				derivationComponent_lazy = () -> Arrays.asList(Amendment1.mmObject(), UndertakingAmendmentMessage1.mmObject(), Amendment2.mmObject(), Amendment6.mmObject(), Amendment3.mmObject(), Amendment8.mmObject(),
						Amendment7.mmObject(), UndertakingAmendmentResponseMessage1.mmObject(), Amendment9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}