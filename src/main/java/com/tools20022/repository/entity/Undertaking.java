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
import com.tools20022.repository.choice.UndertakingType1Choice;
import com.tools20022.repository.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.codeset.ExternalUndertakingTypeCode;
import com.tools20022.repository.codeset.UndertakingNameCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be collected on the
 * presentation of documents that comply with its terms and conditions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Undertaking" src="doc-files/Undertaking.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#ElectronicSignature
 * Undertaking.ElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#UndertakingStatus
 * Undertaking.UndertakingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Identification
 * Undertaking.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Demand
 * Undertaking.Demand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#TerminationDate
 * Undertaking.TerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#UndertakingAmount
 * Undertaking.UndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Expiry
 * Undertaking.Expiry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#PartyRole
 * Undertaking.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#UndertakingAmendment
 * Undertaking.UndertakingAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#SpecifiedDocument
 * Undertaking.SpecifiedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#DateOfAdvice
 * Undertaking.DateOfAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Purpose
 * Undertaking.Purpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#UndertakingName
 * Undertaking.UndertakingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Type
 * Undertaking.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#ConfirmationIndicator
 * Undertaking.ConfirmationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#CounterUndertakingIndicator
 * Undertaking.CounterUndertakingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#RelatedChargesPayableBy
 * Undertaking.RelatedChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#StandardClaimDocumentIndicator
 * Undertaking.StandardClaimDocumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#UnderlyingTransaction
 * Undertaking.UnderlyingTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#ModelForm
 * Undertaking.ModelForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#MultipleDemandIndicator
 * Undertaking.MultipleDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#PartialDemandIndicator
 * Undertaking.PartialDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#TransferIndicator
 * Undertaking.TransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#PredefinedVariation
 * Undertaking.PredefinedVariation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Charges
 * Undertaking.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Presentation
 * Undertaking.Presentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#UndertakingExtension
 * Undertaking.UndertakingExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedUndertaking
 * Charges.RelatedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#Undertaking
 * ElectronicSignature.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#PresentedUndertaking
 * Presentation.PresentedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#Undertaking
 * UndertakingStatus.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole#Undertaking
 * UndertakingPartyRole.Undertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#Undertaking
 * Demand.Undertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#Undertaking
 * Expiry.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#Undertaking
 * UndertakingDocument.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#Undertaking
 * AmendmentOfUndertaking.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#Undertaking
 * UndertakingAmount.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#Undertaking
 * UndertakingExtension.Undertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#Undertaking
 * ModelForm.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#Undertaking
 * UnderlyingTransaction.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#Undertaking
 * AutomaticVariation.Undertaking}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#UndertakingIdentification
 * ExtendOrPayQuery1.UndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#CounterUndertaking
 * Undertaking1.CounterUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#UndertakingIdentification
 * Demand1.UndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage#UndertakingDetails
 * UndertakingIssuanceMessage.UndertakingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#UndertakingIssuanceMessage
 * UndertakingAdvice1.UndertakingIssuanceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#UndertakingIssuanceMessage
 * UndertakingAdvice2.UndertakingIssuanceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionRequest1#UndertakingIdentification
 * UndertakingNonExtensionRequest1.UndertakingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking9 Undertaking9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking6 Undertaking6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
 * ExtendOrPayQuery1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking7 Undertaking7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
 * UndertakingConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking10 Undertaking10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UndertakingType1Choice
 * UndertakingType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage
 * UndertakingIssuanceMessage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAdvice1
 * UndertakingAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAdvice2
 * UndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionRequest1
 * UndertakingNonExtensionRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking8 Undertaking8}</li>
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
 * "Undertaking"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions."
 * </li>
 * </ul>
 */
