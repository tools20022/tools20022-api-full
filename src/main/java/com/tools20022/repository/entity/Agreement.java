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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
 * Agreement.mmDateSigned}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDescription
 * Agreement.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmVersion
 * Agreement.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
 * Agreement.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDocument
 * Agreement.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmTrade
 * Agreement.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmJurisdiction
 * Agreement.mmJurisdiction}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAgreement
 * DateTimePeriod.mmRelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAgreement
 * Document.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedAgreement
 * Jurisdiction.mmRelatedAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmAgreement
 * CommercialTrade.mmAgreement}</li>
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
 * "Agreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to an agreement between parties."</li>
 * </ul>
 */
public class Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate dateSigned;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccountSignatureDateTime
	 * InvestmentAccount35.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmAccountSignatureDateTime
	 * InvestmentAccount36.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmAccountSignatureDateTime
	 * InvestmentAccount34.mmAccountSignatureDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmDate
	 * Agreement3.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#mmSignOffDate
	 * ContractDocument1.mmSignOffDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmDateOfSignature
	 * MandateRelatedInformation1.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmDateOfSignature
	 * MandateRelatedInformation6.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmDateOfSignature
	 * MandateRelatedInformation7.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmDateOfSignature
	 * MandateRelatedInformation8.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmDateOfSignature
	 * MandateRelatedInformation9.mmDateOfSignature}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementDate
	 * Agreement2.mmAgreementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#mmDateOfSignature
	 * MandateRelatedInformation4.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmDateOfSignature
	 * MandateRelatedInformation5.mmDateOfSignature}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#mmDate
	 * Agreement1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccountSignatureDateTime
	 * InvestmentAccount38.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmAccountSignatureDateTime
	 * InvestmentAccount37.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmAccountSignatureDateTime
	 * InvestmentAccount39.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmDateOfSignature
	 * MandateRelatedInformation10.mmDateOfSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccountSignatureDateTime
	 * InvestmentAccount46.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmAccountSignatureDateTime
	 * InvestmentAccount47.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmStartDate
	 * RegisteredContractAmendment1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmAccountSignatureDateTime
	 * InvestmentAccount49.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmAccountSignatureDateTime
	 * InvestmentAccount51.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccountSignatureDateTime
	 * InvestmentAccount50.mmAccountSignatureDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementDate
	 * Agreement4.mmAgreementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmAccountSignatureDateTime
	 * InvestmentAccount61.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountSignatureDateTime
	 * InvestmentAccount63.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountSignatureDateTime
	 * InvestmentAccount62.mmAccountSignatureDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDefinitionsYear
	 * GeneralInformation5.mmDefinitionsYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreementConditions1#mmDate
	 * AgreementConditions1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmDateOfSignature
	 * MandateRelatedInformation11.mmDateOfSignature}</li>
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
	public static final MMBusinessAttribute mmDateSigned = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount35.mmAccountSignatureDateTime, InvestmentAccount36.mmAccountSignatureDateTime, InvestmentAccount34.mmAccountSignatureDateTime, Agreement3.mmDate,
					ContractDocument1.mmSignOffDate, MandateRelatedInformation1.mmDateOfSignature, MandateRelatedInformation6.mmDateOfSignature, MandateRelatedInformation7.mmDateOfSignature, MandateRelatedInformation8.mmDateOfSignature,
					MandateRelatedInformation9.mmDateOfSignature, Agreement2.mmAgreementDate, MandateRelatedInformation4.mmDateOfSignature, MandateRelatedInformation5.mmDateOfSignature, Agreement1.mmDate,
					InvestmentAccount38.mmAccountSignatureDateTime, InvestmentAccount37.mmAccountSignatureDateTime, InvestmentAccount39.mmAccountSignatureDateTime, MandateRelatedInformation10.mmDateOfSignature,
					InvestmentAccount46.mmAccountSignatureDateTime, InvestmentAccount47.mmAccountSignatureDateTime, RegisteredContractAmendment1.mmStartDate, InvestmentAccount49.mmAccountSignatureDateTime,
					InvestmentAccount51.mmAccountSignatureDateTime, InvestmentAccount50.mmAccountSignatureDateTime, Agreement4.mmAgreementDate, InvestmentAccount61.mmAccountSignatureDateTime, InvestmentAccount63.mmAccountSignatureDateTime,
					InvestmentAccount62.mmAccountSignatureDateTime, GeneralInformation5.mmDefinitionsYear, AgreementConditions1.mmDate, MandateRelatedInformation11.mmDateOfSignature);
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateSigned";
			definition = "Date on which the agreement was signed by all parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Agreement.class.getMethod("getDateSigned", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text description;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmDescription
	 * Agreement3.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#mmReference
	 * ContractDocument1.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement2#mmAgreementDetails
	 * Agreement2.mmAgreementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#mmDescription
	 * Agreement1.mmDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#mmReason
	 * Mandate7.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalReason
	 * AmendmentInformationDetails10.mmOriginalReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#mmReason
	 * Mandate6.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#mmReason
	 * Mandate5.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmReason
	 * MandateRelatedInformation10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDescription
	 * SupportingDocumentRequestOrLetter1.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementDetails
	 * Agreement4.mmAgreementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmReason
	 * Mandate10.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmReason
	 * Mandate9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmReason
	 * MandateRelatedInformation11.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmReason
	 * Mandate11.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmReason
	 * Mandate8.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalReason
	 * AmendmentInformationDetails11.mmOriginalReason}</li>
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
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement3.mmDescription, ContractDocument1.mmReference, Agreement2.mmAgreementDetails, Agreement1.mmDescription, Mandate7.mmReason, AmendmentInformationDetails10.mmOriginalReason,
					Mandate6.mmReason, Mandate5.mmReason, MandateRelatedInformation10.mmReason, SupportingDocumentRequestOrLetter1.mmDescription, Agreement4.mmAgreementDetails, Mandate10.mmReason, Mandate9.mmReason,
					MandateRelatedInformation11.mmReason, Mandate11.mmReason, Mandate8.mmReason, AmendmentInformationDetails11.mmOriginalReason);
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Agreement.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text version;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1#mmVersion
	 * ContractDocument1.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreementConditions1#mmVersion
	 * AgreementConditions1.mmVersion}</li>
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
	public static final MMBusinessAttribute mmVersion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContractDocument1.mmVersion, AgreementConditions1.mmVersion);
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of a contract or of a  legal agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Agreement.class.getMethod("getVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Period during which the agreement is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAgreement
	 * DateTimePeriod.mmRelatedAgreement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#mmDuration
	 * MandateOccurrences1.mmDuration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmDuration
	 * MandateOccurrences2.mmDuration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmDuration
	 * MandateOccurrences3.mmDuration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmDuration
	 * MandateOccurrences4.mmDuration}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(MandateOccurrences1.mmDuration, MandateOccurrences2.mmDuration, MandateOccurrences3.mmDuration, MandateOccurrences4.mmDuration);
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the agreement is valid";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Document document;
	/**
	 * Document which materialises the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAgreement
	 * Document.mmAgreement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#mmReferredDocument
	 * MandateInformation1.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate1#mmReferredDocument
	 * Mandate1.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#mmReferredDocument
	 * MandateInformation3.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate3#mmReferredDocument
	 * Mandate3.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmReferredDocument
	 * MandateInformation2.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate2#mmReferredDocument
	 * Mandate2.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate4#mmReferredDocument
	 * Mandate4.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmInvoiceGeneralInformation
	 * InvoiceRequestInformation1.mmInvoiceGeneralInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate7#mmReferredDocument
	 * Mandate7.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate6#mmReferredDocument
	 * Mandate6.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate5#mmReferredDocument
	 * Mandate5.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmRelatedGuaranteeLetter
	 * FinancingAgreementItem1.mmRelatedGuaranteeLetter}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmAssociatedDocument
	 * FinancingAgreementItem1.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmEntry
	 * SupportingDocument1.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmDocument
	 * RegisteredContractAmendment1.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmReferredDocument
	 * Mandate10.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmReferredDocument
	 * Mandate9.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmReferredDocument
	 * Mandate11.mmReferredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmReferredDocument
	 * Mandate8.mmReferredDocument}</li>
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
	public static final MMBusinessAssociationEnd mmDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(MandateInformation1.mmReferredDocument, Mandate1.mmReferredDocument, MandateInformation3.mmReferredDocument, Mandate3.mmReferredDocument, MandateInformation2.mmReferredDocument,
					Mandate2.mmReferredDocument, Mandate4.mmReferredDocument, InvoiceRequestInformation1.mmInvoiceGeneralInformation, Mandate7.mmReferredDocument, Mandate6.mmReferredDocument, Mandate5.mmReferredDocument,
					FinancingAgreementItem1.mmRelatedGuaranteeLetter, FinancingAgreementItem1.mmAssociatedDocument, SupportingDocument1.mmEntry, RegisteredContractAmendment1.mmDocument, Mandate10.mmReferredDocument,
					Mandate9.mmReferredDocument, Mandate11.mmReferredDocument, Mandate8.mmReferredDocument);
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected CommercialTrade trade;
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmAgreement
	 * CommercialTrade.mmAgreement}</li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * Jurisdiction where an agreement applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedAgreement
	 * Jurisdiction.mmRelatedAgreement}</li>
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
	public static final MMBusinessAssociationEnd mmJurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction where an agreement applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRelatedAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Agreement";
				definition = "Contractual details related to an agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedAgreement, com.tools20022.repository.entity.Document.mmAgreement,
						com.tools20022.repository.entity.Jurisdiction.mmRelatedAgreement, com.tools20022.repository.entity.CommercialTrade.mmAgreement);
				subType_lazy = () -> Arrays.asList(Contract.mmObject(), SecuritiesFinancingAgreement.mmObject(), CollateralAgreement.mmObject(), MasterAgreement.mmObject(), InvoiceFinancingAgreement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Agreement.mmDateSigned, com.tools20022.repository.entity.Agreement.mmDescription, com.tools20022.repository.entity.Agreement.mmVersion,
						com.tools20022.repository.entity.Agreement.mmValidityPeriod, com.tools20022.repository.entity.Agreement.mmDocument, com.tools20022.repository.entity.Agreement.mmTrade,
						com.tools20022.repository.entity.Agreement.mmJurisdiction);
				derivationComponent_lazy = () -> Arrays.asList(TradeAgreement6.mmObject(), TradeAgreement13.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Agreement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDateSigned() {
		return dateSigned;
	}

	public void setDateSigned(ISODate dateSigned) {
		this.dateSigned = dateSigned;
	}

	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}

	public Max35Text getVersion() {
		return version;
	}

	public void setVersion(Max35Text version) {
		this.version = version;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(com.tools20022.repository.entity.Document document) {
		this.document = document;
	}

	public CommercialTrade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.CommercialTrade trade) {
		this.trade = trade;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(com.tools20022.repository.entity.Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
}