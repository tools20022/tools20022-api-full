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
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#RelatedDirectDebit
 * DirectDebitMandate.RelatedDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#FinalCollectionDate
 * DirectDebitMandate.FinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#Frequency
 * DirectDebitMandate.Frequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#FirstCollectionDate
 * DirectDebitMandate.FirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
 * DirectDebitMandate.MandatePaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#CollectionAmount
 * DirectDebitMandate.CollectionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MaximumAmount
 * DirectDebitMandate.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#PreNotification
 * DirectDebitMandate.PreNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#PreNotificationThreshold
 * DirectDebitMandate.PreNotificationThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#Classification
 * DirectDebitMandate.Classification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#PointInTime
 * DirectDebitMandate.PointInTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
 * DirectDebit.DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#RelatedMandate
 * PaymentProcessing.RelatedMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#AmendmentInformationDetails
 * MandateRelatedInformation1.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#AmendmentInformationDetails
 * MandateRelatedInformation6.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#AmendmentInformationDetails
 * MandateRelatedInformation7.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#AmendmentInformationDetails
 * MandateRelatedInformation8.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#MandateRelatedInformation
 * OriginalTransactionReference1.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#MandateRelatedInformation
 * OriginalTransactionReference13.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#MandateRelatedInformation
 * OriginalTransactionReference16.MandateRelatedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation1#Type
 * MandateInformation1.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation1#Occurrences
 * MandateInformation1.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate1Choice#OriginalMandate
 * OriginalMandate1Choice.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#Occurrences
 * Mandate1.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate2Choice#OriginalMandate
 * OriginalMandate2Choice.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation3#Type
 * MandateInformation3.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation3#Occurrences
 * MandateInformation3.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment1#Mandate
 * MandateAmendment1.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#Occurrences
 * Mandate3.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment2#Mandate
 * MandateAmendment2.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment3#Mandate
 * MandateAmendment3.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateInformation2#Type
 * MandateInformation2.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateInformation2#Occurrences
 * MandateInformation2.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#Occurrences
 * Mandate2.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#Occurrences
 * Mandate4.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#MandateRelatedInformation
 * OriginalTransactionReference15.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#AmendmentInformationDetails
 * MandateRelatedInformation9.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#MandateRelatedInformation
 * OriginalTransactionReference17.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#AmendmentInformationDetails
 * MandateRelatedInformation4.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#MandateRelatedInformation
 * OriginalTransactionReference7.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#MandateRelatedInformation
 * OriginalTransactionReference10.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#AmendmentInformationDetails
 * MandateRelatedInformation5.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#MandateRelatedInformation
 * OriginalTransactionReference9.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#MandateRelatedInformation
 * OriginalTransactionReference12.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#MandateRelatedInformation
 * OriginalTransactionReference8.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#MandateRelatedInformation
 * OriginalTransactionReference11.MandateRelatedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment4#Mandate
 * MandateAmendment4.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#Occurrences
 * Mandate7.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice#OriginalMandate
 * OriginalMandate3Choice.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#Occurrences
 * Mandate6.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#Occurrences
 * Mandate5.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#MandateRelatedInformation
 * OriginalTransactionReference20.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#AmendmentInformationDetails
 * MandateRelatedInformation10.AmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#MandateRelatedInformation
 * OriginalTransactionReference22.MandateRelatedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Occurrences
 * Mandate10.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5#Mandate
 * MandateAmendment5.Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#OriginalMandate
 * OriginalMandate4Choice.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Occurrences
 * Mandate9.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#MandateRelatedInformation
 * OriginalTransactionReference24.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#AmendmentInformationDetails
 * MandateRelatedInformation11.AmendmentInformationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Occurrences
 * Mandate11.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Occurrences
 * Mandate8.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#OriginalMandate
 * OriginalMandate5Choice.OriginalMandate}</li>
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
	/**
	 * Direct debit to which a mandate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
	 * DirectDebit.DirectDebitMandate}</li>
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
	public static final MMBusinessAssociationEnd RelatedDirectDebit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DirectDebit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebit.DirectDebitMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#OriginalFinalCollectionDate
	 * AmendmentInformationDetails1.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#FinalCollectionDate
	 * MandateRelatedInformation1.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails6#OriginalFinalCollectionDate
	 * AmendmentInformationDetails6.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#FinalCollectionDate
	 * MandateRelatedInformation6.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails7#OriginalFinalCollectionDate
	 * AmendmentInformationDetails7.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#FinalCollectionDate
	 * MandateRelatedInformation7.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#OriginalFinalCollectionDate
	 * AmendmentInformationDetails8.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#FinalCollectionDate
	 * MandateRelatedInformation8.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#FinalCollectionDate
	 * MandateOccurrences1.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#FinalCollectionDate
	 * MandateOccurrences2.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9#OriginalFinalCollectionDate
	 * AmendmentInformationDetails9.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#FinalCollectionDate
	 * MandateRelatedInformation9.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#OriginalFinalCollectionDate
	 * AmendmentInformationDetails5.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#FinalCollectionDate
	 * MandateRelatedInformation5.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#OriginalFinalCollectionDate
	 * AmendmentInformationDetails10.OriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#FinalCollectionDate
	 * MandateRelatedInformation10.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#FinalCollectionDate
	 * MandateOccurrences3.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#FinalCollectionDate
	 * MandateRelatedInformation11.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#FinalCollectionDate
	 * MandateOccurrences4.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalFinalCollectionDate
	 * AmendmentInformationDetails11.OriginalFinalCollectionDate}</li>
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
	public static final MMBusinessAttribute FinalCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails1.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation1.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails6.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation6.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails7.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation7.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails8.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation8.FinalCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences1.FinalCollectionDate, com.tools20022.repository.msg.MandateOccurrences2.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails9.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation9.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails5.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation5.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails10.OriginalFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation10.FinalCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences3.FinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation11.FinalCollectionDate,
					com.tools20022.repository.msg.MandateOccurrences4.FinalCollectionDate, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFinalCollectionDate);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#OriginalFrequency
	 * AmendmentInformationDetails1.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#Frequency
	 * MandateRelatedInformation1.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails6#OriginalFrequency
	 * AmendmentInformationDetails6.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#Frequency
	 * MandateRelatedInformation6.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails7#OriginalFrequency
	 * AmendmentInformationDetails7.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#Frequency
	 * MandateRelatedInformation7.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#OriginalFrequency
	 * AmendmentInformationDetails8.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#Frequency
	 * MandateRelatedInformation8.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#Frequency
	 * MandateOccurrences1.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#Frequency
	 * MandateOccurrences2.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9#OriginalFrequency
	 * AmendmentInformationDetails9.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#Frequency
	 * MandateRelatedInformation9.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#OriginalFrequency
	 * AmendmentInformationDetails5.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#Frequency
	 * MandateRelatedInformation5.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#OriginalFrequency
	 * AmendmentInformationDetails10.OriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#Frequency
	 * MandateRelatedInformation10.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#Frequency
	 * MandateOccurrences3.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#Frequency
	 * MandateRelatedInformation11.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#Category
	 * MandateAdjustment1.Category}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#Frequency
	 * MandateOccurrences4.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalFrequency
	 * AmendmentInformationDetails11.OriginalFrequency}</li>
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
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails1.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation1.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails6.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation6.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails7.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation7.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails8.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation8.Frequency, com.tools20022.repository.msg.MandateOccurrences1.Frequency,
					com.tools20022.repository.msg.MandateOccurrences2.Frequency, com.tools20022.repository.msg.AmendmentInformationDetails9.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation9.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails5.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation5.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails10.OriginalFrequency, com.tools20022.repository.msg.MandateRelatedInformation10.Frequency, com.tools20022.repository.msg.MandateOccurrences3.Frequency,
					com.tools20022.repository.msg.MandateRelatedInformation11.Frequency, com.tools20022.repository.msg.MandateAdjustment1.Category, com.tools20022.repository.msg.MandateOccurrences4.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFrequency);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#FirstCollectionDate
	 * MandateRelatedInformation1.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#FirstCollectionDate
	 * MandateRelatedInformation6.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#FirstCollectionDate
	 * MandateRelatedInformation7.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#FirstCollectionDate
	 * MandateRelatedInformation8.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences1#FirstCollectionDate
	 * MandateOccurrences1.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#FirstCollectionDate
	 * MandateOccurrences2.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#FirstCollectionDate
	 * MandateRelatedInformation9.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#FirstCollectionDate
	 * MandateRelatedInformation5.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#FirstCollectionDate
	 * MandateRelatedInformation10.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#FirstCollectionDate
	 * MandateOccurrences3.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#FirstCollectionDate
	 * MandateRelatedInformation11.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#FirstCollectionDate
	 * MandateOccurrences4.FirstCollectionDate}</li>
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
	public static final MMBusinessAttribute FirstCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.MandateRelatedInformation1.FirstCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation6.FirstCollectionDate,
							com.tools20022.repository.msg.MandateRelatedInformation7.FirstCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation8.FirstCollectionDate,
							com.tools20022.repository.msg.MandateOccurrences1.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences2.FirstCollectionDate,
							com.tools20022.repository.msg.MandateRelatedInformation9.FirstCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation5.FirstCollectionDate,
							com.tools20022.repository.msg.MandateRelatedInformation10.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences3.FirstCollectionDate,
							com.tools20022.repository.msg.MandateRelatedInformation11.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.FirstCollectionDate);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#RelatedMandate
	 * PaymentProcessing.RelatedMandate}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation1#LocalInstrument
	 * MandateTypeInformation1.LocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#Type
	 * Mandate1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#Type
	 * Mandate3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#Type
	 * Mandate2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#Type
	 * Mandate4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#Type
	 * Mandate7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#Type
	 * Mandate6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#Type
	 * Mandate5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Type
	 * Mandate10.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#LocalInstrument
	 * MandateTypeInformation2.LocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Type
	 * Mandate9.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Type
	 * Mandate11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Type
	 * Mandate8.Type}</li>
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
	public static final MMBusinessAssociationEnd MandatePaymentType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation1.LocalInstrument, com.tools20022.repository.msg.Mandate1.Type, com.tools20022.repository.msg.Mandate3.Type,
					com.tools20022.repository.msg.Mandate2.Type, com.tools20022.repository.msg.Mandate4.Type, com.tools20022.repository.msg.Mandate7.Type, com.tools20022.repository.msg.Mandate6.Type,
					com.tools20022.repository.msg.Mandate5.Type, com.tools20022.repository.msg.Mandate10.Type, com.tools20022.repository.msg.MandateTypeInformation2.LocalInstrument, com.tools20022.repository.msg.Mandate9.Type,
					com.tools20022.repository.msg.Mandate11.Type, com.tools20022.repository.msg.Mandate8.Type);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.RelatedMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#CollectionAmount
	 * MandateInformation1.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#CollectionAmount
	 * Mandate1.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#CollectionAmount
	 * MandateInformation3.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#CollectionAmount
	 * Mandate3.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#CollectionAmount
	 * MandateInformation2.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#CollectionAmount
	 * Mandate2.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#CollectionAmount
	 * Mandate4.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#CollectionAmount
	 * Mandate7.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#CollectionAmount
	 * Mandate6.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#CollectionAmount
	 * Mandate5.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#FirstCollectionAmount
	 * Mandate10.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#CollectionAmount
	 * Mandate10.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#FirstCollectionAmount
	 * Mandate9.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#CollectionAmount
	 * Mandate9.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#FirstCollectionAmount
	 * Mandate11.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CollectionAmount
	 * Mandate11.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#Amount
	 * MandateAdjustment1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#FirstCollectionAmount
	 * Mandate8.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#CollectionAmount
	 * Mandate8.CollectionAmount}</li>
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
	public static final MMBusinessAttribute CollectionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateInformation1.CollectionAmount, com.tools20022.repository.msg.Mandate1.CollectionAmount,
					com.tools20022.repository.msg.MandateInformation3.CollectionAmount, com.tools20022.repository.msg.Mandate3.CollectionAmount, com.tools20022.repository.msg.MandateInformation2.CollectionAmount,
					com.tools20022.repository.msg.Mandate2.CollectionAmount, com.tools20022.repository.msg.Mandate4.CollectionAmount, com.tools20022.repository.msg.Mandate7.CollectionAmount,
					com.tools20022.repository.msg.Mandate6.CollectionAmount, com.tools20022.repository.msg.Mandate5.CollectionAmount, com.tools20022.repository.msg.Mandate10.FirstCollectionAmount,
					com.tools20022.repository.msg.Mandate10.CollectionAmount, com.tools20022.repository.msg.Mandate9.FirstCollectionAmount, com.tools20022.repository.msg.Mandate9.CollectionAmount,
					com.tools20022.repository.msg.Mandate11.FirstCollectionAmount, com.tools20022.repository.msg.Mandate11.CollectionAmount, com.tools20022.repository.msg.MandateAdjustment1.Amount,
					com.tools20022.repository.msg.Mandate8.FirstCollectionAmount, com.tools20022.repository.msg.Mandate8.CollectionAmount);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation1#MaximumAmount
	 * MandateInformation1.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate1#MaximumAmount
	 * Mandate1.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation3#MaximumAmount
	 * MandateInformation3.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate3#MaximumAmount
	 * Mandate3.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateInformation2#MaximumAmount
	 * MandateInformation2.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate2#MaximumAmount
	 * Mandate2.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate4#MaximumAmount
	 * Mandate4.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate7#MaximumAmount
	 * Mandate7.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate6#MaximumAmount
	 * Mandate6.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate5#MaximumAmount
	 * Mandate5.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#MaximumAmount
	 * Mandate10.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#MaximumAmount
	 * Mandate9.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#MaximumAmount
	 * Mandate11.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#MaximumAmount
	 * Mandate8.MaximumAmount}</li>
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
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateInformation1.MaximumAmount, com.tools20022.repository.msg.Mandate1.MaximumAmount, com.tools20022.repository.msg.MandateInformation3.MaximumAmount,
					com.tools20022.repository.msg.Mandate3.MaximumAmount, com.tools20022.repository.msg.MandateInformation2.MaximumAmount, com.tools20022.repository.msg.Mandate2.MaximumAmount,
					com.tools20022.repository.msg.Mandate4.MaximumAmount, com.tools20022.repository.msg.Mandate7.MaximumAmount, com.tools20022.repository.msg.Mandate6.MaximumAmount, com.tools20022.repository.msg.Mandate5.MaximumAmount,
					com.tools20022.repository.msg.Mandate10.MaximumAmount, com.tools20022.repository.msg.Mandate9.MaximumAmount, com.tools20022.repository.msg.Mandate11.MaximumAmount, com.tools20022.repository.msg.Mandate8.MaximumAmount);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PreNotification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotification";
			definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PreNotificationThreshold = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationThreshold";
			definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#Classification
	 * MandateTypeInformation2.Classification}</li>
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
	public static final MMBusinessAttribute Classification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.Classification);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MandateClassificationCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PointInTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.DirectDebitMandate, com.tools20022.repository.entity.PaymentProcessing.RelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation1.AmendmentInformationDetails, com.tools20022.repository.msg.MandateRelatedInformation6.AmendmentInformationDetails,
						com.tools20022.repository.msg.MandateRelatedInformation7.AmendmentInformationDetails, com.tools20022.repository.msg.MandateRelatedInformation8.AmendmentInformationDetails,
						com.tools20022.repository.msg.OriginalTransactionReference1.MandateRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference13.MandateRelatedInformation,
						com.tools20022.repository.msg.OriginalTransactionReference16.MandateRelatedInformation, com.tools20022.repository.msg.MandateInformation1.Type, com.tools20022.repository.msg.MandateInformation1.Occurrences,
						com.tools20022.repository.choice.OriginalMandate1Choice.OriginalMandate, com.tools20022.repository.msg.Mandate1.Occurrences, com.tools20022.repository.choice.OriginalMandate2Choice.OriginalMandate,
						com.tools20022.repository.msg.MandateInformation3.Type, com.tools20022.repository.msg.MandateInformation3.Occurrences, com.tools20022.repository.msg.MandateAmendment1.Mandate,
						com.tools20022.repository.msg.Mandate3.Occurrences, com.tools20022.repository.msg.MandateAmendment2.Mandate, com.tools20022.repository.msg.MandateAmendment3.Mandate,
						com.tools20022.repository.msg.MandateInformation2.Type, com.tools20022.repository.msg.MandateInformation2.Occurrences, com.tools20022.repository.msg.Mandate2.Occurrences,
						com.tools20022.repository.msg.Mandate4.Occurrences, com.tools20022.repository.msg.OriginalTransactionReference15.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation9.AmendmentInformationDetails, com.tools20022.repository.msg.OriginalTransactionReference17.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation4.AmendmentInformationDetails, com.tools20022.repository.msg.OriginalTransactionReference7.MandateRelatedInformation,
						com.tools20022.repository.msg.OriginalTransactionReference10.MandateRelatedInformation, com.tools20022.repository.msg.MandateRelatedInformation5.AmendmentInformationDetails,
						com.tools20022.repository.msg.OriginalTransactionReference9.MandateRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference12.MandateRelatedInformation,
						com.tools20022.repository.msg.OriginalTransactionReference8.MandateRelatedInformation, com.tools20022.repository.msg.OriginalTransactionReference11.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateAmendment4.Mandate, com.tools20022.repository.msg.Mandate7.Occurrences, com.tools20022.repository.choice.OriginalMandate3Choice.OriginalMandate,
						com.tools20022.repository.msg.Mandate6.Occurrences, com.tools20022.repository.msg.Mandate5.Occurrences, com.tools20022.repository.msg.OriginalTransactionReference20.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation10.AmendmentInformationDetails, com.tools20022.repository.msg.OriginalTransactionReference22.MandateRelatedInformation,
						com.tools20022.repository.msg.Mandate10.Occurrences, com.tools20022.repository.msg.MandateAmendment5.Mandate, com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandate,
						com.tools20022.repository.msg.Mandate9.Occurrences, com.tools20022.repository.msg.OriginalTransactionReference24.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentInformationDetails, com.tools20022.repository.msg.Mandate11.Occurrences, com.tools20022.repository.msg.Mandate8.Occurrences,
						com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit, com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate,
						com.tools20022.repository.entity.DirectDebitMandate.Frequency, com.tools20022.repository.entity.DirectDebitMandate.FirstCollectionDate, com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType,
						com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount, com.tools20022.repository.entity.DirectDebitMandate.MaximumAmount, com.tools20022.repository.entity.DirectDebitMandate.PreNotification,
						com.tools20022.repository.entity.DirectDebitMandate.PreNotificationThreshold, com.tools20022.repository.entity.DirectDebitMandate.Classification, com.tools20022.repository.entity.DirectDebitMandate.PointInTime);
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
}