public class Undertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#Undertaking
	 * ElectronicSignature.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature1#Signature
	 * PartyAndSignature1.Signature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1#DigitalSignature
	 * UndertakingAmendmentMessage1.DigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment2#DigitalSignature
	 * Amendment2.DigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1#DigitalSignature
	 * UndertakingAmendmentResponseMessage1.DigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage#DigitalSignature
	 * UndertakingIssuanceMessage.DigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#DigitalSignature
	 * UndertakingAdvice1.DigitalSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ElectronicSignature = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndSignature1.Signature, com.tools20022.repository.msg.UndertakingAmendmentMessage1.DigitalSignature,
					com.tools20022.repository.msg.Amendment2.DigitalSignature, com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1.DigitalSignature, com.tools20022.repository.msg.UndertakingIssuanceMessage.DigitalSignature,
					com.tools20022.repository.msg.UndertakingAdvice1.DigitalSignature);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Digital signature.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#Undertaking
	 * UndertakingStatus.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#TerminationDetails
	 * Amendment1.TerminationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#TerminationDetails
	 * Amendment3.TerminationDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment7#AmendmentStatus
	 * Amendment7.AmendmentStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UndertakingStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment1.TerminationDetails, com.tools20022.repository.msg.Amendment3.TerminationDetails, com.tools20022.repository.msg.Amendment7.AmendmentStatus);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status of the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identifier assigned to the undertaking issued by
	 * the guarantor/issuer. This reference is used throughout the life cycle of
	 * the undertaking.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking9#Identification
	 * Undertaking9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking6#Identification
	 * Undertaking6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking7#Identification
	 * Undertaking7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#UndertakingIdentification
	 * Amendment1.UndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#Identification
	 * Undertaking3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking8#Identification
	 * Undertaking8.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking9.Identification, com.tools20022.repository.msg.Undertaking6.Identification, com.tools20022.repository.msg.Undertaking7.Identification,
					com.tools20022.repository.msg.Amendment1.UndertakingIdentification, com.tools20022.repository.msg.Undertaking3.Identification, com.tools20022.repository.msg.Undertaking8.Identification);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Document signed by the beneficiary demanding payment under a demand
	 * guarantee or standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#Undertaking
	 * Demand.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#DemandDetails
	 * DemandRefusal1.DemandDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#DemandDetails
	 * ExtendOrPayQuery1.DemandDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#DemandDetails
	 * ExtendOrPayQuery2.DemandDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Demand = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DemandRefusal1.DemandDetails, com.tools20022.repository.msg.ExtendOrPayQuery1.DemandDetails, com.tools20022.repository.msg.ExtendOrPayQuery2.DemandDetails);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date when the undertaking terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3#EffectiveDate
	 * UndertakingTermination3.EffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the undertaking terminates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TerminationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingTermination3.EffectiveDate);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationDate";
			definition = "Date when the undertaking terminates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#Undertaking
	 * UndertakingAmount.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#NewUndertakingAmount
	 * Undertaking11.NewUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#UndertakingAmountAdjustment
	 * Amendment1.UndertakingAmountAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking10#NewUndertakingAmount
	 * Undertaking10.NewUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#IncreaseDecreaseAmount
	 * Amendment3.IncreaseDecreaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#CounterUndertakingAmount
	 * Undertaking2.CounterUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#UndertakingAmount
	 * Undertaking1.UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#LocalUndertakingAmount
	 * Undertaking4.LocalUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#UndertakingAmount
	 * Undertaking3.UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#PaymentObligationAmount
	 * PaymentObligation2.PaymentObligationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UndertakingAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking11.NewUndertakingAmount, com.tools20022.repository.msg.Amendment1.UndertakingAmountAdjustment,
					com.tools20022.repository.msg.Undertaking10.NewUndertakingAmount, com.tools20022.repository.msg.Amendment3.IncreaseDecreaseAmount, com.tools20022.repository.msg.Undertaking2.CounterUndertakingAmount,
					com.tools20022.repository.msg.Undertaking1.UndertakingAmount, com.tools20022.repository.msg.Undertaking4.LocalUndertakingAmount, com.tools20022.repository.msg.Undertaking3.UndertakingAmount,
					com.tools20022.repository.msg.PaymentObligation2.PaymentObligationAmount);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmount";
			definition = "Amount of the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Expiry information about the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#Undertaking
	 * Expiry.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Expiry Expiry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ExpiryDetails1#ExpiryTerms
	 * ExpiryDetails1.ExpiryTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#NewExpiryDetails
	 * Undertaking11.NewExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#NewExpiryDetails
	 * Amendment1.NewExpiryDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExpiryDetails2#ExpiryTerms
	 * ExpiryDetails2.ExpiryTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking10#NewExpiryDetails
	 * Undertaking10.NewExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#NewExpiryDetails
	 * Amendment3.NewExpiryDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#ExpiryDetails
	 * Undertaking2.ExpiryDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#ExpiryDetails
	 * Undertaking1.ExpiryDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#ExpiryDetails
	 * Undertaking4.ExpiryDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#ExpiryDetails
	 * Undertaking3.ExpiryDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expiry information about the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Expiry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpiryDetails1.ExpiryTerms, com.tools20022.repository.msg.Undertaking11.NewExpiryDetails, com.tools20022.repository.msg.Amendment1.NewExpiryDetails,
					com.tools20022.repository.msg.ExpiryDetails2.ExpiryTerms, com.tools20022.repository.msg.Undertaking10.NewExpiryDetails, com.tools20022.repository.msg.Amendment3.NewExpiryDetails,
					com.tools20022.repository.msg.Undertaking2.ExpiryDetails, com.tools20022.repository.msg.Undertaking1.ExpiryDetails, com.tools20022.repository.msg.Undertaking4.ExpiryDetails,
					com.tools20022.repository.msg.Undertaking3.ExpiryDetails);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expiry";
			definition = "Expiry information about the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Expiry.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of an undertaking or in the context
	 * of the business linked to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole#Undertaking
	 * UndertakingPartyRole.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole
	 * UndertakingPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#AdditionalParty
	 * Undertaking1.AdditionalParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#AdditionalParty
	 * Undertaking4.AdditionalParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#AdditionalParty
	 * Undertaking3.AdditionalParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.AdditionalParty, com.tools20022.repository.msg.Undertaking4.AdditionalParty, com.tools20022.repository.msg.Undertaking3.AdditionalParty);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UndertakingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingPartyRole.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Modification of an undertaking such as an guarantee or standby letter of
	 * credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#Undertaking
	 * AmendmentOfUndertaking.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of an undertaking such as an guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UndertakingAmendment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmendment";
			definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmendmentOfUndertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#Undertaking
	 * UndertakingDocument.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#EnclosedFile
	 * Amendment1.EnclosedFile}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#EnclosedFile
	 * Amendment3.EnclosedFile}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trigger1#DocumentaryEvent
	 * Trigger1.DocumentaryEvent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#EnclosedFile
	 * Undertaking1.EnclosedFile}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#EnclosedFile
	 * Undertaking3.EnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#EnclosedFile
	 * UndertakingAdvice2.EnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#EnclosedFile
	 * UndertakingStatusAdvice1.EnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#EnclosedFile
	 * UndertakingTerminationNotice1.EnclosedFile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SpecifiedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment1.EnclosedFile, com.tools20022.repository.msg.Amendment3.EnclosedFile, com.tools20022.repository.msg.Trigger1.DocumentaryEvent,
					com.tools20022.repository.msg.Undertaking1.EnclosedFile, com.tools20022.repository.msg.Undertaking3.EnclosedFile, com.tools20022.repository.msg.UndertakingAdvice2.EnclosedFile,
					com.tools20022.repository.msg.UndertakingStatusAdvice1.EnclosedFile, com.tools20022.repository.msg.UndertakingTerminationNotice1.EnclosedFile);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecifiedDocument";
			definition = "Document related to the undertaking.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> UndertakingDocument.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the undertaking or its amendment is advised.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#Date
	 * UndertakingConfirmation1.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the undertaking or its amendment is advised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DateOfAdvice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingConfirmation1.Date);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateOfAdvice";
			definition = "Date on which the undertaking or its amendment is advised.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Description of the purpose of the undertaking.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#Purpose
	 * Undertaking1.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the purpose of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.Purpose);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Description of the purpose of the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name of undertaking such as, demand guarantee, standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode
	 * UndertakingNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#Name
	 * Undertaking2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#Name
	 * Undertaking1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#Name
	 * Undertaking4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#Name
	 * Undertaking3.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of undertaking such as, demand guarantee, standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UndertakingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking2.Name, com.tools20022.repository.msg.Undertaking1.Name, com.tools20022.repository.msg.Undertaking4.Name,
					com.tools20022.repository.msg.Undertaking3.Name);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingName";
			definition = "Name of undertaking such as, demand guarantee, standby letter of credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UndertakingNameCode.mmObject();
		}
	};
	/**
	 * Type of guarantee or standby letter of credit, for example, performance,
	 * payment, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingTypeCode
	 * ExternalUndertakingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingType1Choice#Code
	 * UndertakingType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingType1Choice#Proprietary
	 * UndertakingType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#Type
	 * Undertaking1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#Type
	 * Undertaking4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#Type
	 * Undertaking3.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of guarantee or standby letter of credit, for example, performance,  payment, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UndertakingType1Choice.Code, com.tools20022.repository.choice.UndertakingType1Choice.Proprietary, com.tools20022.repository.msg.Undertaking1.Type,
					com.tools20022.repository.msg.Undertaking4.Type, com.tools20022.repository.msg.Undertaking3.Type);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of guarantee or standby letter of credit, for example, performance,  payment, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the advising bank (confirmer) is requested to add its
	 * confirmation to the undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#ConfirmationIndicator
	 * Undertaking1.ConfirmationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#ConfirmationIndicator
	 * Undertaking4.ConfirmationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#ConfirmationIndicator
	 * Undertaking3.ConfirmationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConfirmationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.ConfirmationIndicator, com.tools20022.repository.msg.Undertaking4.ConfirmationIndicator,
					com.tools20022.repository.msg.Undertaking3.ConfirmationIndicator);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the undertaking is a counter-undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#CounterUndertakingIndicator
	 * Undertaking1.CounterUndertakingIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the undertaking is a counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CounterUndertakingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.CounterUndertakingIndicator);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterUndertakingIndicator";
			definition = "Indicates whether the undertaking is a counter-undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the applicant/obligor or beneficiary is responsible for
	 * payment of the charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfPartyCode
	 * ExternalTypeOfPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#ConfirmationChargesPayableBy
	 * Undertaking2.ConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#TransferChargesPayableBy
	 * Undertaking1.TransferChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#ConfirmationChargesPayableBy
	 * Undertaking1.ConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#ConfirmationChargesPayableBy
	 * Undertaking4.ConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#TransferChargesPayableBy
	 * Undertaking4.TransferChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#ConfirmationChargesPayableBy
	 * Undertaking3.ConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#TransferChargesPayableBy
	 * Undertaking3.TransferChargesPayableBy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelatedChargesPayableBy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking2.ConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking1.TransferChargesPayableBy,
					com.tools20022.repository.msg.Undertaking1.ConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking4.ConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking4.TransferChargesPayableBy,
					com.tools20022.repository.msg.Undertaking3.ConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking3.TransferChargesPayableBy);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalTypeOfPartyCode.mmObject();
		}
	};
	/**
	 * Indication as to whether a claim is to utilise a standard claim form of
	 * the issuing institution.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#StandardClaimDocumentIndicator
	 * Undertaking2.StandardClaimDocumentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardClaimDocumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether a claim is to utilise a standard claim form of the issuing institution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StandardClaimDocumentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking2.StandardClaimDocumentIndicator);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandardClaimDocumentIndicator";
			definition = "Indication as to whether a claim is to utilise a standard claim form of the issuing institution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Reference information on a commercial obligation between the beneficiary
	 * and applicant for which an undertaking is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#Undertaking
	 * UnderlyingTransaction.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#UnderlyingTransaction
	 * Undertaking1.UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#UnderlyingTransaction
	 * Undertaking4.UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#UnderlyingTransaction
	 * Undertaking3.UnderlyingTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.UnderlyingTransaction, com.tools20022.repository.msg.Undertaking4.UnderlyingTransaction,
					com.tools20022.repository.msg.Undertaking3.UnderlyingTransaction);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingTransaction";
			definition = "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Wording template for the undertaking content made available for use with
	 * certain governance rules or made available by particular institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#Undertaking
	 * ModelForm.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ModelForm ModelForm}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#UndertakingWording
	 * Undertaking1.UndertakingWording}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#UndertakingWording
	 * Undertaking4.UndertakingWording}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ModelForm = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.UndertakingWording, com.tools20022.repository.msg.Undertaking4.UndertakingWording);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. ";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ModelForm.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether multiple demands are permitted against the undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#MultipleDemandIndicator
	 * Undertaking1.MultipleDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#MultipleDemandIndicator
	 * Undertaking4.MultipleDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#MultipleDemandIndicator
	 * Undertaking3.MultipleDemandIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether multiple demands are permitted against the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MultipleDemandIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.MultipleDemandIndicator, com.tools20022.repository.msg.Undertaking4.MultipleDemandIndicator,
					com.tools20022.repository.msg.Undertaking3.MultipleDemandIndicator);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates whether multiple demands are permitted against the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether partial demands/drawings are permitted against the
	 * undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#PartialDemandIndicator
	 * Undertaking1.PartialDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#PartialDemandIndicator
	 * Undertaking4.PartialDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#PartialDemandIndicator
	 * Undertaking3.PartialDemandIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether partial demands/drawings are permitted against the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialDemandIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.PartialDemandIndicator, com.tools20022.repository.msg.Undertaking4.PartialDemandIndicator,
					com.tools20022.repository.msg.Undertaking3.PartialDemandIndicator);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates whether partial demands/drawings are permitted against the undertaking.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the undertaking is transferrable.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#TransferIndicator
	 * Undertaking1.TransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#TransferIndicator
	 * Undertaking4.TransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#TransferIndicator
	 * Undertaking3.TransferIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the undertaking is transferrable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.TransferIndicator, com.tools20022.repository.msg.Undertaking4.TransferIndicator, com.tools20022.repository.msg.Undertaking3.TransferIndicator);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferrable.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Changes that may be made to the undertaking covered by clauses in the
	 * existing undertaking and its amendments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#Undertaking
	 * AutomaticVariation.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#AutomaticAmountVariation
	 * Undertaking1.AutomaticAmountVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#AutomaticAmountVariation
	 * Undertaking4.AutomaticAmountVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#AutomaticAmountVariation
	 * Undertaking3.AutomaticAmountVariation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PredefinedVariation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PredefinedVariation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.AutomaticAmountVariation, com.tools20022.repository.msg.Undertaking4.AutomaticAmountVariation,
					com.tools20022.repository.msg.Undertaking3.AutomaticAmountVariation);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PredefinedVariation";
			definition = "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AutomaticVariation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount and currency of the commissions and changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#RelatedUndertaking
	 * Charges.RelatedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount and currency of the commissions and changes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Amount and currency of the commissions and changes.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.RelatedUndertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Presentation information related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#PresentedUndertaking
	 * Presentation.PresentedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#PresentationDetails
	 * Undertaking1.PresentationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Demand1#PresentationDetails
	 * Demand1.PresentationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#PresentationDetails
	 * Undertaking4.PresentationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#PresentationDetails
	 * Undertaking3.PresentationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation information related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Presentation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.PresentationDetails, com.tools20022.repository.msg.Demand1.PresentationDetails, com.tools20022.repository.msg.Undertaking4.PresentationDetails,
					com.tools20022.repository.msg.Undertaking3.PresentationDetails);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation information related to the undertaking.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.PresentedUndertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies information related to the extension of an undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#Undertaking
	 * UndertakingExtension.Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ExpiryTerms1#AutoExtension
	 * ExpiryTerms1.AutoExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information related to the extension of an undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UndertakingExtension = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpiryTerms1.AutoExtension);
			elementContext_lazy = () -> Undertaking.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingExtension";
			definition = "Specifies information related to the extension of an undertaking.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Undertaking";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.RelatedUndertaking, com.tools20022.repository.entity.ElectronicSignature.Undertaking,
						com.tools20022.repository.entity.Presentation.PresentedUndertaking, com.tools20022.repository.entity.UndertakingStatus.Undertaking, com.tools20022.repository.entity.UndertakingPartyRole.Undertaking,
						com.tools20022.repository.entity.Demand.Undertaking, com.tools20022.repository.entity.Expiry.Undertaking, com.tools20022.repository.entity.UndertakingDocument.Undertaking,
						com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking, com.tools20022.repository.entity.UndertakingAmount.Undertaking, com.tools20022.repository.entity.UndertakingExtension.Undertaking,
						com.tools20022.repository.entity.ModelForm.Undertaking, com.tools20022.repository.entity.UnderlyingTransaction.Undertaking, com.tools20022.repository.entity.AutomaticVariation.Undertaking);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExtendOrPayQuery1.UndertakingIdentification, com.tools20022.repository.msg.Undertaking1.CounterUndertaking,
						com.tools20022.repository.msg.Demand1.UndertakingIdentification, com.tools20022.repository.msg.UndertakingIssuanceMessage.UndertakingDetails,
						com.tools20022.repository.msg.UndertakingAdvice1.UndertakingIssuanceMessage, com.tools20022.repository.msg.UndertakingAdvice2.UndertakingIssuanceMessage,
						com.tools20022.repository.msg.UndertakingNonExtensionRequest1.UndertakingIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.ElectronicSignature, com.tools20022.repository.entity.Undertaking.UndertakingStatus,
						com.tools20022.repository.entity.Undertaking.Identification, com.tools20022.repository.entity.Undertaking.Demand, com.tools20022.repository.entity.Undertaking.TerminationDate,
						com.tools20022.repository.entity.Undertaking.UndertakingAmount, com.tools20022.repository.entity.Undertaking.Expiry, com.tools20022.repository.entity.Undertaking.PartyRole,
						com.tools20022.repository.entity.Undertaking.UndertakingAmendment, com.tools20022.repository.entity.Undertaking.SpecifiedDocument, com.tools20022.repository.entity.Undertaking.DateOfAdvice,
						com.tools20022.repository.entity.Undertaking.Purpose, com.tools20022.repository.entity.Undertaking.UndertakingName, com.tools20022.repository.entity.Undertaking.Type,
						com.tools20022.repository.entity.Undertaking.ConfirmationIndicator, com.tools20022.repository.entity.Undertaking.CounterUndertakingIndicator, com.tools20022.repository.entity.Undertaking.RelatedChargesPayableBy,
						com.tools20022.repository.entity.Undertaking.StandardClaimDocumentIndicator, com.tools20022.repository.entity.Undertaking.UnderlyingTransaction, com.tools20022.repository.entity.Undertaking.ModelForm,
						com.tools20022.repository.entity.Undertaking.MultipleDemandIndicator, com.tools20022.repository.entity.Undertaking.PartialDemandIndicator, com.tools20022.repository.entity.Undertaking.TransferIndicator,
						com.tools20022.repository.entity.Undertaking.PredefinedVariation, com.tools20022.repository.entity.Undertaking.Charges, com.tools20022.repository.entity.Undertaking.Presentation,
						com.tools20022.repository.entity.Undertaking.UndertakingExtension);
				derivationComponent_lazy = () -> Arrays.asList(Undertaking9.mmObject(), Undertaking6.mmObject(), ExtendOrPayQuery1.mmObject(), Undertaking7.mmObject(), Undertaking11.mmObject(), UndertakingConfirmation1.mmObject(),
						Undertaking10.mmObject(), UndertakingType1Choice.mmObject(), Undertaking2.mmObject(), Undertaking1.mmObject(), Undertaking4.mmObject(), Undertaking3.mmObject(), UndertakingIssuanceMessage.mmObject(),
						UndertakingAdvice1.mmObject(), UndertakingAdvice2.mmObject(), UndertakingNonExtensionRequest1.mmObject(), Undertaking8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}