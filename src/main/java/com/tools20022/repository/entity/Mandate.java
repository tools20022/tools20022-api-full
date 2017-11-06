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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Authorisation given by an issuing party to a holder party to act on the
 * issuer's behalf.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Mandate" src="doc-files/Mandate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#mmSignatureConditions
 * Mandate.mmSignatureConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
 * Mandate.mmMandateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
 * Mandate.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
 * Mandate.mmAmendment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmMandatePartyRole
 * Mandate.mmMandatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmMandateStatus
 * Mandate.mmMandateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAccountContract
 * Mandate.mmAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAuthentication
 * Mandate.mmAuthentication}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmTrackingDays
 * Mandate.mmTrackingDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmTrackingIndicator
 * Mandate.mmTrackingIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmRate
 * Mandate.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountMandate
 * CashAccountMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PowerOfAttorney
 * PowerOfAttorney}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountAuthorisation
 * AccountContract.mmAccountAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmMandate
 * SignatureCondition.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandatePartyRole#mmMandate
 * MandatePartyRole.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
 * Mandate.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
 * Mandate.mmAmendment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus#mmMandate
 * MandateStatus.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmMandate
 * Authentication.mmMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#mmOriginalMandate
 * MandateAmendment1.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment2#mmOriginalMandate
 * MandateAmendment2.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmOriginalMandate
 * MandateAmendment3.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmOriginalMandate
 * MandateAmendment4.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmOriginalMandate
 * MandateAmendment5.mmOriginalMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateTypeInformation1
 * MandateTypeInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate1Choice
 * OriginalMandate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate2Choice
 * OriginalMandate2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment1
 * MandateAmendment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment2
 * MandateAmendment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment3
 * MandateAmendment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment4
 * MandateAmendment4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate3Choice
 * OriginalMandate3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5
 * MandateAmendment5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateTypeInformation2
 * MandateTypeInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate4Choice
 * OriginalMandate4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate5Choice
 * OriginalMandate5Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Mandate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Authorisation given by an issuing party to a holder party to act on the issuer's behalf."
 * </li>
 * </ul>
 */
