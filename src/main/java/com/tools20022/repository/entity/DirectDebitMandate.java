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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.MandateClassificationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation in favour of the creditor given by the debtor to debit its own
 * account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DirectDebitMandate" src="doc-files/DirectDebitMandate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
 * DirectDebitMandate.mmRelatedDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
 * DirectDebitMandate.mmFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
 * DirectDebitMandate.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFirstCollectionDate
 * DirectDebitMandate.mmFirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
 * DirectDebitMandate.mmMandatePaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmCollectionAmount
 * DirectDebitMandate.mmCollectionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMaximumAmount
 * DirectDebitMandate.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmPreNotification
 * DirectDebitMandate.mmPreNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmPreNotificationThreshold
 * DirectDebitMandate.mmPreNotificationThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmClassification
 * DirectDebitMandate.mmClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmPointInTime
 * DirectDebitMandate.mmPointInTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
 * DirectDebit.mmDirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmRelatedMandate
 * PaymentProcessing.mmRelatedMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmAmendmentInformationDetails
 * MandateRelatedInformation1.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmAmendmentInformationDetails
 * MandateRelatedInformation6.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmAmendmentInformationDetails
 * MandateRelatedInformation7.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmAmendmentInformationDetails
 * MandateRelatedInformation8.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmMandateRelatedInformation
 * OriginalTransactionReference1.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmMandateRelatedInformation
 * OriginalTransactionReference13.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmMandateRelatedInformation
 * OriginalTransactionReference16.mmMandateRelatedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation1#mmType
 * MandateInformation1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation1#mmOccurrences
 * MandateInformation1.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate1Choice#mmOriginalMandate
 * OriginalMandate1Choice.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#mmOccurrences
 * Mandate1.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate2Choice#mmOriginalMandate
 * OriginalMandate2Choice.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation3#mmType
 * MandateInformation3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation3#mmOccurrences
 * MandateInformation3.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment1#mmMandate
 * MandateAmendment1.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#mmOccurrences
 * Mandate3.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment2#mmMandate
 * MandateAmendment2.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment3#mmMandate
 * MandateAmendment3.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation2#mmType
 * MandateInformation2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmOccurrences
 * MandateInformation2.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#mmOccurrences
 * Mandate2.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#mmOccurrences
 * Mandate4.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmMandateRelatedInformation
 * OriginalTransactionReference15.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmAmendmentInformationDetails
 * MandateRelatedInformation9.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmMandateRelatedInformation
 * OriginalTransactionReference17.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#mmAmendmentInformationDetails
 * MandateRelatedInformation4.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmMandateRelatedInformation
 * OriginalTransactionReference7.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmMandateRelatedInformation
 * OriginalTransactionReference10.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmAmendmentInformationDetails
 * MandateRelatedInformation5.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmMandateRelatedInformation
 * OriginalTransactionReference9.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmMandateRelatedInformation
 * OriginalTransactionReference12.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmMandateRelatedInformation
 * OriginalTransactionReference8.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmMandateRelatedInformation
 * OriginalTransactionReference11.mmMandateRelatedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment4#mmMandate
 * MandateAmendment4.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#mmOccurrences
 * Mandate7.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice#mmOriginalMandate
 * OriginalMandate3Choice.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#mmOccurrences
 * Mandate6.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#mmOccurrences
 * Mandate5.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmMandateRelatedInformation
 * OriginalTransactionReference20.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmAmendmentInformationDetails
 * MandateRelatedInformation10.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmMandateRelatedInformation
 * OriginalTransactionReference22.mmMandateRelatedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmOccurrences
 * Mandate10.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5#mmMandate
 * MandateAmendment5.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#mmOriginalMandate
 * OriginalMandate4Choice.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmOccurrences
 * Mandate9.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmMandateRelatedInformation
 * OriginalTransactionReference24.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentInformationDetails
 * MandateRelatedInformation11.mmAmendmentInformationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmOccurrences
 * Mandate11.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmOccurrences
 * Mandate8.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#mmOriginalMandate
 * OriginalMandate5Choice.mmOriginalMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
 * AmendmentInformationDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation1
 * MandateRelatedInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails6
 * AmendmentInformationDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation6
 * MandateRelatedInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails7
 * AmendmentInformationDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation7
 * MandateRelatedInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
 * AmendmentInformationDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation8
 * MandateRelatedInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences1
 * MandateOccurrences1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation1
 * MandateInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAcceptance1
 * MandateAcceptance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences2
 * MandateOccurrences2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate1 Mandate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAcceptance2
 * MandateAcceptance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAcceptance3
 * MandateAcceptance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation3
 * MandateInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate3 Mandate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation2
 * MandateInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate2 Mandate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate4 Mandate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9
 * AmendmentInformationDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
 * MandateRelatedInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails4
 * AmendmentInformationDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation4
 * MandateRelatedInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
 * AmendmentInformationDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation5
 * MandateRelatedInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAcceptance4
 * MandateAcceptance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate7 Mandate7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
 * AmendmentInformationDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate6 Mandate6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate5 Mandate5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
 * MandateRelatedInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences3
 * MandateOccurrences3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate10 Mandate10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAcceptance5
 * MandateAcceptance5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate9 Mandate9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
 * MandateRelatedInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11 Mandate11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1
 * MandateAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences4
 * MandateOccurrences4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate8 Mandate8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11
 * AmendmentInformationDetails11}</li>
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
 * "DirectDebitMandate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Authorisation in favour of the creditor given by the debtor to debit its own account."
 * </li>
 * </ul>
 */
