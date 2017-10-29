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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.TradeAgreement13;
import com.tools20022.repository.msg.TradeAgreement6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contractual details related to an agreement between parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Agreement" src="doc-files/Agreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#DateSigned
 * Agreement.DateSigned}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Description
 * Agreement.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Version
 * Agreement.Version}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#ValidityPeriod
 * Agreement.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Document
 * Agreement.Document}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Trade
 * Agreement.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Jurisdiction
 * Agreement.Jurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAgreement
 * DateTimePeriod.RelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Agreement
 * Document.Agreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedAgreement
 * Jurisdiction.RelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#Agreement
 * CommercialTrade.Agreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
 * SecuritiesFinancingAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MasterAgreement
 * MasterAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement6
 * TradeAgreement6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13
 * TradeAgreement13}</li>
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
 * "Agreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to an agreement between parties."</li>
 * </ul>
 */
public class Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the agreement was signed by all parties.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#AccountSignatureDateTime
	 * InvestmentAccount35.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#AccountSignatureDateTime
	 * InvestmentAccount36.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#AccountSignatureDateTime
	 * InvestmentAccount34.AccountSignatureDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#Date
	 * Agreement3.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#SignOffDate
	 * ContractDocument1.SignOffDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#DateOfSignature
	 * MandateRelatedInformation1.DateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#DateOfSignature
	 * MandateRelatedInformation6.DateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#DateOfSignature
	 * MandateRelatedInformation7.DateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#DateOfSignature
	 * MandateRelatedInformation8.DateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#DateOfSignature
	 * MandateRelatedInformation9.DateOfSignature}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#AgreementDate
	 * Agreement2.AgreementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#DateOfSignature
	 * MandateRelatedInformation4.DateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#DateOfSignature
	 * MandateRelatedInformation5.DateOfSignature}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#Date
	 * Agreement1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#AccountSignatureDateTime
	 * InvestmentAccount38.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#AccountSignatureDateTime
	 * InvestmentAccount37.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#AccountSignatureDateTime
	 * InvestmentAccount39.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#DateOfSignature
	 * MandateRelatedInformation10.DateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#AccountSignatureDateTime
	 * InvestmentAccount46.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#AccountSignatureDateTime
	 * InvestmentAccount47.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#StartDate
	 * RegisteredContractAmendment1.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#AccountSignatureDateTime
	 * InvestmentAccount49.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#AccountSignatureDateTime
	 * InvestmentAccount51.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#AccountSignatureDateTime
	 * InvestmentAccount50.AccountSignatureDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#AgreementDate
	 * Agreement4.AgreementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#AccountSignatureDateTime
	 * InvestmentAccount61.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#AccountSignatureDateTime
	 * InvestmentAccount63.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#AccountSignatureDateTime
	 * InvestmentAccount62.AccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#DefinitionsYear
	 * GeneralInformation5.DefinitionsYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreementConditions1#Date
	 * AgreementConditions1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#DateOfSignature
	 * MandateRelatedInformation11.DateOfSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateSigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the agreement was signed by all parties."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DateSigned = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount35.AccountSignatureDateTime, com.tools20022.repository.msg.InvestmentAccount36.AccountSignatureDateTime,
					com.tools20022.repository.msg.InvestmentAccount34.AccountSignatureDateTime, com.tools20022.repository.msg.Agreement3.Date, com.tools20022.repository.msg.ContractDocument1.SignOffDate,
					com.tools20022.repository.msg.MandateRelatedInformation1.DateOfSignature, com.tools20022.repository.msg.MandateRelatedInformation6.DateOfSignature,
					com.tools20022.repository.msg.MandateRelatedInformation7.DateOfSignature, com.tools20022.repository.msg.MandateRelatedInformation8.DateOfSignature,
					com.tools20022.repository.msg.MandateRelatedInformation9.DateOfSignature, com.tools20022.repository.msg.Agreement2.AgreementDate, com.tools20022.repository.msg.MandateRelatedInformation4.DateOfSignature,
					com.tools20022.repository.msg.MandateRelatedInformation5.DateOfSignature, com.tools20022.repository.msg.Agreement1.Date, com.tools20022.repository.msg.InvestmentAccount38.AccountSignatureDateTime,
					com.tools20022.repository.msg.InvestmentAccount37.AccountSignatureDateTime, com.tools20022.repository.msg.InvestmentAccount39.AccountSignatureDateTime,
					com.tools20022.repository.msg.MandateRelatedInformation10.DateOfSignature, com.tools20022.repository.msg.InvestmentAccount46.AccountSignatureDateTime,
					com.tools20022.repository.msg.InvestmentAccount47.AccountSignatureDateTime, com.tools20022.repository.msg.RegisteredContractAmendment1.StartDate,
					com.tools20022.repository.msg.InvestmentAccount49.AccountSignatureDateTime, com.tools20022.repository.msg.InvestmentAccount51.AccountSignatureDateTime,
					com.tools20022.repository.msg.InvestmentAccount50.AccountSignatureDateTime, com.tools20022.repository.msg.Agreement4.AgreementDate, com.tools20022.repository.msg.InvestmentAccount61.AccountSignatureDateTime,
					com.tools20022.repository.msg.InvestmentAccount63.AccountSignatureDateTime, com.tools20022.repository.msg.InvestmentAccount62.AccountSignatureDateTime, com.tools20022.repository.msg.GeneralInformation5.DefinitionsYear,
					com.tools20022.repository.msg.AgreementConditions1.Date, com.tools20022.repository.msg.MandateRelatedInformation11.DateOfSignature);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateSigned";
			definition = "Date on which the agreement was signed by all parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Full name of an agreement, annexes and amendments in place between the
	 * principals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#Description
	 * Agreement3.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#Reference
	 * ContractDocument1.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement2#AgreementDetails
	 * Agreement2.AgreementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#Description
	 * Agreement1.Description}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#Reason
	 * Mandate7.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#OriginalReason
	 * AmendmentInformationDetails10.OriginalReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#Reason
	 * Mandate6.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#Reason
	 * Mandate5.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#Reason
	 * MandateRelatedInformation10.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#Description
	 * SupportingDocumentRequestOrLetter1.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#AgreementDetails
	 * Agreement4.AgreementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Reason
	 * Mandate10.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Reason
	 * Mandate9.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#Reason
	 * MandateRelatedInformation11.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Reason
	 * Mandate11.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Reason
	 * Mandate8.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalReason
	 * AmendmentInformationDetails11.OriginalReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full name of an agreement, annexes and amendments in place between the principals."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Agreement3.Description, com.tools20022.repository.msg.ContractDocument1.Reference, com.tools20022.repository.msg.Agreement2.AgreementDetails,
					com.tools20022.repository.msg.Agreement1.Description, com.tools20022.repository.msg.Mandate7.Reason, com.tools20022.repository.msg.AmendmentInformationDetails10.OriginalReason,
					com.tools20022.repository.msg.Mandate6.Reason, com.tools20022.repository.msg.Mandate5.Reason, com.tools20022.repository.msg.MandateRelatedInformation10.Reason,
					com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1.Description, com.tools20022.repository.msg.Agreement4.AgreementDetails, com.tools20022.repository.msg.Mandate10.Reason,
					com.tools20022.repository.msg.Mandate9.Reason, com.tools20022.repository.msg.MandateRelatedInformation11.Reason, com.tools20022.repository.msg.Mandate11.Reason, com.tools20022.repository.msg.Mandate8.Reason,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalReason);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Version number of a contract or of a legal agreement.
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
	 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1#Version
	 * ContractDocument1.Version}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreementConditions1#Version
	 * AgreementConditions1.Version}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version number of a contract or of a  legal agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Version = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractDocument1.Version, com.tools20022.repository.msg.AgreementConditions1.Version);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of a contract or of a  legal agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Period during which the agreement is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAgreement
	 * DateTimePeriod.RelatedAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#Duration
	 * MandateOccurrences1.Duration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#Duration
	 * MandateOccurrences2.Duration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#Duration
	 * MandateOccurrences3.Duration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#Duration
	 * MandateOccurrences4.Duration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the agreement is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences1.Duration, com.tools20022.repository.msg.MandateOccurrences2.Duration, com.tools20022.repository.msg.MandateOccurrences3.Duration,
					com.tools20022.repository.msg.MandateOccurrences4.Duration);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the agreement is valid";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Document which materialises the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#Agreement
	 * Document.Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#ReferredDocument
	 * MandateInformation1.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#ReferredDocument
	 * Mandate1.ReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#ReferredDocument
	 * MandateInformation3.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#ReferredDocument
	 * Mandate3.ReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#ReferredDocument
	 * MandateInformation2.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#ReferredDocument
	 * Mandate2.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#ReferredDocument
	 * Mandate4.ReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#InvoiceGeneralInformation
	 * InvoiceRequestInformation1.InvoiceGeneralInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#ReferredDocument
	 * Mandate7.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#ReferredDocument
	 * Mandate6.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#ReferredDocument
	 * Mandate5.ReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#RelatedGuaranteeLetter
	 * FinancingAgreementItem1.RelatedGuaranteeLetter}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#AssociatedDocument
	 * FinancingAgreementItem1.AssociatedDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocument1#Entry
	 * SupportingDocument1.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#Document
	 * RegisteredContractAmendment1.Document}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#ReferredDocument
	 * Mandate10.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#ReferredDocument
	 * Mandate9.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#ReferredDocument
	 * Mandate11.ReferredDocument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#ReferredDocument
	 * Mandate8.ReferredDocument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which materialises the agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateInformation1.ReferredDocument, com.tools20022.repository.msg.Mandate1.ReferredDocument,
					com.tools20022.repository.msg.MandateInformation3.ReferredDocument, com.tools20022.repository.msg.Mandate3.ReferredDocument, com.tools20022.repository.msg.MandateInformation2.ReferredDocument,
					com.tools20022.repository.msg.Mandate2.ReferredDocument, com.tools20022.repository.msg.Mandate4.ReferredDocument, com.tools20022.repository.msg.InvoiceRequestInformation1.InvoiceGeneralInformation,
					com.tools20022.repository.msg.Mandate7.ReferredDocument, com.tools20022.repository.msg.Mandate6.ReferredDocument, com.tools20022.repository.msg.Mandate5.ReferredDocument,
					com.tools20022.repository.msg.FinancingAgreementItem1.RelatedGuaranteeLetter, com.tools20022.repository.msg.FinancingAgreementItem1.AssociatedDocument, com.tools20022.repository.msg.SupportingDocument1.Entry,
					com.tools20022.repository.msg.RegisteredContractAmendment1.Document, com.tools20022.repository.msg.Mandate10.ReferredDocument, com.tools20022.repository.msg.Mandate9.ReferredDocument,
					com.tools20022.repository.msg.Mandate11.ReferredDocument, com.tools20022.repository.msg.Mandate8.ReferredDocument);
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Agreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of trade that is the subject of an agreement. The
	 * agreement contains the clauses that will govern each trade between the
	 * signing parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#Agreement
	 * CommercialTrade.Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.Agreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Jurisdiction where an agreement applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedAgreement
	 * Jurisdiction.RelatedAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Agreement
	 * Agreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction where an agreement applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Agreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction where an agreement applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RelatedAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Agreement";
				definition = "Contractual details related to an agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement, com.tools20022.repository.entity.Document.Agreement,
						com.tools20022.repository.entity.Jurisdiction.RelatedAgreement, com.tools20022.repository.entity.CommercialTrade.Agreement);
				subType_lazy = () -> Arrays.asList(Contract.mmObject(), SecuritiesFinancingAgreement.mmObject(), CollateralAgreement.mmObject(), MasterAgreement.mmObject(), InvoiceFinancingAgreement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Agreement.DateSigned, com.tools20022.repository.entity.Agreement.Description, com.tools20022.repository.entity.Agreement.Version,
						com.tools20022.repository.entity.Agreement.ValidityPeriod, com.tools20022.repository.entity.Agreement.Document, com.tools20022.repository.entity.Agreement.Trade,
						com.tools20022.repository.entity.Agreement.Jurisdiction);
				derivationComponent_lazy = () -> Arrays.asList(TradeAgreement6.mmObject(), TradeAgreement13.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}