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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.MandateClassificationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmMandateRelatedInformation
 * OriginalTransactionReference27.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmAmendmentInformationDetails
 * MandateRelatedInformation12.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1#mmMandateRelatedInformation
 * CardDirectDebit1.mmMandateRelatedInformation}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation12
 * MandateRelatedInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
 * AmendmentInformationDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation13
 * MandateRelatedInformation13}</li>
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
		}
	};
	protected ISODate finalCollectionDate;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmFinalCollectionDate
	 * MandateRelatedInformation12.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails12.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 * </li>
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
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinalCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmendmentInformationDetails1.mmOriginalFinalCollectionDate, MandateRelatedInformation1.mmFinalCollectionDate, AmendmentInformationDetails6.mmOriginalFinalCollectionDate,
					MandateRelatedInformation6.mmFinalCollectionDate, AmendmentInformationDetails7.mmOriginalFinalCollectionDate, MandateRelatedInformation7.mmFinalCollectionDate, AmendmentInformationDetails8.mmOriginalFinalCollectionDate,
					MandateRelatedInformation8.mmFinalCollectionDate, MandateOccurrences1.mmFinalCollectionDate, MandateOccurrences2.mmFinalCollectionDate, AmendmentInformationDetails9.mmOriginalFinalCollectionDate,
					MandateRelatedInformation9.mmFinalCollectionDate, AmendmentInformationDetails5.mmOriginalFinalCollectionDate, MandateRelatedInformation5.mmFinalCollectionDate,
					AmendmentInformationDetails10.mmOriginalFinalCollectionDate, MandateRelatedInformation10.mmFinalCollectionDate, MandateOccurrences3.mmFinalCollectionDate, MandateRelatedInformation11.mmFinalCollectionDate,
					MandateOccurrences4.mmFinalCollectionDate, AmendmentInformationDetails11.mmOriginalFinalCollectionDate, MandateRelatedInformation12.mmFinalCollectionDate, AmendmentInformationDetails12.mmOriginalFinalCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getFinalCollectionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmFrequency
	 * MandateRelatedInformation12.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalFrequency
	 * AmendmentInformationDetails12.mmOriginalFrequency}</li>
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(AmendmentInformationDetails1.mmOriginalFrequency, MandateRelatedInformation1.mmFrequency, AmendmentInformationDetails6.mmOriginalFrequency, MandateRelatedInformation6.mmFrequency,
					AmendmentInformationDetails7.mmOriginalFrequency, MandateRelatedInformation7.mmFrequency, AmendmentInformationDetails8.mmOriginalFrequency, MandateRelatedInformation8.mmFrequency, MandateOccurrences1.mmFrequency,
					MandateOccurrences2.mmFrequency, AmendmentInformationDetails9.mmOriginalFrequency, MandateRelatedInformation9.mmFrequency, AmendmentInformationDetails5.mmOriginalFrequency, MandateRelatedInformation5.mmFrequency,
					AmendmentInformationDetails10.mmOriginalFrequency, MandateRelatedInformation10.mmFrequency, MandateOccurrences3.mmFrequency, MandateRelatedInformation11.mmFrequency, MandateAdjustment1.mmCategory,
					MandateOccurrences4.mmFrequency, AmendmentInformationDetails11.mmOriginalFrequency, MandateRelatedInformation12.mmFrequency, AmendmentInformationDetails12.mmOriginalFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate firstCollectionDate;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmFirstCollectionDate
	 * MandateRelatedInformation12.mmFirstCollectionDate}</li>
	 * </ul>
	 * </li>
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
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation1.mmFirstCollectionDate, MandateRelatedInformation6.mmFirstCollectionDate, MandateRelatedInformation7.mmFirstCollectionDate,
					MandateRelatedInformation8.mmFirstCollectionDate, MandateOccurrences1.mmFirstCollectionDate, MandateOccurrences2.mmFirstCollectionDate, MandateRelatedInformation9.mmFirstCollectionDate,
					MandateRelatedInformation5.mmFirstCollectionDate, MandateRelatedInformation10.mmFirstCollectionDate, MandateOccurrences3.mmFirstCollectionDate, MandateRelatedInformation11.mmFirstCollectionDate,
					MandateOccurrences4.mmFirstCollectionDate, MandateRelatedInformation12.mmFirstCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getFirstCollectionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentProcessing mandatePaymentType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
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
			derivation_lazy = () -> Arrays.asList(MandateTypeInformation1.mmLocalInstrument, Mandate1.mmType, Mandate3.mmType, Mandate2.mmType, Mandate4.mmType, Mandate7.mmType, Mandate6.mmType, Mandate5.mmType, Mandate10.mmType,
					MandateTypeInformation2.mmLocalInstrument, Mandate9.mmType, Mandate11.mmType, Mandate8.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected CurrencyAndAmount collectionAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
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
			derivation_lazy = () -> Arrays.asList(MandateInformation1.mmCollectionAmount, Mandate1.mmCollectionAmount, MandateInformation3.mmCollectionAmount, Mandate3.mmCollectionAmount, MandateInformation2.mmCollectionAmount,
					Mandate2.mmCollectionAmount, Mandate4.mmCollectionAmount, Mandate7.mmCollectionAmount, Mandate6.mmCollectionAmount, Mandate5.mmCollectionAmount, Mandate10.mmFirstCollectionAmount, Mandate10.mmCollectionAmount,
					Mandate9.mmFirstCollectionAmount, Mandate9.mmCollectionAmount, Mandate11.mmFirstCollectionAmount, Mandate11.mmCollectionAmount, MandateAdjustment1.mmAmount, Mandate8.mmFirstCollectionAmount, Mandate8.mmCollectionAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getCollectionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
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
			derivation_lazy = () -> Arrays.asList(MandateInformation1.mmMaximumAmount, Mandate1.mmMaximumAmount, MandateInformation3.mmMaximumAmount, Mandate3.mmMaximumAmount, MandateInformation2.mmMaximumAmount, Mandate2.mmMaximumAmount,
					Mandate4.mmMaximumAmount, Mandate7.mmMaximumAmount, Mandate6.mmMaximumAmount, Mandate5.mmMaximumAmount, Mandate10.mmMaximumAmount, Mandate9.mmMaximumAmount, Mandate11.mmMaximumAmount, Mandate8.mmMaximumAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getMaximumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator preNotification;
	/**
	 * 
	 <p>
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
	 * "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPreNotification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotification";
			definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getPreNotification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number preNotificationThreshold;
	/**
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationThreshold";
			definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getPreNotificationThreshold", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MandateClassificationCode classification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
	 * MandateClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmClassification
	 * MandateTypeInformation2.mmClassification}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of direct debit instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClassification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateTypeInformation2.mmClassification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateClassificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getClassification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode pointInTime;
	/**
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getPointInTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate, com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(MandateRelatedInformation1.mmAmendmentInformationDetails, MandateRelatedInformation6.mmAmendmentInformationDetails, MandateRelatedInformation7.mmAmendmentInformationDetails,
						MandateRelatedInformation8.mmAmendmentInformationDetails, OriginalTransactionReference1.mmMandateRelatedInformation, OriginalTransactionReference13.mmMandateRelatedInformation,
						OriginalTransactionReference16.mmMandateRelatedInformation, MandateInformation1.mmType, MandateInformation1.mmOccurrences, OriginalMandate1Choice.mmOriginalMandate, Mandate1.mmOccurrences,
						OriginalMandate2Choice.mmOriginalMandate, MandateInformation3.mmType, MandateInformation3.mmOccurrences, MandateAmendment1.mmMandate, Mandate3.mmOccurrences, MandateAmendment2.mmMandate, MandateAmendment3.mmMandate,
						MandateInformation2.mmType, MandateInformation2.mmOccurrences, Mandate2.mmOccurrences, Mandate4.mmOccurrences, OriginalTransactionReference15.mmMandateRelatedInformation,
						MandateRelatedInformation9.mmAmendmentInformationDetails, OriginalTransactionReference17.mmMandateRelatedInformation, MandateRelatedInformation4.mmAmendmentInformationDetails,
						OriginalTransactionReference7.mmMandateRelatedInformation, OriginalTransactionReference10.mmMandateRelatedInformation, MandateRelatedInformation5.mmAmendmentInformationDetails,
						OriginalTransactionReference9.mmMandateRelatedInformation, OriginalTransactionReference12.mmMandateRelatedInformation, OriginalTransactionReference8.mmMandateRelatedInformation,
						OriginalTransactionReference11.mmMandateRelatedInformation, MandateAmendment4.mmMandate, Mandate7.mmOccurrences, OriginalMandate3Choice.mmOriginalMandate, Mandate6.mmOccurrences, Mandate5.mmOccurrences,
						OriginalTransactionReference20.mmMandateRelatedInformation, MandateRelatedInformation10.mmAmendmentInformationDetails, OriginalTransactionReference22.mmMandateRelatedInformation, Mandate10.mmOccurrences,
						MandateAmendment5.mmMandate, OriginalMandate4Choice.mmOriginalMandate, Mandate9.mmOccurrences, OriginalTransactionReference24.mmMandateRelatedInformation, MandateRelatedInformation11.mmAmendmentInformationDetails,
						Mandate11.mmOccurrences, Mandate8.mmOccurrences, OriginalMandate5Choice.mmOriginalMandate, OriginalTransactionReference27.mmMandateRelatedInformation, MandateRelatedInformation12.mmAmendmentInformationDetails,
						CardDirectDebit1.mmMandateRelatedInformation);
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
						MandateRelatedInformation11.mmObject(), Mandate11.mmObject(), MandateAdjustment1.mmObject(), MandateOccurrences4.mmObject(), Mandate8.mmObject(), AmendmentInformationDetails11.mmObject(),
						MandateRelatedInformation12.mmObject(), AmendmentInformationDetails12.mmObject(), MandateRelatedInformation13.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return DirectDebitMandate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DirectDebit> getRelatedDirectDebit() {
		return relatedDirectDebit == null ? Optional.empty() : Optional.of(relatedDirectDebit);
	}

	public DirectDebitMandate setRelatedDirectDebit(com.tools20022.repository.entity.DirectDebit relatedDirectDebit) {
		this.relatedDirectDebit = relatedDirectDebit;
		return this;
	}

	public ISODate getFinalCollectionDate() {
		return finalCollectionDate;
	}

	public DirectDebitMandate setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = Objects.requireNonNull(finalCollectionDate);
		return this;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public DirectDebitMandate setFrequency(FrequencyCode frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public ISODate getFirstCollectionDate() {
		return firstCollectionDate;
	}

	public DirectDebitMandate setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = Objects.requireNonNull(firstCollectionDate);
		return this;
	}

	public PaymentProcessing getMandatePaymentType() {
		return mandatePaymentType;
	}

	public DirectDebitMandate setMandatePaymentType(com.tools20022.repository.entity.PaymentProcessing mandatePaymentType) {
		this.mandatePaymentType = Objects.requireNonNull(mandatePaymentType);
		return this;
	}

	public CurrencyAndAmount getCollectionAmount() {
		return collectionAmount;
	}

	public DirectDebitMandate setCollectionAmount(CurrencyAndAmount collectionAmount) {
		this.collectionAmount = Objects.requireNonNull(collectionAmount);
		return this;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public DirectDebitMandate setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public TrueFalseIndicator getPreNotification() {
		return preNotification;
	}

	public DirectDebitMandate setPreNotification(TrueFalseIndicator preNotification) {
		this.preNotification = Objects.requireNonNull(preNotification);
		return this;
	}

	public Number getPreNotificationThreshold() {
		return preNotificationThreshold;
	}

	public DirectDebitMandate setPreNotificationThreshold(Number preNotificationThreshold) {
		this.preNotificationThreshold = Objects.requireNonNull(preNotificationThreshold);
		return this;
	}

	public MandateClassificationCode getClassification() {
		return classification;
	}

	public DirectDebitMandate setClassification(MandateClassificationCode classification) {
		this.classification = Objects.requireNonNull(classification);
		return this;
	}

	public FrequencyCode getPointInTime() {
		return pointInTime;
	}

	public DirectDebitMandate setPointInTime(FrequencyCode pointInTime) {
		this.pointInTime = Objects.requireNonNull(pointInTime);
		return this;
	}
}