public class Mandate extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SignatureCondition> signatureConditions;
	/**
	 * Specifies the signature requirements related to the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmMandate
	 * SignatureCondition.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1#mmRequiredSignatureNumber
	 * OperationMandate1.mmRequiredSignatureNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the signature requirements related to the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSignatureConditions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OperationMandate1.mmRequiredSignatureNumber);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureConditions";
			definition = "Specifies the signature requirements related to the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
		}
	};
	protected Max35Text mandateIdentification;
	/**
	 * Unique and unambiguous identification of the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmMandateIdentification
	 * TransactionReferences1.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalMandateIdentification
	 * AmendmentInformationDetails1.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmMandateIdentification
	 * MandateRelatedInformation1.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails6#mmOriginalMandateIdentification
	 * AmendmentInformationDetails6.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmMandateIdentification
	 * MandateRelatedInformation6.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails7#mmOriginalMandateIdentification
	 * AmendmentInformationDetails7.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmMandateIdentification
	 * MandateRelatedInformation7.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalMandateIdentification
	 * AmendmentInformationDetails8.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmMandateIdentification
	 * MandateRelatedInformation8.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate1Choice#mmOriginalMandateIdentification
	 * OriginalMandate1Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate2Choice#mmOriginalMandateIdentification
	 * OriginalMandate2Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9#mmOriginalMandateIdentification
	 * AmendmentInformationDetails9.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmMandateIdentification
	 * MandateRelatedInformation9.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDirectDebitMandateIdentification
	 * PaymentTerms3.mmDirectDebitMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails4#mmOriginalMandateIdentification
	 * AmendmentInformationDetails4.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#mmMandateIdentification
	 * MandateRelatedInformation4.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalMandateIdentification
	 * AmendmentInformationDetails5.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmMandateIdentification
	 * MandateRelatedInformation5.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmMandateIdentification
	 * TransactionReferences4.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalMandateIdentification
	 * AmendmentInformationDetails10.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice#mmOriginalMandateIdentification
	 * OriginalMandate3Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmMandateIdentification
	 * MandateRelatedInformation10.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#mmOriginalMandateIdentification
	 * OriginalMandate4Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmMandateIdentification
	 * MandateRelatedInformation11.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#mmOriginalMandateIdentification
	 * OriginalMandate5Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalMandateIdentification
	 * AmendmentInformationDetails11.mmOriginalMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMandateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences1.mmMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalMandateIdentification,
					com.tools20022.repository.msg.MandateRelatedInformation1.mmMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails6.mmOriginalMandateIdentification,
					com.tools20022.repository.msg.MandateRelatedInformation6.mmMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails7.mmOriginalMandateIdentification,
					com.tools20022.repository.msg.MandateRelatedInformation7.mmMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalMandateIdentification,
					com.tools20022.repository.msg.MandateRelatedInformation8.mmMandateIdentification, com.tools20022.repository.choice.OriginalMandate1Choice.mmOriginalMandateIdentification,
					com.tools20022.repository.choice.OriginalMandate2Choice.mmOriginalMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails9.mmOriginalMandateIdentification,
					com.tools20022.repository.msg.MandateRelatedInformation9.mmMandateIdentification, com.tools20022.repository.msg.PaymentTerms3.mmDirectDebitMandateIdentification,
					com.tools20022.repository.msg.AmendmentInformationDetails4.mmOriginalMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation4.mmMandateIdentification,
					com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation5.mmMandateIdentification,
					com.tools20022.repository.msg.TransactionReferences4.mmMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalMandateIdentification,
					com.tools20022.repository.choice.OriginalMandate3Choice.mmOriginalMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation10.mmMandateIdentification,
					com.tools20022.repository.choice.OriginalMandate4Choice.mmOriginalMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation11.mmMandateIdentification,
					com.tools20022.repository.choice.OriginalMandate5Choice.mmOriginalMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalMandateIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateIdentification";
			definition = "Unique and unambiguous identification of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Mandate originalMandate;
	/**
	 * Mandate which is amended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
	 * Mandate.mmAmendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance1#mmOriginalMandate
	 * MandateAcceptance1.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance2#mmOriginalMandate
	 * MandateAcceptance2.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance3#mmOriginalMandate
	 * MandateAcceptance3.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmOriginalMandate
	 * MandateAcceptance4.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmOriginalMandate
	 * MandateAcceptance5.mmOriginalMandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate which is amended."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOriginalMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance1.mmOriginalMandate, com.tools20022.repository.msg.MandateAcceptance2.mmOriginalMandate,
					com.tools20022.repository.msg.MandateAcceptance3.mmOriginalMandate, com.tools20022.repository.msg.MandateAcceptance4.mmOriginalMandate, com.tools20022.repository.msg.MandateAcceptance5.mmOriginalMandate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalMandate";
			definition = "Mandate which is amended.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmAmendment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected Mandate amendment;
	/**
	 * Improvement on a mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
	 * Mandate.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmAmendmentIndicator
	 * MandateRelatedInformation1.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmAmendmentIndicator
	 * MandateRelatedInformation6.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmAmendmentIndicator
	 * MandateRelatedInformation7.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmAmendmentIndicator
	 * MandateRelatedInformation8.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmAmendmentIndicator
	 * MandateRelatedInformation9.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#mmAmendmentIndicator
	 * MandateRelatedInformation4.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmAmendmentIndicator
	 * MandateRelatedInformation5.mmAmendmentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmAmendmentIndicator
	 * MandateRelatedInformation10.mmAmendmentIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmAdjustment
	 * Mandate10.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmAdjustment
	 * Mandate9.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentIndicator
	 * MandateRelatedInformation11.mmAmendmentIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmAdjustment
	 * Mandate11.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmAdjustment
	 * Mandate8.mmAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Improvement on a mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAmendment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation1.mmAmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation6.mmAmendmentIndicator,
					com.tools20022.repository.msg.MandateRelatedInformation7.mmAmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation8.mmAmendmentIndicator,
					com.tools20022.repository.msg.MandateRelatedInformation9.mmAmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation4.mmAmendmentIndicator,
					com.tools20022.repository.msg.MandateRelatedInformation5.mmAmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation10.mmAmendmentIndicator, com.tools20022.repository.msg.Mandate10.mmAdjustment,
					com.tools20022.repository.msg.Mandate9.mmAdjustment, com.tools20022.repository.msg.MandateRelatedInformation11.mmAmendmentIndicator, com.tools20022.repository.msg.Mandate11.mmAdjustment,
					com.tools20022.repository.msg.Mandate8.mmAdjustment);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amendment";
			definition = "Improvement on a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmOriginalMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MandatePartyRole> mandatePartyRole;
	/**
	 * Specifies each role linked to a mandate and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MandatePartyRole#mmMandate
	 * MandatePartyRole.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MandatePartyRole
	 * MandatePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a mandate and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMandatePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePartyRole";
			definition = "Specifies each role linked to a mandate and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.mmMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MandateStatus> mandateStatus;
	/**
	 * Specifies the status of a mandate
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus#mmMandate
	 * MandateStatus.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MandateStatus
	 * MandateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance1#mmAcceptanceResult
	 * MandateAcceptance1.mmAcceptanceResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance2#mmAcceptanceResult
	 * MandateAcceptance2.mmAcceptanceResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance3#mmAcceptanceResult
	 * MandateAcceptance3.mmAcceptanceResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmAcceptanceResult
	 * MandateAcceptance4.mmAcceptanceResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmAcceptanceResult
	 * MandateAcceptance5.mmAcceptanceResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a mandate"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMandateStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance1.mmAcceptanceResult, com.tools20022.repository.msg.MandateAcceptance2.mmAcceptanceResult,
					com.tools20022.repository.msg.MandateAcceptance3.mmAcceptanceResult, com.tools20022.repository.msg.MandateAcceptance4.mmAcceptanceResult, com.tools20022.repository.msg.MandateAcceptance5.mmAcceptanceResult);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateStatus";
			definition = "Specifies the status of a mandate";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
		}
	};
	protected AccountContract accountContract;
	/**
	 * Contract on which a mandate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountAuthorisation
	 * AccountContract.mmAccountAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract on which a mandate applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Contract on which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmAccountAuthorisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	protected Authentication authentication;
	/**
	 * Specifies the transport authentication details related to the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmMandate
	 * Authentication.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmAuthentication
	 * Mandate10.mmAuthentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmAuthentication
	 * Mandate9.mmAuthentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmAuthentication
	 * Mandate11.mmAuthentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmAuthentication
	 * Mandate8.mmAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport authentication details related to the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAuthentication = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.mmAuthentication, com.tools20022.repository.msg.Mandate9.mmAuthentication, com.tools20022.repository.msg.Mandate11.mmAuthentication,
					com.tools20022.repository.msg.Mandate8.mmAuthentication);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Specifies the transport authentication details related to the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.mmMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
		}
	};
	protected Max35NumericText trackingDays;
	/**
	 * Specifies the number of days the mandate must be tracked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmTrackingDays
	 * MandateRelatedInformation11.mmTrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalTrackingDays
	 * AmendmentInformationDetails11.mmOriginalTrackingDays}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackingDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the number of days the mandate must be tracked."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTrackingDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.mmTrackingDays, com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalTrackingDays);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackingDays";
			definition = "Specifies the number of days the mandate must be tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected TrueFalseIndicator trackingIndicator;
	/**
	 * Specifies whether the direct debit instructions should be automatically
	 * re-submitted periodically when bilaterally agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmTrackingIndicator
	 * Mandate10.mmTrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmTrackingIndicator
	 * Mandate9.mmTrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmTrackingIndicator
	 * Mandate11.mmTrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmTrackingIndicator
	 * Mandate8.mmTrackingIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTrackingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.mmTrackingIndicator, com.tools20022.repository.msg.Mandate9.mmTrackingIndicator, com.tools20022.repository.msg.Mandate11.mmTrackingIndicator,
					com.tools20022.repository.msg.Mandate8.mmTrackingIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackingIndicator";
			definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Pre-agreed increase or decrease rate that will be applied to the
	 * collection amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmRate
	 * MandateAdjustment1.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-agreed increase or decrease rate that will be applied to the collection amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAdjustment1.mmRate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Mandate";
				definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.mmAccountAuthorisation, com.tools20022.repository.entity.SignatureCondition.mmMandate,
						com.tools20022.repository.entity.MandatePartyRole.mmMandate, com.tools20022.repository.entity.Mandate.mmOriginalMandate, com.tools20022.repository.entity.Mandate.mmAmendment,
						com.tools20022.repository.entity.MandateStatus.mmMandate, com.tools20022.repository.entity.Authentication.mmMandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAmendment1.mmOriginalMandate, com.tools20022.repository.msg.MandateAmendment2.mmOriginalMandate,
						com.tools20022.repository.msg.MandateAmendment3.mmOriginalMandate, com.tools20022.repository.msg.MandateAmendment4.mmOriginalMandate, com.tools20022.repository.msg.MandateAmendment5.mmOriginalMandate);
				subType_lazy = () -> Arrays.asList(CashAccountMandate.mmObject(), DirectDebitMandate.mmObject(), PowerOfAttorney.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Mandate.mmSignatureConditions, com.tools20022.repository.entity.Mandate.mmMandateIdentification,
						com.tools20022.repository.entity.Mandate.mmOriginalMandate, com.tools20022.repository.entity.Mandate.mmAmendment, com.tools20022.repository.entity.Mandate.mmMandatePartyRole,
						com.tools20022.repository.entity.Mandate.mmMandateStatus, com.tools20022.repository.entity.Mandate.mmAccountContract, com.tools20022.repository.entity.Mandate.mmAuthentication,
						com.tools20022.repository.entity.Mandate.mmTrackingDays, com.tools20022.repository.entity.Mandate.mmTrackingIndicator, com.tools20022.repository.entity.Mandate.mmRate);
				derivationComponent_lazy = () -> Arrays.asList(MandateTypeInformation1.mmObject(), OriginalMandate1Choice.mmObject(), OriginalMandate2Choice.mmObject(), MandateAmendment1.mmObject(), MandateAmendment2.mmObject(),
						MandateAmendment3.mmObject(), MandateAmendment4.mmObject(), OriginalMandate3Choice.mmObject(), MandateAmendment5.mmObject(), MandateTypeInformation2.mmObject(), OriginalMandate4Choice.mmObject(),
						OriginalMandate5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SignatureCondition> getSignatureConditions() {
		return signatureConditions;
	}

	public void setSignatureConditions(List<com.tools20022.repository.entity.SignatureCondition> signatureConditions) {
		this.signatureConditions = signatureConditions;
	}

	public Max35Text getMandateIdentification() {
		return mandateIdentification;
	}

	public void setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
	}

	public Mandate getOriginalMandate() {
		return originalMandate;
	}

	public void setOriginalMandate(com.tools20022.repository.entity.Mandate originalMandate) {
		this.originalMandate = originalMandate;
	}

	public Mandate getAmendment() {
		return amendment;
	}

	public void setAmendment(com.tools20022.repository.entity.Mandate amendment) {
		this.amendment = amendment;
	}

	public List<MandatePartyRole> getMandatePartyRole() {
		return mandatePartyRole;
	}

	public void setMandatePartyRole(List<com.tools20022.repository.entity.MandatePartyRole> mandatePartyRole) {
		this.mandatePartyRole = mandatePartyRole;
	}

	public List<MandateStatus> getMandateStatus() {
		return mandateStatus;
	}

	public void setMandateStatus(List<com.tools20022.repository.entity.MandateStatus> mandateStatus) {
		this.mandateStatus = mandateStatus;
	}

	public AccountContract getAccountContract() {
		return accountContract;
	}

	public void setAccountContract(com.tools20022.repository.entity.AccountContract accountContract) {
		this.accountContract = accountContract;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthentication(com.tools20022.repository.entity.Authentication authentication) {
		this.authentication = authentication;
	}

	public Max35NumericText getTrackingDays() {
		return trackingDays;
	}

	public void setTrackingDays(Max35NumericText trackingDays) {
		this.trackingDays = trackingDays;
	}

	public TrueFalseIndicator getTrackingIndicator() {
		return trackingIndicator;
	}

	public void setTrackingIndicator(TrueFalseIndicator trackingIndicator) {
		this.trackingIndicator = trackingIndicator;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}
}