public class DirectDebitMandate extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DirectDebit relatedDirectDebit;
	/**
	 * Direct debit to which a mandate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
	 * DirectDebit.mmDirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebit
	 * DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct debit to which a mandate applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDirectDebit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
		}
	};
	protected ISODate finalCollectionDate;
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails1.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmFinalCollectionDate
	 * MandateRelatedInformation1.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails6#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails6.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmFinalCollectionDate
	 * MandateRelatedInformation6.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails7#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails7.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmFinalCollectionDate
	 * MandateRelatedInformation7.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails8.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmFinalCollectionDate
	 * MandateRelatedInformation8.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#mmFinalCollectionDate
	 * MandateOccurrences1.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmFinalCollectionDate
	 * MandateOccurrences2.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails9.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmFinalCollectionDate
	 * MandateRelatedInformation9.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails5.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmFinalCollectionDate
	 * MandateRelatedInformation5.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails10.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFinalCollectionDate
	 * MandateRelatedInformation10.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmFinalCollectionDate
	 * MandateOccurrences3.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFinalCollectionDate
	 * MandateRelatedInformation11.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFinalCollectionDate
	 * MandateOccurrences4.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails11.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinalCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation1.mmFinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails6.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation6.mmFinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails7.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation7.mmFinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation8.mmFinalCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences1.mmFinalCollectionDate, com.tools20022.repository.msg.MandateOccurrences2.mmFinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails9.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation9.mmFinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation5.mmFinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation10.mmFinalCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences3.mmFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation11.mmFinalCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences4.mmFinalCollectionDate, com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalFinalCollectionDate);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected FrequencyCode frequency;
	/**
	 * Regularity with which direct debit instructions are to be created and
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalFrequency
	 * AmendmentInformationDetails1.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmFrequency
	 * MandateRelatedInformation1.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails6#mmOriginalFrequency
	 * AmendmentInformationDetails6.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmFrequency
	 * MandateRelatedInformation6.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails7#mmOriginalFrequency
	 * AmendmentInformationDetails7.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmFrequency
	 * MandateRelatedInformation7.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFrequency
	 * AmendmentInformationDetails8.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmFrequency
	 * MandateRelatedInformation8.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#mmFrequency
	 * MandateOccurrences1.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmFrequency
	 * MandateOccurrences2.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9#mmOriginalFrequency
	 * AmendmentInformationDetails9.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmFrequency
	 * MandateRelatedInformation9.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalFrequency
	 * AmendmentInformationDetails5.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmFrequency
	 * MandateRelatedInformation5.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFrequency
	 * AmendmentInformationDetails10.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFrequency
	 * MandateRelatedInformation10.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmFrequency
	 * MandateOccurrences3.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFrequency
	 * MandateRelatedInformation11.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmCategory
	 * MandateAdjustment1.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFrequency
	 * MandateOccurrences4.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFrequency
	 * AmendmentInformationDetails11.mmOriginalFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which direct debit instructions are to be created and processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation1.mmFrequency,
					com.tools20022.repository.msg.AmendmentInformationDetails6.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation6.mmFrequency,
					com.tools20022.repository.msg.AmendmentInformationDetails7.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation7.mmFrequency,
					com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation8.mmFrequency, com.tools20022.repository.msg.MandateOccurrences1.mmFrequency,
					com.tools20022.repository.msg.MandateOccurrences2.mmFrequency, com.tools20022.repository.msg.AmendmentInformationDetails9.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation9.mmFrequency,
					com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation5.mmFrequency,
					com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation10.mmFrequency, com.tools20022.repository.msg.MandateOccurrences3.mmFrequency,
					com.tools20022.repository.msg.MandateRelatedInformation11.mmFrequency, com.tools20022.repository.msg.MandateAdjustment1.mmCategory, com.tools20022.repository.msg.MandateOccurrences4.mmFrequency,
					com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalFrequency);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	protected ISODate firstCollectionDate;
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmFirstCollectionDate
	 * MandateRelatedInformation1.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmFirstCollectionDate
	 * MandateRelatedInformation6.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmFirstCollectionDate
	 * MandateRelatedInformation7.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmFirstCollectionDate
	 * MandateRelatedInformation8.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#mmFirstCollectionDate
	 * MandateOccurrences1.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmFirstCollectionDate
	 * MandateOccurrences2.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmFirstCollectionDate
	 * MandateRelatedInformation9.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmFirstCollectionDate
	 * MandateRelatedInformation5.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFirstCollectionDate
	 * MandateRelatedInformation10.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmFirstCollectionDate
	 * MandateOccurrences3.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFirstCollectionDate
	 * MandateRelatedInformation11.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFirstCollectionDate
	 * MandateOccurrences4.mmFirstCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation1.mmFirstCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation6.mmFirstCollectionDate,
					com.tools20022.repository.msg.MandateRelatedInformation7.mmFirstCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation8.mmFirstCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences1.mmFirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences2.mmFirstCollectionDate,
					com.tools20022.repository.msg.MandateRelatedInformation9.mmFirstCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation5.mmFirstCollectionDate,
					com.tools20022.repository.msg.MandateRelatedInformation10.mmFirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences3.mmFirstCollectionDate,
					com.tools20022.repository.msg.MandateRelatedInformation11.mmFirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.mmFirstCollectionDate);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PaymentProcessing mandatePaymentType;
	/**
	 * Set of elements that further identifies the type of mandate (service
	 * level and/or paper or electronic) being requested or given by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmRelatedMandate
	 * PaymentProcessing.mmRelatedMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation1#mmLocalInstrument
	 * MandateTypeInformation1.mmLocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#mmType
	 * Mandate1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#mmType
	 * Mandate3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#mmType
	 * Mandate2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#mmType
	 * Mandate4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#mmType
	 * Mandate7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#mmType
	 * Mandate6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#mmType
	 * Mandate5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmType
	 * Mandate10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmLocalInstrument
	 * MandateTypeInformation2.mmLocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmType
	 * Mandate9.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmType
	 * Mandate11.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmType
	 * Mandate8.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatePaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMandatePaymentType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation1.mmLocalInstrument, com.tools20022.repository.msg.Mandate1.mmType, com.tools20022.repository.msg.Mandate3.mmType,
					com.tools20022.repository.msg.Mandate2.mmType, com.tools20022.repository.msg.Mandate4.mmType, com.tools20022.repository.msg.Mandate7.mmType, com.tools20022.repository.msg.Mandate6.mmType,
					com.tools20022.repository.msg.Mandate5.mmType, com.tools20022.repository.msg.Mandate10.mmType, com.tools20022.repository.msg.MandateTypeInformation2.mmLocalInstrument, com.tools20022.repository.msg.Mandate9.mmType,
					com.tools20022.repository.msg.Mandate11.mmType, com.tools20022.repository.msg.Mandate8.mmType);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected CurrencyAndAmount collectionAmount;
	/**
	 * Fixed amount that the debtor has agreed will be collected from their
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#mmCollectionAmount
	 * MandateInformation1.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate1#mmCollectionAmount
	 * Mandate1.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#mmCollectionAmount
	 * MandateInformation3.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate3#mmCollectionAmount
	 * Mandate3.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmCollectionAmount
	 * MandateInformation2.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate2#mmCollectionAmount
	 * Mandate2.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate4#mmCollectionAmount
	 * Mandate4.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate7#mmCollectionAmount
	 * Mandate7.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate6#mmCollectionAmount
	 * Mandate6.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate5#mmCollectionAmount
	 * Mandate5.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmFirstCollectionAmount
	 * Mandate10.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmCollectionAmount
	 * Mandate10.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmFirstCollectionAmount
	 * Mandate9.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmCollectionAmount
	 * Mandate9.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmFirstCollectionAmount
	 * Mandate11.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmCollectionAmount
	 * Mandate11.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmAmount
	 * MandateAdjustment1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmFirstCollectionAmount
	 * Mandate8.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmCollectionAmount
	 * Mandate8.mmCollectionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount that the debtor has agreed will be collected from their account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollectionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateInformation1.mmCollectionAmount, com.tools20022.repository.msg.Mandate1.mmCollectionAmount,
					com.tools20022.repository.msg.MandateInformation3.mmCollectionAmount, com.tools20022.repository.msg.Mandate3.mmCollectionAmount, com.tools20022.repository.msg.MandateInformation2.mmCollectionAmount,
					com.tools20022.repository.msg.Mandate2.mmCollectionAmount, com.tools20022.repository.msg.Mandate4.mmCollectionAmount, com.tools20022.repository.msg.Mandate7.mmCollectionAmount,
					com.tools20022.repository.msg.Mandate6.mmCollectionAmount, com.tools20022.repository.msg.Mandate5.mmCollectionAmount, com.tools20022.repository.msg.Mandate10.mmFirstCollectionAmount,
					com.tools20022.repository.msg.Mandate10.mmCollectionAmount, com.tools20022.repository.msg.Mandate9.mmFirstCollectionAmount, com.tools20022.repository.msg.Mandate9.mmCollectionAmount,
					com.tools20022.repository.msg.Mandate11.mmFirstCollectionAmount, com.tools20022.repository.msg.Mandate11.mmCollectionAmount, com.tools20022.repository.msg.MandateAdjustment1.mmAmount,
					com.tools20022.repository.msg.Mandate8.mmFirstCollectionAmount, com.tools20022.repository.msg.Mandate8.mmCollectionAmount);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount maximumAmount;
	/**
	 * Maximum amount that may be collected from the debtor's account, per
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#mmMaximumAmount
	 * MandateInformation1.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#mmMaximumAmount
	 * Mandate1.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#mmMaximumAmount
	 * MandateInformation3.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#mmMaximumAmount
	 * Mandate3.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#mmMaximumAmount
	 * MandateInformation2.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#mmMaximumAmount
	 * Mandate2.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#mmMaximumAmount
	 * Mandate4.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#mmMaximumAmount
	 * Mandate7.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#mmMaximumAmount
	 * Mandate6.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#mmMaximumAmount
	 * Mandate5.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmMaximumAmount
	 * Mandate10.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmMaximumAmount
	 * Mandate9.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmMaximumAmount
	 * Mandate11.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmMaximumAmount
	 * Mandate8.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that may be collected from the debtor's account, per instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateInformation1.mmMaximumAmount, com.tools20022.repository.msg.Mandate1.mmMaximumAmount, com.tools20022.repository.msg.MandateInformation3.mmMaximumAmount,
					com.tools20022.repository.msg.Mandate3.mmMaximumAmount, com.tools20022.repository.msg.MandateInformation2.mmMaximumAmount, com.tools20022.repository.msg.Mandate2.mmMaximumAmount,
					com.tools20022.repository.msg.Mandate4.mmMaximumAmount, com.tools20022.repository.msg.Mandate7.mmMaximumAmount, com.tools20022.repository.msg.Mandate6.mmMaximumAmount,
					com.tools20022.repository.msg.Mandate5.mmMaximumAmount, com.tools20022.repository.msg.Mandate10.mmMaximumAmount, com.tools20022.repository.msg.Mandate9.mmMaximumAmount,
					com.tools20022.repository.msg.Mandate11.mmMaximumAmount, com.tools20022.repository.msg.Mandate8.mmMaximumAmount);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected TrueFalseIndicator preNotification;
	/**
	 * Indicates wether a pre-notification must be sent by the creditor to the
	 * debtor before a direct debit occurs
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPreNotification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotification";
			definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Number preNotificationThreshold;
	/**
	 * Specifies the number of days before the direct debit for notifying the
	 * debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days before the direct debit for notifying the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPreNotificationThreshold = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationThreshold";
			definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected MandateClassificationCode classification;
	/**
	 * Type of direct debit instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
	 * MandateClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmClassification
	 * MandateTypeInformation2.mmClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of direct debit instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClassification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.mmClassification);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateClassificationCode.mmObject();
		}
	};
	protected FrequencyCode pointInTime;
	/**
	 * Specifies a frequency in terms of an exact point in time or moment within
	 * a specified period type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointInTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a frequency in terms of an exact point in time or moment within a specified period type."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPointInTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate, com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation1.mmAmendmentInformationDetails, com.tools20022.repository.msg.MandateRelatedInformation6.mmAmendmentInformationDetails,
						com.tools20022.repository.msg.MandateRelatedInformation7.mmAmendmentInformationDetails, com.tools20022.repository.msg.MandateRelatedInformation8.mmAmendmentInformationDetails,
						com.tools20022.repository.msg.OriginalTransactionReference1.mmMandateRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference13.mmMandateRelatedInformation,
						com.tools20022.repository.msg.OriginalTransactionReference16.mmMandateRelatedInformation, com.tools20022.repository.msg.MandateInformation1.mmType, com.tools20022.repository.msg.MandateInformation1.mmOccurrences,
						com.tools20022.repository.choice.OriginalMandate1Choice.mmOriginalMandate, com.tools20022.repository.msg.Mandate1.mmOccurrences, com.tools20022.repository.choice.OriginalMandate2Choice.mmOriginalMandate,
						com.tools20022.repository.msg.MandateInformation3.mmType, com.tools20022.repository.msg.MandateInformation3.mmOccurrences, com.tools20022.repository.msg.MandateAmendment1.mmMandate,
						com.tools20022.repository.msg.Mandate3.mmOccurrences, com.tools20022.repository.msg.MandateAmendment2.mmMandate, com.tools20022.repository.msg.MandateAmendment3.mmMandate,
						com.tools20022.repository.msg.MandateInformation2.mmType, com.tools20022.repository.msg.MandateInformation2.mmOccurrences, com.tools20022.repository.msg.Mandate2.mmOccurrences,
						com.tools20022.repository.msg.Mandate4.mmOccurrences, com.tools20022.repository.msg.OriginalTransactionReference15.mmMandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation9.mmAmendmentInformationDetails, com.tools20022.repository.msg.OriginalTransactionReference17.mmMandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation4.mmAmendmentInformationDetails, com.tools20022.repository.msg.OriginalTransactionReference7.mmMandateRelatedInformation,
						com.tools20022.repository.msg.OriginalTransactionReference10.mmMandateRelatedInformation, com.tools20022.repository.msg.MandateRelatedInformation5.mmAmendmentInformationDetails,
						com.tools20022.repository.msg.OriginalTransactionReference9.mmMandateRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference12.mmMandateRelatedInformation,
						com.tools20022.repository.msg.OriginalTransactionReference8.mmMandateRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference11.mmMandateRelatedInformation,
						com.tools20022.repository.msg.MandateAmendment4.mmMandate, com.tools20022.repository.msg.Mandate7.mmOccurrences, com.tools20022.repository.choice.OriginalMandate3Choice.mmOriginalMandate,
						com.tools20022.repository.msg.Mandate6.mmOccurrences, com.tools20022.repository.msg.Mandate5.mmOccurrences, com.tools20022.repository.msg.OriginalTransactionReference20.mmMandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation10.mmAmendmentInformationDetails, com.tools20022.repository.msg.OriginalTransactionReference22.mmMandateRelatedInformation,
						com.tools20022.repository.msg.Mandate10.mmOccurrences, com.tools20022.repository.msg.MandateAmendment5.mmMandate, com.tools20022.repository.choice.OriginalMandate4Choice.mmOriginalMandate,
						com.tools20022.repository.msg.Mandate9.mmOccurrences, com.tools20022.repository.msg.OriginalTransactionReference24.mmMandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation11.mmAmendmentInformationDetails, com.tools20022.repository.msg.Mandate11.mmOccurrences, com.tools20022.repository.msg.Mandate8.mmOccurrences,
						com.tools20022.repository.choice.OriginalMandate5Choice.mmOriginalMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit, com.tools20022.repository.entity.DirectDebitMandate.mmFinalCollectionDate,
								com.tools20022.repository.entity.DirectDebitMandate.mmFrequency, com.tools20022.repository.entity.DirectDebitMandate.mmFirstCollectionDate,
								com.tools20022.repository.entity.DirectDebitMandate.mmMandatePaymentType, com.tools20022.repository.entity.DirectDebitMandate.mmCollectionAmount,
								com.tools20022.repository.entity.DirectDebitMandate.mmMaximumAmount, com.tools20022.repository.entity.DirectDebitMandate.mmPreNotification,
								com.tools20022.repository.entity.DirectDebitMandate.mmPreNotificationThreshold, com.tools20022.repository.entity.DirectDebitMandate.mmClassification,
								com.tools20022.repository.entity.DirectDebitMandate.mmPointInTime);
				derivationComponent_lazy = () -> Arrays.asList(AmendmentInformationDetails1.mmObject(), MandateRelatedInformation1.mmObject(), AmendmentInformationDetails6.mmObject(), MandateRelatedInformation6.mmObject(),
						AmendmentInformationDetails7.mmObject(), MandateRelatedInformation7.mmObject(), AmendmentInformationDetails8.mmObject(), MandateRelatedInformation8.mmObject(), MandateOccurrences1.mmObject(),
						MandateInformation1.mmObject(), MandateAcceptance1.mmObject(), MandateOccurrences2.mmObject(), Mandate1.mmObject(), MandateAcceptance2.mmObject(), MandateAcceptance3.mmObject(), MandateInformation3.mmObject(),
						Mandate3.mmObject(), MandateInformation2.mmObject(), Mandate2.mmObject(), Mandate4.mmObject(), AmendmentInformationDetails9.mmObject(), MandateRelatedInformation9.mmObject(), AmendmentInformationDetails4.mmObject(),
						MandateRelatedInformation4.mmObject(), AmendmentInformationDetails5.mmObject(), MandateRelatedInformation5.mmObject(), MandateAcceptance4.mmObject(), Mandate7.mmObject(), AmendmentInformationDetails10.mmObject(),
						Mandate6.mmObject(), Mandate5.mmObject(), MandateRelatedInformation10.mmObject(), MandateOccurrences3.mmObject(), Mandate10.mmObject(), MandateAcceptance5.mmObject(), Mandate9.mmObject(),
						MandateRelatedInformation11.mmObject(), Mandate11.mmObject(), MandateAdjustment1.mmObject(), MandateOccurrences4.mmObject(), Mandate8.mmObject(), AmendmentInformationDetails11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DirectDebit getRelatedDirectDebit() {
		return relatedDirectDebit;
	}

	public void setRelatedDirectDebit(com.tools20022.repository.entity.DirectDebit relatedDirectDebit) {
		this.relatedDirectDebit = relatedDirectDebit;
	}

	public ISODate getFinalCollectionDate() {
		return finalCollectionDate;
	}

	public void setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = finalCollectionDate;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyCode frequency) {
		this.frequency = frequency;
	}

	public ISODate getFirstCollectionDate() {
		return firstCollectionDate;
	}

	public void setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = firstCollectionDate;
	}

	public PaymentProcessing getMandatePaymentType() {
		return mandatePaymentType;
	}

	public void setMandatePaymentType(com.tools20022.repository.entity.PaymentProcessing mandatePaymentType) {
		this.mandatePaymentType = mandatePaymentType;
	}

	public CurrencyAndAmount getCollectionAmount() {
		return collectionAmount;
	}

	public void setCollectionAmount(CurrencyAndAmount collectionAmount) {
		this.collectionAmount = collectionAmount;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public TrueFalseIndicator getPreNotification() {
		return preNotification;
	}

	public void setPreNotification(TrueFalseIndicator preNotification) {
		this.preNotification = preNotification;
	}

	public Number getPreNotificationThreshold() {
		return preNotificationThreshold;
	}

	public void setPreNotificationThreshold(Number preNotificationThreshold) {
		this.preNotificationThreshold = preNotificationThreshold;
	}

	public MandateClassificationCode getClassification() {
		return classification;
	}

	public void setClassification(MandateClassificationCode classification) {
		this.classification = classification;
	}

	public FrequencyCode getPointInTime() {
		return pointInTime;
	}

	public void setPointInTime(FrequencyCode pointInTime) {
		this.pointInTime = pointInTime;
	}
}